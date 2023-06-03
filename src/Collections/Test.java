package Collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            for (int k = 0; k < nums.size(); k++) {
                int res = nums.get(k + 1);
                int result = n + res;
                r.add(result);
            }
        }
    }
}
