public class Eden {
    protected int protected_score;
    protected int people_trust_score;

    public int getProtected_score() {
        return this.protected_score;
    }

    public void setProtected_score(int protected_score) {
        this.protected_score = protected_score;
    }

    public int getPeople_trust_score() {
        return this.people_trust_score;
    }

    public void setPeople_trust_score(int people_trust_score) {
        this.people_trust_score = people_trust_score;
    }
    
    public Eden(int protected_score, int people_trust_score){
        this.protected_score = protected_score;
        this.people_trust_score = people_trust_score;
    }
    
}
