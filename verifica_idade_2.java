import java.util.Scanner;

public class verifica_idade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Insira sua idade:");
            int A = sc.nextInt();
            if (A == 0) {
                System.out.print("o programa esta encerrando:");
                break;
            }

            else {
                if (A > 0) {
                    if (A >= 18) {
                        if (A >= 60) {
                            System.out.println("voce é idoso tio!");
                        } else {
                            System.out.println("voce é maior de idade:");
                        }
                    } else {
                        System.out.println("voce é criança!");
                    }
                } else {
                    System.out.println("Entrada Invalida Digite nomvamente.");
                    continue;
                }
            }
        }
    }
}
