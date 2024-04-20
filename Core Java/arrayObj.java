class Student{
    int roll;
    String name;
    int mark;

}
public class arrayObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Abe";
        s1.roll = 1;
        s1.mark = 92;

        s2.name = "Ari";
        s2.roll = 2;
        s2.mark = 96;

        s3.name = "Dua";
        s3.roll = 3;
        s3.mark = 72;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].name +" : "+students[i].mark);
        }
        for(Student n: students){
            System.out.println(n.name +" : "+n.mark);
            
        }

    }
}
