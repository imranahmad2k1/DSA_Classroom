/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiondemos;

/**
 *
 * @author AHMED SAYYAB
 */
public class RecursiveAlgos {
    
    public int Factorial(int n)
    {
        if (n==0)
        {
            return 1;
        }
        
        else
            return n*Factorial(n-1);
        
    
    }
    
    public int linearsum(int A[] , int n)
    {
        if (n==1)
        {
            return A[0];
        }
        
        else
            return A[n-1] + linearsum(A , n-1);
    
    }
    
    public void reverseArray(int A[], int i, int j)
    {
	if (i < j)
        {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		reverseArray(A, i+1, j-1);
	}
	// in base case, do nothing
    }
    
    public static int Fibonacci(int n)
    {
	if(n == 0)
        {
		return 0;
	}
	if(n == 1 || n == 2)
        {
			return 1;
        }
	return Fibonacci(n-2) + Fibonacci(n-1);
	}

}
