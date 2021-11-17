package Model;

public class Exam {
    private String examdateTxt;
    private String subjectTxt;
    private String enqTxt;
    private String studIDTxt;

    public Exam(String examdateTxt, String subjectTxt, String enqTxt, String studIDTxt) {
        this.examdateTxt = examdateTxt;
        this.subjectTxt = subjectTxt;
        this.enqTxt = enqTxt;
        this.studIDTxt = studIDTxt;
    }
    
    public String getExamdateTxt() {
        return examdateTxt;
    }

    public String getSubjectTxt() {
        return subjectTxt;
    }

    public String getEnqTxt() {
        return enqTxt;
    }

    public String getStudIDTxt() {
        return studIDTxt;
    }
    
}
