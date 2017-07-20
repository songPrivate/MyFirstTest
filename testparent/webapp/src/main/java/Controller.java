import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by saulsong on 2017/7/4.
 */
public class Controller extends HttpServlet {

    private final MyHttpServlet httpServlet = new MyHttpServlet();

    void go() {
        Test t = new Test();
        t.testSout();
        System.out.printf("dev1");
        System.out.printf("dev2");
        System.out.printf("mst1");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        go();
        out.write("test seccussful!");
        out.flush();
        out.close();
    }

    private class MyHttpServlet extends HttpServlet {
    }
}
