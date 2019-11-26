package com.shadow.resposibilitychain.example;


public class Approver extends Approve {
    private Condition condition;

    public Approver(String name, Condition condition) {
        super(name);
        this.condition = condition;
    }

    @Override
    public void processRequest(ApproveRequest request) {
        if (condition.trigger(request)) {
            System.out.println(name + "处理了请求： id= " + request.getId() + "  price= " + request.getPrice());
        } else {
            if (approver != null)
                approver.processRequest(request);
        }
    }

}
