/**
 * Класс команды Clear
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.CommandWithoutArg;
import Controller.RouteCollection;

public class Clear implements CommandWithoutArg {
	RouteCollection collection = new RouteCollection();

	@Override
	public void execute(Object o) {
		collection.clear();
		System.out.println("Коллекция успешно очищена.");
	}

	@Override
	public String getName() {
		return "clear";
	}
}