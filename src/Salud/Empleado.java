package Salud;

public class Empleado extends Persona{
   
    //Atributos propios
    private String cargo, valorhora, horastrabajadas, departamento;

   public Empleado(){

   }
   public void setCargo(String cargo) {
    this.cargo = cargo;

}
public void setValorhora(String valorhora) {
    this.valorhora = valorhora;

}
public void setHorastrabajadas(String horastrabajadas) {
    this.horastrabajadas = horastrabajadas;

}
public void setDepartamento(String departamento) {
    this.departamento= departamento;

}
public void calularSueldo (){
    //cuerpo metodo
    System.out.println("ingrese su cargo");
    cargo=lectura.nextLine();
    System.out.println("ingrese el  numero de horas trabajadas");
    horastrabajadas=lectura.nextLine();
    System.out.println("ingrese el valor por hora");
    valorhora=lectura.nextLine();
    System.out.println("ingrese su departamento");
    departamento=lectura.nextLine();
}
    
}
    

