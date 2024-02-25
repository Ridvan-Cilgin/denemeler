package serializationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
    public static void main(String[] args) {
//yaz();
        oku();

    }

    public static void yaz() {

        try {
            Kisi kisi = new Kisi("Burak", "Kutbay");
            FileOutputStream dosya = new FileOutputStream("C:\\Yeni klasör\\metin.txt");
            ObjectOutputStream yaz = new ObjectOutputStream(dosya);
            yaz.writeObject(kisi);
            yaz.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void oku() {
        try {
            FileInputStream dosya = new FileInputStream("C:\\Yeni klasör\\metin.txt");
            ObjectInputStream oku = new ObjectInputStream(dosya);
            Kisi kisi = (Kisi) oku.readObject();
            System.out.println(kisi.toString());
            oku.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
