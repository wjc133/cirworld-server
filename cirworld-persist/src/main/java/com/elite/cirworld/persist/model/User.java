package com.elite.cirworld.persist.model;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uid
     *
     * @mbggenerated
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbggenerated
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.default_user
     *
     * @mbggenerated
     */
    private Boolean defaultUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.last_login_time
     *
     * @mbggenerated
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.last_login_ip
     *
     * @mbggenerated
     */
    private String lastLoginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gender
     *
     * @mbggenerated
     */
    private Boolean gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar
     *
     * @mbggenerated
     */
    private String avatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nickname
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.region
     *
     * @mbggenerated
     */
    private String region;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sign_time
     *
     * @mbggenerated
     */
    private Date signTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.weixin_open_id
     *
     * @mbggenerated
     */
    private String weixinOpenId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.qq_open_id
     *
     * @mbggenerated
     */
    private String qqOpenId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.weibo_open_id
     *
     * @mbggenerated
     */
    private String weiboOpenId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.weixin_nick
     *
     * @mbggenerated
     */
    private String weixinNick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.weibo_nick
     *
     * @mbggenerated
     */
    private String weiboNick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.qq_nick
     *
     * @mbggenerated
     */
    private String qqNick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.main_account
     *
     * @mbggenerated
     */
    private String mainAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.valid
     *
     * @mbggenerated
     */
    private Boolean valid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uid
     *
     * @return the value of user.uid
     * @mbggenerated
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uid
     *
     * @param uid the value for user.uid
     * @mbggenerated
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     * @mbggenerated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     * @mbggenerated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.default_user
     *
     * @return the value of user.default_user
     * @mbggenerated
     */
    public Boolean getDefaultUser() {
        return defaultUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.default_user
     *
     * @param defaultUser the value for user.default_user
     * @mbggenerated
     */
    public void setDefaultUser(Boolean defaultUser) {
        this.defaultUser = defaultUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.last_login_time
     *
     * @return the value of user.last_login_time
     * @mbggenerated
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.last_login_time
     *
     * @param lastLoginTime the value for user.last_login_time
     * @mbggenerated
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.last_login_ip
     *
     * @return the value of user.last_login_ip
     * @mbggenerated
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.last_login_ip
     *
     * @param lastLoginIp the value for user.last_login_ip
     * @mbggenerated
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gender
     *
     * @return the value of user.gender
     * @mbggenerated
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gender
     *
     * @param gender the value for user.gender
     * @mbggenerated
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar
     *
     * @return the value of user.avatar
     * @mbggenerated
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar
     *
     * @param avatar the value for user.avatar
     * @mbggenerated
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nickname
     *
     * @return the value of user.nickname
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.nickname
     *
     * @param nickname the value for user.nickname
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.region
     *
     * @return the value of user.region
     * @mbggenerated
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.region
     *
     * @param region the value for user.region
     * @mbggenerated
     */
    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.description
     *
     * @return the value of user.description
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.description
     *
     * @param description the value for user.description
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sign_time
     *
     * @return the value of user.sign_time
     * @mbggenerated
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sign_time
     *
     * @param signTime the value for user.sign_time
     * @mbggenerated
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_time
     *
     * @return the value of user.update_time
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_time
     *
     * @param updateTime the value for user.update_time
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.weixin_open_id
     *
     * @return the value of user.weixin_open_id
     * @mbggenerated
     */
    public String getWeixinOpenId() {
        return weixinOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.weixin_open_id
     *
     * @param weixinOpenId the value for user.weixin_open_id
     * @mbggenerated
     */
    public void setWeixinOpenId(String weixinOpenId) {
        this.weixinOpenId = weixinOpenId == null ? null : weixinOpenId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.qq_open_id
     *
     * @return the value of user.qq_open_id
     * @mbggenerated
     */
    public String getQqOpenId() {
        return qqOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.qq_open_id
     *
     * @param qqOpenId the value for user.qq_open_id
     * @mbggenerated
     */
    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId == null ? null : qqOpenId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.weibo_open_id
     *
     * @return the value of user.weibo_open_id
     * @mbggenerated
     */
    public String getWeiboOpenId() {
        return weiboOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.weibo_open_id
     *
     * @param weiboOpenId the value for user.weibo_open_id
     * @mbggenerated
     */
    public void setWeiboOpenId(String weiboOpenId) {
        this.weiboOpenId = weiboOpenId == null ? null : weiboOpenId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.weixin_nick
     *
     * @return the value of user.weixin_nick
     * @mbggenerated
     */
    public String getWeixinNick() {
        return weixinNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.weixin_nick
     *
     * @param weixinNick the value for user.weixin_nick
     * @mbggenerated
     */
    public void setWeixinNick(String weixinNick) {
        this.weixinNick = weixinNick == null ? null : weixinNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.weibo_nick
     *
     * @return the value of user.weibo_nick
     * @mbggenerated
     */
    public String getWeiboNick() {
        return weiboNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.weibo_nick
     *
     * @param weiboNick the value for user.weibo_nick
     * @mbggenerated
     */
    public void setWeiboNick(String weiboNick) {
        this.weiboNick = weiboNick == null ? null : weiboNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.qq_nick
     *
     * @return the value of user.qq_nick
     * @mbggenerated
     */
    public String getQqNick() {
        return qqNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.qq_nick
     *
     * @param qqNick the value for user.qq_nick
     * @mbggenerated
     */
    public void setQqNick(String qqNick) {
        this.qqNick = qqNick == null ? null : qqNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.main_account
     *
     * @return the value of user.main_account
     * @mbggenerated
     */
    public String getMainAccount() {
        return mainAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.main_account
     *
     * @param mainAccount the value for user.main_account
     * @mbggenerated
     */
    public void setMainAccount(String mainAccount) {
        this.mainAccount = mainAccount == null ? null : mainAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.valid
     *
     * @return the value of user.valid
     * @mbggenerated
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.valid
     *
     * @param valid the value for user.valid
     * @mbggenerated
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
                && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
                && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
                && (this.getDefaultUser() == null ? other.getDefaultUser() == null : this.getDefaultUser().equals(other.getDefaultUser()))
                && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
                && (this.getLastLoginIp() == null ? other.getLastLoginIp() == null : this.getLastLoginIp().equals(other.getLastLoginIp()))
                && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
                && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
                && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
                && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (this.getSignTime() == null ? other.getSignTime() == null : this.getSignTime().equals(other.getSignTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getWeixinOpenId() == null ? other.getWeixinOpenId() == null : this.getWeixinOpenId().equals(other.getWeixinOpenId()))
                && (this.getQqOpenId() == null ? other.getQqOpenId() == null : this.getQqOpenId().equals(other.getQqOpenId()))
                && (this.getWeiboOpenId() == null ? other.getWeiboOpenId() == null : this.getWeiboOpenId().equals(other.getWeiboOpenId()))
                && (this.getWeixinNick() == null ? other.getWeixinNick() == null : this.getWeixinNick().equals(other.getWeixinNick()))
                && (this.getWeiboNick() == null ? other.getWeiboNick() == null : this.getWeiboNick().equals(other.getWeiboNick()))
                && (this.getQqNick() == null ? other.getQqNick() == null : this.getQqNick().equals(other.getQqNick()))
                && (this.getMainAccount() == null ? other.getMainAccount() == null : this.getMainAccount().equals(other.getMainAccount()))
                && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getDefaultUser() == null) ? 0 : getDefaultUser().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getLastLoginIp() == null) ? 0 : getLastLoginIp().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getSignTime() == null) ? 0 : getSignTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getWeixinOpenId() == null) ? 0 : getWeixinOpenId().hashCode());
        result = prime * result + ((getQqOpenId() == null) ? 0 : getQqOpenId().hashCode());
        result = prime * result + ((getWeiboOpenId() == null) ? 0 : getWeiboOpenId().hashCode());
        result = prime * result + ((getWeixinNick() == null) ? 0 : getWeixinNick().hashCode());
        result = prime * result + ((getWeiboNick() == null) ? 0 : getWeiboNick().hashCode());
        result = prime * result + ((getQqNick() == null) ? 0 : getQqNick().hashCode());
        result = prime * result + ((getMainAccount() == null) ? 0 : getMainAccount().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", birthday=").append(birthday);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", username=").append(username);
        sb.append(", defaultUser=").append(defaultUser);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", lastLoginIp=").append(lastLoginIp);
        sb.append(", gender=").append(gender);
        sb.append(", avatar=").append(avatar);
        sb.append(", nickname=").append(nickname);
        sb.append(", region=").append(region);
        sb.append(", description=").append(description);
        sb.append(", signTime=").append(signTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", weixinOpenId=").append(weixinOpenId);
        sb.append(", qqOpenId=").append(qqOpenId);
        sb.append(", weiboOpenId=").append(weiboOpenId);
        sb.append(", weixinNick=").append(weixinNick);
        sb.append(", weiboNick=").append(weiboNick);
        sb.append(", qqNick=").append(qqNick);
        sb.append(", mainAccount=").append(mainAccount);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}