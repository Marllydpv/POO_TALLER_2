package clase1;
import java.util.Scanner;
public class Animal {
    //Atributos
     String nombre;
    int edad;
    Scanner lectura=new Scanner(System.in);
    

    public Animal() {
    }
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //Metodos accesores
    public int getEdad(){ //Metodo get o getter
        return edad;
    }
    public String getNombre(){ 
        return nombre;
    }
    public void setEdad(int edad){ //Metodo set o setter
        this.edad=edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Metodos u operaciones
    public void registrarAnimal (){
        //cuerpo metodo
        System.out.println("ingrese el  nombre del animal");
        nombre=lectura.nextLine();
        System.out.println("ingrese la edad");
        edad=lectura.nextInt();
    }
    public void mostrarAnimal(){
        System.out.println("El nombre del animal ingresado es " +nombre);
    }
    public int duplicarEdad(int edad){
      int duplicado=edad*2;
        return duplicado;
    }
    public void mostrarMovie(){
        System.out.println("El nombre de la pelicula es " +nombre);
    }
    public void mostrarMovie(int no){
        System.out.println("El nombre de la pelicula es " +no);
    }
    public void mostrarMovie(String no){
        System.out.println("El nombre de la pelicula es " +no);
    }
    

}
