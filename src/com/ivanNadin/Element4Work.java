package com.ivanNadin;

/**
 * Created by NIO on 10/28/2016.
 */
public class Element4Work  {
        private int itemId;
        private int groupId;



     Element4Work(int itemId, int groupId){
         setItemId(itemId);
         setGroupId(groupId);
        }

    public int getGroupId() {
        return groupId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
