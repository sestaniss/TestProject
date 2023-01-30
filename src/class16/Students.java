package class16;

public class Students {
    /*
 Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    String stName;
    String stID;
  static   int numberOfStudents;

    public static void main(String[] args) {

        Students st=new Students();
        st.stID="222";
        st.stName="Tami";
        st.numberOfStudents++;

        Students st1=new Students();
        st1.stID="223";
        st1.stName="Sam";
        st1.numberOfStudents++;

        Students st2=new Students();
        st2.stID="224";
        st2.stName="Asghar";
        st2.numberOfStudents++;

        System.out.println(Students.numberOfStudents);



    }
}
