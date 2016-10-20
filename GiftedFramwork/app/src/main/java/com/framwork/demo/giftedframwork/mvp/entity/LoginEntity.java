package com.framwork.demo.giftedframwork.mvp.entity;

import com.framwork.demo.giftedframwork.mvp.entity.base.BaseEntity;
import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Created by cty on 16/10/19.
 */

public class LoginEntity extends BaseEntity{

    public DataEntity data;

    public class DataEntity implements Serializable {
        public String id;
        public String name;
        public String realName;
        public String phone;
        public String introduction;
        public int authStatus;
        public String rgisterTime;
        public String headImage;
        public String sex;  //1:男 0:女
        public String getSex() {
            return sex;
        }
        public void setSex(String sex) {
            this.sex = sex;
        }
        @Expose
        public String nickname;
        public String job;
        public String birthday;
        public String idCard;
        public String identity;
        public String username;
        public String loginSource;
        public String city;
        public int follows;
        //机构特有
        public String abbreviation;    //简称
        public int fans;
        public int works;
        public int projects;
        public int users;
        public int collections;
        public String token;
        public String follow;
        public String email;  //邮箱
        public String loginTime;
        public String signature;     //  个性签
        public String type;            //  机构类型
        public String institutionType;
        public String institutionTypeId;
        public String regionId;
        // ...其它属性 注册成功字段
        public int evaluations;
        public int isXianghuFollow;
        public int applyStatus;
        public String huanxinId;
        public String huanxinName;
        public String idCardImagePath;
        public String applyTime;
        public String fullName;
        public String institutionId;
        public String institutionImage;
        public String authTime;			// 认证时间
        public String applyAuthTime;	// 申请认证时间
        public String authType;       //1:身份证 2：其他
        public String rejectReason;		//认证驳回原因
        public String webHeadImage;
        public String userTypeLevelId;
        public String bussinessId;
        public String projectNumbers;
        public String resourceNums;

        public int getProjectNums() {
            return projectNums;
        }

        public void setProjectNums(int projectNums) {
            this.projectNums = projectNums;
        }

        public int projectNums;
        public int projectUsers;
        public int draft;//草稿数量
        public int newDynamicNums;//动态数量
        public ArrayList<userTypeLevels> userTypeLevels;
        public ArrayList<bussiness> bussiness;

        public String getAuthTime() {
            return authTime;
        }

        public void setAuthTime(String authTime) {
            this.authTime = authTime;
        }

        public String getApplyAuthTime() {
            return applyAuthTime;
        }

        public void setApplyAuthTime(String applyAuthTime) {
            this.applyAuthTime = applyAuthTime;
        }

        public String getAuthType() {
            return authType;
        }

        public void setAuthType(String authType) {
            this.authType = authType;
        }

        public String getRejectReason() {
            return rejectReason;
        }

        public void setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
        }

