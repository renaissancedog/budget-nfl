public class RoundRobin {
  public Match[][] generate(Team[] teams) {
    Match[][] schedule=new Match[teams.length-1][teams.length/2];
    Team fixed=teams[0];
    Team[] moving=new Team[teams.length-1];
    for (int i=1; i<teams.length; i++) {
      moving[i-1]=teams[i];
    }
    int target=teams.length-1;
    for (int i=0; i<teams.length-1; i++) {
      schedule[i][0]=new Match(fixed, moving[0]);
      for (int j=1; j<=(teams.length/2)-1; j++) {
        schedule[i][j]=new Match(moving[j], moving[target-j]);
      }
      Team cache=moving[moving.length-1];
      for (int j=moving.length-1; j>0; j--) {
        moving[j]=moving[j-1];
      }
      moving[0]=cache;
    }
    return schedule;
  }
}