import com.romanklauser.model.Customer;
import com.romanklauser.model.Group;
import com.romanklauser.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
    public static void main(String[] args) {
        System.out.println("running...");


        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //CustomerService service = appContext.getBean("customerService", CustomerService.class);
        //System.out.println(service.findAll().get(0).getFirstname());
        //System.out.println(service.findAll().get(0).getLastname());

        Customer max = appContext.getBean("max", Customer.class);
        Customer moritz = appContext.getBean("moritz", Customer.class);
        Group group = appContext.getBean("group", Group.class);


        //group.addMember(max);
        //group.addMember(moritz);

        for (Customer customer: group.getMembers()) {
            System.out.println(customer.getFirstname());

        }
    }
}
