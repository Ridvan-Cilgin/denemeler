package iftest;

public class IfDemo {
    public static void main(String[] args) {
        boolean isSecure = true;
        boolean isSemiSecure = true;

//        int processId = 10474;
        int processId = 425;

        if ((isSecure || isSemiSecure) && processId !=10474 ) {
            System.out.println("crm");
        }

        System.out.println("cms");
    }

}
