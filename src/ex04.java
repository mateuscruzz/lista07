import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine().toLowerCase();

        int normal = 0;
        int contrario = palavra.length() - 1;

        while(contrario>normal){
            char normalChar = palavra.charAt(normal++);
            char contrarioChar = palavra.charAt(contrario--);
            if (contrarioChar != normalChar){
                System.out.println("Não é um palindromo");
            }
            else {
                System.out.println("É um palindromo");
            }
        }

        sc.close();
    }
}
