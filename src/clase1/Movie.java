package clase1;

public class Movie {

          private String nombre,categoria;
        
       int year;
         public int duration;
         public void mostrarMovie(){
            System.out.println("El nombre de la pelicula es " +nombre);
        }

    
    public Movie() {
    }



    public Movie(String nombre, String categoria, int year, int duration) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.year = year;
        this.duration = duration;
    }
    
    
}
