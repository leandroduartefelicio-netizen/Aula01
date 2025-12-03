import java.util.Scanner;
public class Cor_do_CD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Verificador da Cor do CD!");
        System.out.println();
        System.out.print("Insira a cor do CD desejado: ");
        String cd = sc.nextLine();
        if (cd.equals("Azul")){
            System.out.println("Este CD custa R$10,00!");
        } else{
            if (cd.equals("Vermelho")){
                System.out.println("Este CD custa R$20,00!");
            } else {
                if (cd.equals("Amarelo")){
                    System.out.println("Este CD custa R$30,00!");
                } else {
                    System.out.println("Cor Inválida, tu roubou esse CD de outra loja irmão");
                }
            }
        }
        sc.close();
    }   
}