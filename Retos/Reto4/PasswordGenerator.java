import java.util.Random;

public class PasswordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnñopqrstuvwxyz";
    private static final String UPERCASE = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!'·$%&/()=?¿|@#~€¬`+´ç-^";

    public static String generatePassword(int passLenght, boolean isUperCase, boolean isNumbers, boolean isSymbols){
        StringBuilder charsOK = new StringBuilder(LOWERCASE);

        if (isUperCase){
            charsOK.append(UPERCASE);
        }
        if (isNumbers){
            charsOK.append(NUMBERS);
        }
        if(isSymbols){
            charsOK.append(SYMBOLS);
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < passLenght; i++){
            int index = random.nextInt(charsOK.length());
            password.append(charsOK.charAt(index));
        }

        return password.toString();
    }
}
