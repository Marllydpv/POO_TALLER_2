package Polimorfismo;
import java.util.Scanner;

public class Circulo extends Figura {
    Scanner lectura =new Scanner (System.in);
    private float π,radio; //atributo encapsulado
    //Metodos accesores get y set
    public float getπ(){
        return π;
    }
    public void setπ(float π){
        System.out.println("ingrese el numero π");
        π=lectura.nextFloat();
        this.π = π;
    }
    public float getRadio(){
        return radio;
    }
    public void setRadio(float radio){
        System.out.println("ingrese el radio");
        radio=lectura.nextFloat();
        this.radio = radio;
    }
    
    @Override
    public void calcularArea(){
        //area del circulo
        float area= π*radio*radio;
        System.out.println("El circulo es"+π*radio*radio+"el area es"+area);
}
}