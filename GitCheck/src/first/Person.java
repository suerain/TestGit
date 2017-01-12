package first;

public class Person {
	int[] data = { -1, 0, 4, 23, 84 };

	public void display() {
		System.out.println("Data: ");
		for (int i : data) {
			System.out.println("Next value: " + i);
		}
	}

}
