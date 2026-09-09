package dsa;

import java.util.*;

public class TwoPointers {
    // opposite direction pointers

    public void firstPair(int[] arr, int target) {
        int right = arr.length-1;
        int left = 0;

        while(left < right){    // 1 2 3 4 5 6      6
            if(arr[left]+arr[right]==target){
                System.out.println("Pair Found: "+arr[left]+","+arr[right]);
                break;
            } else if (arr[left]+arr[right] < target) {
                left++;
            }else{
                right--;
            }
        }
    }


    public void allPairs(int[] arr, int target) {
        int right = arr.length-1;
        int left = 0;

        while(left < right) {
            if(arr[left]+arr[right]==target){
                System.out.println("Pair Found: "+arr[left]+","+arr[right]);
                left++;
                right--;
            } else if (arr[left]+arr[right] < target) {
                left++;
            } else{
                right--;
            }
        }
    }

    public void countOfPairs(int[] arr, int target) {
        int left = 0, count =0;
        int right = arr.length-1;

        while(left < right) {
            if(arr[left]+arr[right]==target) {
                count++;
                right--;
                left++;
            } else if (arr[left]+arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        if(count > 0) {
            System.out.println("Count of pairs: " + count);
        } else {
            System.out.println("Count of pairs: " + count);
        }
    }


    public void closestPairs(int[] arr, int target) {
        int right = arr.length-1;
        int left = 0;
        int min = Integer.MAX_VALUE;
        int first = -1, second = -1;

        while(left < right) {
            if(arr[left]+arr[right]==target){
                if(arr[right]-arr[left] < min) {
                    min = arr[right]-arr[left];
                    first=arr[right];
                    second = arr[left];
                }
                left++;
                right--;
            } else if (arr[left]+arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Closest Pair: "+ first+","+second);
    }

    public void triplets(int[] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            int left = i+1;
            int right = arr.length-1;
            while(left < right) {
                if(arr[i]+arr[left]+arr[right]==target) {
                    System.out.println("Triplets Found: "+arr[i]+","+arr[left]+","+arr[right]);
                    break;
                } else if (arr[i]+arr[left]+arr[right]<target) {
                    left++;
                }else{
                    right--;
                }
            }
        }
    }

    public void allTriplets(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            int left = i+1;
            int right = arr.length-1;

            while(left < right) {
                if(arr[i]+arr[left]+arr[right]==target) {
                    System.out.println("Triplet pairs Found: "+arr[i]+","+arr[left]+","+arr[right]);
                    left++;
                    right--;
                } else if (arr[i]+arr[left]+arr[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public void countOfTriplets(int[] arr, int target) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int left = i+1;
            int right = arr.length-1;

            while(left < right) {
                if(arr[i]+arr[left]+arr[right] == target) {
                    count++;
                    left++;
                    right--;
                } else if (arr[i]+arr[left]+arr[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println("Count of triplets pairs: "+count);
    }

    public void fourSum(int[] arr, int target) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1; j<n-2; j++) {
                if(j>i+1 && arr[j] == arr[j-1]){
                    continue;
                }

                int left = j+1;
                int right = n-1;
                while(left < right) {
                    int sum = arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==target) {
                        System.out.println("Four Sum pair found: " + arr[i] + "," + arr[j] + "," + arr[left] + "," + arr[right]);
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1])
                            left++;
                        while (left < right && arr[right] == arr[right + 1])
                            right--;
                    } else if (sum < target) {
                        left++;
                    } else{
                        right--;
                    }
                }
            }
        }
    }

    public void mostWater(int[] arr){
        // [4,6,5,3,6,8,4,2]
        // [4,6,5,3,7,4,2]
        int left =0;
        int right = arr.length-1;
        int max = Integer.MIN_VALUE;

        while(left < right) {
            int area = (right-left)*Integer.min(arr[left], arr[right]);
            max = Math.max(max, area);
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("Container with most water: "+ max);
    }

    public void rainTrappedWater(int[] arr) {
        // [4,6,5,3,6,8,4,2]
        int left =0;
        int right = arr.length-1;

        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while(left < right) {
            if(arr[left] < arr[right]){
                if(arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    water += leftMax - arr[left];
                }
                left++;
            } else {
                if(arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    water += rightMax - arr[right];
                }
                right--;
            }
        }
        System.out.println(water);
    }

    public static int[] reverseArr(int[] arr){
        int left =0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static boolean isValidPalindrome(String str, String approach) {
        boolean flag = true;
        char[] chArr = str.toCharArray();
        switch (approach){
            case "brute force" :
                String reverse="";
                for(int i=chArr.length-1;i>=0;i--){
                    reverse +=chArr[i];
                }
                if(!str.equals(reverse)){
                    flag = false;
                }
                break;

            case "optimum approach"  :
                int left = 0;
                int right = chArr.length-1;
                while(left < right) {
                    if(chArr[left]!=chArr[right]){
                        flag = false;
                        break;
                    }
                    left++;
                    right--;
                }
                break;
        }
        return flag;
    }

    public static int[] twoSum(int[] arr, int target, String approach){
        switch(approach){
            case "brute force" :
                for(int i=0;i<arr.length;i++){
                    for(int j=i+1;j<arr.length;j++){
                        if(arr[i]+arr[j]==target){
                            return new int[] {i,j};
                        }
                    }
                }
                break;

            case "Hashmap" :
                Map<Integer, Integer> map = new HashMap<>();
                for(int i=0;i<arr.length-1;i++){
                    int complement = target - arr[i];
                    if(map.containsKey(complement)){
                        return new int[] {map.get(complement), i};
                    }
                    map.put(arr[i],i);
                }
                break;

            case "two pointers" :
                Arrays.sort(arr);
                int left = 0;
                int right = arr.length-1;
                while(left < right){
                    if(arr[left]+arr[right]==target){
                        return new int[] {left, right};
                    }else if(arr[left]+arr[right]<target){
                        left++;
                    }else{
                        right--;
                    }
                }
                break;
        }
        return null;
    }

    public static int[] moveZeros(int[] arr, String approach){
        switch(approach) {
            case "approach-1" :
                int index=0;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]!=0){
                        arr[index]=arr[i];
                        index++;
                    }
                }
                while(index<arr.length){
                    arr[index++]=0;
                }
                break;

            case "approach-2" :
                int left = 0;

                for (int right = 0; right < arr.length; right++) {
                    if (arr[right] != 0) {
                        int temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;
                        left++;
                    }
                }

        }
        return arr;
    }

    public static List<Integer> removeDuplicates(int[] arr, String approach){
        List<Integer> lst = new ArrayList<>();
        switch(approach) {
            case "brute force" :
                for(int i=0;i<arr.length;i++){
                    for(int j=i+1;j<arr.length;j++){
                        if(arr[i]==arr[j]){
                            lst.add(arr[j]);
                        }
                    }
                }
                break;

            case "two pointers" :
                Arrays.sort(arr);
                int left =0;
                int right = 1;
                while(left<right){
                    if (arr[left] == arr[right]) {
                        if (lst.isEmpty() || lst.get(lst.size() - 1) != arr[left]) {
                            lst.add(arr[left]);
                        }
                    } else {
                        left = right;
                    }
                    right++;
                }

            case "optimum approach" :
                Set<Integer> set = new HashSet<>();
                Set<Integer> duplicates = new LinkedHashSet<>();
                for(int i : arr){
                    if(!set.add(i)){
                        duplicates.add(i);
                    }
                }
                lst.addAll(duplicates);
                break;
        }
        return lst;
    }

    public static int[] removeElements(int[] arr, int target, String approach){
        int index = 0;
        switch (approach) {
            case "brute force" :
                int count = 0;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != target) {
                        count++;
                    }
                }

                int[] result = new int[count];

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != target) {
                        result[index] = arr[i];
                        index++;
                    }
                }
                break;

