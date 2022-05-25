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
        printArrayList(longWordsVer2(9,x,k));
    }


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

    public static String[] longWordsVer3(int miniLen, String[] a, String[] b){
        String[] c = new String[Math.min(a.length, b.length)];
        String d = "";
        int e = 0;

        for(int i = 0; i < c.length; i++){
            d = a[i] + b[i];
            if(d.length() >= miniLen){
                c[e] = d;
                e++;
            }
        }
        return c;
    }

    public static void printArrayList(List<String> x) {
        //advance for loop format: for( (type) tuple variable : list parameter)

        for (String j : x) {

            System.out.printf("%s ", j);

        }

        System.out.println();
    }
}