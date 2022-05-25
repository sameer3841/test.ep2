package test.ep2;

import java.util.*;

public class Quiz3_E17_SaunakP {
    public static void main(String[] args) {
        String[] x = {"car", "house", "flower", "blackboard"};
        String[] y = {"ox", "box", "icecream", "pizza", "hot-dog", "cloud", "castle"};
        String[] j = {"cut","whoosh","zap","pow","smack","zip"};
        String[] k = {"hello","my","name","is"};

        longWords(7, x, y);

        printArrayList(longWordsVer2(7, x, y));
        System.out.println();
        printArrayList(longWordsVer2(6,x,j));
        System.out.println();
        printArray(longWordsVer3(9,x,k));
    }

    /*
    Directions for ALL methods

    1. Find the array with the least amount of indexes between the two array parameters.
    1b. Smallest length between to arrays = the length for the List<String> being returned
    2. Go through each index of both arrays and add both together in one string.
    3. If the length of string is greater than or equal to miniLen, then add to List.
    4. Return List<String>

    Ex:

    String[] a = {"house", "bird","bow","hello"}
    String[] b = {"my","godly","fishes"}

    longWords(miniLen(Ex: 8),String[] a, String[] b)

    Output:

    birdgodly(9) bowfishes(8)
     */
    public static List<String> longWords(int miniLen, String[] a, String[] b) {
        List<String> v = new ArrayList<>();
        String c = "";

        if(a.length < b.length || a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                c = a[i] + b[i];
                if (c.length() >= miniLen) {
                    v.add(c);
                }
            }

        } else if(b.length < a.length){
            for (int i = 0; i < b.length; i++) {
                c = a[i] + b[i];
                if (c.length() >= miniLen) {
                    v.add(c);
                }
            }
        }
        return v;
    }
    //improved version of longWord (using Math function)
    public static List<String> longWordsVer2(int miniLen, String[] a, String[] b) {
        List<String> v = new ArrayList<>();
        String c = "";

        for (int i = 0; i < Math.min(a.length, b.length); i++) {
            c = a[i] + b[i];
            if (c.length() >= miniLen) {
                v.add(c);
            }
        }
        return v;
    }
    //Returns an Array instead of a List
    public static String[] longWordsVer3(int miniLen, String[] a, String[] b){
        List<String> lst = new ArrayList<>();

        String d = "";
        int e = 0;

        for(int i = 0; i < Math.min(a.length, b.length); i++){
            d = a[i] + b[i];
            if(d.length() >= miniLen){
                lst.add(d);

            }
        }

        String[] c = new String[lst.size()];
        for(int i = 0; i < c.length;i++){
            c[i] = lst.get(i);
        }

        return c;
    }
    //Prints LISTS
    public static void printArrayList(List<String> x) {
        //advance for loop format: for( (type) tuple variable : list parameter)

        for (String j : x) {

            System.out.printf("%s ", j);

        }

        System.out.println();
    }
    //prints ARRAYS
    public static void printArray(String[] a){
        for(String i : a){

            System.out.printf("%s ",i);

        }

        System.out.println();

    }
}