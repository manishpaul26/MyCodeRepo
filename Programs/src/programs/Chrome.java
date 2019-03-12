package programs;

class X {
	void bark() {
		System.out.println("bark");
	}
}

class Y extends X {
	void bark() {
		System.out.println("bark");
	}
	void sniff() {
		System.out.println("sniff");
	}
}

public class Chrome {

	public static void main(String[] args) {
		X x = new Y();
		((Y) x).sniff();
		new Chrome().go();
	}

	void go() {
		new Y().bark();
		( (X)new Y()).bark();
		( (Y)new Y()).sniff();
	}
}
