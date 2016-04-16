package part2.lection1;

import java.math.BigInteger;

/**
 * Створити клас з методом, що буде обраховувати факторіал додатнього цілого
 * числа. Працювати з BigInteger (в цьому класі немає методу main він буде в
 * подальшому використовуватися в інших програмах).
 * 
 * @author Anton
 *
 */
public class HomeWork16_1 {

	public BigInteger fac(int i){
		BigInteger res = BigInteger.valueOf(1);
		for(int a=1;a<=i;++a)res=res.multiply(BigInteger.valueOf(a));
		return res;
	}
}
