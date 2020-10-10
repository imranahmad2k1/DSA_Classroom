/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgorithms;
import java.util.Random;

/**
 *
 * @author student
 */
public class LinearSearch {
    int list[];
    public LinearSearch(int x){
        Random rand = new Random();
        list=new int[x];
        for(int i=0;i<list.length;++i){
            x = rand.nextInt(100);
            list[i] = x;
            System.out.println(x);
        }
    }
    public int search(int x){
        int result=-1;
        for(int i=0;i<list.length;++i){
            if (list[i] == x){
                result = i;
                break;
            }
            else{
                result = -1;
            }
        }
        return result;
    }
}
