package protocol;

public class ConnectResponsePacket extends BaseMsgPacket{
    private String kay;
    private String val;
    private long time;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getKay() {
        return kay;
    }

    public void setKay(String kay) {
        this.kay = kay;
    }

    @Override
    public byte getCommand() {
        return Constant.CONNECT_RESPONSE;
    }
}
