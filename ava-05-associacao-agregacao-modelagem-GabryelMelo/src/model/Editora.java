package model;

public class Editora {

  private final String nome;

  public Editora(String str) {
    if(str.isEmpty() || str.isBlank()){
      throw new IllegalArgumentException("O nome da Editora não pode ser vazio.");
    }
    this.nome = str;
  }

  public String getNome() {
    return this.nome;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Editora) {
      Editora outraEditora = (Editora) obj;
      if(this.nome == outraEditora.nome){
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return this.nome;
  }

}
