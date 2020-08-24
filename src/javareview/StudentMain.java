package javareview;

public class StudentMain {
    public static void main(String[] args) {
        Student kwan = new Student(1, "Kwan");
        kwan.setFinalScore(60);
        kwan.setMidTermScore(40);
        Student kate = new Student(2, "Kate");
        kate.setFinalScore(50);
        kate.setMidTermScore(30);
        System.out.println(kwan.getId() + ": " + kwan.getName() + " total: " + kwan.getTotalScore());
        System.out.println(kate.getId() + ": " + kate.getName() + " total: " + kate.getTotalScore());
        Student s = kwan;
        s.setFinalScore(1000);
        s.setName("s");
        System.out.println("set 1000");
        System.out.println(kwan.getId() + ": " + kwan.getName() + " total: " + kwan.getTotalScore());
        System.out.println(s.getId() + ": " + s.getName() + " total: " + s.getTotalScore());
        System.out.println("xxxxx");
        System.out.println(kwan.toString());
        System.out.println(kate);
    }
}
