package com.rps.settling_scores;

public class Score
{
    int wins;
    int ties;
    int losses;

    public Score()
    {
    }

    public Score(int losses, int ties, int wins)
    {
        super();
        this.losses = losses;
        this.ties = ties;
        this.wins = wins;
    }

    public int getWins()
    {
        return wins;
    }

    public void setWins(int wins)
    {
        this.wins = wins;
    }

    public int getTies()
    {
        return ties;
    }

    public void setTies(int ties)
    {
        this.ties = ties;
    }

    public int getLosses()
    {
        return losses;
    }

    public void setLosses(int losses)
    {
        this.losses = losses;
    }
}
