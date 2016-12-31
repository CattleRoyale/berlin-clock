package com.JavaStudyGroup.Projects;


/**
 * Created by MikeSamsung7 on 31/12/2016.
 */
public class RenderClockConsole implements RenderClock {

    private ClockCreater clock;
    public RenderClockConsole(ClockCreater clock){
        this.clock = clock;
    }

    public void drawClock() {

        //  Draw Seconds:

        System.out.println("                 * *");
        System.out.println("               *     *");
        System.out.println("              *   " + clock.getDisplaySeconds() + "   *");
        System.out.println("               *     *");
        System.out.println("                 * *");

        //  Draw Hours Row 1:
        System.out.println("╔════╗╔════╗╔════╗╔════╗");
        System.out.println("║   " + clock.getDisplayHoursRow1()[0] +
                "  ║║   " + clock.getDisplayHoursRow1()[1] +
                "  ║║   " + clock.getDisplayHoursRow1()[2] +
                "  ║║   " + clock.getDisplayHoursRow1()[3] +
                "  ║");
        System.out.println("╚════╝╚════╝╚════╝╚════╝");

        //  Draw Hours Row 2:
        System.out.println("╔════╗╔════╗╔════╗╔════╗");
        System.out.println("║   " + clock.getDisplayHoursRow2()[0] +
                "  ║║   " + clock.getDisplayHoursRow2()[1] +
                "  ║║   " + clock.getDisplayHoursRow2()[2] +
                "  ║║   " + clock.getDisplayHoursRow2()[3] +
                "  ║");
        System.out.println("╚════╝╚════╝╚════╝╚════╝");

        //  Draw Minutes Row 1:

        System.out.println("╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗");
        System.out.println("║"+ clock.getDisplayMinutesRow1()[0] +
                "║"+ clock.getDisplayMinutesRow1()[1] +
                "║"+ clock.getDisplayMinutesRow1()[2] +
                "║"+ clock.getDisplayMinutesRow1()[3] +
                "║"+ clock.getDisplayMinutesRow1()[4] +
                "║"+ clock.getDisplayMinutesRow1()[5] +
                "║"+ clock.getDisplayMinutesRow1()[6] +
                "║"+ clock.getDisplayMinutesRow1()[7] +
                "║"+ clock.getDisplayMinutesRow1()[8] +
                "║"+ clock.getDisplayMinutesRow1()[9] +
                "║"+ clock.getDisplayMinutesRow1()[10] +"║"
        );
        System.out.println("╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝");



        //  Draw Minutes Row 2:

        System.out.println("╔════╗╔════╗╔════╗╔════╗");
        System.out.println("║   " + clock.getDisplayMinutesRow2()[0] +
                "  ║║   " + clock.getDisplayMinutesRow2()[1] +
                "  ║║   " + clock.getDisplayMinutesRow2()[2] +
                "  ║║   " + clock.getDisplayMinutesRow2()[3] +
                "  ║");
        System.out.println("╚════╝╚════╝╚════╝╚════╝");



    }

}
