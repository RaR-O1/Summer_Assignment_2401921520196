/*problem1

class Solution {
    public int maxSubArray(int[] nums) {
     int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;   



    }
}

problem2
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
   Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;

    }
}
 



problem3



class Solution {
    public double findMaxAverage(int[] nums, int k) {

   double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxSum = windowSum;

     
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;


    }
}












 


*/