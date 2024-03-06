import java.util.ArrayList;
import java.util.List;

public class BlocoNotas {

  private List<Anotacoes> listaAnotacoes;

  public BlocoNotas() {
    this.listaAnotacoes = new ArrayList<>();
  }

  public void adicionarAnotacao(Anotacoes anotacao) {
    this.listaAnotacoes.add(anotacao);
  }

  public List<Anotacoes> getAnotacoes() {
    return this.listaAnotacoes;
  }

  public void removerAnotacao(Anotacoes anotacao) {
    this.listaAnotacoes.remove(anotacao);
  }

  public void removerAnotacao(int id) {
    this.listaAnotacoes.remove(id);
  }

  public void removerAnotacao(String conteudo) {
    this.listaAnotacoes.remove(conteudo);
  }

  public void editarAnotacao(int id, Anotacoes anotacao) {
    for (Anotacoes anotacoes : listaAnotacoes) {
      if (anotacoes.getId() == id) {
        anotacoes.setConteudo(anotacao.getConteudo());
      }
    }
    System.out.println("Anotação com ID " + id + " não encontrada.");
  }

  public void deletaAnotacao(int id) {
    for (Anotacoes anotacoes : listaAnotacoes) {
      if (anotacoes.getId() == id) {
        anotacoes.setExcluido(true);
      }
    }
  }

  public List<Anotacoes> buscaAnotacoes(String txtBusca) {
    List<Anotacoes> resultado = new ArrayList<>();

    for (Anotacoes anotacoes : listaAnotacoes) {
      if (!anotacoes.isExcluido() && (anotacoes.getConteudo().contains(txtBusca))) {
        resultado.add(anotacoes);
      }
    }
    return resultado;
  }

  public List<Anotacoes> getAllAnotacoes() {
    List<Anotacoes> resultado = new ArrayList<>();

    for (Anotacoes anotacoes : listaAnotacoes) {
      if (!anotacoes.isExcluido()) {
        resultado.add(anotacoes);
      }
    }
    return resultado;
  }

}
