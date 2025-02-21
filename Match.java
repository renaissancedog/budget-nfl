public class Match {
  Team home, away;
  public Match(Team home, Team away) {
    this.home=home;
    this.away=away;
  }
  public int winner() {
    int homeOvr=home.ovr;
    int awayOvr=away.ovr;
    int x=homeOvr-awayOvr;
    double rand=Math.random();
    double prob=1/(1+Math.pow(10,(-1.0*x/20))); //probability of home team winning
    if (rand>prob) {return 1;} else {return 0;}
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
