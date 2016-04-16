package part2.lection1;

import java.util.Random;

/**
 * Р¦РµР№ РєР»Р°СЃ РґРµРјРѕРЅСЃС‚СЂСѓС” РјРѕР¶Р»РёРІРѕСЃС‚С– С†РёРєР»Сѓ foreach
 * 
 * @author Р’Р»Р°РґРёСЃР»Р°РІ Р’Р°Р»СЊС‚
 * 
 */

public class ForEachExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random rand = new Random(47); // СЃС‚РІРѕСЂСЋС”РјРѕ РµРєР·РµРјРїР»СЏСЂ РєР»Р°СЃСѓ Random
		int randvalue = rand.nextInt(10); // СЃС‚РІРѕСЂСЋС”РјРѕ РІРёРїР°РґРєРѕРІРµ С†С–Р»Рµ С‡РёСЃР»Рѕ
		Student dreamgroup[] = new Student[randvalue]; // РіСЂСѓРїР° Р· РЅРµРІС–РґРѕРјРѕСЋ
														// РєС–Р»СЊРєС–СЃС‚СЊСЋ СЃС‚СѓРґРµРЅС‚С–РІ
		for (int i = 0; i < randvalue; i++)
			// Р†РЅС–С†С–Р°Р»С–Р·Р°С†С–СЏ РіСЂСѓРїРё РІРёРїР°РґРєРѕРІРёРјРё РґР°РЅРёРјРё
			dreamgroup[i] = new Student("Number" + i, rand.nextInt(10) + 18,
					rand.nextInt(50) + 50);

		// РўРµРїРµСЂ С‚СЂРµР±Р° РІРёРІРµСЃС‚Рё СЃРїРёСЃРѕРє РіСЂСѓРїРё
		// РІР°СЂС–Р°РЅС‚ РїРµСЂС€РёР№:
		System.out.println("Р’Р°СЂС–Р°РЅС‚ РїРµСЂС€РёР№: ");
		for (int i = 0; i < randvalue; i++)
			// Р·РІРёС‡Р°Р№РЅРёР№ С†РёРєР» for
			System.out.println(dreamgroup[i]);

		System.out.println();
		System.out.println();

		System.out.println("Р’Р°СЂС–Р°РЅС‚ РґСЂСѓРіРёР№: ");
		for (Student s : dreamgroup)
			// Р·СЂСѓС‡РЅРёР№ С†РёРєР» РєРѕР»Рё РЅРµРѕР±С…С–РґРЅРѕ РїРµСЂРµР±СЂР°С‚Рё РјР°СЃРёРІ Р°Р±Рѕ РєРѕР»РµРєС†С–СЋ. РќРµ
			// РІРёРјР°РіР°С” Р·РЅР°РЅРЅСЏ СЂРѕР·РјС–СЂС–РІ.
			System.out.println(s); // Р—Р°Р·РІРёС‡Р°Р№ СЂРѕР·РјС–СЂРё РІР°Р¶РєРѕ Р·Р°РіСѓР±РёС‚Рё, Р°Р»Рµ
									// РЅР°РІС–С‰Рѕ С—С… РІСЂР°С…РѕРІСѓРІР°С‚Рё, РєРѕР»Рё РЅРµРјР°С” РїРѕС‚СЂРµР±Рё
									// РІ С†СЊРѕРјСѓ?

	}

}
