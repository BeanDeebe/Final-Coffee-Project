package machine;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = 550;
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;

        String userInput;
        boolean machine = true;

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            userInput = scanner.nextLine();

                switch (userInput) {
                    case "buy":
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                        String typeOfCoffee = scanner.nextLine();
                        switch (typeOfCoffee) {
                            case "1":
                                if (water < 250) {
                                    System.out.println("Sorry, not enough water!");
                                    break;
                                } else if (beans < 16) {
                                    System.out.println("Sorry, not enough beans!");
                                    break;
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                    break;
                                } else {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water = (water - 250);
                                    beans = (beans - 16);
                                    money = (money + 4);
                                    cups--;
                                    break;
                                }

                            case "2":
                                if (water < 350) {
                                    System.out.println("Sorry, not enough water!");
                                    break;
                                } else if (beans < 20) {
                                    System.out.println("Sorry, not enough beans!");
                                    break;
                                } else if (milk < 75) {
                                    System.out.println("Sorry, not enough milk!");
                                    break;
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                    break;
                                } else {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water = (water - 350);
                                    milk = (milk - 75);
                                    beans = (beans - 20);
                                    money = (money + 7);
                                    cups--;
                                    break;
                                }

                            case "3":
                                if (water < 200) {
                                    System.out.println("Sorry, not enough water!");
                                    break;
                                } else if (beans < 12) {
                                    System.out.println("Sorry, not enough beans!");
                                    break;
                                } else if (milk < 100) {
                                    System.out.println("Sorry, not enough milk!");
                                    break;
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                    break;
                                } else {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water = (water - 200);
                                    milk = (milk - 100);
                                    beans = (beans - 12);
                                    money = (money + 6);
                                    cups--;
                                    break;
                                }
                            case "back":
                                break;
                        }
                        break;
                    case "fill":

                        System.out.println("Write how many ml of water do you want to add:");
                        int newWater = scanner.nextInt();
                        water = (water + newWater);
                        System.out.println("Write how many ml of milk do you want to add:");
                        int newMilk = scanner.nextInt();
                        milk = (milk + newMilk);
                        System.out.println("Write how many grams of coffee beans do you want to add:");
                        int newBeans = scanner.nextInt();
                        beans = (beans + newBeans);
                        System.out.println("Write how many disposable cups of coffee do you want to add");
                        int newCups = scanner.nextInt();
                        cups = (cups + newCups);
                        break;

                    case "take":
                        System.out.println("I gave you $" + money);
                        money = 0;
                        break;

                    case "remaining":
                        System.out.println("The coffee machine has:");
                        System.out.println(water + " of water");
                        System.out.println(milk + " of milk");
                        System.out.println(beans + " of coffee beans");
                        System.out.println(cups + " of disposable cups");
                        System.out.println(money + " of money");
                        break;

                    case "exit":
                        machine = false;
                        break;

            }
        } while (machine);
    }
}
