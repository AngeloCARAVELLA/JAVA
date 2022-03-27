package it.unisannio.studenti.caravella.angelo.classes;

import java.text.ParseException;
import java.util.*;

import it.unisannio.studenti.caravella.angelo.utils.ClientNotFoundException;
import it.unisannio.studenti.caravella.angelo.utils.ClientTesterByIdTrip;
import it.unisannio.studenti.caravella.angelo.utils.Constants;
import it.unisannio.studenti.caravella.angelo.utils.VoyageNotFoundException;

public class Prenotazioni {

	public Prenotazioni(Scanner sc1, Scanner sc2) {

		this.sc = new HashMap<String, Cliente>();
		this.sv = new HashMap<String, Volo>();

		Cliente cl = Cliente.read(sc1);

		while (cl != null) {
			this.sc.put(cl.getCodice_fiscale(), cl);
			cl = Cliente.read(sc1);

		}

		Volo v = Volo.read(sc2);

		while (v != null) {
			SearchCliente(v.getCl());
			this.sv.put(v.getId(), v);
			v = Volo.read(sc2);

		}

	}

	public void printAll() {

		this.sc.entrySet().forEach(entry -> {

			System.out.println(entry.getKey() + " " + entry.getValue().toString());
		});

		System.out.println(" ");

		this.sv.entrySet().forEach(entry -> {

			System.out.println(entry.getKey() + " " + entry.getValue().toString());
			LinkedList<Cliente> j=(LinkedList<Cliente>) entry.getValue().getCl(); 
			for( Cliente h: j) {
				System.out.println(h.getCodice_fiscale());
			}
		});
	}

	private void SearchCliente(List<Cliente> cl) {
		String cod = null;
		Cliente cli = null;
		for (Cliente c : cl) {
			cod = c.getCodice_fiscale();
			cli = this.sc.get(cod);
			if (cli == null)
				throw new ClientNotFoundException("Client was not found");
		}

	}

	public void InsertClient() {
		Cliente k = Cliente.read();
		this.sc.put(k.getCodice_fiscale(), k);
	}

	public void InsertBooking() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please insert the fiscal code of the client: ");
		String cd = sc.nextLine();
		Cliente cli = null;
		cli = this.sc.get(cd);
		if (cli == null)
			throw new ClientNotFoundException("Client was not found");

		System.out.println("Please where do you want do go by the id of the trip ");
		String id = sc.nextLine();

		Volo v = this.sv.get(id);

		if (v == null)
			throw new VoyageNotFoundException("Voyage not found");

		else {

			LinkedList<Cliente> b = (LinkedList<Cliente>) v.getCl();
		
			if(SearchClient(b, cli.getCodice_fiscale())) {
			if (v.getNum_posti() != 0)
					v.setNum_posti(v.getNum_posti() - 1);
				else System.err.println("All sold out");
			
				b.add(cli);
				v.setCl(b);
			}
			else System.err.println("The client has already booked the "+ v.getId() + " voyage...");
		}

	}
   

	private boolean SearchClient(LinkedList<Cliente> b, String codice_fiscale) {
		
		boolean r= true;
		for( Cliente c: b ) {
			if( c.getCodice_fiscale().equals(codice_fiscale))r=false;
			
		}
		
		return r;
	}
	public void DeleteBooking() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please insert the fiscal code of the client: ");
		String cd = sc.nextLine();
		Cliente cli = null;
		cli = this.sc.get(cd);
		if (cli == null)
			throw new ClientNotFoundException("Client was not found");

		System.out.println("Please insert which booking do you want to delete ");
		String id = sc.nextLine();

		Volo v = this.sv.get(id);

		if (v == null)
			throw new VoyageNotFoundException("Voyage not found");

		else {

			LinkedList<Cliente> b = (LinkedList<Cliente>) v.getCl();

			v.setNum_posti(v.getNum_posti() + 1);
			b.remove(cli);
			v.setCl(b);

		}
	}

	public void ViewBooking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert which booking do you want to see the clients ");
		String id = sc.nextLine();

		Volo v = this.sv.get(id);

		if (v == null)
			throw new VoyageNotFoundException("Voyage not found");

		ClientTesterByIdTrip tg = new ClientTesterByIdTrip(id);
		Cliente cl = null;
		LinkedList<Cliente> c = new LinkedList<Cliente>();
		Set<String> set = this.sv.keySet();
		for (String s : set) {
			if (tg.Verify(this.sv.get(s))) {
				v = this.sv.get(s);
				c = (LinkedList<Cliente>) v.getCl();

			}
		}

		for (Cliente f : c) {
			cl = this.sc.get(f.getCodice_fiscale());
			if (f.getCodice_fiscale().equals(cl.getCodice_fiscale()))
				System.out.println(cl.getCodice_fiscale() + " " + cl.getNome() + " " + cl.getCognome());
		}
	}

	public void View() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please insert the fiscal code of the client: ");
		String cd = sc.nextLine();
		Cliente cli = null;
		cli = this.sc.get(cd);
		if (cli == null)
			throw new ClientNotFoundException("Client was not found");
		String id = cli.getCodice_fiscale();
		ArrayList<String> f = new ArrayList<String>();
		this.sv.entrySet().forEach(entry -> {

			LinkedList<Cliente> cll = (LinkedList<Cliente>) entry.getValue().getCl();
			cll.forEach(e -> {

				if (e.getCodice_fiscale().equals(id))
					f.add(entry.getValue().getId());
			});
		});

		f.forEach(g -> {
			System.out.println(g);

		});
	}

	public void Search() throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert the departure  city");
		String città_p = sc.nextLine();
		System.out.println("Please insert the arrival city");
		String città_a = sc.nextLine();

		System.out.println("Please insert the date after that you will be in search for voyages");
		String data = sc.nextLine();
		Date data_v = Constants.ssMMyyyy.parse(data);

		for (Map.Entry<String, Volo> g : this.sv.entrySet()) {

			if (g.getValue().getCittà_p().equals(città_p) && g.getValue().getCittà_a().equals(città_a)
					&& g.getValue().getData().after(data_v))
				;
			System.out.println("There are :" + g.getValue().getId());
		}

	}

	private Map<String, Cliente> sc;
	private Map<String, Volo> sv;

}
