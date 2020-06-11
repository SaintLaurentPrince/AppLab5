/**
 * Класс команды Sort
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.CommandWithoutArg;
import Controller.RouteCollection;
import RouteObject.Route;


public class Sort implements CommandWithoutArg {

    @Override
    public void execute(Object o) {
        RouteCollection collection = new RouteCollection();
        if (collection.getSize() != 0) {
            collection.toSortArray();
            long i=0;
            long amount= RouteCollection.getFreeId();
            for (Route route: collection.getCollection()){
                if (route.getId() < amount){
                    i++;
                    route.setId(i);
                }
            }
            System.out.println("Коллекция успешно отсортировна.");
        } else System.out.println("Коллекция пустая.");
    }

    @Override
    public String getName() {
        return "sort";
    }
}