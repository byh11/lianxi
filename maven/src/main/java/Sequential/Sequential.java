package Sequential;

public class Sequential {
    private LinkNode node;
    public LinkNode getNode() {
        return node;
    }

    public Sequential(){
        node=new LinkNode();
    }

    public void setNode(LinkNode node) {
        this.node = node;
    }

    public Boolean add(String kay, String val, long time){
        LinkNode linkNode=node;
        while (node.getNext()!=null){
            if(node.getMap().get(kay)!=null){
                return false;
            }
            linkNode=linkNode.getNext();
        }
        linkNode=node;
        if(node.getNext()==null){
            node.setNext(new LinkNode(kay,val,time));
        }else {
            while (node.getNext() != null) {
                if (time < node.getNext().getTime()) {
                    LinkNode linkNode1 = new LinkNode(kay, val, time);
                    System.out.println(linkNode1.getTime());
                    linkNode1.setNext(linkNode.getNext());
                    linkNode.setNext(linkNode1);
                    break;
                }
                linkNode = linkNode.getNext();
            }
        }
        TaskThread.countDownLatch.countDown();
        return true;
    }

    public void del(){
        node=node.getNext();
    }

}
