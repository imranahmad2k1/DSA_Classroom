package sortingapp;

public class SortingAlgos 
{
    private int bSwap;
    private int bComp;
    private int sSwap;
    private int sComp;
    private int temp;
    private int min;
    private int ind;
    private double btimeElapsed;
    private double stimeElapsed;
    
    void SortingAlgos()
    {
        bSwap = 0;
        bComp = 0;
        sSwap = 0;
        sComp = 0;
    }
    public void SelectionSort(int sList[]){
        long s_startTime =  System.nanoTime();
        for(int i=0;i<sList.length-1;i++){
            int index=i;  
            for(int j=i+1;j<sList.length;j++){
                sComp++;
                if(sList[j]<sList[index]){
                    index=j;
                }  
            }  
            min=sList[index];   
            sList[index]=sList[i];  
            sList[i]=min;  
            sSwap++;
        }
        long s_endTime =  System.nanoTime();
        double time = s_endTime - s_startTime;
        stimeElapsed = time/1000000000;
    }
    public void BubbleSort(int bList[])
    {
        long startTime =  System.nanoTime();
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
    long endTime =  System.nanoTime();
    double time = endTime - startTime;
    btimeElapsed = time/1000000000;
    
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
        String bformat = String.format("Selection Sort Time:        %.2eseconds",btimeElapsed);
        System.out.println(bformat);
        System.out.println("Selection Sort Comparisons    : "+sComp);
        System.out.println("Selection Sort Swaps         : "+sSwap);
        String sformat = String.format("Selection Sort Time:        %.2eseconds",stimeElapsed);
        System.out.println(sformat);
        
    }
    
}
