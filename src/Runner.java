import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Duplicate kk = new Duplicate();
        //Test 1 - no duplicates
        int[][] test1 = {{1, 2, 3, 4},
                         {2, 3, 4, 5},
                         {3, 4, 5, 6}};
        System.out.println("Test 1: ");
        System.out.println("input: ");
        for (int[] arrs : test1)
        {
            System.out.println(Arrays.toString(arrs));
        }
        System.out.println("expected result: false");
        System.out.println("actual result: " + kk.hasDuplicate(test1));
        System.out.println();

        //Test 2 - 1 duplicate
        int[][] test2 = {{1, 2, 3, 4},
                         {2, 3, 4, 5},
                         {1, 4, 5, 6}};
        System.out.println("Test 2: ");
        System.out.println("input: ");
        for (int[] arrs : test2)
        {
            System.out.println(Arrays.toString(arrs));
        }
        System.out.println("expected result: true");
        System.out.println("actual result: " + kk.hasDuplicate(test2));
        System.out.println();

        //Test 3 - multiple duplicate
        int[][] test3 = {{1, 2, 3, 4},
                         {2, 2, 4, 5},
                         {1, 4, 3, 5}};
        System.out.println("Test 3: ");
        System.out.println("input: ");
        for (int[] arrs : test3)
        {
            System.out.println(Arrays.toString(arrs));
        }
        System.out.println("expected result: true");
        System.out.println("actual result: " + kk.hasDuplicate(test3));
        System.out.println();

        //Test 4 - multiple duplicate
        int[][] test4 = {{1, 2, 3, 4},
                         {5, 2, 7, 8},
                         {9, 10, 7, 4}};
        System.out.println("Test 4: ");
        System.out.println("input: ");
        for (int[] arrs : test4)
        {
            System.out.println(Arrays.toString(arrs));
        }
        System.out.println("expected result: true");
        System.out.println("actual result: " + kk.hasDuplicate(test4));
        System.out.println();
    }
}