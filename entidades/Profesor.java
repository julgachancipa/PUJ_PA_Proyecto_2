package entidades;

public class Profesor extends Empleado{
    double precio_hora = 105000.5;
    private String facultad;
    private char phd;
    private char planta;
    private int horas_clase;

    public Profesor(String nombre, String carrera, long cedula, long id, int edad, char sexo, String universidad, String facultad, char phd, char planta, int horas_clase) {
        super(nombre, carrera, cedula, id, edad, sexo, universidad);
        this.facultad = facultad;
        this.phd = phd;
        this.planta = planta;
        this.horas_clase = horas_clase;
    }
    public String getFacultad() {
        return this.facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public char getPhd() {
        return this.phd;
    }

    public void setPhd(char phd) {
        this.phd = phd;
    }

    public char getPlanta() {
        return this.planta;
    }

    public void setPlanta(char planta) {
        this.planta = planta;
    }

    public int getHorasClase() {
        return this.horas_clase;
    }

    public void set(int horas_clase) {
        this.horas_clase = horas_clase;
    }

    public void atributos() {
        System.out.println(this.getNombre());
        System.out.println(this.getCarrera());
        System.out.println(this.getCedula());
        System.out.println(this.getId());
        System.out.println(this.getEdad());
        System.out.println(this.getSexo());
        System.out.println(this.getFacultad());
        System.out.println(this.getPhd());
        System.out.println(this.getPlanta());
        System.out.println(this.getHorasClase());
        System.out.println(this.sueldo());
    }

    @Override public double sueldo()
    {
        double sueldo = this.getHorasClase() * precio_hora;

        if (this.getPhd() == 's') {
            sueldo = sueldo + (sueldo * 0.15);
        }

        if (this.getPlanta() == 's') {
            sueldo = sueldo + 1000000;
        }

        return sueldo;
    }
}
