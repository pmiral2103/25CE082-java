import java.util.Scanner;

public class Vendingmachine{
enum Coin{
    ONE,TWO,FIVE,TEN
}


public static void main(String args[])
{

    int price=15;
    int total=0;

    Scanner sc=new Scanner(System.in);

    while(total<price)
    {
        System.out.print("enter coin:");
        Coin c=Coin.valueOf(sc.next().toUpperCase());
        
        switch(c)
        {
         case ONE-> total+=1;
         case TWO-> total+=2;
         case FIVE-> total+=5;
         case TEN-> total+=10;
        }
        System.out.println("total: "+total);
    }
    System.out.println("paid charge: "+(total-price));
}
}