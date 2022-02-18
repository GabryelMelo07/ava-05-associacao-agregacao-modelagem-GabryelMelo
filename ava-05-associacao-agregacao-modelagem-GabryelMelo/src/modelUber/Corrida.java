package modelUber;

public class Corrida {

  private final String origem;
  private final String destino;
  private final Usuario usuario;
  private final Motorista motorista;

  public Corrida(String origem, String destino, Motorista motorista, Usuario usuario) {
    this.origem = origem;
    this.destino = destino;
    this.usuario = usuario;
    this.motorista = motorista;
  }

  public String getOrigem() {
    return this.origem;
  }

  public String getDestino() {
    return this.destino;
  }

  public Usuario getUsuario() {
    return this.usuario;
  }

  public Motorista getMotorista() {
    return this.motorista;
  }

  @Override
  public String toString() {
    return String.format("Origem: %s, Destino: %s\n", this.origem, this.destino);
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Corrida){
      Corrida outraCorrida = (Corrida) obj;
      if(this.origem == outraCorrida.origem && this.destino == outraCorrida.destino){
        return true;
      } else {
        return false;
      }
    }
    return false;
  }


}
