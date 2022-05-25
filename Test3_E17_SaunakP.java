package test.ep2;

public class Test3_E17_SaunakP {
    static public void main(String[] args) {
        System.out.println("Saunak Patel"); //  <--- change to your name
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////
        // The following test cases should help you to debug and verifying your code.
        // Make sure to add more test cases for complicated methods.
        //////////////////////////////////////////////////////////////////////////////
        digitSum3(0);    // expected answer:   0
        digitSum3(4);    // expected answer:   4
        digitSum3(15);   // expected answer:   6
        digitSum3(32);   // expected answer:   5
        digitSum3(175);  // expected answer:  13
        digitSum3(261);  // expected answer:   9
        digitSum3(784);  // expected answer:  19
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////
        nextMultOf5(0);    // expected answer:    0
        nextMultOf5(3);    // expected answer:    5
        nextMultOf5(10);   // expected answer:   10
        nextMultOf5(13);   // expected answer:   15
        nextMultOf5(157);  // expected answer:  160
        nextMultOf5(230);  // expected answer:  230
        nextMultOf5(764);  // expected answer:  765
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////
        asoEven(new int[]{1, 2, 3, 5, 0, 19, 4});   // expected answer:  6
        asoEven(new int[]{12, 35, 0, 194});         // expected answer:  206
        asoEven(new int[]{0, 12, -6, 8, 250});      // expected answer:  264
        asoEven(new int[]{1, 3, -7, 11, 19});       // expected answer:  0
        System.out.println();
        ///////////////////////////////////////////
        asoSkip(3, new int[]{17});                                               //    17
        asoSkip(4, new int[]{25, 24});                                           //    25
        asoSkip(1, new int[]{100, 31, 57});                                      //   157
        asoSkip(2, new int[]{71, 23, -5, -1911});                                // -1840
        asoSkip(0, new int[]{83, 52, -39, 19, 163});                             //   278
        asoSkip(3, new int[]{9, 82, 500, 79, -1113, 15});                        // -1104
        asoSkip(4, new int[]{471, 62, -3, -24, 521, 886, 7});                    //  1357
        asoSkip(3, new int[]{390, 72, 33, -24, 5, 36, 77, 81});                  //   395
        asoSkip(6, new int[]{61, -42, 83, 4, 15, 6, 97, 8, 999});                //    69
        asoSkip(7, new int[]{189, 23, 33, 40, 5, 26, 71, 8, 309, 8});            //   498
        asoSkip(7, new int[]{21, 3, 5, 74, -2, 9, 1, -86, 5, 6, 1, 9, 2, 8});    //    26
        asoSkip(8, new int[]{9, 63, 15, 4, 2, 32, 11, 8, 3, 96, 2, 55, 48});     //   105
        asoSkip(4, new int[]{189, 23, -33, 40, 35, 28, 71, 98, 319, 5, 1});      //   218
    }


    static public void digitSum3(int num) {
        int ans = 0;
        // TO DO:  'ans' is the sum of the digits of a positive integer called 'num'  (up to 3 digits)

        int first = num % 10;

        int second = (num / 10) % 10;

        int third = (num / 100) % 10;

        ans += first + second + third;

        System.out.printf("ds3(  %3d  )  =  %3d\n", num, ans);  //  DO NOT modify this line!!!!!!!!!
    }

    static public void nextMultOf5(int num) {
        int ans = 0;
        int num2 = num;
        // TO DO:  'ans' is the next multiple of 5 equals to or greater than the positive integer 'num'
        while(true){

            if(num2 % 5 == 0){

                ans += num2;

                break;

            } else {

                num2++;
            }
        }
        System.out.printf("nm5(  %3d  )  =  %3d\n", num, ans);  //  DO NOT modify this line!!!!!!!!!
    }


    static public void asoEven(int[] ary) { // array sum of even
        int ans = 0;
        // TO DO:   'ans' is the sum of even numbers in the given array

        for(int i = 0; i < ary.length; i++){

            if(ary[i] % 2 == 0){

                ans += ary[i];
            }
        }

        printAryRes("even(", ary, ans);   //  DO NOT modify this line!!!!!!!!!
    }

    static public void asoSkip(int skip, int[] ary) { // array sum: skip some numbers
        int ans = 0;
        // TO DO:   if array is [A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,...] then:
        //             skip=0 ====> sum=A+B+C+D+E+...  (no skip)
        //             skip=1 ====> sum=A+C+E+G+I+...  (skip 1 number)
        //             skip=2 ====> sum=A+D+G+J+M+...  (skip 2 numbers)
        //             skip=3 ====> sum=A+E+I+M+Q+...  (skip 3 numbers)

        for(int i = 0; i < ary.length; i += skip + 1){

            ans += ary[i];

        }


        printAryRes("skip( " + skip+", ", ary, ans);
    }


    // Do NOT modify this method!!!!
    static public void printAryRes(String prefix, int[] ary, int ans) {
        System.out.printf(prefix + " ");
        for (int i = 0; i < ary.length; i++) {
            System.out.printf(" %d", ary[i]);
        }
        System.out.printf(" )  =  %3d\n", ans);
    }


}

