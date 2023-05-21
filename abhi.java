public class abhi {
    private String name;
    private int score;

    public Student (String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getLearningSpeed() {
        if (score >= 60) {
            return "Fast Learner";
        } 
        else {
            return "Slow Learner";
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("ajay ",85);
        Student s2 = new Student("baban", 45);
        System.out.println(s1.getName() + " is a " + s1.getLearningSpeed());
        System.out.print(s2.getName() + " is a " + s2.getLearningSpeed());
    }
}

