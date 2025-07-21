class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Priya", 11, 'A');
        Student s2 = new Student("Rahul", 12, 'B');
        s1.display();
        s2.display();
        displayTotalStudents();
    }
}
