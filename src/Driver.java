import java.util.*;
import java.io.*;

public class Driver
{
    public static void main(String args[]) {
        {
            System.out.println("Select a Vending Machine:");
            System.out.println();
            // driver for Vending Machine 1
            VM_1 vm1 = new VM_1();
            int p;
            float v;
            int n;
            float x;
            System.out.print(" Vending Machine-1");
            System.out.print("\n");
            System.out.print(" MENU of Operations");
            System.out.print("\n");
            System.out.print(" 0. create(int)");
            System.out.print("\n");
            System.out.print(" 1. coin(int)");
            System.out.print("\n");
            System.out.print(" 2. sugar()");
            System.out.print("\n");
            System.out.print(" 3. tea()");
            System.out.print("\n");
            System.out.print(" 4. latte()");
            System.out.print("\n");
            System.out.print(" 5. insert_cups(int)");
            System.out.print("\n");
            System.out.print(" 6. set_price(float)");
            System.out.print("\n");
            System.out.print(" 7. cancel()");
            System.out.print("\n");
            System.out.print(" q. Quit the demo program");
            System.out.print("\n");
            System.out.print(" Please make a note of these operations");
            System.out.print("\n");
            System.out.print(" Vending Machine-1 Execution");
            System.out.print("\n");

            char ch = 1;
            Scanner sc = new Scanner(System.in);
            while (ch != 'q') {
                System.out.print(" Select Operation: ");
                System.out.print("\n");
                System.out.print("0-create,1-coin,2-sugar,3-tea,4-latte,5-insert_cups,6-set_price,7-cancel");
                System.out.print("\n");

                ch = sc.next().charAt(0);
                switch (ch) {
                    case '0': //create
                        System.out.print(" Operation: create(int p)\n");
                        System.out.print(" Enter value of parameter p:\n");
                        p = sc.nextInt();
                        vm1.create(p);
                        break;
                    case '1': //coin
                        System.out.print(" Operation: coin(float v)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter v:");
                        System.out.print("\n");
                        v = sc.nextInt();
                        vm1.coin(v);
                        break;
                    case '2': //sugar
                        System.out.print(" Operation: sugar()");
                        System.out.print("\n");
                        vm1.sugar();
                        break;
                    case '3': // tea
                        System.out.print(" Operation: tea()");
                        System.out.print("\n");
                        vm1.tea();
                        break;
                    case '4': // latte
                        System.out.print(" Operation: latte()");
                        System.out.print("\n");
                        vm1.latte();
                        break;
                    case '5': // insert_cups
                        System.out.print(" Operation: insert_cups(int n)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter n:");
                        System.out.print("\n");
                        n = sc.nextInt();
                        vm1.insert_cups(n);
                        break;
                    case '6': // set_price
                        System.out.print(" Operation: set_price(float v)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter v:");
                        System.out.print("\n");
                        v = sc.nextInt();
                        vm1.set_price(v);
                        break;
                    case '7': // cancel
                        System.out.print(" Operation: cancel()");
                        System.out.print("\n");
                        vm1.cancel();
                        break;
                    default: // invalid input
                        System.out.println("Please choose an option from the operations menu.");
                        break;
                } // end switch
            } // end while
        } // end VM-1
    }
}