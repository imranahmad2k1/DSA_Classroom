package com.mycompany.datastructures;


public class StackDS {
    public int[] A= new int[5];
    public int top=-1;
    
    void push(int x){
        if(top!=A.length-1){
            top++;
            A[top]=x;
        }
    }
    
    int pop(){
        if(top>-1){
            int x=A[top];
            top--;
            return x;
        }
        return -1;
    }
}
