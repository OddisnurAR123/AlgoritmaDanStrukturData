public class MainSort {
    public static void main(String[] args){
        int a[]={15,10,7,22,5};
    
        Sort urut=new Sort(a, a.length);
        System.out.println("Data sebelum urut");
        urut.tampilData();
        urut.bubbleSort();
        urut.selecionSort();

        System.out.println("Data setelah urut Bubble sort (DESC)");
        urut.tampilData();

        System.out.println("Data setelah urut Selection sort (DESC)");
        urut.tampilData();
        

     }
}