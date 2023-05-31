class CalculadoraFrete {
    private CalculoFreteStrategy strategy;

    public CalculadoraFrete(CalculoFreteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CalculoFreteStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcularFrete(double peso) {
        return strategy.calcularFrete(peso);
    }
}