/**
 * Класс команды Filter_less_than_distance
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.Commandable;
import Controller.RouteCollection;
import RouteObject.Route;

import java.util.Vector;

public class Filter_less_than_distance implements Commandable {
    @Override
    public void execute(Object o) {
        try{
            long sampleDistance = Long.parseLong((String) o);
            Vector<Route> collection = RouteCollection.getCollection();
            boolean tumb = false;
            for(Route route: collection)
                if (route.getDistance() < sampleDistance) {
                    System.out.println(route.getInfo());
                    tumb = true;
                }
            if (!tumb) System.out.println("Таких элементов в коллекции нет");
        }
        catch (Exception e){
            System.out.println("Аргумент команды должен быть типа long");
        }
    }

    @Override
    public String getName() {
        return "filter_less_than_distance";
    }
}
