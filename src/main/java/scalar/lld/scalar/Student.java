package scalar.lld.scalar;

public class Student extends User{
//    A student should have a name, email, batch name and PSP.
//    A student should also have a status reflecting whether they are active or not. Some possible statuses are: active, paused, completed etc.
//    A student should have a method to change their status.
//    The PSP of the student should be private.
//    The PSP of a student should be within the range of 0 to 100. If it is not, then the object should not be created.


    private String PREFIX = "S";



    private Integer psp;

    StudentStatus studentStatus;
    public StudentStatus getStudentStatus() {
        return studentStatus;
    }
    public String getRollNumber(){
        return PREFIX+"_"+ this.batchName+"_"+this.id;
    }

    StudentStatus status;
//    public void setStudentStatus(StudentStatus studentStatus) {
//        this.studentStatus = studsentStatus;
//    }

    String batchName;

    public Integer getPsp() {
        return psp;
    }
    public Student(String name, String email, Integer psp, String batchName, Long id, String phoneNumber)
    {
        super(id, name, email, phoneNumber);
        if(psp<0 || psp>100){
            throw new IllegalArgumentException("Invalid psp");
        }
        this.name = name;
        this.email = email;
        this.psp = psp;
        this.batchName = batchName;
        this.id = id;
        this.studentStatus = StudentStatus.ACTIVE;
    }

    public static String toString(Student st){
        return st.batchName+ " "+st.name+ " "+st.email;
    }

    public String toString(){
        return toString(this);
    }


}
