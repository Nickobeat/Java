/**
 * 
 * Test switch method
 * -------------------
 * Random a letter from a to z
 * Display the letter and shows if it is an vowel, a semivowel or a consonant
 */

public class TestSwitch {
	public static void main(String[] args) {
		char c = 'a';
		int rand = (int) (26 * Math.random());
		char c2 = (char) (c + rand);
		System.out.println(c2);
		switch (c2) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		case 'w':
		case 'y':
			System.out.println("Semivowel");
			break;
		default:
			System.out.println("Consonant");
			break;
		}
	}
}
