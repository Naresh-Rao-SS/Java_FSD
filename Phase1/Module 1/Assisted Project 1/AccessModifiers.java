package Phase1;

public class AccessModifiers {
	public int publicVariable = 10;
	private int privateVariable = 20;
	protected int protectedVariable = 30;
	int defaultVariable = 40;

	public void publicMethod() {
		System.out.println("This is Public Method");
	}

	private void privateMethod() {
		System.out.println("This is Private Method");
	}

	protected void protectedMethod() {
		System.out.println("This is Protected Method");
	}

	void defaultMethod() {
		System.out.println("This is Default Method");
		
	}
}

