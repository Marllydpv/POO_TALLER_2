package clase1;

public class Prueb {
    /**
     * @param args
     */
    public static void main(String[] args ) {
        Animal guacamayo = new Animal("bambu", 10);
       
        Movie up =new Movie ("lanochedeldemonio", "terror", 10, 1);
    

        Animal panda= new Animal ();
        panda.mostrarAnimal();
        up.mostrarMovie();
        

        guacamayo.registrarAnimal();//invocar o llamar un metodo
       
    }
    
}
