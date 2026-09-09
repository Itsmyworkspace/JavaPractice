package programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaPrograms {

    public static void main(String[] args) {

        // Java Streams programs

        // 1. Filter even numbers
        // input: {1,2,3,4,5,6}
        // output: {2,4,6}

        int[] q1 = {1,2,3,4,5,6};
        List<Integer> a1 = Arrays.stream(q1).boxed().filter(i->i%2==0).toList();
        System.out.println(a1);

        // 2. Filter odd number
        // input: {1,2,3,4,5,6}
        // output: {1,3,5}

        int[] q2 = {1,2,3,4,5,6};
        List<Integer> a2 = Arrays.stream(q2).boxed().filter(i->i%2!=0).toList();
        System.out.println(a2);

        // 3. Find numbers greater than 10
        // input: {5, 12, 8, 20, 15}
        // output: {5, 8}, {12, 15, 20}

        int[] q3 = {5, 12, 8, 20, 15};
        Map<Boolean,List<Integer>> a3 = Arrays.stream(q3).boxed().collect(Collectors.partitioningBy(i->i>10));
        System.out.println(a3.get(true));
        System.out.println(a3.get(false));

        // 4. Square every number
        // input: {1, 2, 3, 4}
        // output: {1, 4, 9, 16}

        int[] q4 = {1, 2, 3, 4};
        List<Integer> a4 = Arrays.stream(q4).boxed().map(i->i*i).toList();
        System.out.println(a4);

        // 5. Cube every number
        // input: {1, 2, 3, 4}
        // output: {1, 8, 27, 64}

        int[] q5 = {1, 2, 3, 4};
        List<Integer> a5 = Arrays.stream(q5).boxed().map(i->i*i*i).toList();
        System.out.println(a5);

        // 6. Convert strings to uppercase
        // input: {"java", "spring", "hibernate"}
        // output: {"JAVA", "SPRING", "HIBERNATE"}

        String[] q6 = {"java", "spring", "hibernate"};
        List<String> a6 = Arrays.stream(q6).map(i->i.toUpperCase()).toList();
        System.out.println(a6);

        // 7. Find strings starting with "A"
        // input: {"Apple", "Amazon", "Google", "Adobe"}
        // output: {"Apple", "Amazon", "Adobe"}

        String[] q7 = {"Apple", "Amazon", "Google", "Adobe"};
        List<String> a7 = Arrays.stream(q7).filter(i->i.startsWith("A")).toList();
        System.out.println(a7);

        // 8. Find strings ending with "n"
        // input: {"Java", "Python", "Kotlin", "Scala"}
        // output: {"Python", "Kotlin"}

        String[] q8 = {"Java", "Python", "Kotlin", "Scala"};
        List<String> a8 = Arrays.stream(q8).filter(i->i.endsWith("n")).toList();
        System.out.println(a8);

        // 9. Find strings length
        // input: {"Java", "Spring", "AWS"}
        // output: {4, 6, 3}

        String[] q9 = {"Java", "Python", "Kotlin", "Scala"};
        List<Integer> a9 = Arrays.stream(q9).map(i->i.length()).toList();
        System.out.println(a9);

        // 10. Filter strings with length > 5
        // input: {"Java", "Spring", "Hibernate", "AWS"}
        // output: {"Spring", "Hibernate"}

        String[] q10 = {"Java", "Spring", "Hibernate", "AWS"};
        List<String> a10 = Arrays.stream(q10).filter(i->i.length()>5).toList();
        System.out.println(a10);

        // 11. Remove duplicates
        // input: {1, 2, 2, 3, 3, 3, 4}
        // output: {1, 2, 3, 4}

        int[] q11 = {1, 2, 2, 3, 3, 3, 4};
        List<Integer> a11 = Arrays.stream(q11).boxed().distinct().toList();
        System.out.println(a11);

        // 12. Sort numbers ascending
        // input: {5, 1, 8, 2, 3}
        // output: {1, 2, 3, 5, 8}

        int[] q12 = {5, 1, 8, 2, 3};
        List<Integer> a12 = Arrays.stream(q12).boxed().sorted().toList();
        System.out.println(a12);

        // 13. Sort numbers descending
        // input: {5, 1, 8, 2, 3}
        // output: {8, 5, 3, 2, 1}

        int[] q13 = {5, 1, 8, 2, 3};
        List<Integer> a13= Arrays.stream(q13).boxed().sorted(Comparator.reverseOrder()).toList();
        System.out.println(a13);

        // 14. Find maximum
        // input: {10, 20, 5, 40, 15}
        // output: 40

        int[] q14 = {10, 20, 5, 40, 15};
        int a14= Arrays.stream(q14).max().getAsInt();
        System.out.println(a14);

        // 15. Find minimum
        // input: {10, 20, 5, 40, 15}
        // output: 5

        int[] q15 = {10, 20, 5, 40, 15};
        int a15= Arrays.stream(q15).min().getAsInt();
        System.out.println(a15);

        // 16. Calculate sum
        // input: {1, 2, 3, 4, 5}
        // output: 15

        int[] q16 = {1, 2, 3, 4, 5};
        int a16= Arrays.stream(q16).sum();
        System.out.println(a16);

        // 17. Calculate average
        // input: {1, 2, 3, 4, 5}
        // output: 3

        int[] q17 = {1, 2, 3, 4, 5};
        int a17= (int) Arrays.stream(q17).average().getAsDouble();
        System.out.println(a17);

        // 18. Count elements
        // input: {1, 2, 3, 4, 5}
        // output: 5

        int[] q18 = {1, 2, 3, 4, 5};
        int a18= (int) Arrays.stream(q18).count();
        System.out.println(a18);

        // 19. Check whether any number is greater than 100
        // input: {10, 20, 150, 30}
        // output: true

        int[] q19 = {10, 20, 150, 30};
        boolean a19= Arrays.stream(q19).anyMatch(i->i>100);
        System.out.println(a19);

        // 20. Check whether all numbers are positive
        // input: {1, 2, 3, 4}
        // output: true

        int[] q20 = {10, 20, 150, 30};
        boolean a20 = Arrays.stream(q20).allMatch(i->i>=0);
        System.out.println(a20);

        // 21. Find first number greater than 50
        // input: {10, 20, 70, 30, 90}
        // output: 70

        int[] q21 = {10, 20, 70, 30, 90};
        int a21 = Arrays.stream(q21).filter(i->i>50).findFirst().getAsInt();
        System.out.println(a21);

        // 22. Check whether a list contains "Java"
        // input: {"Python", "Java", "C++"}
        // output: true

        String[] q22 = {"Python", "Java", "C++"};
        boolean a22 = Arrays.stream(q22).anyMatch(i->i.contains("Java"));
        System.out.println(a22);

        // 23. Check whether a list contains no empty strings
        // input: ["Python", "Java", "C++"]
        // output: true

        List<String> q23 = List.of("Python", "Java", "C++");
        boolean a23 = q23.stream().allMatch(i->i!="");
        System.out.println(a23);

        // 24. Find first even number
        // input: [1, 3, 7, 8, 10]
        // output: 8

        List<Integer> q24 = List.of(1, 3, 7, 8, 10);
        int a24 = q24.stream().filter(i->i%2==0).findFirst().get();
        System.out.println("a24: "+ a24);

        // 25. Find first string longer than 10 characters
        // input: ["Java", "Spring", "Microservices"]
        // output: Microservices

        List<String> q25 = List.of("Java", "Spring", "Microservices");
        String a25 = q25.stream().filter(i->i.length()>10).findFirst().get();
        System.out.println("a25: "+ a25);

        // 26. Find first string longer than 10 characters
        // input: [10, 20, 30, 40, 50]
        // output: [10, 20, 30]

        List<Integer> q26 = List.of(10, 20, 30, 40, 50);
        List<Integer> a26 = q26.stream().limit(3).toList();
        System.out.println("a26: "+ a26);

        // 27. Get top 3 largest numbers
        // input: [10, 50, 20, 80, 30]
        // output: [80, 50, 30]

        List<Integer> q27 = List.of(10, 50, 20, 80, 30);
        List<Integer> a27 = q27.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("a28: "+ a27);

        // 28. Implement page 2 with page size 3
        // input: [1,2,3,4,5,6,7,8,9]
        // page = 2
        // size = 3
        // output: [4,5,6]

        List<Integer> q28 = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> a28 = q28.stream().skip(3).limit(3).toList();
        System.out.println("a28: "+ a28);

        // 29. Get top 3 unique numbers
        // input: [10,20,20,30,30,40]
        // output: [40,30,20]

        List<Integer> q29 = List.of(10,20,20,30,30,40);
        List<Integer> a29 = q29.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).toList();
        System.out.println("a29: "+ a29);

        // 30. Find second-largest number
        // input: [10,50,20,80,30]
        // output: 50

        List<Integer> q30 = List.of(10,50,20,80,30);
        int a30 = q30.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("a30: "+ a30);

        // 31. Sum using reduce
        // input: [1,2,3,4]
        // output: 10

        List<Integer> q31 = List.of(1,2,3,4);
        int a31 = q31.stream().reduce(0,(a,b)->(a+b));
        System.out.println("a31: "+ a31);

        // 32. Product using reduce
        // input: [1,2,3,4]
        // output: 10

        List<Integer> q32 = List.of(1,2,3,4);
        int a32 = q32.stream().reduce(1,(a,b)->(a*b));
        System.out.println("a32: "+ a32);

        // 33. Find maximum using reduce
        // input: [10,40,20,50]
        // output: 50

        List<Integer> q33 = List.of(1,2,3,4);
        int a33 = q33.stream().reduce(0,(a,b)->Math.max(a,b));
        System.out.println("a33: "+ a33);

//        List<Integer> q33 = List.of(1,2,3,4);
//        int a33 = q33.stream().max(Integer::compareTo).get();
//        System.out.println("a33: "+ a33);

        // 34. Concatenate strings using reduce
        // input: ["Java","is","powerful"]
        // output: 50

        List<String> q34 = List.of("Java","is","powerful");
        String a34 = q34.stream().reduce("",(a,b)->a+" "+b);
        System.out.println("a34:"+a34);

        // 35. Calculate factorial using reduce
        // input: 5
        // output: 120

        int q35 = 5;
        int a35 = IntStream.rangeClosed(1,q35).reduce(1,(a,b)->a*b);
        System.out.println("a35: "+a35);

        // 36. Count strings beginning with A
        // input: ["Apple","Amazon","Google","Adobe"]
        // output: 3

        List<String> q36 = List.of("Apple","Amazon","Google","Adobe");
        int a36 = (int) q36.stream().filter(i->i.startsWith("A")).count();
        System.out.println("a36: "+a36);

        // 37. Find longest string
        // input: ["Java","Spring","Hibernate","AWS"]
        // output: Hibernate

        List<String> q37 = List.of("Java","Spring","Hibernate","AWS");
        String a37 = q37.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        System.out.println("a37: "+a37);

        // 38. Find longest string
        // input: ["Java","AWS","Spring","Docker"]
        // output: ["AWS","Docker","Java","Spring"]

        List<String> q38 = List.of("Java","AWS","Spring","Docker");
        List<String> a38 = q38.stream().sorted().toList();
        System.out.println("a38: "+a38);

        // 39. Sort strings by length descending
        // input: ["Java","Spring","AWS","Hibernate"]
        // output: ["Hibernate","Spring","Java","AWS"]

        List<String> q39 = List.of("Java","Spring","AWS","Hibernate");
        List<String> a39 = q39.stream().sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println("a39: "+a39);

        // 40. Join strings with comma
        // input: ["Java","Spring","AWS"]
        // output: Java,Spring,AWS

        List<String> q40 = List.of("Java","Spring","AWS");
        String a40 = q40.stream().collect(Collectors.joining(","));
        System.out.println("a40: "+a40);

        // 41. Find duplicate strings
        // input: ["Java","Spring","Java","AWS","Spring"]
        // output: ["Java","Spring"]

        Set<String> s1 = new HashSet<>();
        List<String> q41 = List.of("Java","Spring","Java","AWS","Spring");
        List<String> a41 = q41.stream().filter(i->!s1.add(i)).toList();
        System.out.println("a41: "+a41);

        // 42. Find unique strings
        // input: ["Java","Spring","Java","AWS","Spring"]
        // output: ["AWS"]

        List<String> q42 = List.of("Java","Spring","Java","AWS","Spring");
        List<String> a42 = q42.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()==1).map(i->i.getKey()).toList();
        System.out.println("a42: "+a42);

        // 43. Count characters in a string
        // input: "hello"
        // output: 5

        String q43 = "hello";
        int a43 = (int) q43.chars().count();
        System.out.println("a43: "+a43);

        // 44. Count vowels
        // input: "hello world"
        // output: 3

        String q44 = "hello world";
        int a44 = (int) q44.chars().filter(i-> "aeiouAEIOU".indexOf(i)>=0).count();
        System.out.println("a44: "+a44);

        // 45. Find duplicate characters
        // input: "programming"
        // output: [r, g, m]

        Set<Character> s2 = new HashSet<>();
        String q45 = "programming";
        List<Character> a45 = q45.chars().mapToObj(i->(char)i).filter(i->!s2.add(i)).collect(Collectors.toList());
        System.out.println("a45: "+a45);


    }
}
