package top.banyaoqiang.RPCApi.api;

import top.banyaoqiang.RPCApi.entity.OperationResult;

/**
 * Created by 班耀强 on 2018/8/5
 */
public interface UserAuthorityService {
    OperationResult login(int id, String password);
}
