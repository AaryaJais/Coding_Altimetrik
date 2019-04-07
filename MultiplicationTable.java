
/**
 * @author Dell
 *
 */
public class MultiplicationTable {
	
	
	/* Method to check the number is Prime or not
	 * parameters - n, Integer
	 * return - isPrimeOrNot Integer
	 */
	public int checkPrimeNumber(int n)
	{
		int  count =  0;
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n % i ==0)
			{
				count++;
			}
		}
	  int isPrimeOrNot = (count > 0) ? 0 : n;
	  return isPrimeOrNot;
	}
	
	/* Method to generate the primeNumber
	 * parameters - number, Integer
	 * return - primenumber Integer[]
	 */
	public int[]  printMultiplicationTable(int number)
	{
		int prime = 3;
		int primeNumber[] = new int[number];
		primeNumber[0] = 2;
		
		for(int k =1;k<number;)
		{
			int result = checkPrimeNumber(prime);
			
			if(result != 0)
			{
				primeNumber[k] = prime;
				k++;
			}
			
			prime++;	
		}
		return primeNumber;
	}
	
	/* Method to multiply the primeNumbers and print the table
	 * parameters - number, Integer
	 * return - void
	 */
	public void printMultiplicationOfPrime(int number)
	{
		 int primeNumbers[] = printMultiplicationTable(number);	 
		 int primeMultiplication[][] = new int[number+1][number +1];
		 
		 
		 for(int i=1;i<=number;i++)
		 {
			primeMultiplication[0][i] = primeNumbers[i-1];
			primeMultiplication[i][0] = primeNumbers[i-1];
		 }
		 
		for(int a=1;a<= number;a++)
		{	
			for(int b=1;b<=number;b++)
			{
				primeMultiplication[a][b] = primeNumbers[a-1] * primeNumbers[b-1];
			}
		}
		
		//print the 2-D matrix
		for(int c=0; c< primeMultiplication.length ;c++)
		{
			for(int d=0;d <primeMultiplication.length;d++)
			{
				System.out.print(primeMultiplication[c][d] + "\t");
			}
			
			System.out.println("");
		}
	}
	
	public static void main(String args[])
	{
		MultiplicationTable mt = new MultiplicationTable();
		//Not taking user input, only 10 Primes
		mt.printMultiplicationOfPrime(10);			
	}

}
