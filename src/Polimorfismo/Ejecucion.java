package Polimorfismo;
import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) {
        try (Scanner lectura = new Scanner (System.in)) {
            int opcion;
            Circulo cir =new Circulo();
            Triangulo tri =new Triangulo();
            Rectangulo rec =new Rectangulo();
            
            System.out.println("elija la figura a la que desea elegir el area (1).circulo (2).triangulo (3).rectangulo");
            opcion=lectura.nextInt();
            if (opcion==1) {
            
                cir.setRadio(0);
                cir.setπ(0);
                cir.calcularArea();
            }
            if (opcion==2) {
               
                   tri.setLado(0);
                   tri.setAltura(0);
                    tri.calcularArea();
                 
                }
                if (opcion==3) {
                   
                      rec.setLado(0);
                       rec.calcularArea();
                    }
        }
    }
        
    }
    

