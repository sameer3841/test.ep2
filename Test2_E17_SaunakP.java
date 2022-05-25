package test.ep2;

public class Test2_E17_SaunakP {
    static public void main(String[] args) {
        // make up examples of your own, calculate the answers by hand and make sure
        //    your program gives you the same answer
        prob1(6, 3, 4, 5);
        prob1(10, 14, 8, 15);
        prob1(16, 9, 7, 12);
        prob1(11, 9, 7, 20);
        prob2(5, 12, 3);
        prob2(10, 28, 4);
        prob2(3, 15, 4);
        prob2(13, 71, 6);
        prob2(12,32,4);
        prob3(36, 2);
        prob3(36, 3);
        prob3(36, 4);
        prob3(36, 5);
        prob3(720, 12);
    }

    // find the number of cans required to paint the 4 walls of a rectangular room
    // wd = width of floor
    // ln = length of floor
    // ht = height of wall
    // ar = area that can be covered by one can of paint
    // example: Need 26 cans to paint a room of size: 10 x 14 x 8 x 15
    // make sure you round ans to the nearest primary.
    static void prob1(int wd, int ln, int ht, int ar) {
        int ans = 0;
        // TO DO
        double sq = ((wd * ht) * 2) + ((ln * ht) * 2);

        double ant = ((sq) / ar);

        if(ant % 1 != 0){
            ans++;
        }
         ans += (int)ant;

        System.out.printf("Need %d cans to paint a room of size: %d x %d x %d x %d\n",
                ans, wd, ln, ht,ar);
    }

    // find the sum of cubes of multiples in a given range
    // a = smaller-end of a range of integers (a may be included)
    // b = larger-end of a range of integers  (b may be included)
    // m = multiple
    // example:  if a=10, b=28 and m=4; then need to find the sum of
    //      cubes of multiples of 4 of integers between 10 and 28:
    //              12^3 + 16^3 + 20^3 + 24^3 + 28^3  =  49600
    //      a=10 is excluded in this example, because 10 is not a multiple of 4
    //      b=28 is included in this example, because 28 is a multiple of 4
    static void prob2(int a, int b, int m) {
        int ans = 0;
        // TO DO
        for(int i = a; i <= b; i++){

            if(i % m == 0){

                ans += (i * i * i);
            }
        }
        System.out.printf("Sum of cubes of multiples of %d of nums between %d and %d is %d\n",
                m, a, b, ans);
    }



    // find the biggest positive integer such that
    //         it is less than n,
    //         it is a multiple of m,
    //         it goes into n
    //   returns 0 if no such number exists
    // example:
    //    n=36, m=2  ===> numbers that goes into 36 are: 1,2,3,4,6,9,12,18,36,  hence answer = 18 (multiple of 2)
    //    n=36, m=4  ===> numbers that goes into 36 are: 1,2,3,4,6,9,12,18,36,  hence answer = 12 (multiple of 12)
    //    n=36, m=5  ===> numbers that goes into 36 are: 1,2,3,4,6,9,12,18,36,  hence answer = 0 (no multiple of 5)
    static void prob3(int n,int m) {
        int ans = 0;
        // TO DO
        for(int i = n - 1;i >= 1;i--){

            if(i % m == 0){

                if(n % i == 0){

                    ans += i;

                    break;
                }
            }

        }

        System.out.printf("%d is:  A. less than %d,  B. multiple of %d,  C. goes into %d\n", ans, n, m, n);
    }





}