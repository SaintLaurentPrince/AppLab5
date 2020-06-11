/**
 * Класс команды Min_by_id
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.CommandWithoutArg;
import Controller.RouteCollection;


public class Min_by_id implements CommandWithoutArg {
    @Override
    public void execute(Object o) {
        RouteCollection collection = new RouteCollection();
        if (collection.getSize() != 0) System.out.println(collection.getMinById().getInfo());
        else System.out.println("Коллекция пустая.");
    }

    @Override
    public String getName() {
        return "min_by_id";
    }
}
