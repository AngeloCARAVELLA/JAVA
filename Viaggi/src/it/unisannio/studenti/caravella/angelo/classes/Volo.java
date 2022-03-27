package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Volo {

	public Volo() {

	}

	public Volo(String id, String città_p, String città_a, Date data, int num_posti, List<Cliente> cl) {
		super();
		this.id = id;
		this.città_p = città_p;
		this.città_a = città_a;
		this.data = data;
		this.num_posti = num_posti;
		this.cl = cl;
	}

	public static Volo read(Scanner sc) {

		if (!sc.hasNextLine())
			return null;
		String id = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String città_p = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String città_a = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String data = sc.nextLine();
		Date data_v = null;
		try {
			data_v = Constants.ssMMyyyy.parse(data);
		} catch (ParseException e) {

			System.err.println("Date mistake: data will be the current by default:");
			data_v = new Date();
		}
		if (!sc.hasNextLine())
			return null;
		String num = sc.nextLine();

		int num_max = 0;

		num_max = Integer.parseInt(num);

		String codice_fiscale = null;
		if (!sc.hasNextLine())
			return null;
		codice_fiscale = sc.nextLine();

		Cliente cli = Cliente.read_cl(codice_fiscale);

		List<Cliente> lc = new LinkedList<Cliente>();

		while (cli != null) {

			lc.add(cli);
			if (!sc.hasNextLine())
				return null;
			codice_fiscale = sc.nextLine();
			cli = Cliente.read_cl(codice_fiscale);

		}

		return new Volo(id, città_p, città_a, data_v, num_max, lc);
	}

	@Override
	public String toString() {
		return "Volo [id=" + id + ", città_p=" + città_p + ", città_a=" + città_a + ", data=" + data + ", num_posti="
				+ num_posti + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCittà_p() {
		return città_p;
	}

	public void setCittà_p(String città_p) {
		this.città_p = città_p;
	}

	public String getCittà_a() {
		return città_a;
	}

	public void setCittà_a(String città_a) {
		this.città_a = città_a;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getNum_posti() {
		return num_posti;
	}

	public void setNum_posti(int num_posti) {
		this.num_posti = num_posti;
	}

	public List<Cliente> getCl() {
		return cl;
	}

	public void setCl(List<Cliente> cl) {
		this.cl = cl;
	}

	private String id;
	private String città_p;
	private String città_a;
	private Date data;
	private int num_posti;
	private List<Cliente> cl;
}
