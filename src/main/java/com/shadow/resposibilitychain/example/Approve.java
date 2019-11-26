package com.shadow.resposibilitychain.example;

public abstract class Approve {

    protected String name;
    /**
     * 下一个处理者
     */
    protected Approve approver;

    public Approve(String name) {
        this.name = name;
    }

    public void setApprover(Approve approver) {
        this.approver = approver;
    }

    public abstract void processRequest(ApproveRequest request);

}
