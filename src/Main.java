public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(24);
        persona.setNombre("Andy Orellana");
        persona.setTelefono("+569 87651234");

        System.out.printf("Mi nombre es %s , tengo %d años y mi telefono es %s.",persona.getNombre(),persona.getEdad(),persona.getTelefono());

    }

}

class Persona {

    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}