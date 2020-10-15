/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class main {
    public static void main(String[] args){
        int[] list = new int[]{1,2,3,4,5};
        int low=0;
        int high=list.length-1;
        int target=4;
        int ans;
        while(low<=high){
            ans=(low+high)/2;
            if(target==list[ans]){
                System.out.println("Target on index: "+ans);
                break;
            }
            else if(target<list[ans]) high = ans-1;
            else if(target>list[ans]) low = ans+1;
        }
        
    }
}
