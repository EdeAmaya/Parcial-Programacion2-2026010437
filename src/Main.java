public class Main {
    public static void main(String[] args) {
        // Integrado tras resolver el conflicto en main
        Empleado vendedor = new Vendedor("Edenilson Amaya", 5000.0, new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}