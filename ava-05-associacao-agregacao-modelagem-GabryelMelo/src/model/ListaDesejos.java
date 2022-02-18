package model;

import java.util.ArrayList;

public class ListaDesejos {

  private String nome;
  private boolean publica;
  private ArrayList<Livro> livros = new ArrayList<>();

  public ListaDesejos(String nome, boolean publica) {
    this.nome = nome;
    this.publica = publica;
  }

  public String getNome() {
    return this.nome;
  }

  public boolean isPublica() {
    if(this.publica == true){
      return true;
    }
    return false;
  }

  public boolean isPrivada() {
    if (this.publica == false) {
      return true;
    }
    return false;
  }

  public ArrayList<Livro> getLivros() {
    return livros;
  }

  public Livro getLivro(int i) {
    if (i >= this.livros.size()) {
      return null;
    }
    return this.livros.get(i);
  }

  public Livro adicionar(Livro l) {
    Livro novoLivro = new Livro(l);
    this.livros.add(novoLivro);
    return novoLivro;
  }

  public int getQuantidade() {
    return this.livros.size();
  }

  public boolean isVazia() {
    return this.livros.size() == 0;
  }

  @Override
  public String toString() {
    return String.format("%s, %s", this.getNome(), this.isPublica());
  }

}
