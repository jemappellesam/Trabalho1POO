public class Time {
    private int gols;
    private int chutesAGol;
    private int posseBolaDefesaEmMin;
    private int posseBolaAtaqueEmMin;
    private int faltas;

    private int cartoesAmarelos;
    private int cartoesVermelhos;

    public Time(int gols, int chutesAGol, int posseBolaDefesaEmMin, int posseBolaAtaqueEmMin, int faltas, int cartoesAmarelos, int cartoesVermelhos) {
        this.gols = gols;
        this.chutesAGol = chutesAGol;
        this.posseBolaDefesaEmMin = posseBolaDefesaEmMin;
        this.posseBolaAtaqueEmMin = posseBolaAtaqueEmMin;
        this.faltas = faltas;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelhos = cartoesVermelhos;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getChutesAGol() {
        return chutesAGol;
    }

    public void setChutesAGol(int chutesAGol) {
        this.chutesAGol = chutesAGol;
    }

    public int getPosseBolaDefesaEmMin() {
        return posseBolaDefesaEmMin;
    }

    public void setPosseBolaDefesaEmMin(int posseBolaDefesaEmMin) {
        this.posseBolaDefesaEmMin = posseBolaDefesaEmMin;
    }

    public int getPosseBolaAtaqueEmMin() {
        return posseBolaAtaqueEmMin;
    }

    public void setPosseBolaAtaqueEmMin(int posseBolaAtaqueEmMin) {
        this.posseBolaAtaqueEmMin = posseBolaAtaqueEmMin;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public int getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    public void setCartoesVermelhos(int cartoesVermelhos) {
        this.cartoesVermelhos = cartoesVermelhos;
    }
}
