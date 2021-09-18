package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int disp = 9;
    static int money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //checkmachine(water, milk, coffee, disp, money);

        while(true) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String act = scanner.next();
            if (act.equals("buy")) {
                System.out.println();
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String buycof = scanner.next();
                if(buycof.equals("back")){
                    continue;
                }else{
                    if(buycof.equals("1")){
                        if(water < 250){
                            System.out.println("Sorry, not enough water!");
                            continue;
                        } else if(coffee < 16){
                            System.out.println("Sorry, not enough coffee!");
                            continue;
                        } else if(disp < 1){
                            System.out.println("Sorry, not enough disp!");
                            continue;
                        }
                        water -= 250;
                        coffee -= 16;
                        money += 4;
                        disp -= 1;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else if (buycof.equals("2")){
                        if(water < 350){
                            System.out.println("Sorry, not enough water!");
                            continue;
                        } else if(milk < 75){
                            System.out.println("Sorry, not enough milk!");
                            continue;
                        } else if(disp < 1){
                            System.out.println("Sorry, not enough disp!");
                            continue;
                        }
                        water -= 350;
                        milk -= 75;
                        coffee -= 20;
                        money += 7;
                        disp -= 1;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else if (buycof.equals("3")){
                        if(water < 200){
                            System.out.println("Sorry, not enough water!");
                            continue;
                        } else if(milk < 100){
                            System.out.println("Sorry, not enough milk!");
                            continue;
                        } else if(coffee < 12){
                            System.out.println("Sorry, not enough coffee!");
                            continue;
                        } else if(disp < 1){
                            System.out.println("Sorry, not enough disp!");
                            continue;
                        }
                        water -= 200;
                        milk -= 100;
                        coffee -= 12;
                        money += 6;
                        disp -= 1;
                        System.out.println("I have enough resources, making you a coffee!");
                    }
                }

            } else if (act.equals("fill")) {
                System.out.println();
                System.out.println("Write how many ml of water you want to add: ");
                water += scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add: ");
                milk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add: ");
                coffee += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                disp += scanner.nextInt();
            } else if (act.equals("take")) {
                System.out.println("I gave you $" + money);
                money = 0;
            } else if (act.equals("remaining")) {
                System.out.println();
                checkmachine(water, milk, coffee, disp, money);
            } else if (act.equals("exit")) {
                System.exit(0);
            }
        }
    }

    static void checkmachine(int water, int milk, int coffee, int disp, int money) {
        System.out.println("The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffee + " g of coffee beans\n" +
                disp + " disposable cups\n$" +
                money + " of money");
    }
}
