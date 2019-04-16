/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.security.Key;
import java.sql.Connection;
import java.sql.Statement;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author riit2
 */
public class AESencrp {
     private static final String ALGO = "AES";
    //private static final byte[] keyValue = 
       // new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't','S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };

          
    public  String encrypt(String Data,byte[] k) throws Exception {
        
        Key key = generateKey(k);
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encVal);
        return encryptedValue;
    }

    public  String decrypt(String encryptedData,byte[] k) throws Exception {
        
        Key key = generateKey(k);
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }
    private Key generateKey(byte[] keyValue) throws Exception {
                
        Key key = new SecretKeySpec(keyValue, ALGO);        
        return key;
    }
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        RandomPassword rk=new RandomPassword();
        String rkey=rk.randomAlphaNumeric(16);
        AESencrp a= new AESencrp();
        String d= a.encrypt("amrutha", rkey.getBytes());
        dbcon db=new dbcon();
        Connection con=db.getcon();
        Statement st=con.createStatement();
        st.executeUpdate("insert into aes values('"+rkey+"')");
        
        
        System.out.println(d);
        System.out.println("key"+rkey);
        String e=a.decrypt(d, rkey.getBytes());
        System.out.println(e);
        
    }
   
}
