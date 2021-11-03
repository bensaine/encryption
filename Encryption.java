package com.mycompany.encryption;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        String userInput = getInput();
        System.out.println("Encrypted phrase: "+EncryptionProcedures.periodicEncrypt(userInput));
    }
    
    private static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phrase to encrypt: ");
        return sc.nextLine();
    }
}