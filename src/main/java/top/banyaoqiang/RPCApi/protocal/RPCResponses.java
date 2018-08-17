package top.banyaoqiang.RPCApi.protocal;

/**
 * Created by 班耀强 on 2018/8/9
 */
public final class RPCResponses {
    public static final RPCResponse SUCCESS = new RPCResponse(200, "success");
    public static final RPCResponse ERROR = new RPCResponse(400, "bad request");
    public static final RPCResponse SERVER_ERROR = new RPCResponse(500, "internal server error");
}
