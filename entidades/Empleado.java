package entidades;

abstract class Empleado extends Persona{
    private String universidad;
    
    public Empleado(String nombre, String carrera, long cedula, long id, int edad, char sexo, String universidad) {
        super(nombre, carrera, cedula, id, edad, sexo);
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return this.universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    abstract public double sueldo();
}
