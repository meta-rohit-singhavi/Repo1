package Assignment2;

import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj= new Calculator();
		char opr= chooseOperator();
		double number1= 0;
		double number2= 0;
		
		Scanner scan= new Scanner(System.in);
		try{
			System.out.print("Enter first Number:");
			number1= scan.nextInt();
			System.out.print("Enter second Number:");
			number2= scan.nextInt();
			}catch(Exception e){
				System.out.println("Enter Valid Number");  //exception case when not valid number	
			}	
			obj.calPerform(number1, number2, opr);
	}//End of main
	
	/**
	 * This method is used to take input operator
	 * @return It returns operator
	 */
	public static char chooseOperator(){
		char op;
		
		System.out.println("'+'-->Addition \n '-'-->Subtraction \n '*'-->Multipication \n '/'-->Divide ");
		System.out.print("Enter Your Choice");
		
		Scanner scan = new Scanner(System.in);
		op = scan.next().trim().charAt(0);
		if(op =='+' || op =='-' || op == '*'|| op == '/'){
			return op;
		}else{
			System.out.println("Enter valid operator"); //exeption case when not valid operator
			return ' ';
		}		
	}
}