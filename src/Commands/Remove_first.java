/**
 * Класс команды Remove_first
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.CommandWithoutArg;
import Controller.RouteCollection;
import RouteObject.Route;

public class Remove_first implements CommandWithoutArg {
    @Override
    public void execute(Object o) {
        RouteCollection collection = new RouteCollection();
        if (collection.getSize() != 0) {
            collection.removeFirst();
            System.out.println("Первый элемент успешно удален.");
            long i=0;
            int amount= collection.getSize()+2;
            for (Route route: collection.getCollection()){
                if (route.getId() < amount){
                    i++;
                    route.setId(i);
                }
            }
        }
        else System.out.println("Коллекция итак пустая");

    }

    @Override
    public String getName() {
        return "remove_first";
    }
}
