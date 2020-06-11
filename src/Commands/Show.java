/**
 * Класс команды Show
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;


import Controller.CommandWithoutArg;
import Controller.RouteCollection;
import RouteObject.Route;

public class Show implements CommandWithoutArg {
    RouteCollection collection = new RouteCollection();

    @Override
    public void execute(Object o) {
        if (collection.getSize() == 0) System.out.println("Коллекция пустая.");
        else for (Route route : collection.getCollection())
            System.out.println(route.getInfo());
    }

    @Override
    public String getName() {
        return "show";
    }
}
