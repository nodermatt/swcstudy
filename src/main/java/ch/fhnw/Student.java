package ch.fhnw;

public class Student {
    private String[] courses;
    private double[] grades;
    private String firstname;
    private String lastname;

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname= lastname;
        courses = new String[30];
        grades = new double[30];

    }

    /**
     * Max of 30 courses allowed
     *
     * @param courseId
     * @param grade
     */
    public void addCourseGrade(String courseId, double grade) {
        if(grade < 1.0 || grade > 6.0) throw new IllegalArgumentException("Invalid grade");
        if(courseId.length() != 6) throw new IllegalArgumentException("Course id invalid");
        if (courseId.matches("[A-Za-z]{3}\\d{2}[FH]")) {
            for(int i = 0; i <= courses.length; i++) {
                if(i == 29) throw new ArrayIndexOutOfBoundsException("Max number of courses reached");
                if(courses[i] == null || courseId.equals(courses[i])) {
                    grades[i] = grade;
                    courses[i] = courseId;
                    break;
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid course ID"); }
    }

    public int getNumOfCourses() {
        int count = 0;
        for(String course : courses) {
            if (course != null && !course.equals("")) {
                count++;
            }
        }
        return count;
    }

    public double getGrade(String courseId) {
        for(int i = 0; i < courses.length; i++) {
            if(courses[i].equals(courseId)) {
                return grades[i];
            }
        }
        throw new IllegalArgumentException("No grade for course found");
    }

    public String[] getCourses() {
        return courses;
    }

    public double[] getGrades() {
        return grades;
    }
}
