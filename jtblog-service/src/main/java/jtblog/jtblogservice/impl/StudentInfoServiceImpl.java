package jtblog.jtblogservice.impl;

import jtblog.jtblogdao.dao.StudentInfoRepository;
import jtblog.jtblogdao.entity.StudentInfo;
import jtblog.jtblogservice.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：johnbarrowman@gmail.com
 * @ Date       ：Created in 16:25 2018/12/7
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    StudentInfoRepository studentInfoRepository;

    @Override
    public StudentInfo addOne(StudentInfo studentInfo) {
        StudentInfo save = studentInfoRepository.save(studentInfo);
        if (save!=null){
            return save;
        }else {
            return null;
        }
    }
}
