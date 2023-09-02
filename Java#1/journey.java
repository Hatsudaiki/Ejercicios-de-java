public class journey {
    private int journeyid;
    private int dutyid;
    private String direction;
    private String actualstarttime;
    private String scheduledstarttime;
    private String finishtime;
    private String startstage;
    private String finishstage;
    private String totaltime;
    private String starthour;

    public journey(int journeyid, int dutyid, String direction, String actualstarttime, String scheduledstarttime,
            String finishtime, String startstage, String finishstage, String totaltime, String starthour) {
        this.journeyid = journeyid;
        this.dutyid = dutyid;
        this.direction = direction;
        this.actualstarttime = actualstarttime;
        this.scheduledstarttime = scheduledstarttime;
        this.finishtime = finishtime;
        this.startstage = startstage;
        this.finishstage = finishstage;
        this.totaltime = totaltime;
        this.starthour = starthour;
    }

    public int getJourneyid() {
        return this.journeyid;
    }

    public int getDutyid() {
        return this.dutyid;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getActualstarttime() {
        return this.actualstarttime;
    }

    public String getSheduledstarttime() {
        return this.scheduledstarttime;
    }

    public String getFinishtime() {
        return this.finishtime;
    }

    public String getStarstage() {
        return this.startstage;
    }

    public String getFinishstage() {
        return this.finishstage;
    }

    public String getTotaltime() {
        return this.totaltime;
    }

    public String getStarthour() {
        return this.starthour;
    }

    public void setJourneyid(int journeyid) {
        this.journeyid = journeyid;
    }

    public void setDutyid(int dutyid) {
        this.dutyid = dutyid;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setActualstarttime(String actualstarttime) {
        this.actualstarttime = actualstarttime;
    }

    public void setScheduledstarttime(String scheduledstarttime) {
        this.scheduledstarttime = scheduledstarttime;
    }

    public void setFinishtime(String finishtime) {
        this.finishtime = finishtime;
    }

    public void setStartstage(String startstage) {
        this.startstage = startstage;
    }

    public void setfinishstage(String finishstage) {
        this.finishstage = finishstage;
    }

    public void setTotaltime(String totaltime) {
        this.totaltime = totaltime;
    }

    public void setStarthour(String starthour) {
        this.starthour = starthour;
    }

}
