import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * Read all data we want to delete from a csv file.
 * 
 * */


public class ReadDeleteList extends Procedure{
	public void Task(){
        BufferedReader reader;
        
        try {

            reader = new BufferedReader(new FileReader(myDB.deleteListPath));
         
            // Read the first line or not (comment means yes)
            //reader.readLine();
      
            String line = null;
            
            while ((line = reader.readLine()) != null) {               
                String item[] = line.split(",");              
             
                if(item.length > 0){
                	myDB.deleteList.add(this.ParseCSV(item[0]));
                }
               
            }
            /*
             * Test codes for dumping delete list.
             * */
            
            /*
            for(int i = 0; i < myDB.deleteList.size(); i++){
            	System.out.println(myDB.deleteList.get(i));
            }
            */
            
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
