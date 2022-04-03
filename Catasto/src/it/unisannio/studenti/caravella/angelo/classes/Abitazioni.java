package it.unisannio.studenti.caravella.angelo.classes;

public  class Abitazioni implements Comparable<Abitazioni> {

	/**
	 * @param id
	 */
	public Abitazioni(String id) {
		this.id = id;
	}

	/**
	 * @param id
	 * @param via
	 * @param num
	 * @param comune
	 * @param valore
	 * @param collocazione
	 */
	
	public Abitazioni(String id, String via, int num, String comune, double valore, String collocazione) {
		this.id = id;
		this.via = via;
		this.num = num;
		this.comune = comune;
		this.valore = valore;
		this.collocazione = collocazione;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the via
	 */
	public String getVia() {
		return via;
	}

	/**
	 * @param via the via to set
	 */
	public void setVia(String via) {
		this.via = via;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the comune
	 */
	public String getComune() {
		return comune;
	}

	/**
	 * @param comune the comune to set
	 */
	public void setComune(String comune) {
		this.comune = comune;
	}

	/**
	 * @return the valore
	 */
	public double getValore() {
		return valore;
	}

	/**
	 * @param valore the valore to set
	 */
	public void setValore(double valore) {
		this.valore = valore;
	}

	/**
	 * @return the collocazione
	 */
	public String getCollocazione() {
		return collocazione;
	}

	/**
	 * @param collocazione the collocazione to set
	 */
	public void setCollocazione(String collocazione) {
		this.collocazione = collocazione;
	}

	private String id;
	@Override
	public String toString() {
		return "Abitazioni [id=" + id + ", via=" + via + ", num=" + num + ", comune=" + comune + ", valore=" + valore
				+ ", collocazione=" + collocazione + "]";
	}

	private String via;
	private int num;
	private String comune;
	private double valore;
	private String collocazione;
	@Override
	public int compareTo(Abitazioni o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
