public class Student implements Comparable<Student> {
    private String firstName;
    private String middleName;
    private String lastName;

    // Constructor to initialize the Student object with a full name
    public Student(String fullName) {
        updateName(fullName);
    }

    // Private method to split and update the name fields
    private void updateName(String fullName) {
        String[] nameParts = fullName.trim().split("\\s+");
        this.firstName = nameParts[0];
        if (nameParts.length == 3) {
            this.middleName = nameParts[1];
            this.lastName = nameParts[2];
        } else if (nameParts.length == 2) {
            this.middleName = "";
            this.lastName = nameParts[1];
        } else {
            this.middleName = "";
            this.lastName = "";
        }
    }

    // Method to get the full name
    public String getFullName() {
        StringBuilder fullName = new StringBuilder(firstName);
        if (!middleName.isEmpty()) {
            fullName.append(" ").append(middleName);
        }
        if (!lastName.isEmpty()) {
            fullName.append(" ").append(lastName);
        }
        return fullName.toString();
    }

    // Method to get the middle name
    public String getMiddleName() {
        return middleName;
    }

    // Method to get the last name
    public String getLastName() {
        return lastName;
    }

    // compareTo method to compare students by their full name
    @Override
    public int compareTo(Student other) {
        return this.getFullName().compareTo(other.getFullName());
    }
}