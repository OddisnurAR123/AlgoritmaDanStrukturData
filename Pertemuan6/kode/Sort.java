public class Sort {
    public int [] data;
    public int jumData;
    
    public Sort(int Data[], int jmlData){
        jumData=jmlData;
        data=new int [jmlData];
        for (int i=0; i<jumData; i++){
            data[i]=Data[i];
        }
    }

    void bubbleSort(){
        int temp=0;
        for (int i=0; i<jumData-1; i++){
            for (int j=1; j<(jumData-i); j++){
                // Secara ASC
                /*if (data[j-1]>data[j]){
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }*/

                // Diubah Secara DESC
                if (data[j-1]<data[j]){
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }

    void selecionSort(){
        for (int i=0; i<jumData-1; i++){
            // Secara ASC
            /*int min=i;*/

            // Diubah secara DESC
            int max = i;

            for (int j=i+1; j<jumData; j++){
                // Secara ASC
                /*if(data[j]<data[min]){
                    min=j;
                }*/

                // Diubah secara DESC
                if (data[j] > data[max]) {
                    max = j;
                }

            }
            // Secara ASC
            /*int temp=data[i];
            data[i]=data[min];
            data[min]=temp;*/

            // Diubah secara DESC
            int temp = data[i];
            data[i] = data[max];
            data[max] = temp;
        }
    }

    public void tampilData(){
        for (int i=0; i<jumData; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}