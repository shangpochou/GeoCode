import java.util.*;


public class DataBase {
	
	
	public ArrayList<GeoData> geoDataAL;
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
		this.geoCodePath = new String("GeoCode102.csv");
		this.deleteListPath = new String("deleteList99_1.csv");
		this.addListPath = new String("addList99.csv");
		this.outputCSVPath = new String("GeoCode99.csv");
		this.geoDataAL = new ArrayList<GeoData>();
		this.deleteList = new ArrayList<String>();
		this.geoDataHT = new Hashtable<String, GeoData>();
	}
	
	public static DataBase GetDataBase(){
		if(myDataBase == null){
			myDataBase = new DataBase();
		}
		return myDataBase;
	}
	
}
