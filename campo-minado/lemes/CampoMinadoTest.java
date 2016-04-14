import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Created by dasilfer on 14/04/2016.
 */
public class CampoMinadoTest {

    @Test
    public void calculaMinas_campoVazio_retornaTudoZerado() {

        String[][] campo = new String[][] {
                {".", ".", "."},
                {".", ".", "."},
                {".", ".", "."}
        };
        String[][] campoProcessado = new String[][] {
                {"0", "0", "0"},
                {"0", "0", "0"},
                {"0", "0", "0"}
        };

        assertArrayEquals(campoProcessado, new CampoMinado().calculaMinas(campo, 3, 3));
    }

    @Test
    public void calculaMinas_minaNoCantoEsquerdoSuperior_retornaMapaCorreto() {

        String[][] campo = new String[][] {
                {"*", ".", "."},
                {".", ".", "."},
                {".", ".", "."}
        };
        String[][] campoProcessado = new String[][] {
                {"*", "1", "0"},
                {"1", "1", "0"},
                {"0", "0", "0"}
        };

        assertArrayEquals(campoProcessado, new CampoMinado().calculaMinas(campo, 3, 3));
    }

    @Test
    public void calculaMinas_minaNomEIO_retornaMapaCorreto() {

        String[][] campo = new String[][] {
                {".", ".", "."},
                {".", "*", "."},
                {".", ".", "."}
        };
        String[][] campoProcessado = new String[][] {
                {"1", "1", "1"},
                {"1", "*", "1"},
                {"1", "1", "1"}
        };

        assertArrayEquals(campoProcessado, new CampoMinado().calculaMinas(campo, 3, 3));
    }

    @Test
    public void calculaMinas_minaNoCantoDireitoInferior_retornaMapaCorreto() {

        String[][] campo = new String[][] {
                {".", ".", "."},
                {".", ".", "."},
                {".", ".", "*"}
        };
        String[][] campoProcessado = new String[][] {
                {"0", "0", "0"},
                {"0", "1", "1"},
                {"0", "1", "*"}
        };

        assertArrayEquals(campoProcessado, new CampoMinado().calculaMinas(campo, 3, 3));
    }

    @Test
    public void calculaMinas_minasNosCantosDiagonalPrincipal_retornaMapaCorreto() {

        String[][] campo = new String[][] {
                {"*", ".", "."},
                {".", ".", "."},
                {".", ".", "*"}
        };
        String[][] campoProcessado = new String[][] {
                {"*", "1", "0"},
                {"1", "2", "1"},
                {"0", "1", "*"}
        };

        assertArrayEquals(campoProcessado, new CampoMinado().calculaMinas(campo, 3, 3));
    }

    @Test
    public void calculaMinas_minasNosQuatroCantos_retornaMapaCorreto() {

        String[][] campo = new String[][] {
                {"*", ".", "*"},
                {".", ".", "."},
                {"*", ".", "*"}
        };
        String[][] campoProcessado = new String[][] {
                {"*", "2", "*"},
                {"2", "4", "2"},
                {"*", "2", "*"}
        };

        assertArrayEquals(campoProcessado, new CampoMinado().calculaMinas(campo, 3, 3));
    }

    @Test
    public void calculaMinas_meioSemMina_retornaMapaCorreto() {

        String[][] campo = new String[][] {
                {"*", "*", "*"},
                {"*", ".", "*"},
                {"*", "*", "*"}
        };
        String[][] campoProcessado = new String[][] {
                {"*", "*", "*"},
                {"*", "8", "*"},
                {"*", "*", "*"}
        };

        assertArrayEquals(campoProcessado, new CampoMinado().calculaMinas(campo, 3, 3));
    }

    @Test
    public void calculaMinas_nivelUltraMegaHardDeJogo_retornaMapaCorreto() {

        String[][] campo = new String[][] {
                {"*", "*", "*"},
                {"*", "*", "*"},
                {"*", "*", "*"}
        };
        String[][] campoProcessado = new String[][] {
                {"*", "*", "*"},
                {"*", "*", "*"},
                {"*", "*", "*"}
        };

        assertArrayEquals(campoProcessado, new CampoMinado().calculaMinas(campo, 3, 3));
    }

}
