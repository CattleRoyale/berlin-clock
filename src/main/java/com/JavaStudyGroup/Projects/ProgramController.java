package com.JavaStudyGroup.Projects;

/**
 * Created by MikeSamsung7 on 30/12/2016.
 */
public class ProgramController {

    public static void main(String[] args) {

        UserInput ui = new UserInput();
        String userInput = "";

        userInput = ui.getTime();

        // Validate input is in the correct format
        while (!ui.validateInput(userInput)){
            System.out.println("The time is in the incorrect format.");
            System.out.println("Please enter in format hh::mm:ss");
            userInput = ui.getTime();
        }


    }
}