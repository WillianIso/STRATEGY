import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraFreteTest {

    @Test
    public void testCalculoFreteNormal() {
        CalculoFreteStrategy strategy = new CalculoFreteNormal();
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete(strategy);

        double peso = 10;
        double frete = calculadoraFrete.calcularFrete(peso);

        assertEquals(peso * 2.5, frete, 0);
    }

    @Test
    public void testCalculoFreteExpresso() {
        CalculoFreteStrategy strategy = new CalculoFreteExpresso();
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete(strategy);

        double peso = 10;
        double frete = calculadoraFrete.calcularFrete(peso);

        assertEquals(peso * 5, frete, 0);
    }
}
