class CalculoFreteNormal implements CalculoFreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 2.5;
    }
}