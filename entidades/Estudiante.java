package entidades;

public class Estudiante extends Persona{
    private int creditos;

    public Estudiante(String nombre, String carrera, long sueldo, long cedula, long id, int edad, char sexo, int creditos) {
        super(nombre, carrera, sueldo, cedula, id, edad, sexo);
        this.creditos = creditos;        
    }

    public int getCreditos() {
        return this.creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void atributos() {
        System.out.println(this.getNombre());
        System.out.println(this.getCarrera());
        System.out.println(this.getSueldo());
        System.out.println(this.getCedula());
        System.out.println(this.getId());
        System.out.println(this.getEdad());
        System.out.println(this.getSexo());
        System.out.println(this.getCreditos());
    }
}
