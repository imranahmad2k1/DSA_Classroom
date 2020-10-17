package sortingapp;

public class SortingAlgos 
{
    private int bSwap;
    private int bComp;
    private int temp;
    
    void SortingAlgos()
    {
        bSwap = 0;
        bComp = 0;
    }
    
    public void BubbleSort(int bList[])
    {
        
        for(int i=0;i<bList.length-1;i++){
            for(int j=0;j<bList.length-(i+1);j++){
                bComp++;
                if(bList[j]>bList[j+1]){
                    temp = bList[j];
                    bList[j]=bList[j+1];
                    bList[j+1]=temp;
                    bSwap++;
                }
            }
        }
    
    
    }
    
    public void PrintList(int List[])
    {
        for(int i=0; i<List.length; i++)
        {
            System.out.print(List[i]+" ");
        }
        
    }
    
    public void PrintReport()
    {
        System.out.println("----------------------------------");
        System.out.println("\t Comparison Chart");
        System.out.println("----------------------------------");
        System.out.println("Bubble Sort Comparisons    : "+bComp);
        System.out.println("Bubble Swaps Swaps         : "+bSwap);
        
    }
    
}
