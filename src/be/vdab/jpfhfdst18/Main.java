package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Tik getallen. 0 om te stoppen");
        try (var writer = new PrintWriter(Files.newBufferedWriter(Path.of("/data/getallen.txt")))){
            for (int getal; (getal = scanner.nextInt()) != 0;){
                writer.println(getal);
            }
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
}
