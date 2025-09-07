package Assignment6;

public class Tickets {
    public  void ticketEscalation(int level, int complexity){
        System.out.println(" Escalating ticket to Level "+level+" Support...");
        if (level==complexity){
            System.out.println("\t"+"Level Support: "+level+" Issue resolved!");
            return;
        }
        if (level==1){
            System.out.println("\t"+"Level " + level + " Support: Unable to resolve. Escalating ticket to Level "+(level+1));
        }
        else {
            System.out.println("\t" + "Level " + level + " Support: Still too complex. Escalating ticket to Level " + (level + 1));
        }
        ticketEscalation((level+1),complexity);
    }
    public  void stackTrace(int level, int complexity){
        if (level==complexity){
            System.out.println("> ticketEscalation (ticket,"+"level= "+level+") - resolves");
            System.out.println();
            return;
        }
        stackTrace((level+1),complexity);
        System.out.println("> ticketEscalation (ticket,"+"level= "+level+")");
        System.out.println();
    }
    public void ticketEscalationLoop(int level, int complexity){
        for (int i = level;i<complexity;i++) {
            System.out.println(" Escalating ticket to Level "+i+" Support...");
            if (i == 1) {
                System.out.println("\t" + "Level " + i + " Support: Unable to resolve. Escalating ticket to Level " + (i + 1));
            } else {
                System.out.println("\t" + "Level " + i + " Support: Still too complex. Escalating ticket to Level " + (i + 1));
            }
            level =(i+1);
        }
        System.out.println(" Escalating ticket to Level "+level+" Support...");
        System.out.println("\t"+"Level Support: "+level+" Issue resolved!");
    }
}
