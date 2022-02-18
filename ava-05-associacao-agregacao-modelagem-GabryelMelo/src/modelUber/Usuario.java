package modelUber;

import java.util.ArrayList;

public class Usuario {

  private final String nome;
  private final String email;
  private int telefone;
  ArrayList<Corrida> historicoCorridas = new ArrayList<>();

  public Usuario(String nome, String email, int telefone) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
  }

  public String getNome() {
    return this.nome;
  }

  public String getEmail() {
    return this.email;
  }

  public int getTelefone() {
    return this.telefone;
  }

  public ArrayList<Corrida> getHistoricoCorridas() {
    return historicoCorridas;
  }

  public Corrida getHistoricoCorrida(int i) {
    if (i >= historicoCorridas.size()) {
      return null;
    }
    return this.historicoCorridas.get(i);
  }

  public Corrida getHistoricoCorrida(String str) {
    for (Corrida corrida : historicoCorridas) {
      if (corrida.getOrigem().equalsIgnoreCase(str) || corrida.getDestino().equalsIgnoreCase(str)) {
        return corrida;
      }
    }
    return null;
  }

  public Corrida novaCorrida(String origem, String destino, Motorista motorista, Usuario usuario) {
    Corrida novaCorrida = new Corrida(origem, destino, motorista, this);
    usuario.historicoCorridas.add(novaCorrida);
    motorista.qtd_viagens++;
    return novaCorrida;
  }

  public Motorista cadastrarMotorista(String carro) {
    Motorista motorista = new Motorista(this, carro);
    return motorista;
  }

  @Override
  public String toString() {
    return String.format("%s", this.nome);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Usuario) {
      Usuario outroUsuario = (Usuario) obj;
      if (this.nome == outroUsuario.nome) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

}
