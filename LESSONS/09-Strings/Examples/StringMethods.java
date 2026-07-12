

public class StringMethods {
    public static void main(String[] args){

        String name = "Sangwa";
        String url = "https://www.google.com";
        String fruits = "Apple,Banana,Orange";

        String[] fruitArray = fruits.split(",");
        System.out.println(fruitArray[1]);
        System.out.println(name.charAt(4)); //w
        System.out.println(name.toUpperCase()); //SANGWA
        System.out.println(name.toLowerCase()); // sangwa
        System.out.println(name.equals("SANGWA")); //false
        System.out.println(name.equalsIgnoreCase("SANGWA")); //true
        System.out.println(name.contains("san")); // false (Java is case sensitive)
        System.out.println(url.startsWith("https")); //true
        System.out.println(url.endsWith(".com")); //true
        System.out.println(fruits.replace("Apple", "Marius"));
        System.out.println(name.substring(0,4));
        System.out.println(name.lastIndexOf("a"));



    }
}
