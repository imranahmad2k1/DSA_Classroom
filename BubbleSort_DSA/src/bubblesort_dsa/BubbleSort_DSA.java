/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort_dsa;

/**
 *
 * @author student
 */
public class BubbleSort_DSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] list = {5,4,3,2,1};
        
        System.out.println("\nBEFORE");
        for(int i:list){
            System.out.print(i+ " ");
        }
        System.out.println("");
        int temp;

        for(int i=0;i<list.length-1;i++){
            for(int j=0;j<list.length-(i+1);j++){
                if(list[j]>list[j+1]){
                    temp = list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        
        System.out.println("\nAFTER");
        for(int i:list){
            System.out.print(i+ " ");
        }
    }
    
    
}
