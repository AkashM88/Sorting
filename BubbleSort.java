public class BubbleSort{
    public static void bubblesort(int a[]){
        int temp =0;
        for(int i =0;i<a.length;i++){
            for(int j =1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    
                 temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
            
                }
            }
        }
    }
public static void main(String[] args) {
    int a[] ={1,3,6,2,7,5};
    bubblesort(a);
    for(int i =0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
}
} 