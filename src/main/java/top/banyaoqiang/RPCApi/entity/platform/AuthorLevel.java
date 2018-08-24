package top.banyaoqiang.RPCApi.entity.platform;

/**
 * Created by 班耀强 on 2018/8/21
 */
public class AuthorLevel {
    private Integer authLv;
    private String description;
    private Integer scoreRequired;

    public Integer getAuthLv() {
        return authLv;
    }

    public void setAuthLv(Integer authLv) {
        this.authLv = authLv;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getScoreRequired() {
        return scoreRequired;
    }

    public void setScoreRequired(Integer scoreRequired) {
        this.scoreRequired = scoreRequired;
    }
}
