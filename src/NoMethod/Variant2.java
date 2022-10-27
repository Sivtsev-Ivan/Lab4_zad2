package NoMethod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Variant2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int i = sc.nextInt();
        System.out.println("Введите кол-во столбцов: ");
        int j = sc.nextInt();

        int n = 1;
        int[][] arr = new int[i][j];

        try {
            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr[i].length; j++) {
                    arr[i][j] = n;
                    n++;
                }
            }

            System.out.println("Введите номер стобца: ");
            int x = sc.nextInt();
            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr[i].length; j++) {
                    if (j == x) {
                        System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j] + "; ");
                    }
                }
            }

        }catch(InputMismatchException exc){
            System.out.println("\n ---  Ввод строки вместо числа  ---");
        }catch(NullPointerException exc){
            System.out.println("Нет столбца с таким номером");
        };

    }
}
