public class Main {
  public static void main(String[] args) {
    int money=100;
    Team CHI=new Team(100, "Chicago");
    Team DET=new Team(90, "Detroit");
    Team GB=new Team(50, "Green Bay");
    Team MIN=new Team(89, "Minnesota");
    Team[] teams={CHI, DET, GB, MIN};
    RoundRobin r = new RoundRobin();
    Schedule schedule=new Schedule(r.generate(teams));
    System.out.println("========== BUDGET NFL SIMULATOR ==========");
    for (int i=0; i<teams.length-1; i++) {
      money+=schedule.getWeek(i, money);
      System.out.println("You have "+money+" dollars.");
      System.out.println("=============================================");
    }
  } 
}
