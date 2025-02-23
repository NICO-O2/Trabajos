




public class Estudiante {
    private String nombre;
    private int edad;
    private String genero;
    private String ID;
    private String alergias;
    private String nombreAcudiente;
    private String numero;

    public Estudiante(String nombre,int edad,String genero,String ID,String alergias,String nombreAcudiente,String numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ID = ID;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getID() {
        return ID;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void informacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Documento: " + ID);
        System.out.println("Alergias: " + (alergias.isEmpty() ? "Ninguna" : alergias));
        System.out.println("Acudiente: " + nombreAcudiente);
        System.out.println("Contacto: " + numero);
    }


}
