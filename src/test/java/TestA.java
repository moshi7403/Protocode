public class TestA {

    public static void main(String[] args) {


        /**
         *  Solution-1
         */

        String str = "ABCD";
        int len = str.length(); //4
        String rev = "";

        for (int i = len - 1; i >= 0; i--) {  // 3 2 1 0 -1

            rev = rev + str.charAt(i);  //DCBA
        }

        System.out.println(" Solution : 1 ----> : " + rev);

    }
}
