package compras;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
			Nome: Érick -
			Matrícula: -
			Curso: Análise e Desenvolvimento de Sistemas
		*/
		
		Integer itensQuantidade;
		Scanner scan = new Scanner(System.in);
		Scanner listaCompras = new Scanner(System.in);
		Scanner nome = new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		String l;
		
		System.out.println("É recomendável usar este software CLI no Linux com o openjdk 11.0.8 2020-07-14! \n\n");
		System.out.print("Quantos itens você pretende comprar? | itens > ");
		itensQuantidade = scan.nextInt();
		
		for(int itens = 1 ; itens <= itensQuantidade ; itens=itens+1) {
			System.out.print("Nome do item > ");
			l = listaCompras.next();
			lista.add(l);
		}
	
		System.out.print("Qual o nome da lista para ser salva? | nome > ");
		String n = nome.next();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(n+".txt"))) {
			for(String mostrar : lista) {
				bw.write(mostrar+"\n");
			}
			bw.write("\nQuantidade de itens: "+itensQuantidade+"\n");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
