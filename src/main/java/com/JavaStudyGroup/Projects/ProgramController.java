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

        // Create ClockCreater object
        System.out.println("Creating clock object...");
        ClockCreater clock = new ClockCreater(userInput);
        System.out.println("Clock object created...");

        // Initialise values
        System.out.println("Initialising clock values...");
        clock.initialiseValues();

        // Render clock in console:
        System.out.println("Drawing clock...");
        RenderClock render = new RenderClockWindow(clock);
        render.drawClock();
        System.out.println("Clock created successfully.");

    }
}
