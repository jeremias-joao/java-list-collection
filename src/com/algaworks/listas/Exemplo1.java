package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo1 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Leticia");
		
		//nomes.remove(3);
		//nomes.remove("Jose");
		System.out.println("---Primeira lista---");
		System.out.println(nomes);
		
		
		System.out.println("---Segunda lista For Tradicional---");
		for(int i=0; i< nomes.size(); i++) {
			System.out.println("Nome: " +nomes.get(i));	
		}
		
		System.out.println("---Terceira lista For Tradicional---");
		for (String nome: nomes) {
			System.out.println("Nome: " +nome);
		}
		
		System.out.println("---Quarta lista ForEach---");
		nomes.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		System.out.println("---Quinta lista For com Lambda---");
		nomes.forEach(nome->{
			System.out.println(nome);
		}
		);
		
		System.out.println("---Sexta lista For com Lambda simplificada---");
		nomes.forEach(nome-> System.out.println(nome));
		
		System.out.println("---Setima lista For Method reference---");
		nomes.forEach( System.out::println);
		
		
		
		
		

	}

}
