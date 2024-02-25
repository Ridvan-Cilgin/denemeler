package shapes;

public class Rectangle {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.drawFilledRectangle(5, 10);
        r.drawVoidRectangle(5, 10);


    }

    public void drawFilledRectangle(int row, int column) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void drawVoidRectangle(int row, int column) {
//        System.out.println("*****");
//        System.out.println("*   *");
//        System.out.println("*****");


        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                if (i == 0 || i == row - 1) {
                    System.out.print("*  ");
                } else {
                    if (j == 0) {
                        System.out.print("*  ");
                    } else if (j == column - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
