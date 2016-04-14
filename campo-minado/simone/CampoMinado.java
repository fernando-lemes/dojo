import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Implementacao do campo minado e sua estrutura de dados.
 */
public class CampoMinado {
    int m;
    int n;
    // Vetor com a posicao de cada bomba do campo
    Vector<Posicao> bomba;
    // Matriz para representacao do campo minado
    String[][] campoMinado;

//    Ideia inicial de definicao de variaveis para o
//    campo minado e uma matriz com os valores numericos
//    com as dicas sobre a posicao das bombas.
//
//    String[][] campoMinado = { {"*", ".", ".", "."},
//                               {".", ".", ".", "."},
//                               {".", "*", ".", "."},
//                               {".", ".", ".", "."}};
//
//    int[][] campoMinadoResultado = {{0, 0, 0, 0},
//                                    {0, 0, 0, 0},
//                                    {0, 0, 0, 0},
//                                    {0, 0, 0, 0}};

    public static void main(String[] args) {

    }

    /**
     * Metodo para iterar o vetor com a posicao das bombas
     * e incrementar as posicoes adjacentes no campo em +1
     *
     * @param m altura do campo
     * @param n largura do campo
     * @param bomba vetor com a posicao das bombas
     */
    public void campoMinado (int m, int n, Vector<Posicao> bomba) {
        for (Posicao posicao : bomba) {

        }
    }

    /**
     * Abaixo, seguem dois metodos pensados inicialmente para
     * auxiliar no processo de encontrar os campos adjacentes
     * e incrementar seus valores em +1.
     *
     * Devido a mudancas nas estruturas de dados a serem utilizadas,
     * nenhuma implementacao chegou a ser realizada de fato.
     */

    public List<Integer> get_adjacente(String[][] campoMinado) {
        List<Integer> indices = new ArrayList<Integer>();

        for (int i = 0; i < campoMinado.length; i++) {

        }
        return indices;
    }

    public void incrementa_adjacente( List<Integer> indice, int [][]campoMinadoResultado) {

    }
}
