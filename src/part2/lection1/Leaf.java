/** 
 * Цей клас демонструє переваги методів, які повертають вказівник на об'єкт поточного класу. Тобто повертають самі себе(this)
 * @author Владислав
 *
 */
package part2.lection1;

public class Leaf {

	public static void main(String[] args) {

		Student s = new Student("Петров", 20, 81);
		System.out.println(s);
		s.changeGrade(91).becomeOlder().becomeOlder();
		System.out.println(s);
	}

}
