package test.java;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;



public class Stream {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        List<Integer> numbers = Arrays.asList(9,9,9 , 9, 10, 3, 4, 7, 3, 4);
        //filterCount(strList);
        //distinct(numbers);
        mapFilterDistinct(numbers);
        //summaryStatistics();
        //distinctSort(numbers);

    }

    private static void mapFilterDistinct(List<Integer> numbers){
        List<Integer> distinct = numbers.stream().distinct().filter(i -> i > 5)
                .map( i -> i*i)
                .collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n",
                numbers, distinct);
    }

    private static void summaryStatistics() {
        //Get count, min, max, sum, and average for numbers
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());

    }

    private static void distinctSort(List<Integer> numbers){
        List<Integer> distinct = numbers.stream().distinct().sorted((a,b) -> a - b)
                .collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n",
                numbers, distinct);
    }

    private static void mapDistinct(List<Integer> numbers){
        List<Integer> distinct = numbers.stream()
                .map( i -> i*i).distinct()
                .collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n",
                numbers, distinct);
    }

    private static void distinct(List<Integer> numbers){
        List<Integer> distinct = numbers.stream().distinct()
                .collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n",
                numbers, distinct);
    }

    private static void filterCount( List<String> strList) {
        long count = strList.stream()
                .filter(x -> x.isEmpty())
                .count();
        System.out.printf("List %s has %d empty strings %n", strList, count);
    }
}
