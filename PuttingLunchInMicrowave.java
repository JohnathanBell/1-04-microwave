/****************************************************************************
 *
 * Created by: Johnathan Bell
 * Created on: Feb 2018
 * This program calculates the ammount you of time you should put food in the
 * oven given what said food is and how much of it. very important
 *
 ****************************************************************************/
 import java.util.Scanner;

 public class PuttingLunchInMicrowave {

  public static void main(String[] args) {

    // variables for times and choices
    double howMany = 0.0;
    double choice = 0.0;
    double twoLunch = 0.5;
    double threeLunch = 2.0;
    double oneSoup = 1.75;
    double onePizza = 0.45;
    double oneSub = 1.0;

    // instructions on how to use the program are at the top when the program is run.
    System.out.println("Type in what you'll have for lunch and how much of it."
    + " This program will calculate how long you sould put it in the microwave."
    + " You have the choice of sub, pizza, or soup and you can have up to 3 of one type of food at a time."
    + ""
    + " Start by stating what you're having for lunch, sub (enter 1), pizza (enter 2) or soup (enter 3)."
    + ""
    + "then state how many you want to heat up, you can have up to 3 at a time.");

    // scanners make user inputs possible (found on
    Scanner input = new Scanner(System.in);
    choice = input.nextInt();
    howMany = input.nextInt();

    // if you followed the instructions than the program will calculate the data given one of the three choices
    if (choice == 1) {
      System.out.println("");
      System.out.println("you chose sub");
      System.out.println("");

      if (howMany == 1) {
      System.out.println("you chose one (1) sub.");
      System.out.println("put the sub in the microwave for " + oneSub + " min.");

      }else if (howMany == 2) {
      double twoSubs = oneSub + (oneSub * twoLunch);
      System.out.println("");
      System.out.println("you chose two (2) subs.");
      System.out.println("put the sub in the microwave for " + twoSubs + " min.");

      }else if (howMany == 3) {
      double threeSubs = oneSub + (oneSub * threeLunch);
      System.out.println("");
      System.out.println("you chose three (3) subs.");
      System.out.println("put the sub in the microwave for " + threeSubs + " min.");

      }else {
      System.out.println("");
      System.out.println("you chose " + howMany + "?");
      System.out.println("i think you broke something, now you need to start over.");

      }

    }else if (choice == 2) {
      System.out.println("");
      System.out.println("you chose pizza");
      System.out.println("");
      System.out.println("how many slices of pizza are you having? you can have up to 3 slices ");

      if (howMany == 1) {
      System.out.println("");
      System.out.println("you chose one (1) sub.");
      System.out.println("put the sub in the microwave for " + onePizza + " min.");

      }else if (howMany == 2) {
      double twoPizzas = onePizza + (onePizza * twoLunch);
      System.out.println("");
      System.out.println("you chose two (2) subs.");
      System.out.println("put the sub in the microwave for " + twoPizzas + " min.");

      }else if (howMany == 3) {
      double threePizzas = onePizza + (onePizza * threeLunch);
      System.out.println("");
      System.out.println("you chose three (3) subs.");
      System.out.println("put the sub in the microwave for " + threePizzas + " min.");

      }else {
      System.out.println("");
      System.out.println("you chose " + howMany + "?");
      System.out.println("i think you broke something, now you need to start over.");

      }

    }else if (choice == 3) {
      System.out.println("");
      System.out.println("you chose soup");
      System.out.println("");

      if (howMany == 1) {
      System.out.println("you chose one (1) soup.");
      System.out.println("put the sub in the microwave for " + oneSoup + " min.");

      }else if (howMany == 2) {
      double twoSoups = oneSoup + (oneSoup * twoLunch);
      System.out.println("");
      System.out.println("you chose two (2) subs.");
      System.out.println("put the sub in the microwave for " + twoSoups + " min.");

      }else if (howMany == 3) {
      double threeSoups = oneSoup + (oneSoup * threeLunch);
      System.out.println("");
      System.out.println("you chose three (3) subs.");
      System.out.println("put the sub in the microwave for " + threeSoups + " min.");

      }else {
      System.out.println("");
      System.out.println("you chose " + howMany + "?");
      System.out.println("i think you broke something, now you need to start from the beginning.");

      }

    }else {
    System.out.println("");
    System.out.println("You did not select any of the choices from above.");
    System.out.println("now you have to start all over again");

    }

  }

}

