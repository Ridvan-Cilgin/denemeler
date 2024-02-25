package trycatchdemo;

public class TryCatchExample {
    public static void main(String[] args) throws Hata {

        int i = 10;
        int j = 0;

//
        try {
            int k = i / j;
            throw new Hata();
        } catch (ArithmeticException e) {
            sum();
        }
        catch (NullPointerException e) {
            sum();
        }
        catch (Hata e) {
            sum();
        }catch (Exception e) {
            System.out.println("hata!!!!!");
        }

        System.out.println(13 + 15);

    }

    static void sum() throws Hata {
       throw new Hata();
    }
}


//ssdasfasfasfasfasfasfasfasfasfasfasfasf


//s-----> s
//ss----->ss----------> s
//ssd----->ssd---------->d
//ssda---------->ssda---------->a
//        .
//        .
//        .
//        .
//        .
//        ssdasfasfasfasfasfasfasfasfasfasfasfasf---------->ssdasfasfasfasfasfasfasfasfasfasfasfasf---------->f


// Özel istisna sınıfı oluşturma
//class CustomException extends Exception {
//    public CustomException(String message) {
//        super(message);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            // Bir durum oluştur ve özel istisnayı fırlat
//            throw new CustomException("Bu özel bir istisna örneğidir.");
//        } catch (CustomException e) {
//            // Özel istisnayı yakala ve işle
//            System.out.println("Yakalanan istisna: " + e.getMessage());
//        }
//    }
//}
