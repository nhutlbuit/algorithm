import impl.foundDuplicateChars;

public class Main {
    static final String input = "hoa vàng trên cỏ xanh";
    static final String[] arr = {
            "tôi thấy hoa vàng trên cỏ xanh",
            " hôm nay tôi thấy hoa vàng",
            "hoa vàng trên cỏ xanh, hoa vàng trên cỏ xanh"
            };

    // type O key to turn of insert
    public static void main(String[] args) {
       // getMaxNumberInArray.getMaxNumberInArray();
        // deleteElementInList.deleteElementInList();
       // countMatches.countMatches(arr, input);
       // countMatches.countMatchesUsedJoin(arr, input);
       // triplicated.triplicated();
        // type O key to turn of insert

        System.out.println(foundDuplicateChars.foundDuplicate("abccbaabccba"));

        System.out.println(foundDuplicateChars.solution("abcabcabcabc"));   // output 4
        System.out.println(foundDuplicateChars.solution("abccbaabccba"));   // output 2
        System.out.println(foundDuplicateChars.solution("abcabcabc"));   // output 3
        System.out.println(foundDuplicateChars.solution("abcabcabcp"));   // output 1

    }
}
