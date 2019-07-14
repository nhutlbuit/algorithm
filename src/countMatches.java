import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countMatches {
     static void countMatches(String[] arr, String input) {
        final long startTime = System.nanoTime();
        int countMore = 0;
        Pattern pattern = Pattern.compile(input);
        for(String a: arr) {
            Matcher matcher = pattern.matcher(a);
            while (matcher.find()) countMore ++;
        };
        long elapsedTime = System.nanoTime() - startTime;
        String output = String.format("output is used foreach is: %s take %s nanosecond", countMore, elapsedTime);
        System.out.println(output);
    }

    public static void countMatchesUsedJoin(String[] arr, String input) {
        final long startTime = System.nanoTime();
        int countMore = 0;
        Pattern pattern = Pattern.compile(input);
        String join = String.join(" ", arr);
        Matcher matcher = pattern.matcher(join);
        while (matcher.find()) countMore ++;
        long elapsedTime = System.nanoTime() - startTime;
        String output = String.format("output is used String.join is: %s take %s nanosecond", countMore, elapsedTime);
        System.out.println(output);
    }}
