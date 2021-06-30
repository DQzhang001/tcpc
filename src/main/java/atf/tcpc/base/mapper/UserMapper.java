package atf.tcpc.base.mapper;

import atf.tcpc.base.domain.User;

public interface UserMapper {
    User selectByPrimaryKey(String id);
}
