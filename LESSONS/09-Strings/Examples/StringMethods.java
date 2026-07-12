

public class StringMethods {
    public static void main(String[] args){

        String name = "Sangwa";
        String url = "https://www.google.com";
        System.out.println(name.charAt(4)); //w
        System.out.println(name.toUpperCase()); //SANGWA
        System.out.println(name.toLowerCase()); // sangwa
        System.out.println(name.equals("SANGWA")); //false
        System.out.println(name.equalsIgnoreCase("SANGWA")); //true
        System.out.println(name.contains("san")); // false (Java is case sensitive)
        System.out.println(url.startsWith("https")); //true
        System.out.println(url.endsWith(".com")); //true


    }
}
