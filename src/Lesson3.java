public class Lesson3 {
    public static void main(String[] args) {

        System.out.println("задание 1");

        int [] intArray = {1,0,1,0,1,0,1,1,0,0};

        printArray(intArray);

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 1) {
                intArray[i] = 0;
            } else {
                intArray[i] = 1;
            }
        }
        printArray(intArray);

        System.out.println("задание 2");

        int [] newArray = new int[100];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
        }
        printArray(newArray);

        System.out.println("задание 3");

        int [] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        printArray(thirdArray);

        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] < 6) {
                thirdArray[i] *= 2;
            }
        }

        printArray(thirdArray);

        System.out.println("задание 4");

        int [][] fourthArray = new int[5][5];
        for (int i = 0; i < fourthArray.length; i++) {
            for (int j = 0; j < fourthArray[i].length; j++) {
                if (i == j){
                    fourthArray[i][j] = 1;
                }
                System.out.print(fourthArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("задание 5");

        printArray(fillArray(5,1));


        System.out.println("задание 6");

        int [] fifthArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 0};
        int min, max;

        min = fifthArray[0];
        max = fifthArray[0];

        printArray(fifthArray);

        for (int i = 0; i < fifthArray.length; i++) {
            if (fifthArray[i] < min) {
                min = fifthArray[i];
            }
            if (fifthArray[i] > max) {
                max = fifthArray[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

    public static int [] fillArray(int len, int initialValue){
        int [] newArray = new int[len];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i % 20 == 0 && i != 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
