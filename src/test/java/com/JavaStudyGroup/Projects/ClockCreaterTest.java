package com.JavaStudyGroup.Projects;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

/**
 * Created by MikeSamsung7 on 30/12/2016.
 */
public class ClockCreaterTest {
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