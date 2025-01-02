import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a= {4,6,3,8,3,8,3,7,99,6,56,8,89,7,6,89} ;

        BubbleSortFun(a);

        System.out.println(Arrays.toString(a));
    }

    public static void BubbleSortFun(int[] a){
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            flag=false;
            for(int j=1;j<a.length-1;j++){
                if(a[j-1] > a[j]){
                    int t = a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
