/*   Problem 1
class Solution {
    public void moveZeroes(int[] nums) {
         int insertPos = 0;
        
 
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }


    }
}
Problem 2

 class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos--] = leftSq;
                left++;
            } else {
                result[pos--] = rightSq;
                right--;
            }
        }

        return result;
    }
}

Problem 3

class Solution {
    public int maxArea(int[] height) {
              int left = 0, right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int water = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, water);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}


*/ 
