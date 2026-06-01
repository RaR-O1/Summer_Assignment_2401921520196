// Problem 1
import java.util.Map;
import java.util.HashMap;


class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{};
    }
}

//problem 2
/*  
class Solution {
    public int removeDuplicates(int[] nums) {
        
         int k = 1;

          for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        
        return k;
    }
}

problem 3



class Solution {
    public int maxProfit(int[] prices) {

       int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

       for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;           
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);  
            }
        }

        return maxProfit;
    }
}



    */