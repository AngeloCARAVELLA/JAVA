package it.unisannio.studenti.caravella.angelo.classes;

import java.io.PrintStream;
import java.util.Scanner;

public class Comuni  {

	@Override
	public String toString() {
		return "Comuni [nome=" + nome + ", num_r_m=" + num_r_m + ", num_r_f=" + num_r_f + "]";
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the num_r_m
	 */
	public int getNum_r_m() {
		return num_r_m;
	}

	/**
	 * @param num_r_m the num_r_m to set
	 */
	public void setNum_r_m(int num_r_m) {
		this.num_r_m = num_r_m;
	}

	/**
	 * @return the num_r_f
	 */
	public int getNum_r_f() {
		return num_r_f;
	}

	/**
	 * @param num_r_f the num_r_f to set
	 */
	public void setNum_r_f(int num_r_f) {
		this.num_r_f = num_r_f;
	}

	public Comuni(String nome, int num_r_m, int num_r_f) {
		this.nome=nome;
		this.num_r_m= num_r_m;
		this.num_r_f=num_r_f;
	}

	public static Comuni read(String  label ,Scanner sc) {
		
		if( label.equals("")||label.equals("#"))return null;
		
		if( !sc.hasNext())return null;
		String num_m =sc.next();
		int num_r_m= Integer.parseInt(num_m);
		
		if( !sc.hasNext())return null;
		String num_f= sc.next();
		int num_r_f= Integer.parseInt(num_f);
		
		

		sc.nextLine(); 
		return new Comuni ( label, num_r_m, num_r_f);
		
	}


	
	private String nome;
	private int num_r_m, num_r_f;
}
