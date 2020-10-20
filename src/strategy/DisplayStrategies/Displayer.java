package strategy.DisplayStrategies;

import java.util.*;

public interface Displayer <T> {

    /**
     * Displays a list of items.
     * @param list
     */

    public void display (List <T> list);
}
