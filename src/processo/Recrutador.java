package processo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Recrutador {
	static double salarioBase = 2200;
	
	private static List<Candidato> listaCandidatos;

	public List<Candidato> getListaCandidatos() {
		return listaCandidatos;
	}

	public static  void setListaCandidatos(List<Candidato> candidatos) {
		listaCandidatos = candidatos;
	}
	
	public static List<Candidato> selecionarCandidato() {
		Predicate<Candidato> selecionar = c-> c.salarioPretendido<=salarioBase;
		List<Candidato> selecionados = new ArrayList<>();
		for(Candidato c: listaCandidatos) {
			if(selecionar.test(c)) {
				selecionados.add(c);
			}
		}
		return selecionados;
	}
	
	public static boolean ligar(Candidato c) {
		int tentativas = 0;
		boolean convidado = false;
		
		if(c.salarioPretendido <=2000) {
			do {
				boolean atendeu = new Random().nextInt(3)==1 ? true: false;
				if(atendeu) {System.out.println(c.nome +" atendeu e foi convidado para o processo!");break;}
			}while(tentativas<3);
			convidado = true;
		}
		else if(c.salarioPretendido > 2000) {
			do {
				boolean atendeu = new Random().nextInt(3)==1 ? true: false;
				if(atendeu) {
					System.out.print(c.nome +" atendeu e houve negociação!");
					
					boolean aceitouNegociar = new Random().nextBoolean();
					if(aceitouNegociar) {
						System.out.print("Aceitou negociar e foi convidado!\n");
						convidado = true;
						break;
					}else {
						System.out.println("Não aceitou!");
						break;
					}
				} 
			}while(tentativas<3);
			
		}
		return convidado;
	}
}
