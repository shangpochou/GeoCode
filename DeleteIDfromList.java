
public class DeleteIDfromList extends Procedure{

	public void Task(){
		for(int i = 0; i < myDB.deleteList.size(); i++){
			GeoData tmpData = myDB.geoDataHT.get(myDB.deleteList.get(i));
//			System.out.println(myDB.deleteList.get(i));	
		
			if(myDB.geoDataHT.remove(myDB.deleteList.get(i)) == null){
				System.out.println("remove fail");
				System.out.println(myDB.deleteList.get(i));
			}

		}
		
	}
}
