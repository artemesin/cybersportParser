public class UpcommingMatch {
    private String nameLeftTeam;
    private String naleRightTeam;

    public UpcommingMatch(String nameLeftTeam, String naleRightTeam) {
        this.nameLeftTeam = nameLeftTeam;
        this.naleRightTeam = naleRightTeam;
    }

    public String getNameLeftTeam() {
        return nameLeftTeam;
    }

    public String getNaleRightTeam() {
        return naleRightTeam;
    }

    public void setNameLeftTeam(String nameLeftTeam) {
        this.nameLeftTeam = nameLeftTeam;
    }

    public void setNaleRightTeam(String naleRightTeam) {
        this.naleRightTeam = naleRightTeam;
    }
}
