public class Jogo {
	private int tempoTotalBolaRolandoEmMin;
	private int tempoTotalJogoEmMin;
	private Time timeVisitante;
	private Time timeMandante;

	public Jogo(int tempoTotalBolaRolandoEmMin, int tempoTotalJogoEmMin, Time timeVisitante, Time timeMandante) {
		this.tempoTotalBolaRolandoEmMin = tempoTotalBolaRolandoEmMin;
		this.tempoTotalJogoEmMin = tempoTotalJogoEmMin;
		this.timeVisitante = timeVisitante;
		this.timeMandante = timeMandante;
	}


	public int getTempoTotalBolaRolandoEmMin() {
		return tempoTotalBolaRolandoEmMin;
	}

	public void setTempoTotalBolaRolandoEmMin(int tempoTotalBolaRolandoEmMin) {
		this.tempoTotalBolaRolandoEmMin = tempoTotalBolaRolandoEmMin;
	}

	public int getTempoTotalJogoEmMin() {
		return tempoTotalJogoEmMin;
	}

	public void setTempoTotalJogoEmMin(int tempoTotalJogoEmMin) {
		this.tempoTotalJogoEmMin = tempoTotalJogoEmMin;
	}

	public Time getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

	public Time getTimeMandante() {
		return timeMandante;
	}

	public void setTimeMandante(Time timeMandante) {
		this.timeMandante = timeMandante;
	}
}


