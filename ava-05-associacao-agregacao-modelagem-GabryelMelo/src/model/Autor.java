package model;

public class Autor {

  private final String nome;
  private final String sobrenome;

  public Autor(String sobrenome, String nome) {
    if (nome.isEmpty() || nome.isBlank() || sobrenome.isEmpty() || sobrenome.isBlank()) {
      throw new IllegalArgumentException("O nome da Editora não pode ser vazio.");
    }
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  public String getNomeCompleto() {
    return String.format("%s %s", this.nome, this.sobrenome);
  }

  public String getNome() {
    return String.format("%s", this.nome);
  }

  public String getSobrenome() {
    return String.format("%s", this.sobrenome);
  }

  @Override
  public String toString() {
    return String.format("%s, %s", this.sobrenome, this.nome);
  }

}
