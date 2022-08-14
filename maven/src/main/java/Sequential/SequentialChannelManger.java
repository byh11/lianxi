package Sequential;

import Service.ConnectRequestHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import protocol.PacketCodecHandler;

public class SequentialChannelManger extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(PacketCodecHandler.INSTANCE);
        socketChannel.pipeline().addLast(new ConnectResponseHandler());
    }
}
