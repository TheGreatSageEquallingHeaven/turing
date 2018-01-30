package big.foot.boy.controller;

import big.foot.boy.client.FeignHelloClient;
import big.foot.boy.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaoxuwang on 2018/1/30.
 */

@Controller
@RequestMapping("/")
public class UseLorentzController {

    @Autowired
    private RestTemplateService restTemplateService;

    @Autowired
    private FeignHelloClient feignHelloClient;


    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return restTemplateService.hiService();
    }

    @GetMapping("/feign/hello")
    @ResponseBody
    public String say(){
        return feignHelloClient.sayHello();
    }


}
