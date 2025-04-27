import java.util.Arrays;

public class MaximumProductDifference {
    public static int maxProductDifference(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: The two largest elements will be at the end
        int n = nums.length;
        int largest1 = nums[n - 1]; // largest
        int largest2 = nums[n - 2]; // second largest

        // Step 3: The two smallest elements will be at the start
        int smallest1 = nums[0]; // smallest
        int smallest2 = nums[1]; // second smallest

        // Step 4: Calculate the maximum product difference
        return (largest1 * largest2) - (smallest1 * smallest2);
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 6, 2, 7, 4};
        System.out.println("Maximum Product Difference: " + maxProductDifference(nums1)); 
        // Output: 34

        int[] nums2 = {4, 2, 5, 9, 7, 4, 8};
        System.out.println("Maximum Product Difference: " + maxProductDifference(nums2));
        // Output: 64
    }
}
