package big.foot.boy.client.fallback;

import big.foot.boy.client.FeignHelloClient;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoxuwang on 2018/1/30.
 */

@Component
public class HelloServiceFallback implements FeignHelloClient {

    @Override
    public String sayHello() {
        return "fail";
    }
}
