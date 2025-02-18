import java.util.*;
public class Schedule {
  Match[][] sched;  
  public Schedule(Match[][] m) {
    sched=m;
  }
  public void printSched() {
    for (Match[] row:sched) {
      System.out.println(Arrays.toString(row));
    }
  }
  public void getWeek(int w) {
    Scanner s=new Scanner(System.in);
    HashMap<Integer, Integer> bets=new HashMap<>();
    HashMap<Integer, Integer> amts=new HashMap<>();
    System.out.println("Week "+(w+1));
    int i=1;
    for (Match m:sched[w]) {
      System.out.println(i+": "+m);
      i++;
    }
    System.out.print("Enter match (invalid number to skip): ");
    int opt=s.nextInt();
    while (opt>0&&opt<=sched.length) {
      System.out.print("Pick team: ");
      int team=s.nextInt();
      System.out.print("Enter amount: ");
      int amt=s.nextInt();
      bets.put(opt, team);
      amts.put(opt, amt);
      System.out.println(bets);
      System.out.print("Enter match (invalid number to skip): ");
      opt=s.nextInt();
    }
    System.out.println("=============================================");
  }
}
