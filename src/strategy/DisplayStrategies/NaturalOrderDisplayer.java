package strategy.DisplayStrategies;

import java.util.List;

public class NaturalOrderDisplayer <T> implements Displayer<T> {

    /**
     * Displays items of the list in natural order.
     */
    @Override
    public void display (List <T> list)
    {

        for (int  i = 0; i  < list.size (); i++)
            System.out.print("(" + list.get(i) + ")  ");

        System.out.println ();

    }


}
