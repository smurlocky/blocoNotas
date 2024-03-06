import java.util.List;

public class App {
    public static void main(String[] args) {
        BlocoNotas blocoDeNotas = new BlocoNotas();

        // Exemplo de adição de anotações
        Anotacoes anotacao1 = new Anotacoes("Primeira anotação");
        Anotacoes anotacao2 = new Anotacoes("Segunda anotação");

        blocoDeNotas.adicionarAnotacao(anotacao1);
        blocoDeNotas.adicionarAnotacao(anotacao2);

        // Exemplo de acesso às anotações
        List<Anotacoes> anotacoes = blocoDeNotas.getAnotacoes();
        for (Anotacoes anotacao : anotacoes) {
            System.out.println("ID: " + anotacao.getId());
            System.out.println("Data: " + anotacao.getData());
            System.out.println("Conteúdo: " + anotacao.getConteudo());
            System.out.println();
        }

    }
}
