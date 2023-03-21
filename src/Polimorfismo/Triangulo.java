package Polimorfismo;
import java.util.Scanner;
public class Triangulo extends Figura {
    Scanner lectura =new Scanner (System.in);
    private float base,altura; //atributo encapsulado
    //Metodos accesores get y set
    public float getBase(){
        return base;
    }
    public void setLado(float base){
        System.out.println("ingrese la base");
       base=lectura.nextFloat();
        this.base=base;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        System.out.println("ingrese la altura");
        altura=lectura.nextFloat();
        this.altura=altura;
    }
    @Override
    public void calcularArea(){
        //area del cuadrado
        float area=base*altura;
        System.out.println("la base y altura son"+base*altura+"el area es"+area);
}
}
