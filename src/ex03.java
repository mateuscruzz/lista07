import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vogal = sc.nextLine().toLowerCase();

        int A = 0, E = 0, I = 0, O = 0, U = 0;

        for (int i = 0; i < vogal.length(); i++) {
            char ch = vogal.charAt(i);
            switch (ch) {
                case 'a':
                    A++;
                    break;
                case 'e':
                    E++;
                    break;
                case 'i':
                    I++;
                    break;
                case 'o':
                    O++;
                    break;
                case 'u':
                    U++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("vogais 'a': " + A);
        System.out.println("vogais 'e': " + E);
        System.out.println("vogais 'i': " + I);
        System.out.println("vogais 'o': " + O);
        System.out.println("vogais 'u': " + U);

        sc.close();
    }
}
