import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Digite o limite do Cartão: \n");
        BigDecimal limite = s.nextBigDecimal();
        BigDecimal fatura = new BigDecimal("0.0");


        Cartao meuCartao = new Cartao(limite ,fatura);
        Compra minhaCompra = new Compra();


        s.nextLine();

        int x = 0;
        while ( x !=1 ){
            System.out.println("Digite a descrição da compra \n");
            String descricao = s.nextLine();

            System.out.println("Digite o valor da compra \n");
            BigDecimal valorCompra = s.nextBigDecimal();
            s.nextLine();

            minhaCompra.validaCompra(meuCartao,valorCompra, descricao);

            System.out.println("Digite 0 para continuar 1 para sair! \n");

            int valida = s.nextInt();
            s.nextLine();

            if(valida == 1){
                minhaCompra.printCompras(meuCartao);
                break;
            }else {
                continue;
            }

            }

        }
    }
