package capitulo3;

public class CadastroLivro {

    public static void main(String[] args) {

        //criando o objeto
        Livro livro = new Livro();
        livro.nome ="Java 8";
        livro.descricao = "Como aprencer java";
        livro.valor = 59;
        livro.isbn = "54564564";

        Livro outrolivro = new Livro();
        outrolivro.nome ="html";
        outrolivro.descricao = "Como aprencer html";
        outrolivro.valor = 39;
        outrolivro.isbn = "54793369";

        //chamada do método
        livro.mostrarDetalhe();
        outrolivro.mostrarDetalhe();
    }
}
