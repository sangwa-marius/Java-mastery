public class StringBuild {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Hello");

        String a = "Marius";
        String b = new String("Marius");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(builder.charAt(0));
    }
}