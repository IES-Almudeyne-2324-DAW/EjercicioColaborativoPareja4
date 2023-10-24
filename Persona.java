public class Persona(){
    public String DNI;
    public String nombre;
    public String apellidos;
    public int edad;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String setDNI(String DNI){
        this.DNI = DNI;
    }

    public String setNombre(String nombre){
        this.nombre = nombre;
    }

    public String setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public int setEdad(int edad){
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola, soy "+this.nombre+" y tengo "+this.edad + " años");
    }

}