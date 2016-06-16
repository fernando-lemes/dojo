import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by hanazumi on 31/05/2016.
 */
public class MatrizEspiralTest {

	@Test
	public void construtor_matriz1por1_retornaMatrizDe1Elemento0 () {
		Integer matrix []={0};
		MatrizEspiral m = new MatrizEspiral(1,1);
		assertEquals(matrix[0], m.getMatrizEspiral()[0][0]);
	}

	@Test
	public void geraMatriz_matriz1por1_retornaMatrizDe1Elemento() {
		Integer matrix [] = {1};
		MatrizEspiral m = new MatrizEspiral(1,1);
		assertEquals(matrix[0], m.geraMatrizEspiral()[0][0]);
	}

	@Test
	public void geraMatriz_matriz2por2_retornaMatrizDe4Elemento() {
		Integer matrix [][] = {{1, 2}, {4,3}};
		MatrizEspiral m = new MatrizEspiral(2,2);
		assertEquals(matrix, m.geraMatrizEspiral());
	}
}
