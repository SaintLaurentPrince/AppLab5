/**
 * Класс команды Sort
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.CommandWithoutArg;
import Controller.RouteCollection;


public class Sort implements CommandWithoutArg {

    @Override
    public void execute(Object o) {
        RouteCollection collection = new RouteCollection();
        if (collection.getSize() != 0) {
            collection.toSortArray();
            System.out.println("Коллекция успешно отсортировна.");
        } else System.out.println("Коллекция пустая.");
    }

    @Override
    public String getName() {
        return "sort";
    }
}