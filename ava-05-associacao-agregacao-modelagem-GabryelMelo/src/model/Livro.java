package model;

import java.time.Year;

public class Livro {

  private final String titulo;
  private final int ano;
  private final Autor autor;
  private final Editora editora;

  static final int YEAR = Year.now().getValue();

  public Livro(String titulo, Autor autor, int ano, Editora editora) {
    if (titulo.isEmpty() || titulo.isBlank()) {
      throw new IllegalArgumentException("O nome da Editora não pode ser vazio.");
    } else if (ano > YEAR) {
      throw new IllegalArgumentException("O ano não pode ser maior que o ano atual.");
    }
    this.titulo = titulo;
    this.ano = ano;
    this.editora = editora;
    this.autor = autor;
  }

  public Livro(Livro l) {
    this.titulo = l.titulo;
    this.ano = l.ano;
    this.autor = l.autor;
    this.editora = l.editora;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public int getAno() {
    return this.ano;
  }

  public Autor getAutor() {
    return this.autor;
  }

  public Editora getEditora() {
    return this.editora;
  }

  @Override
  public String toString() {
    return String.format("%s. %s. Ed. %s, %d.", this.autor, this.titulo, this.editora, this.ano);
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Livro){
      Livro outroLivro = (Livro) obj;
      if(this.titulo == outroLivro.titulo && this.ano == outroLivro.ano && this.autor == outroLivro.autor && this.editora == outroLivro.editora){
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

}
