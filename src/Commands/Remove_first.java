/**
 * Класс команды Remove_first
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.CommandWithoutArg;
import Controller.RouteCollection;

public class Remove_first implements CommandWithoutArg {
    @Override
    public void execute(Object o) {
        RouteCollection collection = new RouteCollection();
        if (collection.getSize() != 0) {
            collection.removeFirst();
            System.out.println("Первый элемент успешно удален.");
        }
        else System.out.println("Коллекция итак пустая");

    }

    @Override
    public String getName() {
        return "remove_first";
    }
}
