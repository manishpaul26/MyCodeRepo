package programs;

public interface Test2 {

	public void test();
	
	default void testDef() {
		System.out.println("Test Def2");
	}
}
