package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for(Student s : students){
            if(oldest.getAge() >= s.getAge()){
                oldest = s;
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int countAdult = 0;
        for(Student s : students){
            if(s.isAdult()) countAdult++;
        }
        return countAdult;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        double sumGrades = 0;
        for(Student s : students){
            sumGrades += s.getGrade();
        }
        return sumGrades / Student.getNumStudent();
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for(Student s : students){
            if(s.getName() == name){
                return s;
            }
        }
        return null;

    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s2.getGrade() - s1.getGrade());
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for(Student s : students){
            if(s.getGrade() >= 15){
                System.out.println(s.getName());
            }
            System.out.print("\n");
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        boolean found = false;
        for(Student s : students){
            if(s.getId() == id){
                s.setGrade(newGrade);
                found = true;
                break;
            }
        }
        return found;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        boolean duplicateFound = false;
        for(int i = 0; i < students.length; i++){
            int countName = 1;
            for(int j = 0; j < students.length; j++){
                if(students[i].getName() == students[j].getName()) countName++;
            }
            if(countName >= 2) duplicateFound = true;
        }
        if(duplicateFound) System.out.println("Duplicates found");
        return duplicateFound;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] extendedStudents = new Student[students.length + 1];
        for(int i = 0; i < students.length; i++){
            extendedStudents[i] = students[i];
        }
        extendedStudents[students.length] = newStudent;
        return extendedStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] students = new Student[5];
        students[0] = new Student(1, "mariam", 20);
        students[1] = new Student(2, "ahmed", 19);
        students[2] = new Student(3, "sara", 20);
        students[3] = new Student(4, "salma", 20, 17);
        students[4] = new Student(5, "nissrine", 20, 18);


        // Print all
        System.out.println("== All Students ==");
        for (Student s : students) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println(findOldest(students));



        // 3) Count adults
        System.out.println(countAdults(students));


        // 4) Average grade
        System.out.println(averageGrade(students));


        // 5) Find by name
        System.out.println(findStudentByName(students, "mariam"));


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        sortByGradeDesc(students);
        for (Student s : students) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(students);

        // 8) Update grade by id
        // function
        System.out.println("\nUpdated id=4? " + updateGrade(students, 4, 15) );
        System.out.println(findStudentByName(students, "Dina"));

        // 9) Duplicate names
        System.out.println(hasDuplicateNames(students));


        // 10) Append new student
        appendStudent(students, new Student(6, "yasmin", 20, 15));

    }
}

