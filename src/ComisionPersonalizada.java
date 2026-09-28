public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.14; // 5% + 9 letras = 14%
    }
}