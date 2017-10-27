import com.romanklauser.service.CustomerService;
import com.romanklauser.service.CustomerServiceImpl;

public class Application {
    public static void main(String[] args) {
        System.out.println("running...");

        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstname());
        System.out.println(service.findAll().get(0).getLastname());
    }
}
