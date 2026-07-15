/*
Requirements
Ask the user for the number of students.
Read all student names into a String[].
Ask the user for a name to search.
Use Linear Search.
Display:
The index if found.
"Student not found." if not found.
Bonus ⭐

Instead of printing only the index, print the student's position in a human-friendly way.

Example:

Enter student to search: Alice

Alice found as Student #1.
*/

import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numbersOfStudents;

        while (true){
            System.out.print("Enter number of Students: ");
            numbersOfStudents = input.nextInt();

            if (numbersOfStudents > 0){
                break;
            }
            System.out.println("Enter a number greater than 0");
        }

        input.nextLine();

        String[] namesOfStudents = new String[numbersOfStudents];

        for (int i =0; i < namesOfStudents.length; i++){
            System.out.print("Enter name " +(i+1) + ": ");
            namesOfStudents[i] = input.nextLine();
        }

        System.out.println();

        System.out.print("Enter the name of Student to search: ");
        String target = input.nextLine();
        int position = -1;

        for ( int i =0; i<namesOfStudents.length; i++){
            if (namesOfStudents[i].equals(target)){
                position = i+1;
            }
        }

        System.out.println();

        if(position == -1){
            System.out.println("Student not found");
        }else{
            System.out.println(target + " found as Student #" +position);
        }

        input.close();
    }
}
