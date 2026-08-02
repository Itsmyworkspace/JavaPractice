package dsa;

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
}
