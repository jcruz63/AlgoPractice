package functionalInterfaces;

import java.util.Comparator;

public class Comp {

    Comparable<Integer> comparable = new Comparable<Integer>() {
        @Override
        public int compareTo(Integer o) {
            return 0;
        }
    };

   Comparator<Integer> comparator = (Integer a, Integer b) -> { return 0; };
}
