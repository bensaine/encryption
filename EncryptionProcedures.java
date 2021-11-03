package com.mycompany.encryption;
import java.util.Arrays;

public class EncryptionProcedures {
    private static String encrypted = "";
    private static final String[] arrPeriodicTableValues = {"h", "he", "li", "be", "b", "c", "n", "o", "f", "ne", "na", "mg", "al", "si", "p", "s", "cl", "ar", "k", "ca", "sc", "ti", "v", "cr", "mn", "fe", "co", "ni", "cu", "zn", "ga", "ge", "as", "se", "br", "kr", "rb", "sr", "y", "zr", "nb", "mo", "tc", "ru", "rh", "pd", "ag", "cd", "in", "sn", "sb", "te", "i", "xe", "cs", "ba", "la", "ce", "pr", "nd", "pm", "sm", "eu", "gd", "tb", "dy", "ho", "er", "tm", "yb", "lu", "hf", "ta", "w", "re", "os", "ir", "pt", "au", "hg", "tl", "pb", "bi", "po", "at", "rn", "fr", "ra", "ac", "th", "pa", "u", "np", "pu", "am", "cm", "bk", "cf", "es", "fm", "md", "no", "lr", "rf", "db", "sg", "bh", "hs", "mt", "ds", "rg", "cn", "nh", "fl", "mc", "lv", "ts", "og"};
    
    public static String periodicEncrypt(String decrypted) {
        while (decrypted.length() > 0) {
            boolean twoChars = decrypted.length() >= 2 && elementIndex(decrypted.substring(0, 2)) != -1;
            encrypted += encryptString(decrypted.substring(0, twoChars ? 2 : 1));
            decrypted = decrypted.substring(twoChars ? 2 : 1);
        }
        return encrypted;
    }

    static private String encryptString(String str) {
        int i = elementIndex(str.toLowerCase());
        return i == -1 ? str : String.valueOf(i+1);
    }
    
    static private int elementIndex(String periodicElement) {
        return Arrays.asList(arrPeriodicTableValues).indexOf(periodicElement.toLowerCase());
    }
}