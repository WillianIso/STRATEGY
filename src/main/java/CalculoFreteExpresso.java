class CalculoFreteExpresso implements CalculoFreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 5;
    }
}