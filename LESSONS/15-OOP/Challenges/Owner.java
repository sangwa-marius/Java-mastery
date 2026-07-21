public class Owner {

    private String fullName;
    private String email;

    public Owner(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        if (newEmail.isBlank()) {

            System.out.println("Email should not be blank");
            return;
        }

        if (!newEmail.contains("@")) {

            System.out.println("Invalid email format. \"@\" sign missing");
            return;
        }
        this.email = newEmail;
    }

    public void displayOwner() {
        System.out.println("\nOwner\n------");
        System.out.println(fullName);
        System.out.println(email);
    }
}