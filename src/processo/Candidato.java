package processo;

import java.util.concurrent.ThreadLocalRandom;

public class Candidato {
	public String nome;
	public double salarioPretendido;
	
	public Candidato(String nome, double salarioPretendido) {
		super();
		this.nome = nome;
		this.salarioPretendido = salarioPretendido;
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	public String toString() {
		return this.nome+  " Salário pretendido:R$ "+Math.round(this.salarioPretendido);
	}

}
