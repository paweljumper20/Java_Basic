package tables;

import org.w3c.dom.ls.LSOutput;

public class MultiArray {
    public static void main(String[] args) {
        char[][] t = {{'_', 'X', '_'},
                {'_', 'O', '_'},
                {'_', 'O', 'O'}
        };
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%3c", t[i][j]);
            }
            System.out.println();
        }

        // tablice wielowymiarowe - nieregularne
        int[][] numbers = {
                {1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3, 3}
        };
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%-3d", numbers[i][j]);
            }

            System.out.println();

        }
    }

}
