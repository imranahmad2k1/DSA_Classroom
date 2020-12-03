/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructures;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args){
        StackDS stack = new StackDS();
        
        stack.push(5);
        for(int i:stack.A){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        stack.push(6);
        for(int i:stack.A){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        stack.push(7);
        for(int i:stack.A){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        stack.push(8);
        for(int i:stack.A){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        stack.push(9);
        for(int i:stack.A){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        System.out.println("\nPopped: "+stack.pop());
        System.out.println("\nPopped: "+stack.pop());
        System.out.println("\nPopped: "+stack.pop());
        for(int i:stack.A){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        stack.push(11);
        for(int i:stack.A){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        stack.push(12);
        for(int i:stack.A){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        stack.push(13);
        for(int i:stack.A){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        stack.push(14);
        for(int i:stack.A){
            System.out.print(i + " ");
        }
    }
    
}
