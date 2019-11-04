class Chas3{

	// public static void m1(long l){
		// System.out.println("widening");
	// }
							// public static void m1(Integer i){
								// System.out.println("Autoboxing");
							// }
	public static void m1(int... x){
		System.out.println("var-arg");
	}
	public static void main(String args[]){
		int y=10;
		m1(y);
	}
}