package process;

import comparatordemo.Book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessDemo {
    public static void main(String[] args) throws IOException {

        // Burada process BUilder Oluşturduk
        ProcessBuilder p = new ProcessBuilder();

        // Notepad.exe programını açacağı dosyanın yolu ile birlikte gönderdik
        p.command("notepad.exe", "C:/Yeni klasör/dosya.txt");
        p.start();




    }
}
