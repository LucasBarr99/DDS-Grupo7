package EJ31;

public class Repositorio {
  private static Repositorio repositorio = null;

  private Repositorio(){

  }

  public static Repositorio getInstance(){
    if(repositorio == null){
      repositorio = new Repositorio();
    }
    return repositorio;
  }

  boolean hayCopiasDe(Libro libro){
    // TODO:
  }
  Copia_Libro prestarCopia(Libro libro){
    //Primero se fija si existe una copia en estado BIBLIOTECA, en caso de que no exista, crea una nueva y la devuelve
  }

}
