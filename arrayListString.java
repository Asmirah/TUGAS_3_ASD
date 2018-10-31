import java.util.ArrayList;


public class arrayListString {

	public static void main(String[] args) {
		ArrayList<String> arls= new ArrayList<String>();
		// menambahkan
		arls.add("ASMIRAH");
		arls.add("FAHMI");
		arls.add("MARDIANA");
		System.out.println(arls);
		//menghapus
		arls.remove("ASMIRAH");
		System.out.println(arls);
		
		ArrayList<String> arlS= (ArrayList<String>)arls.clone();
		arlS.add("ACCUL");
		System.out.println("arls" +arls);
		System.out.println("arlS" +arlS);
		
		System.out.println("kosongkah:" + arls.isEmpty());
		if (arls.contains("ASMIRAH"))
			System.out.println(" ada ASMIRAH");
		else{
			System.out.println("tak ada ASMIRAH");
		}
		System.out.println("arl1" +arls);
		System.out.println("arl2" +arlS);
			
	}

}
