/**
 * Класс команды Remove_by_id
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.Commandable;
import Controller.RouteCollection;
import RouteObject.Route;

import java.util.Iterator;

public class Remove_by_id implements Commandable {
    RouteCollection collection = new RouteCollection();

    @Override
    public void execute(Object arg) {
        if (collection.getSize() == 0) System.out.println("Коллекция пустая.");
        else {
            boolean isRemoved = false;
            int id = 0;
            try {
                id = Integer.parseInt((String) arg);
            } catch (NumberFormatException exp) {
            }

            Iterator<Route> it = (Iterator<Route>) collection.getCollection().iterator();
            while (it.hasNext()) {
                Route route = (Route) it.next();
                int humanId = (int) route.getId();
                if (id == humanId) {
                    it.remove();
                    isRemoved = true;
                    System.out.println("Трасса успешно удалена.");
                }
            }
            if (!isRemoved) System.out.println("Элемента с таким id не существует.");
        }
    }

    @Override
    public String getName() {
        return "remove_by_id";
    }
}
