package GroupProjectHomework;

import java.util.ArrayList;

abstract public class Marks {
    int science;
    int math;
    int literature;
    int language;



    abstract void getPercentage();
    Marks(int science, int math, int literature){
        this.science=science;
        this.literature=literature;
        this.math=math;
    }

}
class StudentA extends Marks{


    StudentA(int science, int math, int literature){
        super(science,math,literature);
    }

    @Override
    void getPercentage() {

        System.out.println("Student A's Math score is "+math);
        System.out.println("Student A's Literature score is "+literature);
        System.out.println("Student A's Science score is "+science);
        System.out.println("THE AVERAGE IS "+(math+literature+science)/3+"%");
    }
}
class StudentB extends Marks{
    StudentB(int science, int math, int literature,int language){
        super(science,math,literature);
        this.language=language;
    }


    @Override
    void getPercentage() {
        System.out.println("Student B's Math score is "+math);
        System.out.println("Student B's Literature score is "+literature);
        System.out.println("Student B's Science score is "+science);
        System.out.println("Student B's Language score is "+language);
        System.out.println("THE AVERAGE IS "+(math+literature+science+language)/4+"%");
    }
}

