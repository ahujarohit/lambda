import java.util.function.*;
class PreDefinedFunctionalInterfacesExample {

	public static void main(String args[]) {
		Predicate<Integer> p = (i) -> (i > -10) && (i < 10);
		System.out.println(p.test(9));

		Function<String, Integer> f = s -> s.length(); 
		System.out.println(f.apply("I am happy now")); 

		Consumer<String> c = s -> System.out.println(s); 
		c.accept("I consume data but don't return anything"); 

		Supplier<String> otps = () -> {
			String otp = "";
			for (int i = 1; i <= 4; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(otps.get());
		System.out.println(otps.get());

		BiPredicate<Integer,Integer> bp = (i, j) -> (i + j) %2 == 0; 
		System.out.println(bp.test(24, 34)); 

		BiFunction<Integer,Integer,Integer> bf = (i, j) -> i + j; 
		System.out.println(bf.apply(24, 4)); 

		BiConsumer<String,String> bc = (s1, s2) -> System.out.println(s1+s2); 
		bc.accept("Bi","Consumer"); 
	}
}