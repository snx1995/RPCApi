package top.banyaoqiang.RPCApi.entity;

import java.io.Serializable;

/**
 * Created by 班耀强 on 2018/8/5
 */
public class OperationResult implements Serializable {
    private int status;
    private String result;

    public OperationResult(int status, String result) {
        this.status = status;
        this.result = result;
    }

    public static OperationResult success() {
        return new OperationResult(200, "success");
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
