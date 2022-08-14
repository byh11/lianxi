package protocol;

import java.util.HashMap;
import java.util.Map;

public interface Constant {

    byte CONNECT_REQUEST=1;
    byte CONNECT_RESPONSE=2;

    byte JSON_SERIALIZER = 100;


    Map<Byte, Serializer> serializerMap = new HashMap<Byte, Serializer>() {
        {
            put(Constant.JSON_SERIALIZER, Serializer.DEFAULT);
        }
    };
    Map<Byte, Class<? extends BaseMsgPacket>> packetMap = new HashMap<Byte, Class<? extends BaseMsgPacket>>() {
        {
            put(CONNECT_REQUEST, ConnectRequestPacket.class);
            put(CONNECT_RESPONSE, ConnectResponsePacket.class);
        }
    };
}
