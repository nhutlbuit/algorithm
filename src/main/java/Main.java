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


       testForLoops();
    }

    private  static void  testForLoops() {
        long startFor = System.currentTimeMillis();
        for (int i = 0; i<= 1000000000 ; i++){
            for (int j = 0; j<= 1000000000 ; j++) {
                //  for (int k = 0; k<= 1000000000 ; k++);
            };
        };
        System.out.println("normal loops: " + (System.currentTimeMillis()-startFor));

        long startForNguoc = System.currentTimeMillis();
//        for (int x = 1000000000; x >=0; x --){
//            for (int y = 1000000000; y >=0; y --){
//               //  for (int z = 1000000000; z >=0; z --);
//            }
//        };
        int loops = 1000000000;
        int loops1 = 1000000000;
        while (loops-- > 0) {
            while (loops1-- > 0);
        }
        System.out.println("reverse loops: " +(System.currentTimeMillis()-startForNguoc));
    }


}
