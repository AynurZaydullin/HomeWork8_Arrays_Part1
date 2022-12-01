public class Main {
    public static void main(String[] args) {
        //Домашняя работа 8. Массивы. Часть 1.
        //Задача 1.
        int[]oneTwoThree = new int[3];
        oneTwoThree[0] = 1;
        oneTwoThree[1] = 2;
        oneTwoThree[2] = 3;
        double[]secondArray = {1.57, 7.654, 9.986};
        double[]thirdArray = new double[2];
        thirdArray[0] = -1.2;
        thirdArray[1] = 0.6;

        //Задача 2.
        System.out.println("Домашняя работа 8. Массивы. Часть 1.");
        System.out.println("Задача 2.");
        for (int a = 0; a < oneTwoThree.length; a++){
            System.out.print(oneTwoThree[a] + ",");
        }
        System.out.println();
        for (int a = 0; a < secondArray.length; a++){
            System.out.print(secondArray[a] + ",");
        }
        System.out.println();
        for (int a = 0; a < thirdArray.length; a++){
            System.out.print(thirdArray[a] + ",");
        }
        System.out.println();
        System.out.println();

        //Задача 3.
        System.out.println("Задача 3.");
        for (int  a = (oneTwoThree.length - 1); a >= 0; a--){
            System.out.print(oneTwoThree[a] + ",");
        }
        System.out.println();
        for (int  a = (secondArray.length - 1); a >= 0; a--){
            System.out.print(secondArray[a] + ",");
        }
        System.out.println();
        for (int  a = (thirdArray.length - 1); a >= 0; a--){
            System.out.print(thirdArray[a] + ",");
        }
        System.out.println();
        System.out.println();

        //Задача 4.
        System.out.println("Задача 4.");
        for (int a = 0; a < oneTwoThree.length; a++){
            if (oneTwoThree[a]%2 != 0){
                oneTwoThree[a] = oneTwoThree[a] + 1;
            }
            System.out.print(oneTwoThree[a] + ",");
        }
        System.out.println();

    }
}