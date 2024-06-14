@FunctionalInterface
interface MyNumber {
	double getValue();
}

class LambdaDemo1 {
	public static void main(String args[]) {
		MyNumber myNum; 
		myNum = () -> 123.45;
		System.out.println("A fixed value: " + myNum.getValue()); 	//123.45

		myNum = () -> Math.random() * 100;
	System.out.println("A random value: " + myNum.getValue());
	System.out.println("Another random value: " + myNum.getValue());
		// myNum = () -> "123.03"; // Error!
	}
}










