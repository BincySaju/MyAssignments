package assignments.week1;

public class factorialCode {
	public static void main(String[] args) {
		int f=1;
		int n=5;
		for (int i = 1; i < n; i++) {
			f = f*i;
						
		}
		System.out.println("factorial of  " +n +" is " +f);
	}

}
