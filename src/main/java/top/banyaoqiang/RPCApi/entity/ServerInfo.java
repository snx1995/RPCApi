package top.banyaoqiang.RPCApi.entity;

import java.io.Serializable;

/**
 * Created by 班耀强 on 2018/7/13
 */
public class ServerInfo implements Serializable {
    private String serverName;
    private String info;

    public ServerInfo(String serverName) {
        this.serverName = serverName;
    }

    public ServerInfo(String serverName, String info) {
        this.serverName = serverName;
        this.info = info;
    }

    public String getServerName() {
        return serverName;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Server: " + serverName + "\n" +
                "Description: " + info;
    }
}
