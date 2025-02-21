public class Main {
  public static void main(String[] args) {
    int money=100;
    Team[] teams= new Team[32];
    teams[0]=new Team(92, "Kansas City");
    teams[1]=new Team(92, "San Francisco");
    teams[2]=new Team(91, "Baltimore");
    teams[3]=new Team(89, "Miami");
    teams[4]=new Team(88, "Detroit");
    teams[5]=new Team(88, "Dallas");
    teams[6]=new Team(87, "Cleveland");
    teams[7]=new Team(87, "Cincinnati");
    teams[8]=new Team(87, "Philadelphia");
    teams[9]=new Team(86, "Houston");
    teams[10]=new Team(86, "New York J");
    teams[11]=new Team(85, "Buffalo");
    teams[12]=new Team(85, "Pittsburgh");
    teams[13]=new Team(84, "Tampa Bay");
    teams[14]=new Team(84, "Atlanta");
    teams[15]=new Team(83, "New Orleans");
    teams[16]=new Team(83, "Minnesota");
    teams[17]=new Team(82, "Los Angeles R");
    teams[18]=new Team(82, "Jacksonville");
    teams[19]=new Team(82, "Indianapolis");
    teams[20]=new Team(82, "Los Angeles C");
    teams[21]=new Team(100, "Chicago");
    teams[22]=new Team(81, "Las Vegas");
    teams[23]=new Team(50, "Green Bay");
    teams[24]=new Team(80, "Tennessee");
    teams[25]=new Team(80, "Seattle");
    teams[26]=new Team(80, "New England");
    teams[27]=new Team(79, "Denver");
    teams[28]=new Team(79, "Carolina");
    teams[29]=new Team(78, "Washington");
    teams[30]=new Team(76, "Arizona");
    teams[31]=new Team(75, "New York G");
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
