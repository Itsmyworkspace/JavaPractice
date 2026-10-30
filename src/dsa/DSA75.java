package dsa;

import java.util.*;

public class DSA75 {
    public static void main(String[] args) {

        // 1. Merge Strings Alternately
        // input: word1 = "abc", word2 = "pqr"
        // output: "apbqcr"
        String str1 = "abc", str2 = "pqr";
        q1(str1,str2,"Brute Force");
        q1(str1,str2,"Optimum Approach");

        // 2. Two Sum
        // input: nums = [2,7,11,15], target = 9
        // output: [0,1]
        int[] intput1 = {2,7,11,15};
        int target1 = 9;
        q2(intput1,target1,"Brute Force");
        q2(intput1, target1, "Two Pointer Approach");
        q2(intput1, target1, "Optimum Approach");

        // 3. Contains Duplicate
        // input: nums = [1,2,3,1]
        // output: true
        int[] intput2 = {1,2,3,1};
        q3(intput2,"Brute Force");
        q3(intput2,"Optimum Approach");

        // 4. Valid Anagram
        // input: s = "anagram", t = "nagaram"
        // output: true
        String str3 = "anagram", str4 = "nagaram";
        q4(str3, str4, "Brute Force");
        q4(str3, str4, "Optimum Approach");

        // 5. Group Anagrams
        // input: ["eat","tea","tan","ate","nat","bat"]
        // output: [["eat","tea","ate"],["tan","nat"],["bat"]]
        String[] input3 = {"eat","tea","tan","ate","nat","bat"};
        q5(input3,"Brute Force");
        q5(input3, "Optimum Approach");

    }

    public static void q1(String str1, String str2, String approach) {
        String a1 = "";
        switch (approach){
            case "Brute Force" :
                for(int i =0;i<Math.max(str1.length(),str2.length());i++){
                    if(i<str1.length()){
                        a1+=str1.charAt(i);
                    }
                    if(i<str2.length()){
                        a1+=str2.charAt(i);
                    }
                }
                System.out.println("A1 Alternate Letter Brute Force: "+a1);
                 break;

            case "Optimum Approach" :
                StringBuilder sb1 = new StringBuilder();
                for(int i =0;i<Math.max(str1.length(),str2.length());i++){
                    if(i<str1.length()){
                        sb1.append(str1.charAt(i));
                    }
                    if(i<str2.length()){
                        sb1.append(str2.charAt(i));
                    }
                }
                System.out.println("A1 Alternate Letter Optimum Approach: "+sb1);
                break;
        }
    }

    public static void q2(int[] input, int target, String approach){
        switch (approach){
            case "Brute Force" :
                for(int i=0;i<input.length;i++){
                    for(int j=i+1;j<input.length-1;j++){
                        if(input[i]+input[j]==target){
                            System.out.println("A2 Two Sum Brute Force: "+ input[i]+" "+input[j]);
                        }
                    }
                }
                break;

            case "Optimum Approach" :
                Map<Integer, Integer> m1 = new HashMap<>();
                for (int i=0;i<input.length;i++){
                    int complement = target-input[i];
                    if(m1.containsKey(complement)){
                        System.out.println("A2 Two Sum Optimum Approach: "+ complement+" "+m1.get(complement));
                    }
                    m1.put(input[i],complement);
                }
                break;

            case "Two Pointer Approach" :
                // sorted array
                int left = 0;
                int right = input.length-1;
                while (left < right){
                    int sum = input[left]+input[right];
                    if(sum==target){
                        System.out.println("A2 Two Sum Two Pointer Approach: "+input[left]+" "+input[right]);
                        break;
                    } else if (sum<target) {
                        left++;
                    }else{
                        right--;
                    }
                }
                break;
        }
    }

    public static void q3(int[] input, String approach){
        boolean isDuplicate = false;
        switch (approach){
            case "Brute Force" :
                for(int i=0;i<input.length;i++){
                    for (int j=i+1;j<=input.length-1;j++){
                        if(input[i]==input[j]){
                            isDuplicate = true;
                            System.out.println("A3 Contain Duplicates Brute Force: "+isDuplicate);
                            break;
                        }
                    }
                    if(isDuplicate){
                        break;
                    }
                }
                break;

            case "Optimum Approach" :
                Set<Integer> s1 = new HashSet<>();
                for(int i : input){
                    if(!s1.add(i)){
                        isDuplicate=true;
                        System.out.println("A3 Contain Duplicates Optimum Approach: "+isDuplicate);
                        break;
                    }

                }
                break;
        }
    }

    public static void q4(String str1, String str2, String approach) {
        switch (approach) {
            case "Brute Force" :
                if (str1.length()!=str2.length()){
                    System.out.println("A4 Valid Anagrams Brute Force: False");
                    break;
                }
                char[] char1 = str1.toCharArray();
                char[] char2 = str2.toCharArray();
                Arrays.sort(char1);
                Arrays.sort(char2);
                if(Arrays.equals(char1, char2)){
                    System.out.println("A4 Valid Anagrams Brute Force: True");
                }else{
                    System.out.println("A4 Valid Anagrams Brute Force: False");
                }
                break;

            case "Optimum Approach" :
                if (str1.length()!=str2.length()){
                    System.out.println("A4 Valid Anagrams Brute Force: False");
                    break;
                }
                int[] count = new int[26];
                for(int i=0;i<str1.length();i++){
                    count[str1.charAt(i)-'a']++;
                    count[str2.charAt(i)-'a']--;
                }

                for(int x : count){
                    if(x!=0){
                        System.out.println("A4 Valid Anagrams Brute Force: False");
                    }
                }
                System.out.println("A4 Valid Anagrams Brute Force: True");
                break;
        }
    }

    public static void q5(String[] str, String approach) {
        switch (approach) {
            case "Brute Force" :
                List<List<String>> result = new ArrayList<>();
                boolean[] visited = new boolean[str.length];
                for(int i=0; i<str.length; i++){
                    if(visited[i]) continue;
                    List<String> group = new ArrayList<>();
                    group.add(str[i]);
                    visited[i] = true;
                    for(int j=i+1;j<str.length;j++){
                        if(!visited[j]&&isAnagram(str[i],str[j])){
                            group.add(str[j]);
                            visited[j] = true;
                        }
                    }
                    result.add(group);
                }
                System.out.println("A5 Valid Group Anagrams Brute Force: "+ result);
                break;
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int x : count) {
            if (x != 0) return false;
        }

        return true;
    }

}
