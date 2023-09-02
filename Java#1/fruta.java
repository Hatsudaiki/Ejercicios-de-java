public class fruta {
    private String nombre;
    private String color;
    private int precio;

    public fruta(String nombre, String color, int precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
