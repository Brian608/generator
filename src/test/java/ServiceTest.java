import org.feather.GeneratorApplication;
import org.feather.entity.CouponTemplate;
import org.feather.entity.UserAddress;
import org.feather.service.ICouponTemplateService;
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
 * @since: 2022-01-12 21:05
 **/
@SpringBootTest(classes = GeneratorApplication.class)
@RunWith(SpringRunner.class)
public class ServiceTest {
    @Autowired
    private IUserAddressService userAddressService;

    @Autowired
    private ICouponTemplateService couponTemplateService;

    @Test
    public void  findAll(){
        List<UserAddress> userAddressList = userAddressService.list();
        userAddressList.forEach(System.out::println);
    }
    @Test
    public  void listAllCouponTemplate(){
        List<CouponTemplate> couponTemplateList = couponTemplateService.list();
        couponTemplateList.forEach(System.out::println);
    }
}
