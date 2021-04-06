
import java.util.Scanner;
public class testCalculator{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Calculator c = new Calculator();
        HexCalc h = new HexCalc();
        System.out.println("Would you like to do calculations with decimal or hexadecimal numbers(1 for Decimal, 2 for Hexadecimal)");
        int choice = input.nextInt();
        while(true){
          if (choice == 1) {
            System.out.println("\n---MENU---");
            System.out.println("0- - Exit" + "\n1- Addition" + "\n2- Subtraction " + "\n3- - Multiplication" + "\n4- - Division" +
                    "\nPlease choose an option: ");
            int option = input.nextInt();
            switch(option){
                case 0:
                    System.out.println("You chose to Exit> You chose to Exit> THANK YOU! GOOD BYE!!!");
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Please enter the first number");
                    int p1 = input.nextInt();
                    System.out.println("Please enter the second number");
                    int p2 = input.nextInt();
                    System.out.println(c.add(p1, p2));
                    break;

                case 2:
                    System.out.println("Please enter the first number");
                    int v1 = input.nextInt();
                    System.out.println("Please enter the second number");
                    int v2 = input.nextInt();
                    System.out.println(c.subtract(v1,v2));
                    break;

                case 3:
                    System.out.println("Please enter the first number");
                    int x1 = input.nextInt();
                    System.out.println("Please enter the second number");
                    int x2 = input.nextInt();
                    System.out.println(c.multiply(x1, x2));
                    break;

                case 4:
                    System.out.println("Please enter the first number");
                    int y1 = input.nextInt();
                    System.out.println("Please enter the second number");
                    int y2 = input.nextInt();
                    System.out.println(c.divide(y1,y2));
                    break;

                default:
                    System.out.println("Wrong input");
            }
        }
          
          if (choice == 2){
            System.out.println("\n---MENU---");
            System.out.println("0- - Exit" + "\n1- Addition" + "\n2- Subtraction " + "\n3- - Multiplication" + "\n4- - Division" +
                    "\nPlease choose an option: ");
            int option = input.nextInt();
            switch(option){
              case 0:
                    System.out.println("You chose to Exit> You chose to Exit> THANK YOU! GOOD BYE!!!");
                    System.exit(0);
                    break;

              case 1:
                System.out.println("Please enter the first hexadecimal number");
                String p1 = input.next();
                int p1a = c.hexToDec(p1);
                System.out.println("Please enter the first hexadecimal number");
                String p2 = input.next();
                int p2a = c.hexToDec(p2);
                System.out.println(h.hextoDec(c.add(p1a, p2a)));
                break;
                
              case 2:
                System.out.println("Please enter the first hexadecimal number");
                String v1 = input.next();
                int v1a = c.hexToDec(v1);
                System.out.println("Please enter the first hexadecimal number");
                String v2 = input.next();
                int v2a = c.hexToDec(v2);
                System.out.println(h.hextoDec(c.subtract(v1a, v2a)));
                break;
                
               case 3:
               System.out.println("Please enter the first hexadecimal number");
                String x1 = input.next();
                int x1a = c.hexToDec(x1);
                System.out.println("Please enter the first hexadecimal number");
                String x2 = input.next();
                int x2a = c.hexToDec(x2);
                System.out.println(h.hextoDec(c.multiply(x1a, x2a)));
                break;
                
                case 4:
                System.out.println("Please enter the first hexadecimal number");
                String y1 = input.next();
                int y1a = c.hexToDec(y1);
                System.out.println("Please enter the first hexadecimal number");
                String y2 = input.next();
                int y2a = c.hexToDec(y2);
                System.out.println(h.hextoDec(c.divide(y1a, y2a)));
                 break;
                 
               default:
                    System.out.println("Wrong input");
            }
            
          }
    }
}
}
