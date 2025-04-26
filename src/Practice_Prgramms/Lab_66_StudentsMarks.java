package Practice_Prgramms;

public class Lab_66_StudentsMarks {
    String name;
    int marks;
    

    void showWelcome() {
        System.out.println("Welcome Students");
    }

    String getSubjectName() {
        return "Maths";
    }

    void displayMarks(int marks) {

        System.out.println(marks);
    }

    char CalculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 80 && marks < 90) {
            return 'B';
        } else if (marks >= 70 && marks < 80) {
            return 'C';

        } else if (marks >= 60 && marks < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args)
    {

        Lab_66_StudentsMarks sc = new Lab_66_StudentsMarks();
        sc.showWelcome();
        String subject = sc.getSubjectName();
        System.out.println(subject);
        int studentMarks = 77;
        sc.displayMarks(studentMarks);
        char grade = sc.CalculateGrade(studentMarks);
        System.out.println(grade);
}
}



