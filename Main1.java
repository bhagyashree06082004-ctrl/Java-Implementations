class Subject{

    private String courseId;
    private String courseName;
    private int maxMarks;
    private int marksObtained;

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }
    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }
 
    public int getMarksObtained() {
        return marksObtained;
    }
    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    Subject(String courseId, String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }

    Subject(String courseId, String courseName, int maxMarks, int marksObtained){
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }
}

class Student {
    private String name;
    private int rollNo;
    private String dept;
    private Subject[] subjects;


    Student(String name, int rollNo, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getDept() {
        return dept;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
    

    
    
}

public class Main1 {
    public static void main(String[] args) {
        Subject[] subjects = new Subject[2];

        
        subjects[0] = new Subject("CS101", "Data Structures");
        subjects[1] = new Subject("MA101", "Calculus", 100, 85);

        
        subjects[0].setMaxMarks(120);
        subjects[0].setMarksObtained(95);

        
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(
                subjects[i].getCourseId() + " - " +
                subjects[i].getCourseName() + " : " +
                subjects[i].getMarksObtained() + "/" +
                subjects[i].getMaxMarks()
            );
        }

        Student student = new Student("John Doe", 1, "Computer Science");
        student.setSubjects(subjects);

        System.out.println("Student: " + student.getName() + ", Roll No: " + student.getRollNo() + ", Dept: " + student.getDept());

        for (Subject s : student.getSubjects()) {
            System.out.println(
                s.getCourseId() + " - " +
                s.getCourseName() + " : " +
                s.getMarksObtained() + "/" +
                s.getMaxMarks()
            );
        }
    }
}
