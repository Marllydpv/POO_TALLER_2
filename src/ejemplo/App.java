package ejemplo;
import clase1.Movie;
import clase1.Animal;
public class App {
  String nombre;
  int edad;
    public static void main(String[] args) throws Exception {
      Animal tigre=new Animal ();
      Movie minions=new Movie();
    
    Movie avatar=new Movie();
    
    avatar.setEdad(10);
    avatar.setNombre1("avatar");
    System.out.println("el nombre de la pelicula es"+avatar.getNombre1()+ "y su edad es"+ avatar.getEdad());

  }
  }
