class person 
{
    String name;
    int dob;
    void value1(String x , int y){
        name = x;
        dob = y;
    }
}
class teacher extends person
{
    int sallary;
    int tid;
    String subject;
    void value2(int x , int y , String z){
        sallary = x;
        tid = y;
        subject = z;
    }
}
class student extends teacher
{
    int studentid;
    void value3(int x){
        studentid = x;
    }
}
class classtudent extends student
{
    static String clg = "GIET";
    static int yr = 2022 ;
    void display (){
        System.out.println("Univesrsity name: "+ clg);
        System.out.println("year of student: "+ yr);
        System.out.println("student name: "+ name);
        System.out.println("Teacher sallary: "+ sallary);
        System.out.println("Teacher ID: "+ tid);
        System.out.println("Subject Name: "+ subject);
        System.out.println("Student ID: "+ studentid);
    }
}
class test1
{
    public static void main(String args[]){
        classtudent obj = new classtudent();
        obj.value1("asim",2004);
        obj.value2(100000 , 0001 , "OOPS");
        obj.value3(317);
        obj.display();
    }
}
