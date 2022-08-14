package Service;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.sctp.nio.NioSctpChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import protocol.PacketCodecHandler;

public class ServerChannelManger extends ChannelInitializer<NioSocketChannel> {
    @Override
    protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {
        nioSocketChannel.pipeline().addLast(PacketCodecHandler.INSTANCE);
        nioSocketChannel.pipeline().addLast(new ConnectRequestHandler());
    }
}
