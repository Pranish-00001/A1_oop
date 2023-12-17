package models;

public class Students {
    String name;
    int age;
    int[] marks;
    int grade;


    public Students(String name, int age, int[] marks, int grade) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void result(){
        String grade;
        float percentage = ((float) (this.marks[0] + this.marks[1] + this.marks[2]) /300)*100;
        if (percentage >= 90){
             grade = "A+";
        } else if (percentage>=80) {
            grade = "A";
        } else if (percentage>=70) {
            grade = "B";
        }
        else{
            grade = "NG";
        }
        System.out.println("""
                
                Name : """ + this.name+ """
                \nAge: """ + this.age+ """
                \nClass: """+ this.grade+ """
                \n-----Marks----
                \nPhy:"""+this.marks[0]+ """
                \nChe:"""+this.marks[1]+ """
                \nNep:"""+this.marks[2]+ """
                \nPercentage :"""+ percentage + """
                \nGrade: """+ grade);
    }
}
