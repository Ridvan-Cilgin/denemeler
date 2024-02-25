package wordmerge;

import org.junit.Test;

public class WordTest {

    String metin1 = "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n" +
            "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n" +
            "\tBurada;\n" +
            "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";

    String metin2 = "Burada;\n" +
            "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada X girilen metinlerin \n" +
            "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n" +
            "algoritma kullanılarak gerçekleştirilecektir";

    String sonuc = "Kullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n" +
            "karakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n" +
            "Burada;\n" +
            "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n" +
            "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n" +
            "algoritma kullanılarak gerçekleştirilecektir";

    @Test
    void case1() {
//
//        String cikti = Homeworker.merger(metin1, metin2);
//        assertEquals(sonuc, cikti);

    }
}
