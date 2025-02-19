import java.util.*;
public class Schedule {
  static Match[][] sched;  
  static HashMap<Integer, Integer> bets=new HashMap<>();
  static HashMap<Integer, Integer> amts=new HashMap<>();
  static int won, staked;
  static Scanner s;
  public Schedule(Match[][] m) {
    sched=m;
  }
  public int getWeek(int w, int money) {
    s=new Scanner(System.in);
    won=0;
    staked=0;
    bets=new HashMap<>();
    amts=new HashMap<>();
    System.out.println("Week "+(w+1));
    int i=1;
    for (Match m:sched[w]) {
      System.out.println("Match "+i+": "+m);
      i++;
    }
    while (true) {
      System.out.print("Enter match (0 to skip): ");
      int opt=s.nextInt();
      if (opt<1&&opt>sched[w].length) {break;}
      perMatch(opt, money); 
    }
    resolve(w); 
    return won;
  }
  static void perMatch(int opt, int money) {
    System.out.print("Enter team (1 or 2): ");
    int team=s.nextInt()-1;
    System.out.print("Enter amount: ");
    int amt=s.nextInt();
    staked+=amt;
    if (staked>money) {
      System.out.println("ur broke");
      staked-=amt;
      return;
    }
    bets.put(opt-1, team);
    amts.put(opt-1, amt);
  }
  static void resolve(int w) {
    System.out.println();
    System.out.println("Week "+(w+1)+" Results:");
    for (int j=0; j<sched[w].length; j++) {
      Match m=sched[w][j];
      System.out.print(m.get(m.winner())+ " defeated "+m.get(m.loser()));
      if (bets.get(j)!=null) {
        int amt=amts.get(j);
        if (m.winner()==bets.get(j)) {
          won+=amt;
          System.out.println(" - won $"+amt);
        } else {
          won-=amt;
          System.out.println(" - lost $"+amt);
        }
      }
    }
  }
  public void printSched() {
    for (Match[] row:sched) {
      System.out.println(Arrays.toString(row));
    }
  }
}
