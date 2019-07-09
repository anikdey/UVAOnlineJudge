import java.util.ArrayList;
import java.util.Scanner;

public class Prerequisites {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfCoursesTaken = input.nextInt();

        while (numberOfCoursesTaken != 0) {
            int numberOfCategories = input.nextInt();

            ArrayList<Integer> courseNumber = new ArrayList<>(numberOfCoursesTaken);

            for(int i=0; i<numberOfCoursesTaken; i++){
                courseNumber.add(input.nextInt());
            }

            boolean isPassed = true;

            for(int i=0; i<numberOfCategories; i++) {
                int numberOfCoursesInCategory = input.nextInt();
                int requiredNumberOfCourseToBeTaken = input.nextInt();
                int count = 0;
                for(int j=0; j<numberOfCoursesInCategory; j++) {
                    int courseId = input.nextInt();
                    if(courseNumber.contains(courseId)) {
                        count++;
                    }
                }

                if(count < requiredNumberOfCourseToBeTaken) {
                    isPassed = false;
                }
            }

            if(isPassed) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            numberOfCoursesTaken = input.nextInt();
        }

        input.close();
    }

}
