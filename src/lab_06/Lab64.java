package lab_06;

public class Lab64 {
    public static void main(String[] args) {
        /* LAB 6.4
        String url = "https://google.com";
        Check http OR https; domain name, .com OR .net
        */

        String url = "https://google.com";
        if (url.contains("https")) {
            System.out.println("Url contains 'https'");
        }
        if (url.contains(".com")) {
            System.out.println("Url contains '.com'");
        }
    }
}
