package top.banyaoqiang.RPCApi.entity.platform;

/**
 * Created by 班耀强 on 2018/8/21
 */
public class WebFunction {
    private Integer funcId;
    private Integer funcLevel;
    private Integer parent;
    private String funcName;
    private Integer authLv;
    private String funcUrl;

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public Integer getFuncLevel() {
        return funcLevel;
    }

    public void setFuncLevel(Integer funcLevel) {
        this.funcLevel = funcLevel;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public Integer getAuthLv() {
        return authLv;
    }

    public void setAuthLv(Integer authLv) {
        this.authLv = authLv;
    }

    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl;
    }
}
