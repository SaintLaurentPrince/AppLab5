/**
 * Класс команды Save
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Commands;

import Controller.CommandWithoutArg;
import Controller.RouteCollection;
import RouteObject.Route;
import Utilities.FileReader;
import Utilities.FileWriter;

import java.io.IOException;
import java.util.Scanner;

public class Save implements CommandWithoutArg {

    @Override
    public void execute(Object o) throws IOException {
        Scanner in = new Scanner(System.in);
        String filename = FileReader.getFilename();
        while (filename.equals("")){
            System.out.print("Вы не указали имя файла изначально, укажите сейчас:\n$ ");
            filename = in.nextLine();
        }
        String csv = "";
        for (Route route : RouteCollection.getCollection())
            csv += route.getCSV() + "\n";
        FileWriter.write(filename, csv);
        System.out.println("Коллекция успешно сохранена.");
    }

    @Override
    public String getName() {
        return "save";
    }
}
