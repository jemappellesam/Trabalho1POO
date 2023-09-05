public class Main {

	public static void main(String[] args) {
		Time time1= new Time(1,2,3,4,5,6,7);
		Time time2= new Time(8,9,10,11,12,13,14);
		Jogo jogo = new Jogo(2, 4,time1,time2);
		GeradorEstatisticas gerador = new GeradorEstatisticas();
		EstatisticaFaltasCartoes f1 = new EstatisticaFaltasCartoes(time1.getCartoesAmarelos(),time1.getCartoesVermelhos(),time2.getCartoesAmarelos(),time2.getCartoesVermelhos(),time1.getFaltas(),time2.getFaltas());
		System.out.println(gerador.gerarEstatisticas(f1,jogo));
	}

}
