package Assignment2;

public class Operation {
	double result;
	public Operation() {
		// TODO Auto-generated constructor stub
	result=0;
	}
	void addition(double number1, double number2){
		result= number1 + number2;
	}
	void multiplication(double number1, double number2){
		result= number1 * number2;
	}
	void substraction(double number1, double number2){
		result= number1 - number2;
	}
	void divide(double number1, double number2){
		result= number1 / number2;
	}
	
	double getResult(){
		return result;
	}

}
