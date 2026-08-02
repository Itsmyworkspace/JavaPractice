package dsa;

public class Leetcode75BruteForceSolution {
    /*
     * 1. Two Sum
     * Given an array of integers and a target value,
     * return the indices of two numbers whose sum
     * equals the target
     *
     * input: [2,7,11,15], target=9
     * output: [0,1]
     */
    public void twoSum(int[] arr, int target){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("["+i+","+j+"]");

                }
            }
        }
    }

    /*
     * 2. Best Time to Buy and Sell Stock
     * Given stock prices where prices[i] is the price
     * on day i. find the maximum profit you can achieve
     * by buying once and selling once
     *
     * input: [7,1,5,3,6,4]
     * output: 5
     */
    public void profitStocks(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]>max){
                    max=Math.max(max,arr[j]-arr[i]);
                }
            }
        }
        System.out.println("Max Profit: "+max);
    }

    /*
     * 3. Contains Duplicate
     * Determine whether any value appears at least
     * twice in the array
     *
     * input: [1,2,3,1,4]
     * output: true
     */
    public void containsDuplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Array contains duplicates");
                }
            }
        }
    }


    /*
     * 4. Product of Array Except Self
     * For each element, return the product of
     * all otherelements except itself. Donot use division
     *
     * input: [1,2,3,1,4]
     * output: true
     */
    public void arrayProduct(int[] arr){
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                product*=arr[j];
            }
            System.out.print(product+" ");
        }
        System.out.print("\n");
    }


    /*
     * 5. Maximum Sum Subarray
     * Find the contiguous subarray having the largest sum.
     *
     * input: [-2,1,-3,4,-1,2,1,-5,4]
     * output: 6
     */
    public void maxSumSubarray(int[] arr){
        int max = Integer.MIN_VALUE, start = 0, end=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum > max){
                    max = sum;
                    start=i;
                    end=j;
                }

            }
        }
        System.out.println("Max sum subarray: "+max);

        System.out.print("Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /*
     * 6. Maximum Product Subarray
     * Find the contiguous subarray having the largest product.
     *
     * input: [-2,1,-3,4,-1,2,1,-5,4]
     * output:
     */
    public void maxProductSubarray(int[] arr) {
        int max = Integer.MIN_VALUE, start=0, end=0;
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=i;j<arr.length;j++){
                product *= arr[j];
//                max = Math.max(max,product);
                if(product>max){
                    max= product;
                    start=i;
                    end=j;
                }
            }
        }
        System.out.println("Max Prodcut Subarray: "+max);

        System.out.print("Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    /*
     * 7. Find Minimum in Rotated Sorted Array
     * A sorted array has been rotated. Find the minimum
     * element in O(log n)
     *
     * input: [4,5,6,7,0,1,2]
     * output: 0
     */
    public void minRotatedSortarray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println("Min: " + arr[left]);
    }


    /*
     * 8. Search in Rotated Sorted Array
     * Search for a target value in a rotated sorted array.
     *
     * input: [4,5,6,7,0,1,2], target = 0
     * output: 4
     */
    public void searchRotatedSortarray(int[] arr,int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }
    }


    /*
     * 9. 3Sum
     * Find all unique triplets whose sum is 0.
     *
     * input: [-1,0,1,2,-1,-4], target = 0
     * output: [[-1,-1,2],[-1,0,1]]
     */
    public void tripletsSum (int[] arr, int target) {
        int fixed = 0;
        for(int i=fixed; i<arr.length;i++){
            int left= fixed+1;
            int right = arr.length-1;
            while(left < right){
                if(arr[fixed]+arr[right]+arr[left]==target){
                    System.out.println("Triplets found: "+arr[fixed]+" "+arr[right]+" "+arr[left]);
                    left++;
                    right--;
                }
            }

        }
    }

    
}


