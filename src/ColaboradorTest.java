import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Escolha AnalistaDados ou CientistaML e complete 2 testes.
 * Um deles deve obrigatoriamente verificar registrarPagamento.
 */
public class ColaboradorTest {
    @Test
    void exemploEstruturaAaa() {
        AnalistaDados analista = new AnalistaDados("Ana", "A001");
        double horas = analista.addHoraPipeline(1.0);
        assertEquals(0.0, horas, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
}
