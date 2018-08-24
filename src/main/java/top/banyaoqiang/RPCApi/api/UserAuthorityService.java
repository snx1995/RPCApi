package top.banyaoqiang.RPCApi.api;

import top.banyaoqiang.RPCApi.entity.OperationResult;
import top.banyaoqiang.RPCApi.entity.User;

import java.util.Map;

/**
 * Created by 班耀强 on 2018/8/5
 */
public interface UserAuthorityService {
    User login(Integer id, String name, String password);

    User login(Integer id, String password);

    User login(String name, String password);

    User register(Map<String, Object> param);

    User getUserInfo(int id);

    User getUserInfo(String name);
}
