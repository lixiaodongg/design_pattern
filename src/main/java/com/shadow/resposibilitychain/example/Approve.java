package com.shadow.resposibilitychain.example;

public  class Approve {
    private Condition condition;
    protected String name;
    /**
     * 下一个处理者
     */
    protected Approve approver;

    public Approve(String name, Condition condition) {
        this.name = name;
        this.condition = condition;
    }

    public void setApprover(Approve approver) {
        this.approver = approver;
    }

    public void processRequest(ApproveRequest request) {

        if (condition.trigger(request)) {
            System.out.println(name + "处理了请求： id= " + request.getId() + "  price= " + request.getPrice());
        } else {
            if (approver != null)
                approver.processRequest(request);
        }
    }

}
