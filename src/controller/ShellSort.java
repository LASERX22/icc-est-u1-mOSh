package  controller;
public class ShellSort{
    public void sort(int[] arr, boolean orden){
        int n=arr.length;
        if (orden==true) {
            for(int gap = n/2;gap>0;gap/=2){
                //Insercion
                int cambios=0;
                for(int i=gap;i<n;i++){
                    int temp=arr[i];
                    int j=i;
                    while(j>=gap && arr[j-gap]>temp){
                        arr[j]=arr[j-gap];
                        j-=gap;
                        cambios++;
                    }
                    arr[j]=temp;
                }
                System.out.println(cambios+" Cambios en Gap "+gap);
                //Ver el estado actual
                printArray(arr);
            }
        }
        else{
            for(int gap = n/2;gap>0;gap/=2){
                //Insercion
                int cambios=0;
                for(int i=gap;i<n;i++){
                    int temp=arr[i];
                    int j=i;
                    while(j>=gap && arr[j-gap]<temp){
                        arr[j]=arr[j-gap];
                        j-=gap;
                        cambios++;
                    }
                    arr[j]=temp;
                }
                System.out.println(cambios+" Cambios en Gap "+gap);
                //Ver el estado actual
                printArray(arr);
            }
        }
        
    }
    public void printArray(int[] a){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}