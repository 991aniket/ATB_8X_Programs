package Practice_Prgramms;

public class Lab_71_Constructor_Student
{
    String name;
    int id;
    double marks;

    Lab_71_Constructor_Student  (String name, int id, double marks)
    {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    void displayDetails()
    {
        System.out.println("Student Name  - " + name);
        System.out.println("Student id    - " + id);
        System.out.println("Student Marks -" + marks);
    }

    void Grade(int marks)
    {
        if (marks >= 0 && marks <= 100)
        {
            if (marks >= 90 && marks <= 100) {
                System.out.println("Grade is - O");
            } else if (marks >= 80 && marks < 90)
            {
                System.out.println("Grade is - A+");
            } else if (marks >= 70 && marks < 80) {
                System.out.println("Grade is - A");
            } else if (marks >= 60 && marks < 70) {
                System.out.println("Grade is - B");
            } else if (marks >= 50 && marks < 60) {
                System.out.println("Grade is - C");
            } else if (marks >= 0 && marks < 50) {
                System.out.println("Grade is - F");
            }
        }
        else
        {
            System.out.println("please valid number ");

        }

    }
}

