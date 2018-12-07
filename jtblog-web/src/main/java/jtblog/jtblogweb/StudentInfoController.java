package jtblog.jtblogweb;

import jtblog.jtblogdao.entity.StudentInfo;
import jtblog.jtblogservice.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：johnbarrowman@gmail.com
 * @ Date       ：Created in 16:29 2018/12/7
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */

@RestController
@RequestMapping("/demo/")
public class StudentInfoController {

    @Autowired
    StudentInfoService studentInfoService;

    @RequestMapping("add")
    private StudentInfo add(){
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setBirthday("1995-04-24");
        studentInfo.setEmail("汤姆猫@gmail.com");
        studentInfo.setName("猫");
        return studentInfoService.addOne(studentInfo);
    }

}
