import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum{
    public static void main(String[] args) {
        int[] arr = new int[]{
            1,2,3,4,5,6,7,-1,0,9,8,100
        };
        int target = -1;
        System.out.println("Index of numbers that add upto "+target+" :"+ 
        Arrays.toString(Solution.twoSum(arr, target)));
    }
    

    static class Solution{
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i<nums.length; i++){
                if(map.containsKey(target-nums[i]))
                    return new int[]{
                        i,map.get(target-nums[i])
                    };
                map.put(nums[i],i);
            }
            return new int[]{-1};
        }
    }
}