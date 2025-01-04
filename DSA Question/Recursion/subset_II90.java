import java.util.*;
class subset_II90{
    public static void main(String[] args){
        int[] nums = new int[]{1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res =new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        int str=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            str=0;
            if(i>0 && nums[i]==nums[i-1]){
                str=end+1;
            }
            end=res.size()-1;
            int size=res.size();
            for(int j=str;j<size;j++){
                List<Integer> out = new ArrayList<Integer>(res.get(j));
                out.add(nums[i]);
                res.add(out);
            }
        }
        return res;
    }
}