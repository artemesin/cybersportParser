public class PreveousMatch {
    private int scoreLeftTeam;
    private int scoreRightTeam;
    private String nameLeftTeam;
    private String nameRightTeam;

    public PreveousMatch(int scoreLeftTeam, int scoreRightTeam, String nameLeftTeam, String nameRightTeam) {
        this.scoreLeftTeam = scoreLeftTeam;
        this.scoreRightTeam = scoreRightTeam;
        this.nameLeftTeam = nameLeftTeam;
        this.nameRightTeam = nameRightTeam;
    }

    public void setScoreLeftTeam(int scoreLeftTeam) {
        this.scoreLeftTeam = scoreLeftTeam;
    }

    public void setScoreRightTeam(int scoreRightTeam) {
        this.scoreRightTeam = scoreRightTeam;
    }

    public void setNameLeftTeam(String nameLeftTeam) {
        this.nameLeftTeam = nameLeftTeam;
    }

    public void setNameRightTeam(String nameRightTeam) {
        this.nameRightTeam = nameRightTeam;
    }

    public int getScoreLeftTeam() {
        return scoreLeftTeam;
    }

    public int getScoreRightTeam() {
        return scoreRightTeam;
    }

    public String getNameLeftTeam() {
        return nameLeftTeam;
    }

    public String getNameRightTeam() {
        return nameRightTeam;
    }

}
