package Polimorfismo;

import java.util.Scanner;

public class Rectangulo extends Figura {
    Scanner lectura =new Scanner (System.in);
    private float lado; //atributo encapsulado
    //Metodos accesores get y set
    public float getLado(){
        return lado;
    }
    public void setLado(float lado){
        System.out.println("ingrese el lado");
        lado=lectura.nextFloat();
        this.lado = lado;
    }
    @Override
    public void calcularArea(){
        //area del cuadrado
        float area=lado*lado;
        System.out.println("El lado del triangulo es"+lado+ "el area es"+area);
}
}