            case "optimum approach" :
                for(int i=0;i<arr.length;i++){
                    if(arr[i]!=target){
                        arr[index]=arr[i];
                        index++;
                    }
                }
                break;
        }
        return  arr;
    }

    public static int[] mergedArr(int[] arr1, int[] arr2, String approach){
        int[] mergedArr = new int[arr1.length+arr2.length];

        switch (approach){
            case "brute force" :
                for(int i=0;i< arr1.length;i++){
                    mergedArr[i]=arr1[i];
                }
                int length = arr1.length;
                for(int j=0;j< arr2.length;j++){
                    mergedArr[length++]=arr2[j];
                }
                Arrays.sort(mergedArr);
                break;

            case "optimum approach" :
                int left = 0;
                int right =0;
                int k=0;
                while(left<arr1.length && right < arr2.length){
                    if(arr1[left]<arr2[right]){
                        mergedArr[k] = arr1[left];
                        left++;
                    }else{
                        mergedArr[k]=arr2[right];
                        right++;
                    }
                    k++;
                }

                while (left < arr1.length) {
                    mergedArr[k] = arr1[left];
                    left++;
                    k++;
                }

                while (right < arr2.length) {
                    mergedArr[k] = arr2[right];
                    right++;
                    k++;
                }
        }
        return mergedArr;
    }


    public static int[] squareOfSortedArr(int[] arr, String approach) {
        switch (approach){
            case "brute force" :
                int index =0;
                for(int i=0;i<arr.length;i++){
                    arr[index] = arr[i]*arr[i];
                    index++;
                }
                Arrays.sort(arr);
                break;

            case "optimum approach" :
                int left = 0;
                int right = arr.length - 1;
                int i = arr.length - 1;

                while (left <= right) {
                    if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                        arr[i] = arr[left] * arr[left];
                        left++;
                    } else {
                        arr[i] = arr[right] * arr[right];
                        right--;
                    }
                    i--;
                }
                break;
        }
        return arr;
    }

    public static int mostWaterContainer(int[] arr, String approach){
        int max = Integer.MIN_VALUE;
        int area =0;
        switch (approach){
            case "brute force" :
                for(int i=0;i<arr.length;i++){
                    for(int j=i+1;j<arr.length;j++){
                        area = Math.min(arr[i],arr[j])*(j-i);
                        max = Math.max(max,area);
                    }
                }
                break;

            case "optimum approach" :
                int left =0;
                int right = arr.length-1;
                while(left<right){
                    area = Math.min(arr[left],arr[right])*(right-left);
                    max = Math.max(max, area);
                    if (arr[left] < arr[right]) {
                        left++;
                    } else {
                        right--;
                    }
                }
                break;
        }
        return max;
    }

    public static int[] threeSum(int[] arr, int target, String approach){
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
        switch (approach){
            case "brute force" :
                for(int i=0;i<arr.length;i++){
                    for(int j=i+1;j<arr.length;j++){
                        for(int k=j+1;k<arr.length;k++){
                            if(arr[i]+arr[j]+arr[k]==target){
                                lst.add(i);
                                lst.add(j);
                                lst.add(k);
                                set.add(lst);
                            }
                        }
                    }
                }
                break;

            case "optimum approach" : // [-1, 0, 1, 2, -1, -4]
                for(int i=0;i<arr.length;i++){

                }
        }
       return null;
    }

//    public static int[] sortColors(int[] arr, String approach){
//        switch (approach){
//            case "brute approach" : //[2, 0, 2, 1, 1, 0]
//                for(int i=0;i<arr.length;i++){
//                    int x = arr[i];
//                    if(arr[i]<arr[i+1]){
//
//                    }
//                }
//        }
//    }

}
