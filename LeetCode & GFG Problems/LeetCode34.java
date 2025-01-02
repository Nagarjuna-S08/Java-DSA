import java.util.Arrays;

class LeetCode34 {
    public static void main(String[] args) {
        int[] a=new int[]{5,7,7,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(a,7)));
    }
    public static int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[]{-1,-1};

        res[0] = FindBound(nums,target,true);

        if(res[0] != -1)
            res[1] = FindBound(nums,target,false);
        
        return res;
    }

    public static int FindBound(int[] nums,int target,boolean left){

        int str=0;
        int end = nums.length-1;
        int b=-1;
        while(str<=end){
            int mid = str +(end-str);
            if(nums[mid]==target){

                b = mid;

                if(left){
                    end=mid-1;
                }
                else{
                    str=mid+1;
                }
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                str=mid+1;
            }
        }

        return b;

    }

}