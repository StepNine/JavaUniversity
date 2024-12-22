public class Student {

    private String firstName;
    private String lastName;
    private String specialization;
    private int course;
    private String group;

    // Конструктор
    public Student(String firstName, String lastName, String specialization, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
    }

    // Геттер и сеттер
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    // Детали
    public void displayStudentDetails() {
        System.out.println("Детали:");
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Профессия: " + specialization);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
    }

    public static void main(String[] args) {

        Student student = new Student("Дима", "Вася", "Инженер", 3, "CS-301");
        student.displayStudentDetails();


        student.setLastName("Смит");
        student.setCourse(4);
        System.out.println("\nОбновленные детали:");
        student.displayStudentDetails();
    }
}
