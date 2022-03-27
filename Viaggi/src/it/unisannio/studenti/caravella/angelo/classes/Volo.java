package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.Constants;

public class Volo {

	public Volo() {

	}

	public Volo(String id, String citt�_p, String citt�_a, Date data, int num_posti, List<Cliente> cl) {
		super();
		this.id = id;
		this.citt�_p = citt�_p;
		this.citt�_a = citt�_a;
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
		String citt�_p = sc.nextLine();

		if (!sc.hasNextLine())
			return null;
		String citt�_a = sc.nextLine();

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

		return new Volo(id, citt�_p, citt�_a, data_v, num_max, lc);
	}

	@Override
	public String toString() {
		return "Volo [id=" + id + ", citt�_p=" + citt�_p + ", citt�_a=" + citt�_a + ", data=" + data + ", num_posti="
				+ num_posti + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCitt�_p() {
		return citt�_p;
	}

	public void setCitt�_p(String citt�_p) {
		this.citt�_p = citt�_p;
	}

	public String getCitt�_a() {
		return citt�_a;
	}

	public void setCitt�_a(String citt�_a) {
		this.citt�_a = citt�_a;
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
	private String citt�_p;
	private String citt�_a;
	private Date data;
	private int num_posti;
	private List<Cliente> cl;
}
