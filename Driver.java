public class Driver {
  public static void main(String[] args) {
    Team CHI=new Team(100, "Chicago");
    Team DET=new Team(90, "Detroit");
    Team GB=new Team(50, "Green Bay");
    Team MIN=new Team(89, "Minnesota");
    Team[] teams={CHI, DET, GB, MIN};
    RoundRobin r = new RoundRobin();
    r.generate(teams);
  } 
}
