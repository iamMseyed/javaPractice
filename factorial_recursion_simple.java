import java.util.Scanner;
public class Factorail_of_number_Recurrsion_WithoutRecursion {
	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		try(s;){
			System.out.println("Enter any positive number to find factorial:");
			long n = s.nextLong();
			if(n>=0) {
				System.out.println("Via Recursion, factorial of "+n+" is: "+findFactorialWithRecursion(n));
				System.out.println("Via no Recursion, factorial of "+n+" is: "+findFactorialWithoutRecursion(n));
			}
			else
				System.out.println("Can't find factorial of negative numbers!");
		}catch(Exception e) {
			System.out.println("Must be a number!");
		}
	}
	public static long findFactorialWithoutRecursion(long num) {
		long totalFac = 1;
		while(num>=1) {
			totalFac = totalFac*num;
			num--;
		}
		return totalFac; 
	}
	public static long findFactorialWithRecursion(long num) {
		if(num>0) {
			return num * findFactorialWithRecursion(num - 1);
		}
		else {
			return 1; // need to have base value at any cost to stop the recursion.
		}
	}
}
