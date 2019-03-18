package cn.mefo.springboot20190318;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

/*    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;*/

    /**
     *
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello(){
       /* DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/user/get");
        OapiUserGetRequest request = new OapiUserGetRequest();
        request.setUserid("zhangsan");
        request.setHttpMethod("GET");
        OapiUserGetResponse response = client.execute(request, accessToken);*/
        return null;
    }
}
