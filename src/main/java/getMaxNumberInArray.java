import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class getMaxNumberInArray {

    public static void getMaxNumberInArray() {
        List<String> arr = Arrays.asList("321", "956", "21", "9");
        List<String> sored = arr.stream().sorted((a, b) -> (b+a).compareTo(a+b)).collect(Collectors.toList());
        sored.stream().forEach(System.out::print);
    }
}
