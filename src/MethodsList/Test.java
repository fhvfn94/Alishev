package MethodsList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String str = "one,two,three,раз,два,три,one1,two2,three3";
        String letter = "abcdefghigklmnopqrstuvwxyz";
        String[] ar = str.split(",");
        ArrayList<String> array = new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {
//            String s = "";
            boolean flag = true;
            String word = ar[i];
            for (int j = 0; j < word.length(); j++) {
                char l = word.charAt(j);
                if (!letter.contains(String.valueOf(l))) {
//                    s += l;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                array.add(word);
            }
        }
        System.out.println(array);
        String words = String.join(" ", array);
        System.out.println(words);
    }
}
