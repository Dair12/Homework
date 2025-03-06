import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;
    private Set<String> courses;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = new HashSet<>();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public Set<String> getCourses() { return courses; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public void addCourse(String course) { courses.add(course); }
    public void removeCourse(String course) { courses.remove(course); }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + ", courses=" + courses + "}";
    }
}

class StudentManager {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(int id) {
        students.remove(id);
    }

    public void updateStudent(int id, String name, int age, Set<String> courses) {
        Student student = students.get(id);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
            student.getCourses().clear();
            student.getCourses().addAll(courses);
        }
    }

    public void displayStudents() {
        students.values().stream()
                .sorted(Comparator.comparingInt(Student::getId))
                .forEach(System.out::println);
    }

    public void searchStudent(int id) {
        System.out.println(students.get(id));
    }

    public void listStudentsInCourse(String course) {
        students.values().stream()
                .filter(s -> s.getCourses().contains(course))
                .forEach(System.out::println);
    }

    public void displayStudentsSortedByName() {
        TreeSet<Student> sortedStudents = new TreeSet<>(Comparator.comparing(Student::getName));
        sortedStudents.addAll(students.values());
        sortedStudents.forEach(System.out::println);
    }

    public void searchStudentsByCourse(Map<String, Set<Student>> courseMap, String course) {
        Set<Student> studentsInCourse = courseMap.get(course);
        if (studentsInCourse != null) {
            studentsInCourse.forEach(System.out::println);
        }
    }
}

class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student(1, "Alice", 20);
        s1.addCourse("Math");
        s1.addCourse("Java");

        Student s2 = new Student(2, "Bob", 22);
        s2.addCourse("Java");
        s2.addCourse("Physics");

        Student s3 = new Student(3, "Charlie", 21);
        s3.addCourse("Math");

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        manager.displayStudents();
        manager.searchStudent(2);
        manager.listStudentsInCourse("Java");
        manager.updateStudent(1, "Alice Johnson", 21, new HashSet<>(Arrays.asList("Math", "Python")));
        manager.displayStudents();
        manager.removeStudent(3);
        manager.displayStudents();
        manager.displayStudentsSortedByName();
        Map<String, Set<Student>> courseMap = new HashMap<>();
        for (Student student : Arrays.asList(s1, s2, s3)) {
            for (String course : student.getCourses()) {
                courseMap.computeIfAbsent(course, k -> new HashSet<>()).add(student);
            }
        }
        manager.searchStudentsByCourse(courseMap, "Math");
    }
}
