package atf.tcpc.service;

import atf.tcpc.base.domain.User;
import atf.tcpc.base.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User selectUser(String id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
