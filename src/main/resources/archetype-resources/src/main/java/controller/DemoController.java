package ${package}.controller;


import com.sleeper.base.annotate.WebLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * demo 前端控制器
 * </p>
 *
 * @author chenxuan
 * @since 2021-09-17
 */
@RestController
@RequestMapping("/demo")
@Api(value = "demo", tags = "实列")
public class DemoController {

    @GetMapping("/hello")
    @ApiOperation(value = "hello")
    @WebLog
    public String hello() {
        return "hello world";
    }

}
