package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");


        LinkedList<String> futureSubjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");

        LinkedList<String> allSubjects=new LinkedList<>();
        //Get all the subjects from subject list and futureSubjects and put them in all subjects list
        allSubjects.addAll(futureSubjects);
        allSubjects.addAll(subjects);
        System.out.println(allSubjects);

        LinkedList<String> subjectsILIke=new LinkedList<>();
        subjectsILIke.add("Java");
        subjectsILIke.add("SDLC");
        subjectsILIke.add("SQL");
        System.out.println(subjectsILIke);
        allSubjects.removeAll(subjectsILIke);
        System.out.println(allSubjects);





    }
}
