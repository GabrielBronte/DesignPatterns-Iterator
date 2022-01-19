public class Viewer {

    private String name;
    private String chairId;
    private boolean hasPaidTicket;

    public Viewer(String name, String chairId, boolean hasPaidTicket) {
        this.name = name;
        this.chairId = chairId;
        this.hasPaidTicket = hasPaidTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getChairId() {
        return chairId;
    }   

    public void setChairId(String chairId) {
        this.chairId = chairId;
    }

    public boolean getHasPaidTicket() {
        return hasPaidTicket;
    }

    public void setHasPaidTicket(boolean hasPaidTicket) {
        this.hasPaidTicket = hasPaidTicket;
    }
}