package src;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;

import static java.nio.file.Files.readString;

public class Encryption {
    public static HashSet<Character> chars = new HashSet<>();
    private static final char[] ALPHABET = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З',
            'И', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};
    private static final int KEY = 5;

    private static void fillHashSet() {
        for (int i = 0; i < ALPHABET.length; i++) {
            chars.add(ALPHABET[i]);
        }
    }

    public static void doEncrypt() throws IOException {
        Path InputFile = Path.of("C:\\Users\\User\\IdeaProjects\\com.javarush.cryptoanalyzer.druzhinin\\Files_for_example\\FileBeforeEncryption.txt");
        Path OutputFile = Path.of("C:\\Users\\User\\IdeaProjects\\com.javarush.cryptoanalyzer.druzhinin\\Files_for_example\\FileAfterEncryption.txt");

        String FileInclude = readString(InputFile);
        char[] charInputFile = FileInclude.toCharArray();
        char[] charOutputFile = new char[charInputFile.length];
        for (int i = 0; i < charInputFile.length - 1; i++) {
            if (chars.contains(charInputFile[i])) {
                int index = Arrays.binarySearch(ALPHABET, charInputFile[i]);
                int newIndex = index + KEY;
                if (newIndex >= ALPHABET.length) {
                    int x = newIndex % ALPHABET.length;
                    ALPHABET[newIndex] = ALPHABET[x];
                }
                charOutputFile[i] = ALPHABET[newIndex];
            } else continue;
            //writer.write(charOutputFile[i]);
            //System.out.println(indexPlusKEY);
        }
        for (int i = 0; i < charOutputFile.length; i++) {
            System.out.print(charOutputFile[i]);

        }
        try {
            FileWriter writer = new FileWriter("C:\\Users\\User\\IdeaProjects\\com.javarush.cryptoanalyzer.druzhinin\\Files_for_example\\FileAfterEncryption.txt");
            for (int i = 0; i < charOutputFile.length; i++) {
                writer.write(charOutputFile[i]);
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("Возникла ошибка во время записи, проверьте данные.");
        }
    }
}
