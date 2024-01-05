import java.io.IOException;
import java.util.HashSet;

public class Decryption {
    private static final char[] ALPHABET = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З',
            'И', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};
    private static final int KEY = 5;
    public static HashSet<Character> chars = new HashSet<>();

    private static void fillHashSet() {
        for (int i = 0; i < ALPHABET.length; i++) {
            chars.add(ALPHABET[i]);
        }
    }
    public static void doDecrypt(){

    }
}

