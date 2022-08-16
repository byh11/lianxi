package Sequential;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import protocol.ConnectResponsePacket;

import java.lang.reflect.Method;

public class ConnectResponseHandler extends SimpleChannelInboundHandler<ConnectResponsePacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ConnectResponsePacket connectResponsePacket) throws Exception {
        System.out.println(11);
        TaskThread.sequential.add(connectResponsePacket.getKay(),connectResponsePacket.getVal(),connectResponsePacket.getTime());
    }
}
