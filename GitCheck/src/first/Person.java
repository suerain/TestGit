package first;

public class Person {
	int[] data = { 0, 4, 23, 84 };
<<<<<<< HEAD
	int sum = 10;
=======
	int sum = 11;
>>>>>>> branch 'master' of https://github.com/suerain/TestGit.git
	public void display() {
		
		System.out.println("Data: ");
		for (int i : data) {
			System.out.println("Next value: " + i);
			sum += i;
		}
		System.out.println("Sum is found to be: " + sum);
	}

}
