// This is the driver to interact with the vending machines
import java.util.Scanner;
import java.io.*;

import AbstractFactory.*;
import OP_Strategy.*;
import State.*;
import DataStore.*;


public class Driver {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option;
        String input = null;
        char ch = 1;

        // loop until a valid vending machine is chosen (1 or 2)
        while (true) {
            System.out.println("Choose a vending machine:");
            System.out.println("1. Vending Machine 1");
            System.out.println("2. Vending Machine 2");
            input = br.readLine();
            try {
                option = Integer.parseInt(input);
                if (option == 1 || option == 2) {
                    break;
                }
                else {
                    System.out.println("Please enter 1 or 2 to choose a vending machine.\n");
                }
            }
            catch (Exception e){
                System.out.println("Please enter 1 or 2 to choose a vending machine.\n");
                continue;
            } // end catch
        } // end while

        // vending machine 1 options
        if (option == 1) {
            VM1_Factory af1 = new VM1_Factory();
            DataStore d = af1.getDataStore();
            OP op = new OP(af1, d);
            MDA_EFSM m = new MDA_EFSM(op);
            VM_1 vm1 = new VM_1(m, d);

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

            while (ch != 'q') {
                System.out.print(" Select Operation: ");
                System.out.print("\n");
                System.out.print("0-create,1-coin,2-sugar,3-tea,4-latte,5-insert_cups,6-set_price,7-cancel,q-Quit");
                System.out.print("\n");
                ch = scan.next().charAt(0);
                switch (ch) {
                    case '0': // create
                        System.out.print(" Operation: create(int p)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter p:");
                        System.out.print("\n");
                        p = scan.nextInt();
                        vm1.create(p);
                        break;
                    case '1': // coin
                        System.out.print(" Operation: coin(float v)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter v:");
                        System.out.print("\n");
                        v = scan.nextInt();
                        vm1.coin(v);
                        break;
                    case '2': // sugar
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
                        n = scan.nextInt();
                        vm1.insert_cups(n);
                        break;
                    case '6': // set_price
                        System.out.print(" Operation: set_price(float v)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter v:");
                        System.out.print("\n");
                        x = scan.nextFloat();
                        vm1.set_price(x);
                        break;
                    case '7': // cancel
                        System.out.print(" Operation: cancel()");
                        System.out.print("\n");
                        vm1.cancel();
                        break;
                    case 'q': // quit
                        System.out.print("Quitting the Vending Machine Demo\n");
                        break;
                    default:    // invalid input
                        System.out.println("Please choose an option from the operation menu.\n");
                        break;
                } // end switch
            } //end while
        } // end if for VM 1 options

        if (option == 2) {
            // vending machine 2 options
            VM2_Factory af2 = new VM2_Factory();
            DataStore d = af2.getDataStore();
            OP op = new OP(af2, d);
            MDA_EFSM m = new MDA_EFSM(op);
            VM_2 vm2 = new VM_2(m, d);

            float p;
            int v;
            int n;
            int x;

            System.out.print(" Vending Machine-2");
            System.out.print("\n");
            System.out.print(" MENU of Operations");
            System.out.print("\n");
            System.out.print(" 0. CREATE(float)");
            System.out.print("\n");
            System.out.print(" 1. COIN(int)");
            System.out.print("\n");
            System.out.print(" 2. CARD(int)");
            System.out.print("\n");
            System.out.print(" 3. SUGAR()");
            System.out.print("\n");
            System.out.print(" 4. CREAM()");
            System.out.print("\n");
            System.out.print(" 5. COFFEE()");
            System.out.print("\n");
            System.out.print(" 6. InsertCups(int)");
            System.out.print("\n");
            System.out.print(" 7. SetPrice(int)");
            System.out.print("\n");
            System.out.print(" 8. CANCEL()");
            System.out.print("\n");
            System.out.print(" q. Quit the demo program");
            System.out.print("\n");
            System.out.print(" Please make a note of these operations");
            System.out.print("\n");
            System.out.print(" Vending Machine-2 Execution");
            System.out.print("\n");

            while (ch != 'q') {
                System.out.print(" Select Operation: ");
                System.out.print("\n");
                System.out.print("0-CREATE,1-COIN,2-CARD,3-SUGAR,4-CREAM,5-COFFEE,6-InsertCups,7-SetPrice,8-CANCEL,q-Quit");
                System.out.print("\n");
                ch = scan.next().charAt(0);
                switch (ch) {
                    case '0': // CREATE
                        System.out.print(" Operation: CREATE(float p)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter p:");
                        System.out.print("\n");
                        p = scan.nextFloat();
                        vm2.CREATE(p);
                        break;
                    case '1': // COIN
                        System.out.print(" Operation: COIN(int v)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter v:");
                        System.out.print("\n");
                        v = scan.nextInt();
                        vm2.COIN(v);
                        break;
                    case '2': // CARD
                        System.out.print(" Operation: CARD()");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter x:\n");
                        x = scan.nextInt();
                        vm2.CARD(x);
                        break;
                    case '3': // SUGAR
                        System.out.print(" Operation: SUGAR()");
                        System.out.print("\n");
                        vm2.SUGAR();
                        break;
                    case '4': // CREAM
                        System.out.print(" Operation: CREAM()");
                        System.out.print("\n");
                        vm2.CREAM();
                        break;
                    case '5': // COFFEE
                        System.out.print(" Operation: COFFEE()");
                        System.out.print("\n");
                        vm2.COFFEE();
                        break;
                    case '6': // InsertCups
                        System.out.print(" Operation: InsertCups(int n)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter n:");
                        System.out.print("\n");
                        n = scan.nextInt();
                        vm2.InsertCups(n);
                        break;
                    case '7': // SetPrice
                        System.out.print(" Operation: SetPrice(int p)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter p:");
                        System.out.print("\n");
                        // p is a float so I will use v
                        v = scan.nextInt();
                        vm2.SetPrice(v);
                        break;
                    case '8': // CANCEL
                        System.out.print(" Operation: CANCEL()");
                        System.out.print("\n");
                        vm2.CANCEL();
                        break;
                    case 'q': // quit
                        System.out.print("Quitting the Vending Machine Demo\n");
                        break;
                    default:    // invalid input
                        System.out.println("Please choose an option from the operation menu.\n");
                } // end switch
            } //end while
        } // end if for VM 2 options
    }
}