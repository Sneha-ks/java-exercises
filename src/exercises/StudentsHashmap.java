 package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentsHashmap {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer studentId;

        System.out.println("Enter the student ID (or ENTER -1 to finish):");

        do{
            System.out.print("Student ID: ");
            studentId = in.nextInt();

            if(studentId != -1){
                System.out.print("Student Name: ");
                String newStudent = in.next();
                students.put(studentId,newStudent);

                in.nextLine();
            }
        }while(studentId != -1);

        System.out.println("\nClass Roster:");

        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + ": " + student.getValue());
        }

    }
}
