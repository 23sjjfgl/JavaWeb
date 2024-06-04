package com.lanqiao.pojo;

// 实体类小组表
public class groups999 {
    private Integer groupId;    // 小组（主键）
    private String groupName;   // 小组名
    private double groupScore;  // 小组分数
    private Integer groupClassId; // （小组与班级）外键


    public groups999() {
    }


    public groups999(String groupName, double groupScore, Integer groupClassId) {
        this.groupName = groupName;
        this.groupScore = groupScore;
        this.groupClassId = groupClassId;
    }

    public groups999(Integer groupId, String groupName, double groupScore, Integer groupClassId) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupScore = groupScore;
        this.groupClassId = groupClassId;
    }

    /**
     * 获取
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置
     * @param groupId
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 获取
     * @return groupScore
     */
    public double getGroupScore() {
        return groupScore;
    }

    /**
     * 设置
     * @param groupScore
     */
    public void setGroupScore(double groupScore) {
        this.groupScore = groupScore;
    }

    /**
     * 获取
     * @return groupClassId
     */
    public Integer getGroupClassId() {
        return groupClassId;
    }

    /**
     * 设置
     * @param groupClassId
     */
    public void setGroupClassId(Integer groupClassId) {
        this.groupClassId = groupClassId;
    }

    public String toString() {
        return "groups999{groupId = " + groupId + ", groupName = " + groupName + ", groupScore = " + groupScore + ", groupClassId = " + groupClassId + "}";
    }
}
