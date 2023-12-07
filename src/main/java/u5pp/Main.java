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
