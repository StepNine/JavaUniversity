import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int id;

    // Конструктор
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}

public class Main {

    public static List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }

        int mid = students.size() / 2;
        List<Student> left = new ArrayList<>(students.subList(0, mid));
        List<Student> right = new ArrayList<>(students.subList(mid, students.size()));

        return merge(mergeSort(left), mergeSort(right));
    }

    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }


        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }

    public static void main(String[] args) {

        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 3));
        list1.add(new Student("Bob", 1));
        list1.add(new Student("Charlie", 5));


        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Dave", 2));
        list2.add(new Student("Eve", 4));
        list2.add(new Student("Frank", 6));


        List<Student> combinedList = new ArrayList<>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);


        List<Student> sortedList = mergeSort(combinedList);


        System.out.println("Sorted list:");
        for (Student student : sortedList) {
            System.out.println(student);
        }
    }
}
