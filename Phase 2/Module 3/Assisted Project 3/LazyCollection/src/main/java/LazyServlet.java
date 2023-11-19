import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.connection.HibernateConnection;
import com.models.Student;


@WebServlet("/LazyServlet")
public class LazyServlet extends HttpServlet {
	private static SessionFactory sessionFactory = null;
	private static final long serialVersionUID = 1L;

	public LazyServlet() {
		super();
		sessionFactory = HibernateConnection.getSessionFactory();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			Session session = sessionFactory.openSession();

			TypedQuery<Student> query = session.createQuery("from Student");
			List<Student> studentList = query.getResultList();

			out.println("<h1>Student Details</h1>");
			for (Student student : studentList) {
				out.println("<p><b>Roll No</b>: " + student.getRollNo() + "</p>");
				out.println("<p><b>Name</b>: " + student.getStudentName() + "</p>");
			}
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
