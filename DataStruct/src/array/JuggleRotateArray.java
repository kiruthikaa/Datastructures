package array;

import java.util.Scanner;

/*Array Juggling Sort mechanism*/
public class JuggleRotateArray {

	void JuggleRotate( int arr[], int n, int d)
	{
		for(int i = 0;i< gcd(n,d);i++)
		{
			
		}
	}
	
	
	
	int gcd( int a, int b)
	{
		if ( b == 0 )
			return a;
		else 
			return gcd (b,a%b );
	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Driver program
		JuggleRotateArray jugArr = new JuggleRotateArray();
		int arr[] = new int [100];
		System.out.println("Enter the aray size ");
		int n = sc.nextInt();
		System.out.println("Enter the number of rotation");
		int d = sc.nextInt();
		System.out.println("Enter the array elements ");
		for(int c = 0;c<n;c++)
			arr[c] = sc.nextInt();
		jugArr.JuggleRotate(arr, n, d);
	}
}
