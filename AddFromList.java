import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddFromList extends Procedure{

	
	public void Task(){
        BufferedReader reader;
        
        try {

            reader = new BufferedReader(new FileReader(myDB.addListPath));
         
            // Read the first line or not (comment means yes)
            reader.readLine();
      
            String line = null;
            
            while ((line = reader.readLine()) != null) {               
                String item[] = line.split(",");              
             
                if(item.length == 6){
                GeoData tmpGData = new GeoData();
                tmpGData.cityCode = this.ParseCSV(item[0]);
                tmpGData.cityName = this.ParseCSV(item[1]);
                tmpGData.townshipCode = this.ParseCSV(item[2]);
                tmpGData.townshipName = this.ParseCSV(item[3]);
                tmpGData.totalCode = this.ParseCSV(item[4]);
                tmpGData.villageName = this.ParseCSV(item[5]);
                
                myDB.geoDataHT.put(tmpGData.totalCode, tmpGData);
                }else{
                	System.out.println(item);
                }
                /*
                for(int i = 0; i < item.length; i++)
                	System.out.println(item[i]);
				*/
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
