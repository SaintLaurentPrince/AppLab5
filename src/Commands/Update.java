/**
 * Класс команды Update
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.Commandable;
import Controller.RouteCollection;
import RouteObject.Route;
import RouteObject.RouteBuilder;

public class Update implements Commandable {

    @Override
    public void execute(Object arg) {
        RouteCollection collection = new RouteCollection();
        try {
            if (collection.isIndexBusy(Integer.parseInt((String) arg))) {
                int id=Integer.parseInt((String) arg);
                String oldName= " ";
                for (Route route : collection.getCollection()){
                    if (route.getId()==id){
                       oldName=route.getName();
                    }
                }
                collection.set(id,(new RouteBuilder()).create(oldName, String.valueOf(id)));
                System.out.println("Трасса [id:" + arg + "] успешно обновлена.");
            } else System.out.println("Элемента с таким id не существует.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Элемента с таким id не существует.");
        }
    }

    @Override
    public String getName() {
        return "update";
    }
}

