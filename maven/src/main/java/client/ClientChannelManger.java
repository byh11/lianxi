package client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import protocol.PacketCodecHandler;

public class ClientChannelManger extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(PacketCodecHandler.INSTANCE);
    }
}
