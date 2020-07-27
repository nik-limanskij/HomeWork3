
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        boolean letsGame = true;
        while (letsGame) {
            Random rnd = new Random();
            int guessNumber = rnd.nextInt(10);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Угадайте число от 0 до 9");
            for (int i = 0; i < 3; i++) {
                int userNumber;
                System.out.print("Попытка # " + (i + 1) + ". Введите число: ");
                userNumber = scanner.nextInt();
                if (userNumber < guessNumber)
                    System.out.println("Ваше число меньше! Попробуйте еще раз...");
                else if (userNumber > guessNumber)
                    System.out.println("Ваше число больше! Попробуйте еще раз...");
                else {
                    System.out.println("Поздравляю! Вы угадали!!!");
                    break;
                }
            }
            System.out.println("\nМожет еще раз? 1 – да / 0 – нет: ");
            letsGame = scanner.nextInt() == 1;
        }
    }


}
