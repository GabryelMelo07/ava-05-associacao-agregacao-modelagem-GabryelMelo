package modelUber;

public class Motorista {

  private final Usuario usuario;
  private final String carro;
  int qtd_viagens;

  public Motorista(Usuario usuario, String carro) {
    this.usuario = usuario;
    this.carro = carro;
  }

  public String getNome() {
    return this.usuario.getNome();
  }

  public int getQtd_viagens() {
    return qtd_viagens;
  }

  @Override
  public String toString() {
    return String.format("%s, %s", this.usuario.getNome(), this.carro);
  }

}
