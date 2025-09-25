public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setName("Alexandra");
        student.setAge(0);
        student.setGrade('C');

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Grade: " + student.getGrade());
    }
}