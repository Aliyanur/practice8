class P8copy12{
	public static void main(String[] args) {
		String word ="I love Java and Cpp";
		String store[]=word.split(" ");

		for (int i =0; i<store.length ;i++ ) {
			System.out.println(store[i]);
		}

		System.out.println();
		String store2[]=word.split("v");
		for (int i =0; i<store2.length;i++ ) {
			System.out.println(store2[i]);	
		}
		System.out.println();
		String store3[] = word.split("Java");
		for (int i =0;i<store3.length ; i++) {
			System.out.println(store[i]);
			
		}
	}
}