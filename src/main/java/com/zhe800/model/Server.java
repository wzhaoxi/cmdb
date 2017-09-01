package com.zhe800.model;

import java.util.Date;

public class Server {
    private Integer id;

    private String assertNumber;

    private String idracIp;

    private String hostname;

    private String status;

    private String principal;

    private String type;

    private String model;

    private String snNumber;

    private Date buyTime;

    private Date addedTime;

    private Integer idcId;

    private Integer cabinetId;

    private String cabinetPosition;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssertNumber() {
        return assertNumber;
    }

    public void setAssertNumber(String assertNumber) {
        this.assertNumber = assertNumber == null ? null : assertNumber.trim();
    }

    public String getIdracIp() {
        return idracIp;
    }

    public void setIdracIp(String idracIp) {
        this.idracIp = idracIp == null ? null : idracIp.trim();
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getSnNumber() {
        return snNumber;
    }

    public void setSnNumber(String snNumber) {
        this.snNumber = snNumber == null ? null : snNumber.trim();
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public Integer getIdcId() {
        return idcId;
    }

    public void setIdcId(Integer idcId) {
        this.idcId = idcId;
    }

    public Integer getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(Integer cabinetId) {
        this.cabinetId = cabinetId;
    }

    public String getCabinetPosition() {
        return cabinetPosition;
    }

    public void setCabinetPosition(String cabinetPosition) {
        this.cabinetPosition = cabinetPosition == null ? null : cabinetPosition.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}