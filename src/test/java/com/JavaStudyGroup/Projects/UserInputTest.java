package com.JavaStudyGroup.Projects;

import junit.framework.TestCase;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;

/**
 * Created by MikeSamsung7 on 30/12/2016.
 */
public class UserInputTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testGetInput() throws Exception {


    }

    public void testSetInput() throws Exception {

    }

    public void testGetTime() throws Exception {

        UserInput ui = new UserInput();


    }

    @Test
    public void testValidateInput() throws Exception {
        UserInput ui = new UserInput();
        String testTime = "03::23:58";
        boolean result = ui.validateInput(testTime);
        assertEquals(true, result);
    }

}