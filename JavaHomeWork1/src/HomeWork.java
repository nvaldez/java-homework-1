import java.util.Scanner;
public class HomeWork {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String letterGrade = "";
		
		System.out.print("Please enter the student's grade: ");
		int grade = Integer.parseInt(input.nextLine());
		
		if(grade < 0 || grade > 100) {
			System.out.println("Wrong score. The score needs to be between 0 and 100");
		}
		else if(grade >=0 && grade < 60) {
			System.out.println("Your grade is: F");
			letterGrade = "F";
		}
		else if(grade >= 60 && grade < 70 ) {
			System.out.println("Your grade is: D");	
			letterGrade = "D";
		}
		else if(grade >= 70 && grade < 80 ) {
			System.out.println("Your grade is: C");	
			letterGrade = "C";
		}
		else if(grade >= 80 && grade < 90 ) {
			System.out.println("Your grade is: B");	
			letterGrade = "B";
		}
		else if(grade >= 90 && grade < 101 ) {
			System.out.println("Your grade is: A");
			letterGrade = "A";
		}
		
		
		switch (letterGrade) {
		case "A":
			System.out.println("Your score was between 90-100" );
			break;
		case "B":
			System.out.println("Your score was between 80 - 89");
			break;
		case "C":
			System.out.println("Your score was between 70 - 79");
			break;
		case "D":
			System.out.println("Your score was between 60 - 69");
			break;
		default:
            System.out.println("Error!");
            System.out.println("The grade you entered is not valid");
		}
		
		
				
	}

}
