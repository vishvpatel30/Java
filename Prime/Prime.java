import java.util.Scanner;

public class Prime {
	public static boolean primes(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main (String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any number to check weather it's prime");
		int n=scan.nextInt();
		System.out.println(primes(n));
		
	}
}
