import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created on 2016/12/14 0014.
 *
 * @author zlf
 * @since 1.0
 */
@SpringBootApplication
@ComponentScan("cn.merryyou.boot")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
