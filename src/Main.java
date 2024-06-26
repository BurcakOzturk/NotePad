import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            createFile();
            readFile();
            writeFile();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    //  NOTEPAD OLUŞTURULDU
    public static void createFile() throws IOException {
        File file = new File("Notepad.txt");
        if (file.createNewFile()) {
            System.out.println(file.getName() + " dosyası oluşturuldu.");
        } else {
            System.out.println(file.getName() + " dosyası zaten var");
        }

    }
    // NOTEPAD YAZMA
    public static void writeFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("Notepad.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        System.out.print("Notunuzu giriniz : ");
        String metin = scanner.nextLine();
        bufferedWriter.write(metin);bufferedWriter.newLine();
        System.out.println("Notunuz başarılı bir şekilde eklendi.");
        bufferedWriter.close();
    }

    // NOTEPAD OKUMA
    public static void readFile() throws IOException{
        File file = new File("Notepad.txt");
        Scanner scanner = new Scanner(file);
        int i  = 1;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(i +") "+ line);
            i++;
        }
        scanner.close();
    }
}

