import java.util.Scanner;
public class sesliHarfler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Sesli harf giriniz : ");
		String sesliHarf=input.nextLine();
		
		sesliHarf=sesliHarf.toUpperCase();
		
		/*switch (sesliHarf){
		case "A":
			System.out.println("kalın sesli");
			break;
		case "I":
			System.out.println("kalın sesli");
			break;
		case "O":
			System.out.println("kalın sesli");
			break;
		case "U":
			System.out.println("kalın sesli");
			break;
		case "E":
			System.out.println("ince sesli");
			break;
		case "İ":
			System.out.println("ince sesli");
			break;
		case "Ö":
			System.out.println("ince sesli");
			break;
		case "Ü":
			System.out.println("ince sesli");
			break;
			default:
				System.out.println("Geersiz input");
			}*/
		
		if (sesliHarf.equals("A")||sesliHarf.equals("O")||sesliHarf.equals("I")||sesliHarf.equals("U")) {
			System.out.println("kalin sesli harf");
			
		}
		else if (sesliHarf.equals("E")||sesliHarf.equals("İ")||sesliHarf.equals("Ö")||sesliHarf.equals("Ü")){
			System.out.println("ince sesli harf");
		}
		else {
			System.out.println("Gecersiz input");
		}

	}

}
