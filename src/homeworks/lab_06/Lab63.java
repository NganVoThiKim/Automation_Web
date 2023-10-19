package homeworks.lab_06;

public class Lab63 {
    public static void main(String[] args) {
        /* LAB 6.3
        String myStr = "100 minutes";
        NOT using REGEX, extract digit character from that String
        Expected output: "100".
        EX: "12345nabc678" -> "12345678"
        */
        String myStr = "100 minutes";
        String digitStr = "";
        char[] charList = myStr.toCharArray();
        for (char character : charList) {
            if(Character.isDigit(character)){
                digitStr += character;
            }
        }
        System.out.println("Digit character string : " + digitStr);

    }
}
