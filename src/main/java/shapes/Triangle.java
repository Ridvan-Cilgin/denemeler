package shapes;

public class Triangle {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.drawTriangle(3);

    }

    public void drawTriangle (int h){


        for (int i = 1; i < 2*h; i++) {

            for (int j = 1; j <2*h; j++) {

                for (int k = 0; k < (2*h - 1) - i; k++) {
                    System.out.print(" ");
                }


                for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                }


                for (int k = 0; k < (2*h - 1) - i; k++) {
                    System.out.print(" ");
                }
                System.out.println();
            }

       }

    }
}








