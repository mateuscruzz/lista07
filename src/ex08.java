import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor inicial: ");
        int valorInicial = sc.nextInt();
        System.out.println("Valor final: ");
        int valorFinal = sc.nextInt();

        for (int i = valorInicial; i<= valorFinal; i++){
            boolean primo = true;
            if (i > 1) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        primo = false;
                    }
                }
                if (primo){
                    System.out.println(i);
                }
            }
        }


        sc.close();
    }
}
