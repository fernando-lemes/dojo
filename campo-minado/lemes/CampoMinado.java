/**
 * Created by dasilfer on 14/04/2016.
 */
public class CampoMinado {

    public static final String MINA = "*";

    public String[][] calculaMinas(String[][] mapaDeMinas, int largura, int altura) {
        for (int indiceDaLinha = 0; indiceDaLinha < altura; indiceDaLinha++) {
            for (int indiceDaColuna = 0; indiceDaColuna < largura; indiceDaColuna++) {
                mapaDeMinas[indiceDaLinha][indiceDaColuna] = pegaQuantidadeDeMinas(mapaDeMinas, indiceDaLinha, indiceDaColuna);
            }
        }
        return mapaDeMinas;
    }

    private String pegaQuantidadeDeMinas(String[][] mapaDeMinas, int indiceDaLinha, int indiceDaColuna) {
        if (mapaDeMinas[indiceDaLinha][indiceDaColuna].equals(MINA)) {
            return MINA;
        } else {
            return "" + ((temMina(mapaDeMinas, indiceDaLinha - 1, indiceDaColuna - 1) ? 1 : 0) +
                        (temMina(mapaDeMinas, indiceDaLinha - 1, indiceDaColuna) ? 1 : 0) +
                        (temMina(mapaDeMinas, indiceDaLinha - 1, indiceDaColuna + 1) ? 1 : 0) +
                        (temMina(mapaDeMinas, indiceDaLinha, indiceDaColuna - 1) ? 1 : 0) +
                        (temMina(mapaDeMinas, indiceDaLinha, indiceDaColuna + 1) ? 1 : 0) +
                        (temMina(mapaDeMinas, indiceDaLinha + 1, indiceDaColuna - 1) ? 1 : 0) +
                        (temMina(mapaDeMinas, indiceDaLinha + 1, indiceDaColuna) ? 1 : 0) +
                        (temMina(mapaDeMinas, indiceDaLinha + 1, indiceDaColuna + 1) ? 1 : 0));
        }
    }

    private boolean temMina(String[][] mapaDeMinas, int indiceDaLinha, int indiceDaColuna) {
        try {
            return MINA.equals(mapaDeMinas[indiceDaLinha][indiceDaColuna]);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

}
