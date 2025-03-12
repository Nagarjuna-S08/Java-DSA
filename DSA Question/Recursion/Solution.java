import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] permute(int n, long k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        int i=1;
        double lim = 1;
        while(k>0){
            lim*=k;
            k--;
        }
        int cnt=1;
        while(i<=lim){
            ArrayList<Integer> res = nextPeru(arr);
            if(res.equals(arr)){
                i++;
            }
            else{
                cnt++;
            }
            
            if(cnt==k){
                // break;
                int[] res2 = new int[res.size()];
                for(int j=0;j<res2.length;j++){
                    res2[j]=res.get(j);
                }
                return res2;
            }
        }
        return new int[]{ };
    }

    public ArrayList<Integer> nextPeru(ArrayList<Integer> arr){
        int last = arr.get(arr.size()-1);

        for(int k=arr.size()-1;k>=0;k--){
            last = arr.get(k);
            for(int i=arr.size()-1;i>=0;i--){
                if(last>arr.get(i)){
                    // if((arr.get(i)%2==0 && last%2==0)|| (arr.get(i)%2!=0 && last%2!=0)){
                    //     continue;
                    // }
                    // else{
                        // System.out.println(arr +" Brfore");
                        int f = arr.get(i);
                        // int s = arr.get(i-1);
                        arr.set(i,last);
                        arr.set(arr.size()-1,f);
                        // System.out.println(arr +" After");
                        return arr;
                    // }
                    
                }
            }
            System.out.println(arr +" Brfore");
        }
        return arr;
        
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.permute(4,8)));
    }
}