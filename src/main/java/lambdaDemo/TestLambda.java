package lambdaDemo;

public class TestLambda {
    public static void main(String[] args) {

        Selamlama selamla = (String isim) -> System.out.println("Merhaba " + isim);

       selamla.selamla("Ahmet");

        selamlayici("Mehmet", selamla);


        Selamlama hier = (String isim) -> System.out.println("Hi " + isim);

        selamlayici("Ali", hier);


        Selamlama aloha = (String isim) -> System.out.println("Aloha " + isim);

        selamlayici("Jack", aloha);
    }

    public static void selamlayici(String isim, Selamlama selamla){

        selamla.selamla(isim);
    }
}
