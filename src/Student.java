public class Student {
    int roll;
    String name;

    void getStudent(int a, String b) {
        roll = a;
        name = b;
    }

    void displayStudent() {
        System.out.println("Roll: " + roll + ", Name: " + name);
    }
}

class Exam extends Student {
    int mark1, mark2;

    void getExam(int a, int b) {
        mark1 = a;
        mark2 = b;
    }

    void displayExam() {
        System.out.println("Mark1: " + mark1 + ", Mark2: " + mark2);
    }
}

class SingleDemo {
    public static void main(String args[]) {
        Exam e = new Exam();
        e.getStudent(12, "Alok");
        e.getExam(52, 78);
        e.displayStudent();
        e.displayExam();
    }
}


