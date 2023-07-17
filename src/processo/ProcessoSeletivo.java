package processo;

import static processo.Candidato.*;
import static processo.Recrutador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		List<Candidato> candidaturas = new ArrayList<>(Arrays.asList(
				new Candidato("Matheus", valorPretendido()),
				new Candidato("Leonardo",valorPretendido()),
				new Candidato("Sandra",  valorPretendido()),
				new Candidato("Eduardo", valorPretendido()),
				new Candidato("Marcos",  valorPretendido()),
				new Candidato("Fernanda",valorPretendido()),
				new Candidato("Francisco", valorPretendido()),
				new Candidato("Julia", valorPretendido()),
				new Candidato("Pedro", valorPretendido()),
				new Candidato("Adriana", valorPretendido())
				));
		
		setListaCandidatos(candidaturas);
		List<Candidato> selecionados = selecionarCandidato();
		selecionados.forEach(System.out::println);
		System.out.println("\n\nLigações:");

		List<Candidato> listaFinal = selecionados
				.stream()
				.filter(Recrutador::ligar)
				.collect(Collectors.toList());
		System.out.println("\n\nCandidatos convidados para participar do processo seletivo: \n");
		listaFinal.forEach(c -> System.out.println(c.nome));
		
		
		

	}

}
