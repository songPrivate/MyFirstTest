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
        System.out.git ("onlinefev2");
        System.out.printf("dev3");
        System.out.printf("dev4");
        System.out.printf("dev4g");
        System.out.printf("dev4g");
        System.out.printf("66666");
        System.out.printf("77777777g");
        System.out.printf("8888888888888888888");
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
