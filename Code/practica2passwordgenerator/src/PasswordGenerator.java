

import java.util.Random;

class PasswordGenerator {
    public static String generatePassword(boolean letters, boolean numbers, boolean symbols) {
        String letterChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numberChars = "0123456789";
        String symbolChars = "!@#$%^&*()_+";
        String validChars = "";
        
        if (letters) validChars += letterChars;
        if (numbers) validChars += numberChars;
        if (symbols) validChars += symbolChars;
        
        if (validChars.isEmpty()) return "Seleccione al menos una opción";
        
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            password.append(validChars.charAt(random.nextInt(validChars.length())));
        }
        return password.toString();
    }
}
