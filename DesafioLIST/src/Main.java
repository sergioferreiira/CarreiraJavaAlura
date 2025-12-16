import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> listaCompras = new ArrayList<>();


        System.out.println("Digite o limite do Cartão: \n");
        float limite = s.nextInt();
        float fatura = 0;

        Cartao meuCartao = new Cartao(limite ,fatura);

        int x = 0;
        while ( x !=1 ){
            System.out.println("Digite a descrição da compra \n");
            String descricao = s.nextLine();
            s.nextLine();

            System.out.println("Digite o valor da compra \n");
            float compra = s.nextFloat();



            if (compra < meuCartao.getLimite()){
                meuCartao.setFatura(compra);
            }else{
                System.out.println("O valor dessa compra é maior que o limite do seu cartao!!!");

                System.out.println("Quer comprar outro produto? 0 não 1 sim");
                int validaNovaCompra = s.nextInt();

                if(validaNovaCompra == 1 && validaNovaCompra < meuCartao.getLimite()){
                    System.out.println("Digite o valor da compra: ");
                    compra = s.nextFloat();
                    meuCartao.setFatura(compra);
                }else{
                    break;
                }
            }


            if (meuCartao.getFatura() <= limite){
                System.out.println("Compra Realizada \n");
                System.out.println(meuCartao.getFatura());
            }else {
                System.out.println("Sua compra ultrapassou o limite: " + meuCartao.getFatura());
                listaCompras.remove(listaCompras.size() -1);
                System.out.println(listaCompras);
                break;
            }


            System.out.println("Digite 0 para continuar 1 para sair! \n");

            int valida = s.nextInt();

            if(valida == 1){
                break;
            }
        }
    }
}