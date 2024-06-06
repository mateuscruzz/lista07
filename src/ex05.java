import java.util.Random;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1;

        System.out.println("Adivinhe o numero: ");
        int adv = sc.nextInt();
        while(adv != num) {
            if (adv > num) {
                System.out.println("O numero é menor");
                System.out.println("Adivinhe o numero: ");
                adv = sc.nextInt();
            } else if (adv < num) {
                System.out.println("O numero é maior");
                System.out.println("Adivinhe o numero: ");
                adv = sc.nextInt();
            }
        }
        System.out.println("Acertou!");
        sc.close();
    }
}
