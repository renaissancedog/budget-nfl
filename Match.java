public class Match {
  Team home, away;
  public Match(Team home, Team away) {
    this.home=home;
    this.away=away;
  }
  public int winner() {
    return 0;
  }
  public int loser() {
    return 1-this.winner();
  }
  public Team get(int i) {
    if (i==0) {return home;}
    else if (i==1) {return away;}
    else {return null;}
  }
  public String toString() {
    return home+" vs "+away;
  }
}
