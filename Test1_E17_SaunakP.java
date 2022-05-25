package test.ep2;

public class Test1_E17_SaunakP implements Test1_ProbInterface{
    static public void main(String[] args) {
        Test1_E17_SaunakP app = new Test1_E17_SaunakP();
        // Example Test Cases (change the arguments and add more test cases)
        app.testCase(  1,   2,   0, -1,  -9);
        app.testCase(  2,   9,  50,  1,  26);
        app.testCase( 33,  15, -11, 41, -29);
        app.testCase(  0, -83,  20,  6,  17);
        app.testCase(3,-2,1,3,-5);
    }

    void testCase(int p, int q, int r, int s, int t) {  // do NOT modify this function
        System.out.printf("prob(%4d,%4d,%4d,%4d,%4d) = %s\n", p, q, r, s, t, prob(p, q, r, s, t));
    }

    // this function takes 5 arguments: p, q, r, s, t.
    //    p is the 1st argument, q is the 2nd argument, ..., t is the 5th argument
    // step 1:  x = number of arguments whose values are multiples of 6 or negative
    // step 2:  y = larger of the 1st, 3rd and 4th arguments
    public String prob( int p, int q, int r, int s, int t){

        int x = 0;  // TO DO: calculate x according to the above instruction

        if(p % 6 == 0 || p < 0){
            x++;
        }
        if (q % 6 == 0 || q < 0){
            x++;
        }
        if (r % 6 == 0 || r < 0){
            x++;
        }
        if (s % 6 == 0 || s < 0){
            x++;
        }
        if (t % 6 == 0 || t < 0){
            x++;
        }

        int y = 0;  // TO DO: calculate y according to the above instruction

        if((p >= q && p > s) || (p >= s && p > q)){
            y += p;
        }
        if((q >= s && q > p)){
            y += q;
        }
        if((s > q && s > p)){
            y += s;
        }

        return "" + x + " " + y; // do NOT change this line!!!
    }

}