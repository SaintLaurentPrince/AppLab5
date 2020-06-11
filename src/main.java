/**
 * Класс main
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */


import Controller.*;
import Commands.*;
import Utilities.Decoder;
import Utilities.FileReader;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /**
         * Автоматичское заполнение коллекции из файла, имя которого передано как аргумент командной строки
         */
        String filename = "";
        if (args.length != 0) filename = args[0];
        FileReader.setFilename(filename);
        RouteCollection routeCollection = new RouteCollection();
        Decoder.fillCollection(FileReader.read(filename));
        Commands commands = new Commands();
        commands.regist(new Show(), new Exit(), new Help(), new Info(), new Clear(), new Remove_first(),
                new Execute_script(), new Add(), new Save(), new Sort(), new Update(), new Remove_by_id(),
                new Filter_less_than_distance(), new Filter_contains_name(), new Add_if_min(), new Min_by_id());
        Scanner in = new Scanner(System.in);
        /**
         * Цикл работы ввода команд
         */
        while (true) {
            System.out.print("$ ");
            String commandName = in.nextLine();
            if (!commandName.equals(""))
                commands.executeCommand(commandName);
        }
    }
}
