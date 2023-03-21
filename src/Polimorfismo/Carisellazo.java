package Polimorfismo;

import java.util.Scanner;

public class Carisellazo implements Juego{
private String nombre;
private int eleccion;
private int lanzamiento;
private
Scanner lectura=new Scanner(System.in);
    @Override
    public void iniciar() {
        System.out.println("ingrese el nombre del jugador");
        nombre=lectura.nextLine();
    }

    @Override
    public void jugar() {
       int lanzamiento=(int)(Math.random()*2+1);
       System.out.println("seleccione 1. cara 2. sello");
    }

    @Override
    public void finalizar() {
        if (lanzamiento==1 && eleccion==1){
            System.out.println("ha salido cara,usted selecciono cara");
        }
      
    }
    

}
