import java.util.*;


public class DataBase {
	
	/*
	 * Hashtable which keeps all the Geo data
	 * */
	public Hashtable<String, GeoData> geoDataHT;
	/*
	 * An arraylist contains all IDs we want to delete
	 * */
	public ArrayList<String> deleteList;
	
	public String geoCodePath;
	
	public String deleteListPath;
	
	public String addListPath;
	
	public String outputCSVPath;
	//singulaton 
	private static DataBase myDataBase;
	
	/*
	 * Constructor, and config here.
	 */
	public DataBase(){	
		this.deleteList = new ArrayList<String>();
		this.geoDataHT = new Hashtable<String, GeoData>();
	}
	
	public void SetPath(String geoCodePath, String deleteListPath, String addListPath, String outputPath){
		this.geoCodePath = geoCodePath;
		this.deleteListPath = deleteListPath;
		this.addListPath = addListPath;
		this.outputCSVPath = outputPath;
	}
	
	public static DataBase GetDataBase(){
		if(myDataBase == null){
			myDataBase = new DataBase();
		}
		return myDataBase;
	}
	
}
