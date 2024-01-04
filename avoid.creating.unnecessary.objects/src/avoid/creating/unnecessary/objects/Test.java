package avoid.creating.unnecessary.objects;

public class Test {

	public static void main(String[] args) {

		String word1 = new String("İzzet");

		String word2 = "İzzet";
		String word3 = "İzzet";

		System.out.println(word1 == word2);
		System.out.println(word2 == word3);

		long start1 = System.nanoTime();
		sum1();
		long end1 = System.nanoTime();

		long duration1 = end1 - start1;

		System.out.println("Durartion sum1 :" + duration1);
		
		long start2 = System.nanoTime();
		sum2();
		long end2 = System.nanoTime();

		long duration2 = end2 - start2;
		
		System.out.println("Durartion sum2 :" + duration2);

	}

	private static long sum1() {
		
		Long sum = 0L;
		
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
			sum += i;
		
		return sum;
	}
	
	private static long sum2() {
		
		long sum = 0L;
		
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
			sum += i;
		
		return sum;
	}

}
