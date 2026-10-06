class StudentResult{
    String name;
    int rollNo;
    int marks_sub1;
    int marks_sub2;
    int marks_sub3;

    StudentResult(String name, int rollNo, int marks_sub1, int marks_sub2, int marks_sub3){
        this.name = name;
        this.rollNo = rollNo;
        this.marks_sub1 = marks_sub1;
        this.marks_sub2 = marks_sub2;
        this.marks_sub3 = marks_sub3;
    }

    void calculateTotal(){
        int total = marks_sub1 + marks_sub2 + marks_sub3;
        System.out.println("Total Marks: " + total);
    }

    void calculateAverage(){
        double average = (marks_sub1 + marks_sub2 + marks_sub3) / 3.0;
        System.out.println("Average Marks: " + average);
    }

    void determineResult(){
        double average = (marks_sub1 + marks_sub2 + marks_sub3) / 3.0;
        if(average >= 40){
            System.out.println("Result: Pass\n");
        } else {
            System.out.println("Result: Fail\n");
        }
    }
}

public class MarksAndUtilityCalc {
    public static void main(String[] args){
        StudentResult s1 = new StudentResult("Ajay",103, 88,91,90);
        StudentResult s2 = new StudentResult("Ravi",104, 35, 40, 38);

        System.out.println("Student: " + s1.name + ", Roll No: " + s1.rollNo);
        s1.calculateTotal();
        s1.calculateAverage();
        s1.determineResult();

        System.out.println("Student: "+s2.name+", Roll No: "+s2.rollNo);
        s2.calculateTotal();
        s2.calculateAverage();
        s2.determineResult();
    }
    
}
