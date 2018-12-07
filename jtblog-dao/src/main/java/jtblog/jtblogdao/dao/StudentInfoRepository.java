package jtblog.jtblogdao.dao;

import jtblog.jtblogdao.entity.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author     ：johnbarrowman@gmail.com
 * @ Date       ：Created in 16:20 2018/12/7
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
public interface StudentInfoRepository extends JpaRepository<StudentInfo,Integer> {

}
