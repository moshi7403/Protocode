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

        /**
         *  Solution-2
         */

        StringBuffer m = new StringBuffer(str);
        System.out.println(" Solution : 2 ----> : "+ m.reverse());


        /**
         *  Solution-3
         */

        char a[] = str.toCharArray();
        int len2 = a.length; // 4
        String rev2 = "";

        for (int i=len2-1; i>=0 ; i--){

            rev2 = rev2 + a[i]; //DCBA
        }

        System.out.println(" Solution : 3 ----> : "+ rev2);
    }

}
