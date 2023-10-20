
package common;

import java.util.ArrayList;
import java.util.Collections;
import model.Student;

public class Algorithm {
    Validation validation = new Validation();
    ArrayList<Student> st = new ArrayList<>();
    
    public void addStudent() {
        System.out.println("Please input student information ");
        System.out.print("Name: ");
        String name = validation.checkInputString();
        System.out.print("Mark: ");
        float mark = validation.checkInputFloat();
        System.out.print("Classes: ");
        String classes = validation.checkInputString();
        st.add(new Student(name, mark, classes));
    }
    
    public void print() {
        if (st.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(st);
        for (int i = 0; i < st.size(); i++) {
            System.out.println("--------Student " + (i+1) + "--------");
            System.out.println("Name: " + st.get(i).getName());
            System.out.println("Classes: " + st.get(i).getClasses());
            System.out.println("Mark: " + st.get(i).getMark());
        }
    }
    
    public void display() {
        addStudent();
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N): ");
            if (validation.checkInputYN()) {
                addStudent();
            } else {
                break;
            }
        }
    }
    
    
    
    
}
