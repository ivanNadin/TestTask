package com.ivanNadin;

import java.util.PriorityQueue;

/**
 * Created by NIO on 10/28/2016.
 */
public class Working implements Runnable {

    private Element4Work val;
    @Override

    public void run() {

            System.out.println(getVal().getItemId() + " " + getVal().getGroupId());
    }

    Working(Element4Work eWork){
        setVal(eWork);
    }
    public Element4Work getVal() {
        return val;
    }

    public void setVal(Element4Work val) {
        this.val = val;
    }

}
