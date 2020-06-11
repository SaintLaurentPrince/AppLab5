/**
 * Класс команды Filter_contains_name
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.Commandable;
import Controller.RouteCollection;
import RouteObject.Route;

public class Filter_contains_name implements Commandable {
    @Override
    public void execute(Object o) {
        String subSt = (String) o;
        boolean was = false;
        RouteCollection collection = new RouteCollection();
        if (collection.getSize() == 0) System.out.println("Коллекция пустая.");
        else for (Route route : collection.getCollection()){
           if (route.getName().indexOf(subSt) != -1){
               was = true;
               System.out.println(route.getInfo());
           }
        }
        if (!was) System.out.println("Нет таких элементов в коллекции");
    }


    @Override
    public String getName() {
        return "filter_contains_name";
    }
}
