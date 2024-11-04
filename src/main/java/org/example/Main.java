package org.example;

public class Main {
    public static void main(String[] args) {
        String text = "Kryptera denna texten";
        int shift = 3;

        String encryptedText = Kryptering.encrypt(text, shift);
        System.out.println(encryptedText);

        String decryptedText = Kryptering.decrypt(encryptedText, shift);
        System.out.println(decryptedText);
    }
}