
public class Operator {
    public static void main(String[] args) {
        String a = "applePie";
		String b = "applePie";
		boolean c;
		c = a == b;
		System.out.println(c);
		c = a.equals(b);
		System.out.println(c);
		
		a = "applePie";
		String d = "apple";
		String e = d + "Pie";
		c = a == e;  // c = false
		System.out.println(c);
		c = a.equals(e);
		System.out.println(c);
		
		String f = new String("applePie");
		c = a == f;
		System.out.println(c);
		c = a.equals(f);
		System.out.println(c);
		
		
    }

}
