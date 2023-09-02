public class animal {
    private String nombre;
    private String tipo;
    private String color;
    private int edad;

    public animal(String nombre, String tipo, String color, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getColor() {
        return this.color;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
