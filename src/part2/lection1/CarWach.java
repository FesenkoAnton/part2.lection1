package part2.lection1;

class Car {
	void wash() {
		System.out.println("Good cool");
	}
}

public class CarWach {
	public static void main(String[] args) {
		Car a = new Car(), b = new Car();
		a.wash();
		b.wash();
	}
}
