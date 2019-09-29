package servlets;

import book.Book;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.tool.schema.Action;
import services.AuthorService;
import services.BookService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
    private BookService bookService = new BookService();
    private AuthorService authorService = new AuthorService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NotImplementedException {
// w post musimy uzyskac 2 informacje - jaki przycisk byl klikniety i jaki id ksiazki wybrany zeby przekierowac do innych widokow
        // bedzie decydowac do jakiego servletu przejsc w zaleznosci
        // switch do innego servletu (np addservlet)
        //metoda add -> do addservlet

Action action = Action.valueOf(request.getParameter("action"));
Long idBook = Long.valueOf(request.getParameter("idBook"));

//            switch (action) {
//                case ADD:
//                    response.sendRedirect("/AddServlet");
//                    break;
//                case EDIT:
//                    response.sendRedirect("/EditServlet" + idBook);
//                    break;
//                case SHOW:
//                    response.sendRedirect("/ShowServlet" + idBook);
//                    break;
//                default:
//                    throw new Exception()
//                    break;
//            }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//get pobieramy liste ksiazek z bazy danych i przekazac do index.jsp
        List<Book> books = new ArrayList<Book>();

    }
}

