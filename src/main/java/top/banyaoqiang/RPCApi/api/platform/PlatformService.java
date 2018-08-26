package top.banyaoqiang.RPCApi.api.platform;

import top.banyaoqiang.RPCApi.entity.platform.WebFunction;

import java.util.List;

/**
 * Created by 班耀强 on 2018/8/21
 */
public interface PlatformService {
    List<WebFunction> getLimitedFunctions(int id);

    List<WebFunction> getAllFunctions();
}
