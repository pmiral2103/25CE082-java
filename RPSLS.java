import java.util.Random;
import java.util.Scanner;

public class RPSLS {
enum Move{
    ROCK,PAPER,SCISSORS,LIZARD,SPOCK
}    

 static int winner(Move a,Move b)
{
    if(a==b)
    {
        return 0;
    }

    return switch(a)
    {
        case ROCK-> (b == Move.SCISSORS || b == Move.LIZARD) ? 1 : -1;
        case PAPER->(b==Move.ROCK || b==Move.SPOCK)?1: -1;
        case SCISSORS->(b==Move.PAPER || b==Move.LIZARD)?1:-1;
        case LIZARD->(b == Move.SPOCK || b == Move.PAPER) ? 1 : -1;
        case SPOCK->(b==Move.SCISSORS || b==Move.ROCK)?1:-1;
    };
}

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Random r=new Random();

    int player=0;
    int computer=0;

    for(int i=1;i<=5;i++)
    {

        System.out.println("enter your move: ");
        Move p=Move.valueOf(sc.next().toUpperCase());

        Move c=Move.values()[r.nextInt(5)];

        System.out.println("Player Move : " + p);
            System.out.println("Computer Move : " + c);
    
         int ans = winner(p, c);

            if (ans == 1) {
                System.out.println("You Win This Round");
                player++;
            } else if (ans == -1) {
                System.out.println("Computer Wins This Round");
                computer++;
            } else {
                System.out.println("Round Tie");
            }

    }

           if (player > computer) {
            System.out.println("You Win " + player + "-" + computer);
        } else if (computer > player) {
            System.out.println("Computer Wins " + computer + "-" + player);
        } else {
            System.out.println("Match Tie");
        }
}
}
