package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HolleController {
    @RequestMapping(value = "/")
//    @ResponseBody
    public String holle(){
        return "index.html";
    }

    @RequestMapping(value = "/getBook")
    @ResponseBody
    public String x(){
        return "xx";
    }

    @RequestMapping("/xxx")
    public String xx(){
        return "xxx.html";
    }



}
