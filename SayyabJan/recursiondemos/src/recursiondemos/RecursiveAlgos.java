
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
    
    public int Fibonacci(int n)
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
    
    public int EuGCD(int a, int b){
        if(b>a){
            int temp = b;
            b = a;
            a = temp;
        }
        
        int r = a%b;
        if(r==0){
            return b;
        }
        else{
            return EuGCD(r,b);
        }
        
    }
    
    public int Triangular(int b){
        if(b==1){
            return 1;
        }
        else{
            return b+Triangular(b-1);
        }
    }
    
    public int SquareSum(int b){
        if(b==1){
            return 1;
        }
        else{
            return b*b+SquareSum(b-1);
        }
    }
    
    public int PowerofNumber(int n,int p){
        if(p==1){
            return n;
        }
        else{
            return n*PowerofNumber(n,p-1);
        }
    }
    

}
