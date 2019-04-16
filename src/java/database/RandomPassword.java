/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author riit2
 */
public class RandomPassword {
    
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public  String randomAlphaNumeric(int count) {

        StringBuilder builder = new StringBuilder();

        while (count-- != 0) {

            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());

            builder.append(ALPHA_NUMERIC_STRING.charAt(character));

        }

        return builder.toString();

    } 
}
