class Solution {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;

        int low = 0;
        int high = n - 1;



            while (low <= high) {
            int mid = low + (high - low) / 2; // This prevents potential integer overflow

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low; // 'low' is the correct insertion position
    }

        
    }
