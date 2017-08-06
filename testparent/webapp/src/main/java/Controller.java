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
        System.out.printf("dev3");
        System.out.printf("dev4 ");
		System.out.printf("mst2 ");
        System.out.printf("dev5 ");
        System.out.printf("dev6 ");
        System.out.printf("mst3 ");
		System.out.printf("edit1 ");
        System.out.printf("dev7");
        System.out.printf("dev8");
        System.out.printf("dev9");
		System.out.printf("edit2");
		ystem.out.printf("dev10");
        System.out.printf("dev11");
	    System.out.printf("edit3");
        System.out.printf("edit4");
        System.out.printf("dev12");
        System.out.printf("dev13");
        System.out.printf("dev14");
        System.out.println("dev15");
        System.out.println("dev16");
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
