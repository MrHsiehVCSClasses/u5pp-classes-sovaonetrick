package u5pp;

import java.util.Scanner;
import java.util.Random;

class Dice 
{

  private int currentSide;
  private int numSides = 6;
  private int startingSide = 1;
  private String color = "green";

public Dice(int numSides, int startingSide, String color)
{
  if (startingSide > numSides)
  {
    startingSide = this.startingSide;
  }
  this.numSides = numSides;
  this.startingSide = startingSide;
  this.color = color;
}

public Dice(int numSides, int startingSide)
{
  if (startingSide > numSides)
  {
    startingSide = this.startingSide;
  }
  this.numSides = numSides;
  this.startingSide = startingSide;

  String color = this.color;
}

public Dice(int numSides)
{
  if (startingSide > numSides)
  {
    startingSide = this.startingSide;
  }
  this.numSides = numSides;

  int startingSide = this.startingSide;
  String color = this.color;
}

public Dice()
{
  if (startingSide > numSides)
  {
    startingSide = this.startingSide;
  }
  int numSides = this.numSides;
  int startingSide = this.startingSide;
  String color = this.color;
}

public int getSides()
{
  return this.numSides;
}

public int getCurrentSide()
{
  return this.startingSide;
}

public String getColor()
{
  return this.color;
}

public String toString()
{
  return "The " + this.color + " " + this.numSides + "-sided dice is showing " + this.startingSide;
}

public boolean equals(Dice d)
{
  currentSide = this.startingSide;
  if (currentSide == d.startingSide)
  {
    return true;
  }
  else
  {
    return false;
  }
}

public int roll()
{
  Random rand = new Random();
  int randomnumber = rand.nextInt(1, (this.numSides + 1));
  this.currentSide = randomnumber;
  this.startingSide = randomnumber;
  return this.currentSide;
}

void changeSide(int num)
{
  if (num >= 1 && num <= this.numSides)
  {
    this.currentSide = num;
    this.startingSide = num;
  }
}

void changeColor(String color)
{
  this.color = color;
}

void changeNumSides(int num)
{
  this.numSides = num;
}
}

class Card
{
  private String value = "2";
  private String suit = "clubs";

  String jack = "jack";
  String queen = "queen";
  String king = "king";
  String ace = "ace";

  String clubs = "clubs";
  String diamonds = "diamonds";
  String spades = "spades";
  String hearts = "hearts";

  Card()
  {
    value = this.value;
    suit = this.suit;
  }

  Card(String suit)
  {
    String banana = suit.toLowerCase();
    if (banana == clubs || banana == diamonds || banana == spades || banana == hearts)
    {
      this.suit = suit;
    }

    value = this.value;
  }

  Card(String suit, String value)
  {
    String banana = suit.toLowerCase();
    if (banana == clubs || banana == diamonds || banana == spades || banana == hearts)
    {
      this.suit = suit;
    }
    else
    {
      suit = this.suit;
    }

    String potato = value.toLowerCase();
    if (potato == king || potato == queen || potato == ace || potato == jack)
    {
      this.value = value;
    }
    else
    {
      if (Integer.parseInt(value) >= 2 && Integer.parseInt(value) <= 10)
      {
        this.value = value;
      }
      else
      {
        value = this.value;
      }
    }
  }

  public String getValue()
  {
    return this.value;
  }

  public String getSuit()
  {
    return this.suit;
  }

  public String toString()
  {
    return "The " + this.value + " of " + this.suit;
  }

  public boolean equals(Card c)
  {
    if (this.value == c.value && this.suit == c.suit)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public void changeSuit(String suit)
  {
    String pickles = suit.toLowerCase();
    if (pickles == hearts || pickles == clubs || pickles == diamonds || pickles == spades)
    {
      this.suit = suit.toLowerCase();
    }
  }
  public void changeValue(String value)
  {
    String banda = value.toLowerCase();
    if (banda == jack || banda == queen || banda == ace || banda == king)
    {
      this.value = value.toLowerCase();
    }
    else
    {
      if (Integer.parseInt(value) >= 2 && Integer.parseInt(value) <= 10)
      {
        this.value = value;
      }
    }
  }
}

class MyMath
{
  public static int abs(int x)
  {
    if (x < 0)
    {
      x *= -1;
    }
    return x;
  }

  public static double abs(double x)
  {
    if (x < 0)
    {
      x *= -1.0;
    }
    return x;
  }

  public static double pow(double base, int exponent)
  {
    double answer = 1.0;

    for (int i = 0; i < exponent; i++)
    {
      answer *= base;
    }

    return answer;
  }

  public static int perfectSqrt(int x)
  {
    if (x < 0) {
      return -1;
    }

    for (int i = 0; i * i <= x; i++)
    {
      if (i * i == x)
      {
        return i;
      }
    }

    return -1;
  }
}

class InputHelper {

  private Scanner scanner;

  public InputHelper(Scanner scanner) {
    this.scanner = scanner;
  }

  public boolean getYesNoInput(String prompt) {
    while (true) {
      System.out.print(prompt + " (yes/no): ");
      String input = scanner.next().toLowerCase();

      if (input.startsWith("y")) {
        return true;
      }
      else if (input.startsWith("n"))
      {
        return false;
      }
      else
      {
        System.out.println("HE CANCELLLED HE CANCELLEDDD AYAYA HE CANCELLED");
      }
    }
  }

  public int getIntegerInput(String prompt, int min, int max)
  {

    while (true) {
      System.out.print(prompt + " enter an integer between " + min + " and " + max);
      while (!scanner.hasNextInt()){
        System.out.println("Invalid input. RIOOOOOT");
        scanner.next();
      }

      int input = scanner.nextInt();

      if (input >= min && input <= max) {
        return input;
      }
      else {
        System.out.println("my glorious king T1 faker playmaker");
      }
    }

}
}


class Main {
  public static void main(String[] args) {
    System.out.println("Hi! If you're seeing this, then you just ran your main method.... Nothing is here though :)\n");

    
    /* Example usage for InputHelper */
    // Scanner sc = new Scanner(System.in);
    // InputHelper ih = new InputHelper(sc);
    // boolean yesNo = ih.getYesNoInput("please answer yes or no.");
    // System.out.println("the player chose " + yesNo);
    // int numberChosen = ih.getIntegerInput("please chose a number between 10 and 12 (inclusive).", 10, 12);
    // System.out.println("the player chose " + numberChosen);

  }
}
