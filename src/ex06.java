import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro termo: ");
        int num = sc.nextInt();
        System.out.println("Razão: ");
        int razao = sc.nextInt();

        for (int i = 0;i<10;i++){
            num = num + razao;
            System.out.println(num);
        }
        sc.close();
    }
}
