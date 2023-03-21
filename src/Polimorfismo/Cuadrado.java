package Polimorfismo;

public class Cuadrado extends Figura {
    private float lado; //atributo encapsulado
    //Metodos accesores get y set
    public float getLado(){
        return lado;
    }
    public void setLado(float lado){
        this.lado = lado;
    }

    @Override
    public void calcularArea(){
        //area del cuadrado
        float area=lado*lado;
        System.out.println("El lado del cuadrado es"+lado+ "el area es"+area);
    }
    
}
