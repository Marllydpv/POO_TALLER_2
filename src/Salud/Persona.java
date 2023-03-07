package Salud;
import java.util.Scanner;

public class Persona {
 
        
        public static Object pedirDatos;
        String tipoDoc;
        String nombre;
        String apellido;
        Double peso;
        Double estatura;
        int edad;
        String sexo;
        Scanner lectura=new Scanner(System.in);
    
        public void pedirDatos(){
            //cuerpo metodo
            System.out.println("cual es su tipo de documento");
            tipoDoc=lectura.nextLine();
            System.out.println("ingrese su nombre");
            nombre=lectura.nextLine();
            System.out.println("ingrese su apellido");
            apellido=lectura.nextLine();
            System.out.println("ingrese su peso");
            peso=lectura.nextDouble();
            System.out.println("ingrese su estatura");
            estatura=lectura.nextDouble();
            System.out.println("ingrese su edad");
            edad=lectura.nextLine();
            System.out.println("ingrese su sexo");
            sexo=lectura.nextLine();
        }
        public double IMC,calc1;
        public void calcularIMC (){
          System.out.println("");
          IMC =Math.pow(estatura, 2);
          calc1 = (peso/IMC);
          System.out.println("Su IMC es se:"+calc1);
          if (IMC<20){
            System.out.println("el peso esta por debajo de lo ideal ");
          }
          else if (calc1>=20 && calc1 <=25){
            System.out.println("el peso es ideal");
          }
          else if (calc1>25){
            System.out.println("usted tiene sobre peso");
          }


        }
        public void mayorEdad(){
            if (edad>=18){
                System.out.println("Usted es maypr de edad");
              }
              else if (edad<18){
                System.out.println("usted es menor de edad");
              }
        }

    
}
