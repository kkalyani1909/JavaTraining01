
public class VariableJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable 
		//Data type are as follows
		
		boolean isFun = true;
		boolean isBoring = false;
		System.out.println(isFun);
		System.out.println(isBoring);
		
		
		int num1 = 128;
		System.out.println(num1);
		
		int num2 = 50000;
		System.out.println(num2);
		
		int a = 5;
		int b = 8;
		int c = a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		short x = 25005;
		short y = 25647;
		System.out.println(x);
		System.out.println(y);
		// maximum 5 digits acceptable to run the script.
		
		
		long Mynum = 52361426;
		System.out.println(Mynum);
		
		
		double Mynum1 = 4224.25;
		System.out.println(Mynum1);
		// double can hold integers and decimals
		
		//float Salary = 2.1;
		// This syntax not working 
		
		//byte n = 100;
		// This syntax not working
		
		char MyGrade = 'B';
		System.out.println(MyGrade);
		
		
		char FirstDiv = 'E';
		char SecondDiv = 'F';
		char ThirdDiv = 'G';
		System.out.println(FirstDiv + "FirstDiv");
		System.out.println(SecondDiv + "SecondDiv");
		System.out.println(ThirdDiv + "ThirdDiv");
		// assigning values to the character.
		
		
		//Some arithmetic operations
		//addition
		int k = 200 + 30;
		System.out.println(k);
		
		// addition with a variable and a value
		int sum1 = 150 + 50;
		int sum2 = sum1 + 100;
		int sum3 = sum1 + sum2;
		int sum4 = sum2 + sum3;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		
		//subtraction 
		int h = 500 - 30;
		System.out.println(h);
		
		//subtraction with a variable and a value
		int sum5 = 200 - 40;
		int sum6 = sum5 - 50;
		int sum7 = sum6 - 100;
		System.out.println(sum5);
		System.out.println(sum6);
		System.out.println(sum7);
		
		//multiplication
		int m = 5 * 3;
		System.out.println(m);
		
		//multiplication with a variable and a value
		int sum8 = 2 * 5;
		int sum9 = sum8 * 3;
		int sum10 = sum8 * sum9;
		System.out.println(sum8);
		System.out.println(sum9);
		System.out.println(sum10);
		
		//division
		int n = 8/2;
		System.out.println(n);
		
		//division with a variable and a value
		int sum11 = 9/3;
		int sum12 = sum11/2;
		int sum13 = sum11/3;
		System.out.println(sum11);
		System.out.println(sum12);
		System.out.println(sum13);
		
		//modulus (percentage)
		int p = 10;
		int q = 5;
		System.out.println(p % q); // will get round off answer actual ans is 0.5
		
		// swipe two variable data value eg values of r to s and s to r 
		 // where r = 5, s = 2, temp = 0
		
		//before swiping the values
		int r = 5;
		int s = 2;
		
		System.out.println("Value of r:" + r);
		System.out.println("Value of s:" + s);
		
	//after swiping the value with temp
		int temp = r;
		r = s;
		s = temp;
		System.out.println("After swaping");
		System.out.println("Value of r:" + r);
		System.out.println("Value of s:" + s);
		
		
	//swiping the value without temp --add both the numbers and assign it to first
		r = r + s;
		s = r - s;
		r = r - s;
		System.out.println("After swaping without using temp");
		System.out.println("Value of r:" + r);
		System.out.println("Value of s:" + s);
		
		
	
		 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
