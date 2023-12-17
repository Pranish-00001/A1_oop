import models.Students;

public class Main {
    public static void main(String[] args) {
        int[] s1_marks ={90,98,80};
        Students s1 = new Students("Ram",18, s1_marks, 12);
        int[] s2_marks = {80,91,92};
        Students s2 = new Students("Shyam",17, s2_marks,12);
        int[] s3_marks = {93,88,80};
        Students s3 = new Students("Hari", 18, s3_marks, 12);
        s3.result();

    }
}