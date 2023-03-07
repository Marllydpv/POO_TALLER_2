package clase1;
import java.util.Scanner;
public class Animal {
    //Atributos
     String nombre;
    String edad;
    Scanner lectura=new Scanner(System.in);

    //Metodos u operaciones
    public void registrarAnimal (){
        //cuerpo metodo
        System.out.println("ingrese el  nombre del animal");
        nombre=lectura.nextLine();
        System.out.println("ingrese la edad");
        edad=lectura.nextLine();
    }
    public void mostrarAnimal(){
        System.out.println("El nombre del animal ingresado es " +nombre);
    }
    public int duplicarEdad(int edad){
      int duplicado=edad*2;
        return duplicado;
    }

}
