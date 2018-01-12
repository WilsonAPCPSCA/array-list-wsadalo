import java.util.ArrayList;
public class emperorsNewGrove {

	public static void main(String[] args) {
		ArrayList<String> emperorCast = new ArrayList<String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.println("Original List: "+emperorCast);
		
		emperorCast.add(3,"Chaca");
		emperorCast.add(4,"Tipo");
		emperorCast.add("Bucky");
		emperorCast.add("Pacha");
		emperorCast.remove(1);
		System.out.print("Modified List: "+emperorCast);
	}

}
