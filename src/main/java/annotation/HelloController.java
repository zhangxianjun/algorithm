package annotation;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: zxj
 * @date: 2019/9/10 16:41
 * Description: .
 */
@RestController("/hello")
public class HelloController {
    public void say(String name) {
        System.out.println("====" + name);
    }
}
