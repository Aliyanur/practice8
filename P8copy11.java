class P8copy11{
	public static void main(String[] args) {
		String word = "I love Cpp and Cpp";
		String newWord =word.replaceAll("Cpp","Java");

		System.out.println("Word: "+word);
		System.out.println("newWord: "+newWord);

		System.out.println();
		System.out.println();

		String newWord2 =word.replaceFirst("Cpp","Java");
		System.out.println("NewWord2 : "+newWord2);
	}
}