package clase1;

public class Prueb {
    /**
     * @param args
     */
    public static void main(String[] args ) {
        Animal guacamayo = new Animal("bambu", 10);
       Movie avatar=new Movie ();
        Movie up =new Movie ("lanochedeldemonio", "terror", 10, 1);
    

        Animal panda= new Animal ();
        panda.mostrarAnimal();
        up.mostrarMovie();
        
guacamayo.setNombre("pancho");
guacamayo.setEdad(10);
        guacamayo.registrarAnimal();
       System.out.println("el nombre del guacamayo es"+guacamayo.getNombre()+ "y su edad es"+ guacamayo.getEdad());
      
    }
    
}
