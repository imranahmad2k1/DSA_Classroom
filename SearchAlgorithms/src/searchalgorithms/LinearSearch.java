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
    int indexes[];
    int count;
    public LinearSearch(int x){
        Random rand = new Random();
        list=new int[x];
        for(int i=0;i<list.length;++i){
            x = rand.nextInt(100);
            list[i] = x;
            System.out.println(x);
        }
    }
    public void search(int x){
        int result=-1;
        int ind=0;
        indexes=new int[count];
        for(int i=0;i<list.length;++i){
            if (list[i] == x){
                indexes[ind]=i;
                ind+=1;
            }
            else{
                result = -1;
            }
        }
        if(indexes.length>0){
            for(int i =0;i<indexes.length;++i){
                System.out.println("Instance " + (i+1) + " found at Index: "+indexes[i]);
            }
        }
        else{
            System.out.println("-1");
        }
    }
    public int searchInstances(int x){
        count=0;
        for(int i=0;i<list.length;++i){
            if (list[i] == x){
                count += 1;
            }
        }
        return count;
    }
}
