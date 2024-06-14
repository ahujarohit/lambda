class MyClass {
	protected int val;
	MyClass(int val) {
		this.val = val;
	}
	MyClass() {
		val = 0;
	}
	int getVal() {
		return val;
	}
}
@FunctionalInterface
interface MyFunc {
	MyClass func(int n);
}
class ConstructorRefDemo {
	public static void main(String args[]) {
		MyFunc myClassCons = MyClass::new;
		MyClass mc = myClassCons.func(100);
		System.out.println("val in mc is " + mc.getVal());
	}
}







