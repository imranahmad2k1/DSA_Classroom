/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_dsa;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Arrays_DSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        int high=0;
        int low=0;
        int num, total, avg;
        System.out.print("Total Tests: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int array[] = new int[N];
        for(int i=0;i<N;++i){
            System.out.println("Marks in Test " + (i+1));
            num = sc.nextInt();
            array[i]=num;
            sum=sum+num;
        }
        
        total = sum;
        avg = total/N;
        for (int i:array){
            if (i>high){
                high = i;
            }
            low = high;
            if (i<low){
                low = i;
            }
        }
        
        
       
        System.out.println("Student Transcript");
        System.out.println("-------------------");
        System.out.println("Total Marks: "+total);
        System.out.println("Average Marks: "+avg);
        System.out.println("Highest Marks: "+high);
        System.out.println("Lowest Marks: "+low);
        
    }
    
}
