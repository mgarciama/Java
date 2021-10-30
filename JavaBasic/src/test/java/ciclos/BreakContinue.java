package ciclos;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador2;
		 for ( contador2 = 0; contador2 < 3; contador2++) {
			 
//			 if(contador2 % 2 == 0) {
//				 System.out.println("solo par : " + contador2);
//				 break;
//			 }
			 if (contador2 % 2 !=0) {
				continue; // ir a la siguiente iteración 
			}
			 System.out.println("solo par " + contador2);
		}
	}

}
