public class Student1 {
    String name;
    int id;
    int age;

    public Student1(String n, int i, int a) {
        name = n;
        id = i;
        age = a;
    }

    public static void main(String[] args) {
        Student1[] students = {
            new Student1("Alam", 101, 25),
            new Student1("Mahtab", 105, 23),
            new Student1("Esha", 110, 22),
            new Student1("Bob", 115, 21),
            new Student1("Uma", 120, 20)
        };

        System.out.println("Students whose names start with a vowel:");
        for (Student1 s : students) {
            if (s.name != null && !s.name.isBlank()) {
                char firstChar = Character.toLowerCase(s.name.trim().charAt(0));
                if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || 
                    firstChar == 'o' || firstChar == 'u') {
                    System.out.println("Name: " + s.name );
                }
            }
        }
    }
}


