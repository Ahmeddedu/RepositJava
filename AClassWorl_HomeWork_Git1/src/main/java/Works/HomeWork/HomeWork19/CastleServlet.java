package Works.HomeWork.HomeWork19;

import Works.HomeWork.HomeWork19.store.Animal;
import Works.HomeWork.HomeWork19.store.AnimalStore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class CastleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String animalName = request.getParameter("name");

        if (animalName != null) {
            Animal animal = AnimalStore.getAnimals().get(animalName);
            if (animal != null) {
                request.setAttribute("animal", animal);
                RequestDispatcher dispatcher = request.getRequestDispatcher("livingThing.jsp");
                dispatcher.forward(request, response);
            } else {
                response.sendRedirect("/castle");
            }
        } else {
            Map<String, Animal> animals = AnimalStore.getAnimals();
            request.setAttribute("animals", animals);
            RequestDispatcher dispatcher = request.getRequestDispatcher("castle.jsp");
            dispatcher.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String animalName = request.getParameter("name");
        String description = request.getParameter("desc");

        if (animalName != null && !animalName.isEmpty()) {
            Animal newAnimal = new Animal(animalName, description);
            AnimalStore.addAnimal(newAnimal);
        }
        response.sendRedirect("/castle");
    }
}
