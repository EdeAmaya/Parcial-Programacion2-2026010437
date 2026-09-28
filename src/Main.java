public class Main {
    public static void main(String[] args) {
        // En la rama main usa por defecto ComisionEstandar
        Empleado vendedor = new Vendedor("Edenilson Amaya", 5000.0, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}