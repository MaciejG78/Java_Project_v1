package conditionals;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ChristmasTree {

    int treeSize;

    public void christmasTree() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ilość poziomów drzewka wysokość: ");
        treeSize = scanner.nextInt();

//        printChristmasTree(treeSize);

    }

    private void printChristmasTree(int treeSize) throws InterruptedException {
        String emptySign = " ";
        String starSign = "*";

        for (int i = 0; i < treeSize-1; i++) {
            System.out.println(emptySign.repeat(Math.abs(i-(treeSize-2))) + starSign.repeat(i*2+1));
        }
        System.out.println(emptySign.repeat(treeSize-3) + "***");
        TimeUnit.SECONDS.sleep(1);
    }
}







