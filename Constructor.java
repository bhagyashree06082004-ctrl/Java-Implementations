class Subject {
    private final String subID;
    private final String name;
    private int maxMarks;
    private int marksObtained;


    public Subject(String subID, String name, int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtained = 0;
    }

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    // Qualification check (40%)
    public boolean isQualified() {
        return marksObtained >= (maxMarks * 40) / 100;
    }

    // Display object details
    @Override
    public String toString() {
        return "Subject ID: " + subID +
               "\nName: " + name +
               "\nMarks Obtained: " + marksObtained +
               "\nQualified: " + (isQualified() ? "Yes" : "No") +
               "\n";
    }
}

public class Constructor {
    public static void main(String[] args) {

        Subject[] subs = new Subject[3];
        subs[0] = new Subject("S101", "DS", 100);
        subs[1] = new Subject("S102", "Algorithms", 100);
        subs[2] = new Subject("S103", "Operating Systems", 100);

        subs[0].setMarksObtained(45);
        subs[1].setMarksObtained(35);
        subs[2].setMarksObtained(80);

        for (Subject s : subs) {
            System.out.println(s);
        }
    }
}
