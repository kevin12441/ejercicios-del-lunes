public class ejercicio1poo {

     public static void main(String[] args) {
        // Crear una instancia de Animal
        Animal animal1 = new Animal();

        // Usar los setters para establecer valores
        animal1.setNombre("Tigre");
        animal1.setOrden("Carnívoro");
        animal1.setExtremidades(4);

        // Mostrar los datos del animal usando los getters
        System.out.println("Información del Animal:");
        System.out.println("Nombre: " + animal1.getNombre());
        System.out.println("Orden: " + animal1.getOrden());
        System.out.println("Extremidades: " + animal1.getExtremidades());
    }
}

// Clase Animal con encapsulamiento
class Animal {
    private String nombre;
    private String orden;
    private int extremidades;

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }
}

