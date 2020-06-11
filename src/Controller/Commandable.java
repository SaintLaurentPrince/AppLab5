/**
 * Interface for working with commands which have an argument
 *
 * @author SaintLaurentPrince and Mariec
 * @version 1.0
 */

package Controller;

import java.io.IOException;

public interface Commandable {
   void execute(Object o) throws IOException;
   String getName();
}
