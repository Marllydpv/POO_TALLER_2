package clase1;

public class Ave extends Animal{
    //Atributos propio
    private String envergadura;
    public Ave (){

    }
    public Ave (String nombre , int edad,String envergadura){
        super(nombre,edad);
        this.envergadura=envergadura;
    }
    //Metodos accesores getters setters

    public String getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    }
    public void mostrarAve(){
        System.out.println("el nombre del animal es"+getNombre()+"tiene"+getEdad()+"y envergadura de"+getEnvergadura());
    }

}
