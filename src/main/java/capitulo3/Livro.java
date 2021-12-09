package capitulo3;

public class Livro {

    //atributoas da classe
    String nome;
    String descricao;
    double valor;
    String isbn;

    //método
    void mostrarDetalhe() {
        String msg = "Mostrando detalhes do livro";
        System.out.println(msg);
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println(valor);
        System.out.println(isbn);

    }
}
