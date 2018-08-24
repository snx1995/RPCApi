package top.banyaoqiang.RPCApi.entity;

import java.util.Date;

/**
 * Created by 班耀强 on 2018/8/21
 */
public class User {

    private Integer id;
    private String name;
    private Integer authLv;
    private String phone;
    private String address;
    private String education;
    private String job;
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthLv() {
        return authLv;
    }

    public void setAuthLv(int authLv) {
        this.authLv = authLv;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
