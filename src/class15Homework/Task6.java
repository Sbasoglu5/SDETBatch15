package class15Homework;

public class Task6 {
    //Create  class Student that will have a method getGrade.
    // Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F

    String grades(int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else if (score >= 0) {
            return "F";
        }else{
            return "N/A";
        }
    }

}