        public String getHuanxinName() {
            return huanxinName;
        }
        public void setHuanxinName(String huanxinName) {
            this.huanxinName = huanxinName;
        }
        public String getInstitutionImage() {
            return institutionImage;
        }
        public void setInstitutionImage(String institutionImage) {
            this.institutionImage = institutionImage;
        }
        public int getEvaluations() {
            return evaluations;
        }
        public void setEvaluations(int evaluations) {
            this.evaluations = evaluations;
        }
        public int getIsXianghuFollow() {
            return isXianghuFollow;
        }
        public void setIsXianghuFollow(int isXianghuFollow) {
            this.isXianghuFollow = isXianghuFollow;
        }
        public int getApplyStatus() {
            return applyStatus;
        }
        public void setApplyStatus(int applyStatus) {
            this.applyStatus = applyStatus;
        }
        public String getHuanxinId() {
            return huanxinId;
        }
        public void setHuanxinId(String huanxinId) {
            this.huanxinId = huanxinId;
        }
        public String getIdCardImagePath() {
            return idCardImagePath;
        }
        public void setIdCardImagePath(String idCardImagePath) {
            this.idCardImagePath = idCardImagePath;
        }
        public String getApplyTime() {
            return applyTime;
        }
        public void setApplyTime(String applyTime) {
            this.applyTime = applyTime;
        }
        public String getFullName() {
            return fullName;
        }
        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
        public String getInstitutionId() {
            return institutionId;
        }
        public void setInstitutionId(String institutionId) {
            this.institutionId = institutionId;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getRealName() {
            return realName;
        }
        public void setRealName(String realName) {
            this.realName = realName;
        }
        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }
        public String getIntroduction() {
            return introduction;
        }
        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }
        public int getAuthStatus() {
            return authStatus;
        }
        public void setAuthStatus(int authStatus) {
            this.authStatus = authStatus;
        }
        public String getRgisterTime() {
            return rgisterTime;
        }
        public void setRgisterTime(String rgisterTime) {
            this.rgisterTime = rgisterTime;
        }
        public String getHeadImage() {
            return headImage;
        }
        public void setHeadImage(String headImage) {
            this.headImage = headImage;
        }
        public String getNickname() {
            return nickname;
        }
        public void setNickname(String nickname) {
            this.nickname = nickname;
        }
        public String getJob() {
            return job;
        }
        public void setJob(String job) {
            this.job = job;
        }
        public String getBirthday() {
            return birthday;
        }
        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }
        public String getIdCard() {
            return idCard;
        }
        public void setIdCard(String idCard) {
            this.idCard = idCard;
        }
        public String getIdentity() {
            return identity;
        }
        public void setIdentity(String identity) {
            this.identity = identity;
        }
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public String getLoginSource() {
            return loginSource;
        }
        public void setLoginSource(String loginSource) {
            this.loginSource = loginSource;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public int getFollows() {
            return follows;
        }
        public void setFollows(int follows) {
            this.follows = follows;
        }
        public String getAbbreviation() {
            return abbreviation;
        }
        public void setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
        }
        public int getFans() {
            return fans;
        }
        public void setFans(int fans) {
            this.fans = fans;
        }
        public int getWorks() {
            return works;
        }
        public void setWorks(int works) {
            this.works = works;
        }
        public int getProjects() {
            return projects;
        }
        public void setProjects(int projects) {
            this.projects = projects;
        }
        public int getUsers() {
            return users;
        }
        public void setUsers(int users) {
            this.users = users;
        }
        public int getCollections() {
            return collections;
        }
        public void setCollections(int collections) {
            this.collections = collections;
        }
        public String getToken() {
            return token;
        }
        public void setToken(String token) {
            this.token = token;
        }
        public String getFollow() {
            return follow;
        }
        public void setFollow(String follow) {
            this.follow = follow;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getLoginTime() {
            return loginTime;
        }
        public void setLoginTime(String loginTime) {
            this.loginTime = loginTime;
        }
        public String getSignature() {
            return signature;
        }
        public void setSignature(String signature) {
            this.signature = signature;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        public String getInstitutionType() {
            return institutionType;
        }
        public void setInstitutionType(String institutionType) {
            this.institutionType = institutionType;
        }
        public String getInstitutionTypeId() {
            return institutionTypeId;
        }
        public void setInstitutionTypeId(String institutionTypeId) {
            this.institutionTypeId = institutionTypeId;
        }
        public String getRegionId() {
            return regionId;
        }
        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public ArrayList<DataEntity.userTypeLevels> getUserTypeLevels() {
            return userTypeLevels;
        }

        public void setUserTypeLevels(ArrayList<DataEntity.userTypeLevels> userTypeLevels) {
            this.userTypeLevels = userTypeLevels;
        }

        @Override
        public String toString() {
            return "DataEntity [id=" + id + ", name=" + name + ", realName="
                    + realName + ", phone=" + phone + ", introduction="
                    + introduction + ", authStatus=" + authStatus
                    + ", rgisterTime=" + rgisterTime + ", headImage="
                    + headImage + ", sex=" + sex + ", nickname=" + nickname
                    + ", job=" + job + ", birthday=" + birthday + ", idCard="
                    + idCard + ", identity=" + identity + ", username="
                    + username + ", loginSource=" + loginSource + ", city="
                    + city + ", follows=" + follows + ", abbreviation="
                    + abbreviation + ", fans=" + fans + ", works=" + works
                    + ", projects=" + projects + ", users=" + users
                    + ", collections=" + collections + ", token=" + token
                    + ", projectNums=" + projectNums + ", follow=" + follow
                    + ", email=" + email + ", loginTime=" + loginTime
                    + ", signature=" + signature + ", type=" + type
                    + ", institutionType=" + institutionType
                    + ", institutionTypeId=" + institutionTypeId
                    + ", regionId=" + regionId + ", evaluations=" + evaluations
                    + ", isXianghuFollow=" + isXianghuFollow + ", applyStatus="
                    + applyStatus + ", huanxinId=" + huanxinId
                    + ", idCardImagePath=" + idCardImagePath + ", applyTime="
                    + applyTime + ", fullName=" + fullName + ", institutionId="
                    + institutionId + ", getEvaluations()=" + getEvaluations()
                    + ", getIsXianghuFollow()=" + getIsXianghuFollow()
                    + ", getApplyStatus()=" + getApplyStatus()
                    + ", getHuanxinId()=" + getHuanxinId()
                    + ", getIdCardImagePath()=" + getIdCardImagePath()
                    + ", getApplyTime()=" + getApplyTime() + ", getFullName()="
                    + getFullName() + ", getInstitutionId()="
                    + getInstitutionId() + ", getId()=" + getId()
                    + ", getName()=" + getName() + ", getRealName()="
                    + getRealName() + ", getPhone()=" + getPhone()
                    + ", getIntroduction()=" + getIntroduction()
                    + ", getAuthStatus()=" + getAuthStatus()
                    + ", getRgisterTime()=" + getRgisterTime()
                    + ", getHeadImage()=" + getHeadImage() + ", getSex()="
                    + sex + ", getNickname()=" + getNickname()
                    + ", getJob()=" + getJob() + ", getBirthday()="
                    + getBirthday() + ", getIdCard()=" + getIdCard()
                    + ", getIdentity()=" + getIdentity() + ", getUsername()="
                    + getUsername() + ", getLoginSource()=" + getLoginSource()
                    + ", getCity()=" + getCity() + ", getFollows()="
                    + getFollows() + ", getAbbreviation()=" + getAbbreviation()
                    + ", getFans()=" + getFans() + ", getWorks()=" + getWorks()
                    + ", getProjects()=" + getProjects() + ", getUsers()="
                    + getUsers() + ", getCollections()=" + getCollections()
                    + ", getToken()=" + getToken() + ", getProjectNums()="
                    + getProjectNums() + ", getFollow()=" + getFollow()
                    + ", getEmail()=" + getEmail() + ", getLoginTime()="
                    + getLoginTime() + ", getSignature()=" + getSignature()
                    + ", getType()=" + getType() + ", getInstitutionType()="
                    + getInstitutionType() + ", getInstitutionTypeId()="
                    + getInstitutionTypeId() + ", getRegionId()="
                    + getRegionId() + ", getClass()=" + getClass()
                    + ", hashCode()=" + hashCode() + ", toString()="
                    + super.toString() + "]";
        }

        public  class userTypeLevels implements Serializable{
            public int id;
            public int isActive;
            public String created;
            public String updated;
            public String typeName;
            public String typeName_en;
            public String remark;
            @Expose
            public boolean isSelection = false;
            @Override
            public String toString() {
                return "Levels{" +
                        "id=" + id +
                        ", isActive=" + isActive +
                        ", created='" + created + '\'' +
                        ", updated='" + updated + '\'' +
                        ", typeName='" + typeName + '\'' +
                        ", typeName_en='" + typeName_en + '\'' +
                        ", remark='" + remark + '\'' +
                        ", userType=" + userType +
                        '}';
            }


            public UserType userType;

            public UserType getUserType() {
                return userType;
            }

            public void setUserType(UserType userType) {
                this.userType = userType;
            }

            public  class UserType implements Serializable{
                public int id;
                public int isActive;
                public String created;
                public String updated;
                public String typeName;
                public String typeName_en;
                public String remark;
            }
        }

        public class bussiness implements Serializable{
            public int id;
            public int isActive;
            public String created;
            public String updated;
            public String name;
            public String icon;
            public String remark;
            public String sort;
            public SysUser sysUser;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getIsActive() {
                return isActive;
            }

            public void setIsActive(int isActive) {
                this.isActive = isActive;
            }

            public String getCreated() {
                return created;
            }

            public void setCreated(String created) {
                this.created = created;
            }

            public String getUpdated() {
                return updated;
            }

            public void setUpdated(String updated) {
                this.updated = updated;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getSort() {
                return sort;
            }

            public void setSort(String sort) {
                this.sort = sort;
            }

            public SysUser getSysUser() {
                return sysUser;
            }

            public void setSysUser(SysUser sysUser) {
                this.sysUser = sysUser;
            }

            public class SysUser implements Serializable{
                public int id;
                public int isActive;
                public String created;
                public String updated;
                public String name;
                public String userName;
                public String password;
                public String phone;
                public String status;
                public Authority authority;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getIsActive() {
                    return isActive;
                }

                public void setIsActive(int isActive) {
                    this.isActive = isActive;
                }

                public String getCreated() {
                    return created;
                }

                public void setCreated(String created) {
                    this.created = created;
                }

                public String getUpdated() {
                    return updated;
                }

                public void setUpdated(String updated) {
                    this.updated = updated;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUserName() {
                    return userName;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }

                public String getPassword() {
                    return password;
                }

                public void setPassword(String password) {
                    this.password = password;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public class Authority implements Serializable {
                    public int id;
                    public int isActive;
                    public String created;
                    public String updated;
                    public int num;
                    public String name;
                    public String user;
                }
            }
        }

    }
}
