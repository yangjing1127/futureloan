//package com.yj.dao;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//public class Member {
//    private Integer id;
//
//    private String regname;
//
//    private String pwd;
//
//    private Integer type;
//
//    private String salt;
//
//    private String photo;
//
//    private Date birth;
//
//    private String mobilephone;
//
//    private String email;
//
//    private Date regtime;
//
//    private String regip;
//
//    private String realname;
//
//    private String idnumber;
//
//    private String addressinfo;
//
//    private Boolean isvalid;
//
//    private BigDecimal leaveamount;
//
//    private Boolean isvalidatemobile;
//
//    private Boolean isvalidateemail;
//
//    private Integer vip;
//
//    private Integer regtype;
//
//    private String paypwd;
//
//    private String paypwdsalt;
//
//    private Date lastlogtime;
//
//    private Integer expgrade;
//
//    private Integer expvalue;
//
//    public Member(Integer id, String regname, String pwd, Integer type, String salt, String photo, Date birth, String mobilephone, String email, Date regtime, String regip, String realname, String idnumber, String addressinfo, Boolean isvalid, BigDecimal leaveamount, Boolean isvalidatemobile, Boolean isvalidateemail, Integer vip, Integer regtype, String paypwd, String paypwdsalt, Date lastlogtime, Integer expgrade, Integer expvalue) {
//        this.id = id;
//        this.regname = regname;
//        this.pwd = pwd;
//        this.type = type;
//        this.salt = salt;
//        this.photo = photo;
//        this.birth = birth;
//        this.mobilephone = mobilephone;
//        this.email = email;
//        this.regtime = regtime;
//        this.regip = regip;
//        this.realname = realname;
//        this.idnumber = idnumber;
//        this.addressinfo = addressinfo;
//        this.isvalid = isvalid;
//        this.leaveamount = leaveamount;
//        this.isvalidatemobile = isvalidatemobile;
//        this.isvalidateemail = isvalidateemail;
//        this.vip = vip;
//        this.regtype = regtype;
//        this.paypwd = paypwd;
//        this.paypwdsalt = paypwdsalt;
//        this.lastlogtime = lastlogtime;
//        this.expgrade = expgrade;
//        this.expvalue = expvalue;
//    }
//
//    public Member() {
//        super();
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getRegname() {
//        return regname;
//    }
//
//    public void setRegname(String regname) {
//        this.regname = regname == null ? null : regname.trim();
//    }
//
//    public String getPwd() {
//        return pwd;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd == null ? null : pwd.trim();
//    }
//
//    public Integer getType() {
//        return type;
//    }
//
//    public void setType(Integer type) {
//        this.type = type;
//    }
//
//    public String getSalt() {
//        return salt;
//    }
//
//    public void setSalt(String salt) {
//        this.salt = salt == null ? null : salt.trim();
//    }
//
//    public String getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(String photo) {
//        this.photo = photo == null ? null : photo.trim();
//    }
//
//    public Date getBirth() {
//        return birth;
//    }
//
//    public void setBirth(Date birth) {
//        this.birth = birth;
//    }
//
//    public String getMobilephone() {
//        return mobilephone;
//    }
//
//    public void setMobilephone(String mobilephone) {
//        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email == null ? null : email.trim();
//    }
//
//    public Date getRegtime() {
//        return regtime;
//    }
//
//    public void setRegtime(Date regtime) {
//        this.regtime = regtime;
//    }
//
//    public String getRegip() {
//        return regip;
//    }
//
//    public void setRegip(String regip) {
//        this.regip = regip == null ? null : regip.trim();
//    }
//
//    public String getRealname() {
//        return realname;
//    }
//
//    public void setRealname(String realname) {
//        this.realname = realname == null ? null : realname.trim();
//    }
//
//    public String getIdnumber() {
//        return idnumber;
//    }
//
//    public void setIdnumber(String idnumber) {
//        this.idnumber = idnumber == null ? null : idnumber.trim();
//    }
//
//    public String getAddressinfo() {
//        return addressinfo;
//    }
//
//    public void setAddressinfo(String addressinfo) {
//        this.addressinfo = addressinfo == null ? null : addressinfo.trim();
//    }
//
//    public Boolean getIsvalid() {
//        return isvalid;
//    }
//
//    public void setIsvalid(Boolean isvalid) {
//        this.isvalid = isvalid;
//    }
//
//    public BigDecimal getLeaveamount() {
//        return leaveamount;
//    }
//
//    public void setLeaveamount(BigDecimal leaveamount) {
//        this.leaveamount = leaveamount;
//    }
//
//    public Boolean getIsvalidatemobile() {
//        return isvalidatemobile;
//    }
//
//    public void setIsvalidatemobile(Boolean isvalidatemobile) {
//        this.isvalidatemobile = isvalidatemobile;
//    }
//
//    public Boolean getIsvalidateemail() {
//        return isvalidateemail;
//    }
//
//    public void setIsvalidateemail(Boolean isvalidateemail) {
//        this.isvalidateemail = isvalidateemail;
//    }
//
//    public Integer getVip() {
//        return vip;
//    }
//
//    public void setVip(Integer vip) {
//        this.vip = vip;
//    }
//
//    public Integer getRegtype() {
//        return regtype;
//    }
//
//    public void setRegtype(Integer regtype) {
//        this.regtype = regtype;
//    }
//
//    public String getPaypwd() {
//        return paypwd;
//    }
//
//    public void setPaypwd(String paypwd) {
//        this.paypwd = paypwd == null ? null : paypwd.trim();
//    }
//
//    public String getPaypwdsalt() {
//        return paypwdsalt;
//    }
//
//    public void setPaypwdsalt(String paypwdsalt) {
//        this.paypwdsalt = paypwdsalt == null ? null : paypwdsalt.trim();
//    }
//
//    public Date getLastlogtime() {
//        return lastlogtime;
//    }
//
//    public void setLastlogtime(Date lastlogtime) {
//        this.lastlogtime = lastlogtime;
//    }
//
//    public Integer getExpgrade() {
//        return expgrade;
//    }
//
//    public void setExpgrade(Integer expgrade) {
//        this.expgrade = expgrade;
//    }
//
//    public Integer getExpvalue() {
//        return expvalue;
//    }
//
//    public void setExpvalue(Integer expvalue) {
//        this.expvalue = expvalue;
//    }
//}