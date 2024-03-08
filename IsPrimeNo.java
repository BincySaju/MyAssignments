package assignments.week1;

public class IsPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("number 1 is not a prime number");
System.out.println("Prime numbers in the range of 2 to 10");
int n =5;
boolean prime = true;
		for (int i = 2; i < n-1; i++) {
			
			if (n%i == 0) ////checking prime number
			{
				System.out.println(i);
				prime = false;
				break; // not a prime ;set the flag as false and exit the loop
			}
		}
		if (prime == false) ////flag false prime number
		{
			System.out.println(+n +" is not a prime number ");
		}
		else  ////flag false prime number
		{System.out.println(+n +" is a prime number ");
			
		}
	}
}
