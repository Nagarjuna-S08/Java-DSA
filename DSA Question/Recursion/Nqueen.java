import java.util.Arrays;

public class Nqueen {
    public static void main(String[] args) {
        int n=4;
        char[][] arr = new char[n][n];
        Nqueen(arr, n, 0);
    }

    public static void Nqueen(char[][] arr,int n,int i){
        if(n<=i){
            System.out.println(Arrays.deepToString(arr));
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(i,j,arr)){
                arr[i][j]='Q';
                Nqueen(arr,n,i+1);
                arr[i][j]='.';
            }
        }
    }

    public static boolean isSafe(int i,int j,char[][] arr){
        for(int k=0;k<arr[i].length;k++){
            if(arr[i][k]=='Q'){
                return false;
            }
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k][j]=='Q'){
                return false;
            }
        }
        int r=i,c=j;
        while(r>=0 && c<arr.length){
            if(arr[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        r=i;
        c=j;
        while(r>=0 && c>=0){
            if(arr[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        return true;
    }
}
