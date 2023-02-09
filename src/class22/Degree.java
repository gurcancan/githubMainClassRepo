package class22;

public class Degree {

    String prerequisite = "To get a degree you need a high school diploma";

    void getPrerequisite() {
        System.out.println(prerequisite);
    }
}

class Bachelors extends Degree {

}

class Masters extends Degree {

    @Override
    void getPrerequisite() {
        System.out.println("To get a Master you need a bachelors");
    }
}

class DegreeTester {
    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
        Masters masters = new Masters();
        masters.getPrerequisite();

    }
}

