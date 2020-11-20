package exam.dao;

import domain.User;
import util.UserFileReader;

//现阶段看到的方法内部 通常都是包含了I/O
public class UserDao {

    //负责查询一个人的信息

    public User selectOne(String account){
        return UserFileReader.getUser(account);
    }
}
