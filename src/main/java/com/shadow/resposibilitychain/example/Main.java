package com.shadow.resposibilitychain.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 学校OA系统的采购审批项目:
 * 需求是
 * 1)采购员采购教学器材
 * 2)如果金额小于等于5000,由教学主任审批
 * 3)如果金额小于等于10000,由院长审批
 * 4)如果金额小于等于30000,由副校长审批
 * 5)如果金额超过30000以上,有校长审批请设计程序完成采购审批项目
 */
public class Main {
    public static void main(String[] args) {
        int step = 5000;
        ApproveRequest request = new ApproveRequest(499);
        List<Approve> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Approver approver1 = new Approver("执行者" + i, new Condition(i * step, (i + 1) * step));
            list.add(approver1);
        }
        list.add(new Approver("执行者" + list.size(), new Condition(list.size() * step, 0)));
        chain(list.toArray(new Approve[0]));
        list.get(4).processRequest(request);
    }


    @Test
    public void test() {
        ApproveRequest request = new ApproveRequest(49919);
        Approver approver1 = new Approver("教导主任", new Condition(0, 5000));
        Approver approver2 = new Approver("副校长", new Condition(5000, 10000));
        Approver approver3 = new Approver("校长", new Condition(10000, 0));
        chain(approver1, approver2, approver3);
        approver1.processRequest(request);
    }


    /**
     * 将所有的点连接起来
     *
     * @param approve
     */
    public static void chain(Approve... approve) {
        if (approve == null) {
            return;
        }
        if (approve.length <= 1) {
            return;
        }
        for (int i = 0; i < approve.length - 1; i++) {
            approve[i].setApprover(approve[i + 1]);
        }
        approve[approve.length - 1].setApprover(approve[0]);
    }


}
