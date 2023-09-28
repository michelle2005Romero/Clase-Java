import java.util.Scanner;

/**
 * Clase Heladeria, se representan objetos como nombre, capacidadClientes y direccion.
 */
public class Heladeria {
    /***************************************************/
    /******************** Atributos ********************/
    /***************************************************/
    private String nombre;
    private int capacidadClientes;
    private String direccion;

    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/

    /**
     * Constructor de la clase Heladeria: Inicializa los atributos de la heladería.
     *
     * @param nombre            El nombre de la heladería.
     * @param direccion         La dirección de la heladería .
     * @param capacidadClientes La capacidad máxima de clientes que puede atender la heladería.
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Heladeria(String nombre, String direccion, int capacidadClientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidadClientes = capacidadClientes;
    }

    /**
     * Método que inicia el funcionamiento de la heladería.
     *
     * @return boolean: Indica si la heladería ha iniciado.
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public boolean abrir() {
        System.out.println(nombre + "  Bienvenidos. Ya abrimospazyamor.");
        return true;
    }

    /**
     * Método que cierra la heladería al final del día.
     *
     * @return boolean: Indica si la heladería ha cerrado.
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public boolean cerrar() {
        System.out.println(nombre + " Hasta mañana. Ya cerramos.");
        return true;
    }

    /**
     * Método que sirve un helado a un cliente con sabor, tamaño y precio específicos.
     *
     * @param cliente El nombre del cliente al que se le sirve el helado.
     * @param sabor   El sabor del helado.
     * @param tamaño  El tamaño del helado .
     * @param precio  El precio del helado
     * @return boolean: Indica si el helado ha sido servido.
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public boolean servirHelado(String cliente, String sabor, String tamaño, double precio) {
        System.out.println("Se le ha servido un helado de sabor " + sabor + ", tamaño " + tamaño + " a " + cliente + " por $" + precio);
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se le solicita al usuario que ingrese el nombre de la heladería
        System.out.print("Ingresa el nombre de la heladería: ");
        String nombreHeladeria = scanner.nextLine();

        // Le solicitamos al usuario que ingrese la dirección de la heladería
        System.out.print("Ingresa la dirección de la heladería: ");
        String direccionHeladeria = scanner.nextLine();

        // Le solicitamos al  usuario que ingrese la capacidad máxima de clientes
        System.out.print("Ingresa la capacidad máxima de clientes: ");
        int capacidadClientesHeladeria = scanner.nextInt();

        // Creamos  una instancia de la heladería con los datos ingresados por el usuario
        Heladeria miHeladeria = new Heladeria(nombreHeladeria, direccionHeladeria, capacidadClientesHeladeria);

        // Abrir la heladería
        miHeladeria.abrir();

        // Aqui le solcitamosal usuario que ingrese los datos del helado a servir
        scanner.nextLine(); // Limpiar el buffer de entrada

        System.out.print("Ingresa el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingresa el sabor del helado: ");
        String saborHelado = scanner.nextLine();

        System.out.print("Ingresa el tamaño del helado : ");
        String tamañoHelado = scanner.nextLine();

        System.out.print("Ingresa el precio del helado : ");
        double precioHelado = scanner.nextDouble();

        // Servir el helado con los datos ingresados por el usuario
        miHeladeria.servirHelado(nombreCliente, saborHelado, tamañoHelado, precioHelado);

        // Cerrar la heladería
        miHeladeria.cerrar();

        // Cerrar el scanner
        scanner.close();
    }
}
