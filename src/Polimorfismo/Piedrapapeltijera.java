package Polimorfismo;

import java.util.Scanner;

public class Piedrapapeltijera implements Juego2{
private int eleccion;
private int lanzamiento;
private
Scanner lectura=new Scanner(System.in);
    @Override
    public void iniciar() {
        System.out.println("ingrese el nombre del jugador");
        lectura.nextLine();
    }

    @Override
    public void jugar() {
       System.out.println("seleccione 1. piedra 2. papel 3. tijera");
    }

    @Override
    public void terminar () {
        int seleccionUsuario;
    int seleccionCompu;
    switch ( seleccionCompu )
    {
        case 1:
            System.out.println("Piedra");
            switch ( seleccionUsuario )
            {
                case 1: System.out.println("Empate!"); break;
                case 2: System.out.println("Usted gana!"); break;
                case 3: System.out.println("La computadora gana!"); break;
            }
            break;

        case 2:
            System.out.println("Papel");
            switch ( seleccionUsuario )
            {
                case 1: System.out.println("La computadora gana!"); break;
                case 2: System.out.println("Empate!"); break;
                case 3: System.out.println("Usted gana!"); break;
            }
            break;

        case 3:
            System.out.println("Tijera");
            switch ( seleccionUsuario )
            {
                case 1: System.out.println("Usted gana!"); break;
                case 2: System.out.println("La computadora gana!"); break;
                case 3: System.out.println("Empate!"); break;
            }
            break;
    }


   
} 

}
