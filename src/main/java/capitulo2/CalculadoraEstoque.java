package capitulo2;

public class CalculadoraEstoque {

    public static void main(String[] args) {
        //variáveis
        //adicionando condicionais

        String livro = "livros";
        int livroSegurançaJava = 59;
        double livroJava8 =  59.90;
        double livroTDD = 55;

        double soma = livroJava8 + livroTDD + livroSegurançaJava;

        System.out.println(livroSegurançaJava);
        System.out.println(livroJava8);
        System.out.println(livroTDD);
        System.out.println("A soma dos " + livro);
        System.out.println(soma);


        if (soma < 80 ){
            System.out.println("Promoção!!");
        } else {
            System.out.println("Tá muito caro!!");
        }

        soma = 0;
        int contador = 0;

        While(contador < 150);{
            double valorDoLivro = 59.29;
            soma += valorDoLivro;
            contador++;

            System.out.println("while " + soma);
        }
        soma = 0;
        for (contador = 0; contador < 35; contador ++){
            soma += 59.90;

            System.out.println("for " + soma);
        }


        System.out.println("total " + soma);
    }

    private static void While(boolean b) {
    }
}
