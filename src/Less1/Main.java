package Less1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int failsCount = 0;

    public static void main(String[] args) {
        char[][] words = new char[][]{{'t', 'h', 'i', 's'}, {'i', 's'}, {'a'}, {'w', 'o', 'r', 'd'}};

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
            }
        }

        Random random = new Random();
        int secretWordIndex = random.nextInt(words.length);

        int secretWordLength = words[secretWordIndex].length;
        char[] secretWord = new char[secretWordLength];
        Arrays.fill(secretWord, '*');
        final char[] openWord = words[secretWordIndex];
        System.out.println(secretWord);
     do {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть літеру: ");
        String letter = in.nextLine();

        System.out.println("Введіть позицію літери");
        int position = in.nextInt();

        System.out.printf("Letter: %s index: %d", letter, position);

        char userLetter = letter.toCharArray()[0];

        if (Objects.equals(userLetter, openWord[position])) {
            secretWord[position] = userLetter;
        } else {
            failsCount++;
        }
        System.out.println();
        System.out.println(secretWord);
        System.out.println("Кількість невдалих спроб: " + failsCount);
       }while (secretWord != openWord);


    }
}
