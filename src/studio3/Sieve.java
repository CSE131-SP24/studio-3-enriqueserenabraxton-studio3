package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Maximum: ");
		int n = in.nextInt();
		
		Boolean[] sieve = new Boolean[n];
		
		for(int j = 2; j < Math.sqrt(n); j++)
		{
		
		for(int i = j*j; i < n; i = i + j )
		{
				sieve[i] = false;
				
			}
		}
		
for(int x = 2; x < sieve.length; x++)
{
	if(sieve[x] = true)
	{
	System.out.println(x);
	}
}
}
}
