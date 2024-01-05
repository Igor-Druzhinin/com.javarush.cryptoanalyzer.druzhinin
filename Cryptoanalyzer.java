import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Cryptoanalyzer {
    public static void main(String[] args) throws IOException {
//        System.out.println("Введите режим работы программы");
//        System.out.println("1 - Шифровка текста");
//        System.out.println("2 - Дешифровка текста");
//        System.out.println("3 - Взлом файла");
        Scanner scanner = new Scanner(System.in);
        int UserInput = Integer.parseInt(scanner.nextLine());
        if (UserInput==1) {
            Encryption.doEncrypt();
        }
        else if (UserInput==1) {
            Decryption.doDecrypt();
        }

    }
}
