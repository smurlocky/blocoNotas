import java.util.Date;

public class Anotacoes {
  private static int proximoId = 1;
  private int id;
  private String conteudo;
  private Date data;
  private boolean excluido;

  public Anotacoes(String conteudo) {
    this.id = proximoId++;
    this.conteudo = conteudo;
    this.data = new Date();
    this.excluido = false;
  }

  public int getId() {
    return id;
  }

  public String getConteudo() {
    return conteudo;
  }

  public Date getData() {
    return data;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public boolean isExcluido() {
    return excluido;
  }

  public void setExcluido(boolean excluido) {
    this.excluido = excluido;
  }

}
