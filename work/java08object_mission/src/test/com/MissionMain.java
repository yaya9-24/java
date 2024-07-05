package test.com;

public class MissionMain {
    public static void main(String[] args) {
        Student[] sts = new Student[3]; //null,null,null

        for (int i = 0; i < sts.length; i++) {
            sts[i] = new Student();
        }

        for (int i = 0; i < sts.length; i++) {
            int total = sts[i].kor + sts[i].eng + sts[i].math;
            double avg = total / 3.0;
            String grade = "";
            if (avg >= 90) {
                grade = "A";
            } else if (avg >= 80) {
                grade = "B";
            } else if (avg >= 70) {
                grade = "C";
            } else {
                grade = "D";
            }
            System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%s\n",
                    sts[i].num, sts[i].name, sts[i].kor, sts[i].eng, sts[i].math, total, avg, grade);
        } //end for

        System.out.println("------------------------");

        sts = new Student[3]; //null,null,null

        for (int i = 0; i < sts.length; i++) {
            sts[i] = new Student(i + 1, "lee" + (i + 1), 90 + i + 1, 80 + i + 1, 70 + i + 1);
        }

        for (int i = 0; i < sts.length; i++) {
            int total = sts[i].kor + sts[i].eng + sts[i].math;
            double avg = total / 3.0;
            String grade = "";
            if (avg >= 90) {
                grade = "A";
            } else if (avg >= 80) {
                grade = "B";
            } else if (avg >= 70) {
                grade = "C";
            } else {
                grade = "D";
            }
            System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%s\n",
                    sts[i].num, sts[i].name, sts[i].kor, sts[i].eng, sts[i].math, total, avg, grade);
        }
    }//end main
}//end class