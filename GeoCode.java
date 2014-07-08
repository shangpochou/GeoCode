import java.util.ArrayList;


public class GeoCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataBase myDB = DataBase.GetDataBase();
	
		myDB.SetPath(args[0], args[1], args[2], args[3]);
		
		ArrayList<Procedure> myProcAL = new ArrayList<Procedure>();
		
		ReadCSV myRCSV = new ReadCSV();
		myProcAL.add(myRCSV);
		
		ReadDeleteList myRDL = new ReadDeleteList();
		myProcAL.add(myRDL);
		
		DeleteIDfromList myDIFL = new DeleteIDfromList();
		myProcAL.add(myDIFL);
		
//		AddFromList myAFL = new AddFromList();
//		myProcAL.add(myAFL);
		
		AddFromListII myAFLII = new AddFromListII();
		myProcAL.add(myAFLII);
		
		WriteToCSV myWCSV = new WriteToCSV();
		myProcAL.add(myWCSV);
				
		for(int i = 0; i < myProcAL.size(); i++){
			myProcAL.get(i).GetData(myDB);
			myProcAL.get(i).Task();
		}
		
		
	}

}
