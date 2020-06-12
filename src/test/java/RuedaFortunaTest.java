import static org.junit.jupiter.api.Assertions.*;

class RuedaFortunaTest {
    RuedaFortuna ruleta;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ruleta = new RuedaFortuna();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        ruleta = null;
    }

    @org.junit.jupiter.api.Test
    void verifiarLargo_test01() {
        assertEquals(false,ruleta.verificarLargo(-1));
    }
    @org.junit.jupiter.api.Test
    void verifiarLargo_test02() {
        assertEquals(true,ruleta.verificarLargo(10));
    }
    @org.junit.jupiter.api.Test
    void verifiarLargo_test03() {
        assertEquals(false,ruleta.verificarLargo(3));
    }
    @org.junit.jupiter.api.Test
    void inicializarRueda_test01() {
        ruleta.inicializarRueda(76);
    }
    @org.junit.jupiter.api.Test
    void inicializarRueda_test02() {
        ruleta.inicializarRueda(-47);
    }
    @org.junit.jupiter.api.Test
    void lanzarRueda() {
        assertEquals(-1,ruleta.lanzarRueda());
    }
}