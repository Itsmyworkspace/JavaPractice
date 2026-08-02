package dsa;

import java.io.InputStream;
import java.util.*;

public class Leetcode75 {
    public static void main(String[] args) {

        Leetcode75BruteForceSolution sol = new Leetcode75BruteForceSolution();

        System.out.println("----------Two Sum----------");
        int[] twoSumInput = new int[] {1,2,3,4,5};
        int target1 = 6;
        sol.twoSum(twoSumInput,target1);


        System.out.println("----------Best Time to Buy and Sell Stock----------");
        int[] stockInput = new int[] {7,5,6,3,8,4,9};
        sol.profitStocks(stockInput);


        System.out.println("----------Contains Duplicate----------");
        int[] duplicatesInput = new int[]{1,2,3,4,5,1};
        sol.containsDuplicate(duplicatesInput);


        System.out.println("----------Product of Array Except Self----------");
        int[] arrProductInput = new int[]{1,2,3,4};
        sol.arrayProduct(arrProductInput);


        System.out.println("----------Maximum Sum Subarray----------");
        int[] maxSumSubarray = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        sol.maxSumSubarray(maxSumSubarray);


        System.out.println("----------Maximum Product Subarray----------");
        int[] maxProductSubarray = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        sol.maxProductSubarray(maxProductSubarray);


        System.out.println("----------Find Minimum in Rotated Sorted Array----------");
        int[] maxRotatedSortarray = new int[]{4,5,6,7,0,1,2};
        sol.minRotatedSortarray(maxRotatedSortarray);


        System.out.println("----------Search in Rotated Sorted Array----------");
        int[] sortedArray = new int[]{4,5,6,7,0,1,2};
        int searchTarget = 0;
        sol.searchRotatedSortarray(sortedArray, searchTarget);


        System.out.println("----------3Sum----------");
//        int[] input3SumArr = new int[]{-1,0,1,2,-1,-4};
//        int target3Sum = 0;
//        sol.tripletsSum(sortedArray, target3Sum);


        int[] arr = new int[]{1,2,3,4,2,3,5};
        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println("Output: " + i + ","+ j+": "+ arr[i]);
//                }
//            }
//        }
//        System.out.println("-----------------");

        Arrays.stream(arr).forEach(
                i-> {
                    map.put(i, arr[i]);
                }
        );

        for(int i: arr){
            if(arr[i]==map.get(i)){
                System.out.println(i+" "+arr[i]);
            }
        }


    }
}
