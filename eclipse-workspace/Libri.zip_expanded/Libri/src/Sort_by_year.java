import java.util.Comparator;

public class Sort_by_year implements Comparator<Libro>{
	
	public int compare(Libro l1, Libro l2)
    {
        return l1.set_anno() - l2.set_anno();
    }
}
