package Java.JavaSwing_ManageStudent.Models;

public class Student {
    private String id;
    private String name;
    private double Math, English;

    public Student(String id, String name, double Math, double English) {
        this.id = id;
        this.name = name;
        this.Math = Math;
        this.English = English;
    }

    public double AverageSubjects() {
        return (Math + English) / 2.0;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getMath() {
        return Math;
    }
    public double getEnglish() {
        return English;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMath(double Main) {
        this.Math = Main;
    }
    public void setEnglish(double English) {
        this.English = English;
    }
    
}
