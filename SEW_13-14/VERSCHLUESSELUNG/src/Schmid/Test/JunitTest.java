package Schmid.Test;
import java.util.ArrayList;

import org.junit.*;

import Schmid.Cipher.SubstitutionCipher;

/**
 * 
 * @author Bernhard Schmid
 * 
 */

public class JunitTest{

	private final String wort = "Bernhard";
	private final String wort2 = "Schmid";

	private ArrayList<String> secretAlphabet;
	private ArrayList<String> encrypted;
	private ArrayList<String> decrypted;

	private SubstitutionCipher sc;

	@Before
	public void secretAlphabetSetup() {
		secretAlphabet = new ArrayList<String>();

		secretAlphabet.add("Test");
		
		sc = new SubstitutionCipher();
		encrypted = new ArrayList<String>();
		decrypted = new ArrayList<String>();
	}

	@Test
	public void Test1() {
		for(int x=0; x<secretAlphabet.size(); x++) {
			
			sc.setSecretAlphabeticCipher(secretAlphabet.get(x));
			System.out.println(sc.getSecretAlphabet());

			encrypted.add(sc.encrypt(wort));
			System.out.println(encrypted.get(x));
			
			decrypted.add(sc.decrypt(encrypted.get(x)));
			System.out.println(decrypted.get(x));

			System.out.println();
		}
	}

	@Test
	public void Test2() {
		for(int x=0; x<secretAlphabet.size(); x++) {
			
			sc.setSecretAlphabeticCipher(secretAlphabet.get(x));
			System.out.println(sc.getSecretAlphabet());

			encrypted.add(sc.encrypt(wort2));
			System.out.println(encrypted.get(x));
			
			decrypted.add(sc.decrypt(encrypted.get(x)));
			System.out.println(decrypted.get(x));

			System.out.println();
		}
	}
}