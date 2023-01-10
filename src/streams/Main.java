package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList);
        List<Integer> intListNew = new ArrayList<>();
        for (Integer count : intList) {
            if (count > 0) {
                if (count % 2 == 0) {
                    intListNew.add(count);

                }
            }
        }
        System.out.println(intListNew);

    }

}

