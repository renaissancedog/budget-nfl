public class Match {
  Team home, away;
  public Match(Team home, Team away) {
    this.home=home;
    this.away=away;
  }
  public Team winner() {
    return home;
  }
  public String toString() {
    return home+" vs "+away;
  }
}
