/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgorithms;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements in Array: ");
        int x = sc.nextInt();
        LinearSearch ls = new LinearSearch(x);
        int result = ls.search(50);
        //int result = ls.LinearSearch(list,50);
        System.out.println("Element found in Index "+result);
        
    }
    
    
}
