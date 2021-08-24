import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] makeSet(int size) {
        Random random = new Random();
        int[] set = new int[size];
        for (int i = 0; i < size; i++) {
            set[i] = random.nextInt(size);
        }
        return set;
    }

    public static void sortSetAscending(int[] set) {
        Arrays.sort(set, 0, set.length / 2);
    }

    public static void sortSetDescending(int[] set) {
        int tmp;
        for (int i = 0; i < set.length / 2; i++) {
            for (int j = 1; j < set.length / 2; j++) {
                if (set[j - 1] < set[j]) {
                    tmp = set[j - 1];
                    set[j - 1] = set[j];
                    set[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Sorting sort = new Sorting();
        int[] set1 = makeSet(10000);
        int[] set2 = makeSet(100000);
        int[] set3 = makeSet(1000000);


        sort.bubble(set1);
        sort.shell(set1);
        sort.insert(set1);
        sort.select(set1);
        sort.quick(set1);
        sort.arraySort(set1);
//
//        System.out.println("\n");
//        int[] set3_2 = set3.clone();
//        sortSetAscending(set3_2);
//        sort.bubble(set3_2);
//        sort.shell(set3_2);
//        sort.insert(set3_2);
//        sort.select(set3_2);
//        sort.quick(set3_2);
//        sort.arraySort(set3_2);
//
//        System.out.println("\n");
//        int[] set3_3 = set3.clone();
//        sortSetDescending(set3_3);
//        sort.bubble(set3_3);
//        sort.shell(set3_3);
//        sort.insert(set3_3);
//        sort.select(set3_3);
//        sort.quick(set3_3);
//        sort.arraySort(set3_3);

    }
}