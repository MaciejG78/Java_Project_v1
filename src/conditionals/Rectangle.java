package conditionals;

public class Rectangle {

    /*Jako parametry wejściowe przekazujemy wysokość i szerokość prostokąta, wyliczmy metodą
   Pole i obwód, drugą metodą rysujemy prostokąt:
   h=4 w=6         h=2, w=2
           ******   **
           *    *   **
           *    *
           ******
   Dodatkowo można weryfikować czy wartość podana h i w jest >= 2
   (Jak nie to ponownie oczekujemy na wprowadzenie wartości h i w wyświetlając stosowny komunikat)
    */
    public void rectangleMethod(int h, int w) {
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        int w = scanner.nextInt();

        calculateRectangle(h, w);
        printRectangle(h, w);
    }

    private void printRectangle(int h, int w) {
//        for () {
//            for () {
//                System.out.println();
//            }
//            System.out.println();
//        }
        System.out.println("koniec...");
    }

    private void calculateRectangle(int h, int w) {
        int pole = h*w;
        int obwod = 2*h + 2*w;
        System.out.println("Pole prostokąta wynosi: " + pole + ",  obwod wynosi: " + obwod);
    }
}
