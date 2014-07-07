import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


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
	
	/*		
			temp = temp + '"' + tmpGData.cityName + '"' + "," + '"' + tmpGData.townshipName + '"'+ "," + '"' + tmpGData.villageName + '"' + ",";
	//		temp = temp + '"' + tmpGData.cityCode + '"' + "," + '"' + tmpGData.townshipCode + '"';
			temp = temp + '"' + tmpGData.cityCode + '"' + "," + '"' + tmpGData.townshipCode + '"'+ "," + '"' + tmpGData.totalCode + '"';
	*/		
			temp = temp + '"' + tmpGData.cityCode + '"' + "," + '"' + tmpGData.cityName + '"' + ","  + '"' + tmpGData.townshipCode + '"'  + ",";
			temp = temp + '"' + tmpGData.townshipName + '"'+ "," + '"' + tmpGData.totalCode + '"'+ "," + '"' + tmpGData.villageName + '"';
		
			
			bw.write(temp);
			bw.newLine();
			
		}
		bw.close();
	}
	
}
