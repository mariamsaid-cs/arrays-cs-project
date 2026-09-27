package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};

        int newCourse = 2340;
        int[] updatedCourses = new int[registeredCourses.length + 1];
        for(int i = 0; i < registeredCourses.length; i++){
            updatedCourses[i] = registeredCourses[i];
        }
        updatedCourses[registeredCourses.length] = newCourse;

        for(int course : updatedCourses){
            System.out.print(course + " ");
        }
        System.out.println("\n");

        int courseCheck1 = 2150;
        int courseCheck2 = 2028;

        boolean found1 = false;
        for(int course : updatedCourses){
            if(course == courseCheck1){
                found1 = true;
                break;
            }
        }

        boolean found2 = false;
        for(int course : updatedCourses){
            if(course == courseCheck2){
                found2 = true;
                break;
            }
        }

        System.out.print("first check : " + found1);
        System.out.print("second check : " + found2);


    }
}
