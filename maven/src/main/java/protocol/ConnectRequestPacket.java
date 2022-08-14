package protocol;

public class ConnectRequestPacket extends BaseMsgPacket{
    @Override
    public byte getCommand() {
        return Constant.CONNECT_REQUEST;
    }
}
