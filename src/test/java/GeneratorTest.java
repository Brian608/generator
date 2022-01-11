import org.feather.GeneratorApplication;
import org.feather.config.CodeGenerator;
import org.feather.entity.UserAddress;
import org.feather.service.IUserAddressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @program: generator
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2022-01-10 23:11
 **/
@SpringBootTest(classes = GeneratorApplication.class)
@RunWith(SpringRunner.class)
public class GeneratorTest {
    @Autowired
    private IUserAddressService userAddressService;


    @Test
    public void  findAll(){
        List<UserAddress> userAddressList = userAddressService.list();
        userAddressList.forEach(System.out::println);
    }
    @Test
    public  void generatorTest(){
        CodeGenerator codeGenerator=new CodeGenerator();
        codeGenerator.generator("user_address");
    }
}
