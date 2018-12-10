import java.util.ArrayList;

public class Deck
{
    ArrayList<Card>unDealt;
    ArrayList<Card>Dealt;

    public Deck(String[] ranks, String[] suits, int[] pointValues)
    {
        for(int i=0;i<ranks.length;i++)
        {
            for(int j=0;j<suits.length;j++)
            {
                for(int k=0;k<pointValues.length;k++)
                {

                }
            }
        }
    }

    public boolean isEmpty()
    {
        if(unDealt.size() == 0)
        {
            return true;
        }
        return false;
    }

    public int size()
    {
        return unDealt.size();
    }

    public void shuffle()
    {

    }
}
