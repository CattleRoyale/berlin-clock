package com.JavaStudyGroup.Projects;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

/**
 * Created by MikeSamsung7 on 30/12/2016.
 */
public class ClockCreaterTest {
    @Test
    public void createSecondsEven() throws Exception {
        ClockCreater clock = new ClockCreater("13::09:52");
        clock.createSeconds();
        assertThat(clock.getDisplaySeconds(), is ('Y'));
    }

    @Test
    public void createSecondsOdd() throws Exception {
        ClockCreater clock = new ClockCreater("13::09:53");
        clock.createSeconds();
        assertThat(clock.getDisplaySeconds(), is ('O'));
    }

    @Test
    public void createHours() throws Exception {
        ClockCreater clock = new ClockCreater("13::09:53");
        clock.createHours();
        char[] hoursRow1 = clock.getDisplayHoursRow1();
        assertThat(hoursRow1[0], is('R'));
        assertThat(hoursRow1[1], is('R'));
        assertThat(hoursRow1[2], is('O'));
        assertThat(hoursRow1[3], is('O'));

    }

    @Test
    public void createMinutes() throws Exception {

    }


    @Test
    public void getHours() throws Exception {
        ClockCreater clock = new ClockCreater("13::09:53");
        assertThat(clock.getHours(), is (13));

    }

    @Test
    public void setHours() throws Exception {

    }

    @Test
    public void getMinutes() throws Exception {

    }

    @Test
    public void setMinutes() throws Exception {

    }

    @Test
    public void getSeconds() throws Exception {

    }

    @Test
    public void setSeconds() throws Exception {

    }

}