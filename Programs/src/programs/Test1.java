package programs;

public interface Test1 {
	
	public void test();
	
	default void testDef() {
		System.out.println("Test Def1");
	}

}
