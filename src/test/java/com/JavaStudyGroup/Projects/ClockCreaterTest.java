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
    public void createHours_13_09_53() throws Exception {
        ClockCreater clock = new ClockCreater("13::09:53");
        clock.createHours();
        char[] hoursRow1 = clock.getDisplayHoursRow1();
        char[] hoursRow2 = clock.getDisplayHoursRow2();
        assertThat(hoursRow1[0], is('R'));
        assertThat(hoursRow1[1], is('R'));
        assertThat(hoursRow1[2], is('O'));
        assertThat(hoursRow1[3], is('O'));

        assertThat(hoursRow2[0], is('R'));
        assertThat(hoursRow2[1], is('R'));
        assertThat(hoursRow2[2], is('R'));
        assertThat(hoursRow2[3], is('O'));
    }

    @Test
    public void createHours_00_00_00() throws Exception {
        ClockCreater clock = new ClockCreater("00::00:00");
        clock.createHours();
        char[] hoursRow1 = clock.getDisplayHoursRow1();
        char[] hoursRow2 = clock.getDisplayHoursRow2();
        assertThat(hoursRow1[0], is('O'));
        assertThat(hoursRow1[1], is('O'));
        assertThat(hoursRow1[2], is('O'));
        assertThat(hoursRow1[3], is('O'));

        assertThat(hoursRow2[0], is('O'));
        assertThat(hoursRow2[1], is('O'));
        assertThat(hoursRow2[2], is('O'));
        assertThat(hoursRow2[3], is('O'));
    }

    @Test
    public void createHours_23_45_19() throws Exception {
        ClockCreater clock = new ClockCreater("23::45:19");
        clock.createHours();
        char[] hoursRow1 = clock.getDisplayHoursRow1();
        char[] hoursRow2 = clock.getDisplayHoursRow2();
        assertThat(hoursRow1[0], is('R'));
        assertThat(hoursRow1[1], is('R'));
        assertThat(hoursRow1[2], is('R'));
        assertThat(hoursRow1[3], is('R'));

        assertThat(hoursRow2[0], is('R'));
        assertThat(hoursRow2[1], is('R'));
        assertThat(hoursRow2[2], is('R'));
        assertThat(hoursRow2[3], is('O'));
    }

    @Test
    public void createMinutes_23_45_19() throws Exception {
        ClockCreater clock = new ClockCreater("23::45:19");
        clock.createMinutes();
        char[] minutesRow1 = clock.getDisplayMinutesRow1();
        char[] minutesRow2 = clock.getDisplayMinutesRow2();
        assertThat(minutesRow1[0], is('Y'));
        assertThat(minutesRow1[1], is('Y'));
        assertThat(minutesRow1[2], is('R'));
        assertThat(minutesRow1[3], is('Y'));
        assertThat(minutesRow1[4], is('Y'));
        assertThat(minutesRow1[5], is('R'));
        assertThat(minutesRow1[6], is('Y'));
        assertThat(minutesRow1[7], is('Y'));
        assertThat(minutesRow1[8], is('R'));
        assertThat(minutesRow1[9], is('O'));
        assertThat(minutesRow1[10], is('O'));

        assertThat(minutesRow2[0], is('O'));
        assertThat(minutesRow2[1], is('O'));
        assertThat(minutesRow2[2], is('O'));
        assertThat(minutesRow2[3], is('O'));

    }

    @Test
    public void createMinutes_23_00_19() throws Exception {
        ClockCreater clock = new ClockCreater("23::00:19");
        clock.createMinutes();
        char[] minutesRow1 = clock.getDisplayMinutesRow1();
        char[] minutesRow2 = clock.getDisplayMinutesRow2();
        assertThat(minutesRow1[0], is('O'));
        assertThat(minutesRow1[1], is('O'));
        assertThat(minutesRow1[2], is('O'));
        assertThat(minutesRow1[3], is('O'));
        assertThat(minutesRow1[4], is('O'));
        assertThat(minutesRow1[5], is('O'));
        assertThat(minutesRow1[6], is('O'));
        assertThat(minutesRow1[7], is('O'));
        assertThat(minutesRow1[8], is('O'));
        assertThat(minutesRow1[9], is('O'));
        assertThat(minutesRow1[10], is('O'));

        assertThat(minutesRow2[0], is('O'));
        assertThat(minutesRow2[1], is('O'));
        assertThat(minutesRow2[2], is('O'));
        assertThat(minutesRow2[3], is('O'));

    }

    @Test
    public void createMinutes_23_59_19() throws Exception {
        ClockCreater clock = new ClockCreater("23::59:19");
        clock.createMinutes();
        char[] minutesRow1 = clock.getDisplayMinutesRow1();
        char[] minutesRow2 = clock.getDisplayMinutesRow2();
        assertThat(minutesRow1[0], is('Y'));
        assertThat(minutesRow1[1], is('Y'));
        assertThat(minutesRow1[2], is('R'));
        assertThat(minutesRow1[3], is('Y'));
        assertThat(minutesRow1[4], is('Y'));
        assertThat(minutesRow1[5], is('R'));
        assertThat(minutesRow1[6], is('Y'));
        assertThat(minutesRow1[7], is('Y'));
        assertThat(minutesRow1[8], is('R'));
        assertThat(minutesRow1[9], is('Y'));
        assertThat(minutesRow1[10], is('Y'));

        assertThat(minutesRow2[0], is('Y'));
        assertThat(minutesRow2[1], is('Y'));
        assertThat(minutesRow2[2], is('Y'));
        assertThat(minutesRow2[3], is('Y'));

    }

    @Test
    public void testExample1_10_13_00() throws Exception {
        ClockCreater clock = new ClockCreater("10::13:00");
        clock.createHours();
        clock.createMinutes();
        clock.createSeconds();

        char[] hoursRow1 = clock.getDisplayHoursRow1();
        char[] hoursRow2 = clock.getDisplayHoursRow2();
        char[] minutesRow1 = clock.getDisplayMinutesRow1();
        char[] minutesRow2 = clock.getDisplayMinutesRow2();

        assertThat(clock.getDisplaySeconds(), is ('Y'));

        assertThat(hoursRow1[0], is('R'));
        assertThat(hoursRow1[1], is('R'));
        assertThat(hoursRow1[2], is('O'));
        assertThat(hoursRow1[3], is('O'));

        assertThat(hoursRow2[0], is('O'));
        assertThat(hoursRow2[1], is('O'));
        assertThat(hoursRow2[2], is('O'));
        assertThat(hoursRow2[3], is('O'));

        assertThat(minutesRow1[0], is('Y'));
        assertThat(minutesRow1[1], is('Y'));
        assertThat(minutesRow1[2], is('O'));
        assertThat(minutesRow1[3], is('O'));
        assertThat(minutesRow1[4], is('O'));
        assertThat(minutesRow1[5], is('O'));
        assertThat(minutesRow1[6], is('O'));
        assertThat(minutesRow1[7], is('O'));
        assertThat(minutesRow1[8], is('O'));
        assertThat(minutesRow1[9], is('O'));
        assertThat(minutesRow1[10], is('O'));

        assertThat(minutesRow2[0], is('Y'));
        assertThat(minutesRow2[1], is('Y'));
        assertThat(minutesRow2[2], is('Y'));
        assertThat(minutesRow2[3], is('O'));

    }

    @Test
    public void testExample2_17_37_01() throws Exception {
        ClockCreater clock = new ClockCreater("17::37:01");
        clock.createHours();
        clock.createMinutes();
        clock.createSeconds();

        char[] hoursRow1 = clock.getDisplayHoursRow1();
        char[] hoursRow2 = clock.getDisplayHoursRow2();
        char[] minutesRow1 = clock.getDisplayMinutesRow1();
        char[] minutesRow2 = clock.getDisplayMinutesRow2();

        assertThat(clock.getDisplaySeconds(), is ('O'));

        assertThat(hoursRow1[0], is('R'));
        assertThat(hoursRow1[1], is('R'));
        assertThat(hoursRow1[2], is('R'));
        assertThat(hoursRow1[3], is('O'));

        assertThat(hoursRow2[0], is('R'));
        assertThat(hoursRow2[1], is('R'));
        assertThat(hoursRow2[2], is('O'));
        assertThat(hoursRow2[3], is('O'));

        assertThat(minutesRow1[0], is('Y'));
        assertThat(minutesRow1[1], is('Y'));
        assertThat(minutesRow1[2], is('R'));
        assertThat(minutesRow1[3], is('Y'));
        assertThat(minutesRow1[4], is('Y'));
        assertThat(minutesRow1[5], is('R'));
        assertThat(minutesRow1[6], is('Y'));
        assertThat(minutesRow1[7], is('O'));
        assertThat(minutesRow1[8], is('O'));
        assertThat(minutesRow1[9], is('O'));
        assertThat(minutesRow1[10], is('O'));

        assertThat(minutesRow2[0], is('Y'));
        assertThat(minutesRow2[1], is('Y'));
        assertThat(minutesRow2[2], is('O'));
        assertThat(minutesRow2[3], is('O'));

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