public class triplicated {
    public static void triplicated() {
        String arr1 = "1234445555vcccc11";
        String arr2 = "12345";
        StringBuilder triplicated = new StringBuilder("");;;
        for(int i = 0; i< arr2.length(); i++) {
            char temp = arr2.charAt(i);
            long count = arr1.chars().filter(ch -> ch == temp).count();
            if(count == 3) {
                if("".equals(triplicated.toString())) {
                    triplicated.append(temp);
                } else {
                    triplicated.append( " and " + temp);
                }
            }
        }
        System.out.println("Character " + triplicated + " is triplicated in arr1");
    }

}
