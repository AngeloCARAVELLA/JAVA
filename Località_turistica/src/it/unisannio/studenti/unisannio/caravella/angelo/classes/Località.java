package it.unisannio.studenti.unisannio.caravella.angelo.classes;

import java.util.*;

public class Località {

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
	 * @return the nazionalità
	 */
	public String getNazionalità() {
		return nazionalità;
	}

	/**
	 * @param nazionalità the nazionalità to set
	 */
	public void setNazionalità(String nazionalità) {
		this.nazionalità = nazionalità;
	}

	/**
	 * @return the votes
	 */
	public ArrayList<Votante> getVotes() {
		return votes;
	}

	/**
	 * @param votes the votes to set
	 */
	public void setVotes(ArrayList<Votante> votes) {
		this.votes = votes;
	}

	/**
	 * @param nome
	 * @param funzionalità
	 * @param nazionalità
	 */
	public Località(String nome, String nazionalità) {
		this.nome = nome;
		this.nazionalità = nazionalità;
		this.votes = new ArrayList<Votante>();
	}

	public void addVotante(Votante v) {

		this.votes.add(v);
	}

	private String nome;
	private String nazionalità;
	private ArrayList<Votante> votes;

}
