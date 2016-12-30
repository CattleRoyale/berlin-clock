package com.JavaStudyGroup.Projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by MikeSamsung7 on 30/12/2016.
 */
public class UserInput {
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getTime() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter time:");
        String userInput = null;
        try {
            userInput = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userInput;

    }
    public boolean validateInput(String userInput){

        if(userInput.length()==9) {
            Pattern pattern;
            Matcher matcher;

            String inputPattern = "^([0-1]?[0-9]|[2][0-3])::([0-5][0-9])(:[0-5][0-9])?$";

            pattern = Pattern.compile(inputPattern);
            matcher = pattern.matcher(userInput);
            return matcher.matches();
        }
        else{
            return false;
        }
    }
}
