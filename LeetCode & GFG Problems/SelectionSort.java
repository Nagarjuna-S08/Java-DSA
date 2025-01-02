import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a= {4,6,3,8,3,8,3,7,99,6,56,8,89,7,6,89} ;

        SelectionSortFun(a);

        System.out.println(Arrays.toString(a));
    }

    public static void SelectionSortFun(int[] ind) {

        for(int i=0;i<ind.length-1;i++){
            int minInd = FindMinInd(ind,i);
            swap(i,minInd,ind);
        }
    }

    public static int FindMinInd(int[] ind,int str){
        int min =str;
        for(int i=str;i<ind.length;i++){
            if(ind[min] > ind[i]){
                min = i; 
            }
        }
        return min;
    }

    public static void swap(int i,int min,int[] ind){
        int temp = ind[i];
        ind[i] = ind[min];
        ind[min] = temp;
    }

}
