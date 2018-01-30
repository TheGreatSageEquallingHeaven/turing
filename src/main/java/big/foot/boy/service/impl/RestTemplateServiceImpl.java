package big.foot.boy.service.impl;

import big.foot.boy.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xiaoxuwang on 2018/1/30.
 */
@Service
public class RestTemplateServiceImpl implements RestTemplateService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hiService() {
        return restTemplate.getForObject("http://LORENTZ/hi",String.class);
    }
}
