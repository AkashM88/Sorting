public class InsertionSort {
    public static void insertionsort(int []a ){
        for(int i =1;i<a.length;i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && temp <= a[j]){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = temp;    
        }
    }
    public static void main(String[] args) {
        int a[] = {1,5,2,5,6,4,3};
        insertionsort(a);
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }
}
