import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o limite do cartão de crédito: R$ ");
        double limite = scanner.nextDouble();
        var cartao = new CartaoDeCredito(limite);

        while (true) {
            System.out.print("Insira a descrição da compra (ou 'sair' para finalizar): ");
            String descricao = scanner.next();
            if (descricao.equals("sair")) {
                break;
            }

            System.out.print("Insira o valor da compra: R$ ");
            double valor = scanner.nextDouble();
            var compra = new Compra(descricao, valor);
            boolean comprasLancadas = cartao.lancaCompras(compra);

            if (comprasLancadas) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println(compra);
                System.out.print("Digite 0 para sair ou 1 para continuar comprando");
                String sair = scanner.next();
                if (sair.equals("0")) {
                    break;
                }
            } else {
                System.out.println("Compra não realizada: saldo insuficiente.");

            }

        }
        System.out.printf("COMPRAS REALIZADAS:");
        for (Compra c : cartao.getCompras()) {
            System.out.println(c);
        }
    }
}