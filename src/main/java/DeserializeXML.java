import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeserializeXML {

    public static void main(String[] args) {
        try {
                XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("librarylistings.xml")));
                librarylist librarylist=(librarylist)xmlDecoder.readObject();


                List<book>  books=librarylist.getbooks();
                
                for (book value : books)
                {
                    System.out.println(value);
                }

        } catch (FileNotFoundException ex){
            Logger.getLogger(SerializeXML.class.getName()). log(Level.SEVERE,null,ex);

        }


    }
}

