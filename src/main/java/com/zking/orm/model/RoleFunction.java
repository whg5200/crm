package com.zking.orm.model;

public class RoleFunction {
    private Integer rfId;

    private Integer roleId;

    private Integer functionId;

    public RoleFunction(Integer rfId, Integer roleId, Integer functionId) {
        this.rfId = rfId;
        this.roleId = roleId;
        this.functionId = functionId;
    }

    public RoleFunction() {
        super();
    }

    public Integer getRfId() {
        return rfId;
    }

    public void setRfId(Integer rfId) {
        this.rfId = rfId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }
}