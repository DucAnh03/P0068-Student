/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import java.util.ArrayList;
import model.Student;
import view.Menu;

public class Management {
    private final String[] MAIN_MENU_ITEMS ={
        " Input Student",
        " Display Student",
        " Exit",
    };
    
    Algorithm algorithm = new Algorithm();
    ArrayList<Student> st = new ArrayList<>();
    
    
    Menu mainMenu = new Menu("======== Student Program ========", MAIN_MENU_ITEMS) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    algorithm.display();
                    break;
                case 2:
                    algorithm.print();
                    break;
                    
                case 3:
                    System.exit(0);
                    break;
            }
        }
    };
    
    public void run() {
        mainMenu.run();
    }
}
