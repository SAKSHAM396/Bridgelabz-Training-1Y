import java.util.Scanner;
class CelsiusToFahrenheitConversion{
	public static void main(String [] args){
		Scanner am=new Scanner(System.in);
		int Celsius=am.nextInt();
		float Fahrenheit=(Celsius*9.0f/5)+32;
		System.out.println(Fahrenheit);
		
	} 
}