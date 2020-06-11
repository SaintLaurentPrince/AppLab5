/**
 * Класс команды Add
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.Commandable;
import Controller.RouteCollection;
import RouteObject.RouteBuilder;

public class Add implements Commandable {
    RouteCollection collection = new RouteCollection();

    /**
     * @param o название трассы
     */

    @Override
    public void execute(Object o) {
        collection.add((new RouteBuilder()).create((String) o,"free"));
        System.out.println("Трасса успешно добавлена.");
    }

    @Override
    public String getName() {
        return "add";
    }
}