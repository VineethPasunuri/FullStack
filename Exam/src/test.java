import java.util.TreeSet;

public class test {
//	static byte a;
//	static short b;
//	static char c;
//	static int d;
//	static long e;
//	static String s;

	public static void main(String[] args) {
		// System.out.println(a + b + c + d + e + s);
		TreeSet<String> t = new TreeSet<String>();
		t.add("B");
		t.add("A");
		t.add("D");
		t.add("A");
		for (String s : t)
			System.out.println(s);
	}

}
