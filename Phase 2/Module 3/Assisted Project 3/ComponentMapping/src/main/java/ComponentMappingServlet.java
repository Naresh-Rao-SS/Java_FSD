import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.connection.HibernateConnection;
import com.models.Course;
import com.models.Student;


@WebServlet("/ComponentMappingServlet")
public class ComponentMappingServlet extends HttpServlet {
	private static SessionFactory sessionFactory = null;
	private static final long serialVersionUID = 1L;

	
	public ComponentMappingServlet() {
		super();
		sessionFactory = HibernateConnection.getSessionFactory();
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			Session session = sessionFactory.openSession();

			TypedQuery<Course> query = session.createQuery("from Course");
			List<Course> cList = query.getResultList();
			for (Course course : cList) {
				out.println("<p><b>Course</b>: " + course.getName() + "</p>");
				out.println("<p><b>Course Fees</b>: " + course.getFees() + "</p>");
				out.println("<p><b>Course Duration</b>: " + course.getDuration() + "</p>");
				out.println("<h2>Students Enrolled: </h2>");
				List<Student> studentList = course.getStudents();
				for (Student std : studentList) {
					out.println("<p><b>Roll No: </b>: " + std.getRollNo() + "</p>");
					out.println("<p><b>Name: </b>: " + std.getStudentName() + "</p>");
					out.println("<p><b>Age: </b>: " + std.getAge() + "</p>");
				}
			}
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
