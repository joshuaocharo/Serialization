import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializeXML {

    public static void main(String[] args) {
        try {
        book book1 = new book();
        book1.setName("Nimo");
        book1.setDescription("For Kids ");
        book1.setCost("$4");
        book1.setNumber(1000);
        book1.setYearofrelease(1901);

        book book2 = new book();
        book2.setName("Fifty Shades of Grey");
        book2.setDescription("For Adults ");
        book2.setCost("$50");
        book2.setNumber(10120);
        book2.setYearofrelease(2008);

        book book3 = new book();
        book3.setName("River Between");
        book3.setDescription("For Students ");
        book3.setCost("$12");
        book3.setNumber(13);
        book3.setYearofrelease(1998);

        List<book> booksList=new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);


        librarylist librarylist=new librarylist();
        librarylist.setbooks(booksList);


        XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("librarylistings.xml")));
        xmlEncoder.writeObject(librarylist);
        xmlEncoder.close();

        }catch (FileNotFoundException ex){
            Logger.getLogger(SerializeXML.class.getName()). log(Level.SEVERE,null,ex);

        }




    }

}