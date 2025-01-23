package JF.co.uk.demo;

import com.cultodeportivo.demo65jakartaee2.models.Role;
import com.cultodeportivo.demo65jakartaee2.services.RoleService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Inject
    private RoleService roleService;

    private String message;

    public void init() {
        message = "Hola mundo Diego";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        List<Role> roles = roleService.obtenerTodosRoles();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        // Mostrar los roles recuperados
        out.println("<h2>Lista de Roles:</h2>");
        out.println("<ul>");
        for (Role role : roles) {
            out.println("<li>ID: " + role.getId() + " | Nombre: " + role.getNombre() + "</li>");
        }
        out.println("</ul>");

        out.println("</body></html>");
    }

    public void destroy() {
    }
}
