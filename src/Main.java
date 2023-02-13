import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        float[] arr3 = new float[7];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (i + (float) (3.1 * i));
        }

        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        System.out.println("The first (int) array: ");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        for (int i = 0; i < arr1.length; i++) {
            if (i == (arr1.length - 1)) {
                System.out.print(arr1[i]);
                break;
            }

            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        System.out.println("The second (double) array: ");
        double[] arr2 = {1.57, 7.654, 9.986};

        for (int i = 0; i < arr2.length; i++) {
            if (i == (arr2.length - 1)) {
                System.out.print(arr2[i]);
                break;
            }

            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        System.out.println("The third (float) array: ");
        float[] arr3 = new float[7];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (i + (float) (3.1 * i));
        }

        for (int i = 0; i < arr3.length; i++) {
            if (i == (arr3.length - 1)) {
                System.out.print(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task 3");
        int i;

        System.out.println("The first (int) array: ");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        i = (arr1.length - 1);
        while (true) {
            if (i == 0) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
            i--;
        }
        System.out.println();

        System.out.println("The second (double) array: ");
        double[] arr2 = {1.57, 7.654, 9.986};
        i = (arr2.length - 1);
        while (true) {
            if (i == 0) {
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
            i--;
        }
        System.out.println();

        System.out.println("The third (float) array: ");
        float[] arr3 = new float[7];
        for (int j = 0; j < arr3.length; j++) {
            arr3[j] = (j + (float) (3.1 * j));
        }
        i = (arr3.length - 1);
        while (true) {
            if (i == 0) {
                System.out.print(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
            i--;
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task 4");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
