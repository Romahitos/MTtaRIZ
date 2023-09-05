public class Main {
    public static void main(String[] args) {
        int rows = 4; // Кількість рядків масиву
        int cols = 5; // Кількість стовпців масиву

        int[][] array = createIntArray(rows, cols);
        printIntArray(array);
    }

    public static int[][] createIntArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value += 3;
            }
        }

        return array;
    }

    public static void printIntArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Перехід на новий рядок після кожного рядка масиву
        }
    }
}
