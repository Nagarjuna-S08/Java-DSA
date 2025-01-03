import java.util.*;
class subset78{
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        System.out.println(subsets(nums));
    }
        public static List<List<Integer>> subsets(int[] nums) {
            return subsetFun(nums,new ArrayList<>(),0);
        }
        public static List<List<Integer>> subsetFun(int[] nums,List<Integer> arr,int ind){
            if(ind>=nums.length){
                List<List<Integer>> a = new ArrayList<>();
                a.add(new ArrayList<>(arr)); // Create a copy of the list
                return a;
            }
            List<List<Integer>> fin = new ArrayList<>();
            arr.add(nums[ind]);
            fin.addAll(subsetFun(nums,arr,ind+1));
            arr.remove(arr.size()-1);
            fin.addAll(subsetFun(nums,arr,ind+1));
    
            return fin;
        }
}