package Schmid.Cipher;
/**
 * 
 * @author Bernhard Schmid
 * 
 * Interface f�r die Methoden encrypt und decrypt
 *
 */

public interface Cipher {
	
	public String encrypt(String text);
	public String decrypt(String text);
	
	}
