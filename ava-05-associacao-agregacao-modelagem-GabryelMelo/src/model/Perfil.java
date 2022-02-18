package model;
import java.util.ArrayList;

public class Perfil {

  private String nome;
  private ArrayList<ListaDesejos> listaDeDesejos = new ArrayList<>();

  public Perfil(String str) {
    this.nome = str;
  }

  public String getNome() {
    return this.nome;
  }

  public ArrayList<ListaDesejos> getListasDeDesejos() {
    return this.listaDeDesejos;
  }

  public ArrayList<ListaDesejos> getListasDeDesejos(String str) {
    for (ListaDesejos l : listaDeDesejos) {
      if(l.getNome().equalsIgnoreCase(str)){
        return listaDeDesejos;
      }
    }
    return null;
  }

  public ListaDesejos getListaDeDesejos(int i) {
    if(i >= this.listaDeDesejos.size()){
      return null;
    }
    return this.listaDeDesejos.get(i);
  }

  public ListaDesejos getListaDeDesejos(String str) {
    for (ListaDesejos listaDesejos : listaDeDesejos) {
      if(listaDesejos.getNome().equalsIgnoreCase(str)){
        return listaDesejos;
      }
    }
    return null;
  }

  public ListaDesejos novaListaDesejos(String nome, boolean publica) {
    ListaDesejos novaLista = new ListaDesejos(nome, publica);
    this.listaDeDesejos.add(novaLista);
    return novaLista;
  }

  @Override
  public String toString() {
    return this.getNome();
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Perfil){
      Perfil outroPerfil = (Perfil) obj;
      if(this.nome == outroPerfil.nome){
        return true;
      } else {
        return false;
      }
    }
    return false;
  }


}
