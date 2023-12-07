package u5pp;

public class Dice
{
    private int numSides = 6;
    private int startingSide = 1;
    private String color = "green";
    private int currentSide;
}

    public Dice(int numSides, int startingSide, String color)
    {
        int sides = numSides;
        int currentSide = startingSide;
        String diecolor = color;
    }

    public int getSides()
    {
        return numSides;
    }

    public int getCurrentSide()
    {
        currentSide = startingSide;
        return currentSide;
    }

    public String getColor()
    {
        return color;
    }

    public String toString()
    {
        return "The " + color + " " + numSides + "-sided dice is showing " + startingSide;
    }

    public boolean equals(Dice d)
    {
        if (this.startingSide == getCurrentSide())
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
        int upperbound = sides;
        int int_random = rand.nextInt(upperbound);
        currentSide = int_random;

        return currentSide;
    }

    public void changeSide(int num)
    {
        if (num >= 1 && num <= numSides)
        {
            currentSide = num;
        }
    }

    public void changeColor(String color)
    {
        this.color = color;
    }

    public void changeNumSides(int num)
    {
        this.numSides = num;
    }