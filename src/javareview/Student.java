package javareview;

public class Student {
    // field
    // access modifier เพื่อกำหนดความปลอดภัย
    private int id;
    private String name;
    private double midTermScore, finalScore;
    // constructor
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    // method
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMidTermScore(double midTermScore){
        this.midTermScore = midTermScore;
    }
    public void setFinalScore(double finalScore){
        this.finalScore = finalScore;
    }
    public double getTotalScore(){
        return midTermScore + finalScore;
    }
    // toString method
    public String toString(){
        return id + " -- " + name;
    }
}