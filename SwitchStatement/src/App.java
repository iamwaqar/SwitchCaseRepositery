
public class App {
	public static void main(String[] args) {

		char switchvalue = 'e';
		switch (switchvalue) {

		case 'A':
			System.out.println("Found A");
			break;

		case 'B':
			System.out.println("Found B");
			break;

		case 'C':
			System.out.println("Found C");
			break;

		case 'D':
			System.out.println("Found D");
			break;

		case 'E':
			System.out.println("Found E");
			break;

		default:
			System.out.println("Nothing found");
			break;
		}

		String month = "January";
		switch (month.toLowerCase()) {

		case "january":
			System.out.println("January");
			break;
		case "febraary":
			System.out.println("Febraary");
			break;
			
			default:
				System.out.println("Not found");
				break;
		}
	}
}
