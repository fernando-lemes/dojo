/**
 * Created by hanazumi on 31/05/2016.
 */
public class MatrizEspiral {
	//num. linhas
	int m;
	//num. colunas
	int n;
	//matriz
	Integer[][] matrizEspiral;

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public MatrizEspiral() {

	}

	public MatrizEspiral(int m, int n) {
		this.m = m;
		this.n = n;

		matrizEspiral = new Integer[m][n];
		for(int i = 0; i < m; i++){
			for(int j=0; j<n; j++){
				matrizEspiral[i][j] = 0;
			}
		}
	}

	public Integer[][] getMatrizEspiral() {
		return matrizEspiral;
	}

	public void setMatrizEspiral(Integer[][] matrizEspiral) {
		this.matrizEspiral = matrizEspiral;
	}

	public Integer[][] geraMatrizEspiral () {
		int conta_linha = 0;
		int conta_coluna = 0;
		int valor = 1;
		int limitante = m;



		while (conta_coluna < n)  {
			matrizEspiral[conta_linha][conta_coluna] = valor;
			System.out.println(conta_coluna);
			conta_coluna ++;
			valor ++;
		}

		conta_coluna--;
		conta_linha++;
		while (conta_linha < m) {
			matrizEspiral[conta_linha][conta_coluna] = valor;
			conta_linha ++;
			valor ++;
		}

		while (conta_coluna > 0)  {
			matrizEspiral[conta_linha][conta_coluna] = valor;
			conta_coluna --;
			valor ++;
		}

		conta_linha--;
		while (conta_linha > (m -1))  {
			matrizEspiral[conta_linha][conta_coluna] = valor;
			conta_linha --;
			valor ++;
		}

//		int length = 0;
//		while(length<matrizEspiral.length) {
//			System.out.println(matrizEspiral[length][length]);
//		}
		return matrizEspiral;
	}
}

