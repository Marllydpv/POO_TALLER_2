package clase1;

public class Movie {
    String nombre1;
  int edad;

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
    
    public void setEdad(int edad){ //Metodo set o setter
        this.edad=edad;
    }
    
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }
    public int getEdad(){ //Metodo get o getter
        return edad;
    }
    public String getNombre1(){ 
        return nombre1;
    }
  }
    

