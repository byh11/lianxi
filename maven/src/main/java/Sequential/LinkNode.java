package Sequential;

import java.util.HashMap;

public class LinkNode {
    private HashMap<String,String> map=new HashMap<>();
    private long time;
    private LinkNode next;

    public LinkNode(){}

    public LinkNode(String kay,String val,long time){
        map.put(kay,val);
        this.time=time;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
