/**
 * Класс команды Add_if_min
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.Commandable;
import Controller.RouteCollection;
import RouteObject.Route;
import RouteObject.RouteBuilder;

import java.util.Collections;
import java.util.Vector;

public class Add_if_min implements Commandable {

    /**
     * @param o название трассы
     */

    @Override
    public void execute(Object o) {
        if ((new RouteCollection().getSize() != 0)) {
            Vector<Route> collection = RouteCollection.getCollection();
            Collections.sort(collection);
            Route sample = (new RouteBuilder()).create((String) o,"free");
            if (sample.compareTo(collection.get(0)) < 0) {
                collection.add(sample);
                System.out.println("Трасса успешно добавлена.");
            } else System.out.println("Элемента меньше не оказалось");
        } else System.out.println("Коллекция пустая, даже сравнить не с чем(");
    }

    @Override
    public String getName() {
        return "add_if_min";
    }
}
