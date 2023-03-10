package class30Homework;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeImportant {
        /*Create a Map that will store Employee name and salary.
        Write a logic to retrieve an employee who gets the highest salary.
        Output should be in the below format
        John Smith=$100000*/
        public static void main(String[] args) {
            Map<String,Integer> employee=new TreeMap<>();
            employee.put("Tom",100000);
            employee.put("Jon",90000);
            employee.put("Kathy",125000);
            employee.put("Dick",75000);

            var highestSalary=employee.entrySet();
            String name="";
            int maxSal=0;
            for (var entry:highestSalary){
                if (entry.getValue()>maxSal){
                    maxSal= entry.getValue();
                    name= entry.getKey();
                }
            }
            System.out.println(name+" "+maxSal);


        }
}
