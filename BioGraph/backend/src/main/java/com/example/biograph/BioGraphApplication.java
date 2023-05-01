package com.example.biograph;

import com.example.biograph.model.Cadeia;
import com.example.biograph.model.Grafo_CadeiaAlimentar;
import com.example.biograph.model.RelacionamentoAlimentar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class BioGraphApplication {

	public static void main(String[] args) {
		Grafo_CadeiaAlimentar grafo = new Grafo_CadeiaAlimentar();

		grafo.addNovoRelacionamentoAlimentar(1,2,true);
		grafo.addNovoRelacionamentoAlimentar(1,3,true);
		grafo.addNovoRelacionamentoAlimentar(2,4,true);
		grafo.addNovoRelacionamentoAlimentar(3,4,true);
		grafo.addNovoRelacionamentoAlimentar(3,5,true);

		System.out.println("Lista de Adjacência para o grafo:\n"+ grafo);

		List<RelacionamentoAlimentar> edges = Arrays.asList(new RelacionamentoAlimentar(1, 2), new RelacionamentoAlimentar(1, 2), new RelacionamentoAlimentar(2, 4), new RelacionamentoAlimentar(3, 4),new RelacionamentoAlimentar(2, 5), new RelacionamentoAlimentar(3, 5));

		Cadeia graph = new Cadeia(edges);

		Cadeia.imprimeCadeia(graph);

		SpringApplication.run(BioGraphApplication.class, args);

	}

}


