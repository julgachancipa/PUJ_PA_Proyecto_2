package entidades;

public class Profesor extends Persona{
    private String facultad;

    public Profesor(String nombre, String carrera, long sueldo, long cedula, long id, int edad, char sexo, String facultad) {
        super(nombre, carrera, sueldo, cedula, id, edad, sexo);
        this.facultad = facultad;
    }
    public String getFacultad() {
        return this.facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void atributos() {
        System.out.println(this.getNombre());
        System.out.println(this.getCarrera());
        System.out.println(this.getSueldo());
        System.out.println(this.getCedula());
        System.out.println(this.getId());
        System.out.println(this.getEdad());
        System.out.println(this.getSexo());
        System.out.println(this.getFacultad());
    }
}
