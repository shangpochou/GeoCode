import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;


public class WriteToCSV extends Procedure{
	public void Task(){
		try {
			Output();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void Output() throws IOException{
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(myDB.outputCSVPath)); 

		String tmpTitle = new String();
		tmpTitle = tmpTitle + '"'+"CityCode"+'"'+","+'"'+"CityName"+'"'+","+'"'+"TownshipCode"+'"';
		tmpTitle = tmpTitle + ","+'"'+"TownshipName"+'"'+","+'"'+"TotalCode"+'"'+","+'"'+"VillageName"+'"';
		bw.write(tmpTitle);
	    bw.newLine();
	    
		for(String key : myDB.geoDataHT.keySet()){
			GeoData tmpGData = myDB.geoDataHT.get(key);

			String temp = new String();
		
			temp = temp + '"' + "\t"+tmpGData.cityCode + '"' + "," + '"' + tmpGData.cityName + '"' + ","  + '"' + '\t' +tmpGData.townshipCode + '"'  + ",";
			temp = temp + '"' + tmpGData.townshipName + '"'+ "," + '"' + "\t"+tmpGData.villageCode + '"'+ "," + '"' + tmpGData.villageName + '"';
					
			bw.write(temp);
			bw.newLine();
			
		}
		
		bw.close();
	}
	
}
