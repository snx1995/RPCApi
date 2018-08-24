package top.banyaoqiang.RPCApi.protocal;

import top.banyaoqiang.RPCApi.entity.OperationResult;

import java.io.Serializable;

/**
 * Created by 班耀强 on 2018/8/5
 */
public class RPCResponse implements Serializable {
    private int status;
    private Object result;
    private Exception exception;

    public RPCResponse() {}

    public RPCResponse(int status, Object result) {
        this.status = status;
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public boolean exceptionHappened() {
        return exception != null;
    }
}
