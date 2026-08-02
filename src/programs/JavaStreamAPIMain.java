package programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamAPIMain {

    public static void main(String[] args) {

        System.out.println("---------------------------");
        //find even number for list
        List<Integer> lst1 = List.of(1,2,3,4,5,6,7,8,9,10);
        lst1.stream().filter(i->i%2==0).forEach(i-> System.out.println(i));

        //find odd number of list
        Map<Boolean, List<Integer>> map = lst1.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(map.get(false));

        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr1).filter(i->i%2==0).forEach(i-> System.out.println(i));

        System.out.println("---------------------------");
        //2. Remove the duplicate elements from the list
        int[] arr2 = new int[]{2,3,4,2,1,5,4};
        List<Integer> lst2 = List.of(2,3,4,2,1,5,4);
        Arrays.stream(arr2).distinct().forEach(i-> System.out.println(i));
        lst2.stream().distinct().forEach(i-> System.out.println(i));

        System.out.println("---------------------------");
        //3. frequency of each character in a string
        String s1 = "vinubujji";
        Map<Character, Long> map1 = s1.chars().filter(c->c!=' ').mapToObj(i->(char) i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);

        System.out.println("---------------------------");
        //4. Find frequency of each element in a array
        lst1.stream().sorted(Comparator.reverseOrder()).forEach(i-> System.out.println(i));

        System.out.println("---------------------------");
        //6. Given a list of strings, join the strings with `[` as prefix, `]` as suffix and `,` as delimiter
        List<String> lst4 = List.of("vineeth","vasu","sekhar");
        String joined = lst4.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(joined);




    }

}
