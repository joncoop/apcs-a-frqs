
public class SparseArrayTester {

	public static void main(String[] args) {
		
		SparseArrayEntry a = new SparseArrayEntry(1, 1, 5);
		SparseArrayEntry b = new SparseArrayEntry(1, 4, 4);
		SparseArrayEntry c = new SparseArrayEntry(2, 0, 1);
		SparseArrayEntry d = new SparseArrayEntry(3, 1, -9);
		
		SparseArray sparse = new SparseArray();
		sparse.setDimensions(6, 5);
		sparse.insert(a);
		sparse.insert(b);
		sparse.insert(c);
		sparse.insert(d);
		
		System.out.println(sparse);
		
		System.out.println( sparse.getValueAt(3,  1) );
		System.out.println( sparse.getValueAt(3,  3) );
		
		sparse.removeColumn(1);
		System.out.println(sparse);

	}
}
