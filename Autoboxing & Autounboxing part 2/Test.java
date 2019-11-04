class Test{

	public static void m1(Integer i){
		System.out.println("Autoboxing");
	}
	
	public static void m1(long i){
		System.out.println("widning");
	}
	public static void main(String args[]){
		int x=10;
		m1(x);
	}
}