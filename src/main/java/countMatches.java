import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countMatches {
    public static final String A = "a";
    public final String B = "b";
     static long countMatches(String[] arr, String input) {
        final long startTime = System.nanoTime();
        int count = 0;
        final Pattern pattern = Pattern.compile(input);
        for(String a: arr) {
            Matcher matcher = pattern.matcher(a);
            while (matcher.find()) count ++;
        };
         printOutput("foreach", count, startTime);
         return count;
    }

     static long countMatchesUsedJoin(String[] arr, String input) {
        final long startTime = System.nanoTime();
        int count = 0;
        final Pattern pattern = Pattern.compile(input);
        final String join = String.join(" ", arr);
        final Matcher matcher = pattern.matcher(join);
        while (matcher.find()) count ++;
        printOutput("String.join", count, startTime);
        return count;
    }

    static void printOutput(String method, long count, long startTime) {
        final long elapsedTime = System.nanoTime() - startTime;
        final String output = String.format("output is used %s is: %s take %s nanosecond(s)", method, count, elapsedTime);
        System.out.println(output);
    }
}


