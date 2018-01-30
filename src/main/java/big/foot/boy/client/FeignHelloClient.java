package big.foot.boy.client;

import big.foot.boy.client.fallback.HelloServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiaoxuwang on 2018/1/30.
 */
@FeignClient(value="lorentz", fallback = HelloServiceFallback.class)
public interface FeignHelloClient {

    @RequestMapping(value = "/hi" , method = RequestMethod.GET)
    String sayHello();

}
