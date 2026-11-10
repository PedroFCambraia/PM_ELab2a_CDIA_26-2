import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Escolha AnalistaDados ou CientistaML e complete 2 testes.
 * Um deles deve obrigatoriamente verificar registrarPagamento.
 */
public class ColaboradorTest {
    @Test
/*ARRANGE*/
    void testeanalista1() {
        AnalistaDados analista1 = new AnalistaDados("Pedro", "A100");
/*ACT */
        double teste1 = analista1.addHoraPipeline(45);
        
/*ASSERT*/
        assertEquals(teste1 ,35 , "Deve ser 35 horas devido ao limite de tempo imposto sobre a variavel");
}
/*ARRANGE*/
    void testeanalista2() {
        AnalistaDados analista2 = new AnalistaDados("Manu", "A050");
/*ACT*/
    analista2.addHoraPipeline(20);
    double teste2 = analista2.registrarPagamento();
/*ASSERT*/
    assertEquals(teste2, 5250.0, "O valor recebido deve ser 5250 apos a adicao de 20 horas de pipeline" );
    }
    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
}