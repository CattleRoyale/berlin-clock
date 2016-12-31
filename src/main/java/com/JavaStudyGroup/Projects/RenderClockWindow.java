package com.JavaStudyGroup.Projects;

import java.awt.*;
import javax.swing.*;

/**
 * Created by MikeSamsung7 on 31/12/2016.
 */
public class RenderClockWindow implements RenderClock {

    private ClockCreater clock;
    public RenderClockWindow(ClockCreater clock){
        this.clock = clock;
    }

    public void drawClock() {

        JFrame frame = new JFrame();
        JTextArea area = new JTextArea();
        area.setFont(new Font("Courier New", Font.BOLD, 24));

        //  Draw Seconds:

        area.append("\n");
        area.append("                 * *\n");
        area.append("               *     *\n");
        area.append("              *   " + clock.getDisplaySeconds() + "   *\n");
        area.append("               *     *\n");
        area.append("                 * *\n");

        //  Draw Hours Row 1:
        area.append(" ╔═══════╗╔═══════╗╔═══════╗╔═══════╗\n");
        area.append(" ║   " + clock.getDisplayHoursRow1()[0] +
                "   ║║   " + clock.getDisplayHoursRow1()[1] +
                "   ║║   " + clock.getDisplayHoursRow1()[2] +
                "   ║║   " + clock.getDisplayHoursRow1()[3] +
                "   ║\n");
        area.append(" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝\n");

        //  Draw Hours Row 2:
        area.append(" ╔═══════╗╔═══════╗╔═══════╗╔═══════╗\n");
        area.append(" ║   " + clock.getDisplayHoursRow2()[0] +
                "   ║║   " + clock.getDisplayHoursRow2()[1] +
                "   ║║   " + clock.getDisplayHoursRow2()[2] +
                "   ║║   " + clock.getDisplayHoursRow2()[3] +
                "   ║\n");
        area.append(" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝\n");


        //  Draw Minutes Row 1:

        area.append(" ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗\n");
        area.append(" ║"+ clock.getDisplayMinutesRow1()[0] +
                "║║"+ clock.getDisplayMinutesRow1()[1] +
                "║║"+ clock.getDisplayMinutesRow1()[2] +
                "║ ║"+ clock.getDisplayMinutesRow1()[3] +
                "║║"+ clock.getDisplayMinutesRow1()[4] +
                "║║"+ clock.getDisplayMinutesRow1()[5] +
                "║ ║"+ clock.getDisplayMinutesRow1()[6] +
                "║║"+ clock.getDisplayMinutesRow1()[7] +
                "║║"+ clock.getDisplayMinutesRow1()[8] +
                "║ ║"+ clock.getDisplayMinutesRow1()[9] +
                "║║"+ clock.getDisplayMinutesRow1()[10] +"║\n"
        );
        area.append(" ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝\n");



        //  Draw Minutes Row 2:

        area.append(" ╔═══════╗╔═══════╗╔═══════╗╔═══════╗\n");
        area.append(" ║   " + clock.getDisplayMinutesRow2()[0] +
                "   ║║   " + clock.getDisplayMinutesRow2()[1] +
                "   ║║   " + clock.getDisplayMinutesRow2()[2] +
                "   ║║   " + clock.getDisplayMinutesRow2()[3] +
                "   ║\n");
        area.append(" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝\n");


        frame.add(area);
        frame.setSize(560,560);
        frame.setTitle("Berlin Clock for " + clock.getTime());
        frame.setVisible(true);



    }
}
