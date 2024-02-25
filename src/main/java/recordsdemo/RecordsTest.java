package recordsdemo;

public class RecordsTest {
    public static void main(String[] args) {
        BookRecords bookRecords = new BookRecords("suç",35,1889);

        System.out.println(bookRecords);

        record Customer(int customerNo , String customerName){}

        Customer customer = new Customer(5,"Alper");

        System.out.println(customer);
    }

}
