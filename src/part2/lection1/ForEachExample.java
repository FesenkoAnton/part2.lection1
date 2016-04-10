package part2.lection1;

import java.util.Random;

/**
 * Цей клас демонструє можливості циклу foreach
 * 
 * @author Владислав Вальт
 * 
 */

public class ForEachExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random rand = new Random(47); // створюємо екземпляр класу Random
		int randvalue = rand.nextInt(10); // створюємо випадкове ціле число
		Student dreamgroup[] = new Student[randvalue]; // група з невідомою
														// кількістью студентів
		for (int i = 0; i < randvalue; i++)
			// Ініціалізація групи випадковими даними
			dreamgroup[i] = new Student("Number" + i, rand.nextInt(10) + 18,
					rand.nextInt(50) + 50);

		// Тепер треба вивести список групи
		// варіант перший:
		System.out.println("Варіант перший: ");
		for (int i = 0; i < randvalue; i++)
			// звичайний цикл for
			System.out.println(dreamgroup[i]);

		System.out.println();
		System.out.println();

		System.out.println("Варіант другий: ");
		for (Student s : dreamgroup)
			// зручний цикл коли необхідно перебрати масив або колекцію. Не
			// вимагає знання розмірів.
			System.out.println(s); // Зазвичай розміри важко загубити, але
									// навіщо їх враховувати, коли немає потреби
									// в цьому?

	}

}
