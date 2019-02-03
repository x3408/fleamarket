import domain.User;
import mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Impl.UserServiceImpl;
import service.UserService;

public class UserTest {
    @Test
    public void userMapperTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        String applicationName = applicationContext.getApplicationName();
        User user = userService.login("1");

        System.out.println(user);
    }
}
