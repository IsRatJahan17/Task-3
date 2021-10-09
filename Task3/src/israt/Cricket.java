package israt;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;
    Cricket(String matchType,int over,Player player)
    {
        this.matchType=matchType;
        this.over=over;
        this.player=player;
    }
    void display()
    {
        System.out.println("Match Type: " +matchType);
        System.out.println("Over of the match: " +over);
        System.out.println("Name of a player: " +player.playerName);
        System.out.println("Jersey number of a player: " +player.jerseyNumber);
    }
}

/*
        Name: Israt Jahan
        ID: 2012020163
        Section: d
        Email: cse_2012020163@lus.ac.bd
        Date: 12th September,2021
    */
