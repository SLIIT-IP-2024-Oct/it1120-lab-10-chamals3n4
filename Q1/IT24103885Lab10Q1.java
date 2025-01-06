import java.util.Scanner;
public class IT24103885Lab10Q1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the marks(0-100) : ");
		
		int mark = scanner.nextInt(); 
		char grade;
		assert (mark>=0&&mark<=100):"invalid marks";

		System.out.println("mark is validated");
		
		if(mark>=75)
			grade='A';
		else if(mark>=60&&mark<=74)
			grade='B';
		else if(mark>=50&&mark<=59)
			grade='C';
		else if(mark>=40&&mark<=49)
			grade='D';
		else
			grade='F';

		assert ( 
            		(grade == 'A' && mark >= 75) || 
            		(grade == 'B' && mark >= 60 && mark < 75) || 
            		(grade == 'C' && mark >= 50 && mark < 60) || 
            		(grade == 'D' && mark >= 40 && mark < 50) || 
            		(grade == 'F' && mark < 40)
       		) : "incorrect grade assigned";

		System.out.println("the grade for the entered mark is " + grade);


	
	}
}