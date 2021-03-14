package homework8.src.main.java.com.example.homework8.Controllers;

import com.example.homework7.DAO.UserDAO;
import com.example.homework7.models.Car;
import com.example.homework7.models.Product;
import com.example.homework7.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {


    private UserDAO userDAO;


    @GetMapping()
    public List<User> getUsers() {
        return userDAO.findAll();
    }

    @GetMapping("/save")
    public void save() {
        User user = new User();
        user.setName("vasya");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("milk"));
        productList.add(new Product("kokos"));
        user.setProducts(productList);

        userDAO.save(user);
    }


    @GetMapping("/saveWithCars")
    public void saveWithCars() {

        User user = new User("max");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("suba"));
        cars.add(new Car("mazda"));
        user.setCars(cars);
        userDAO.save(user);

    }

}
