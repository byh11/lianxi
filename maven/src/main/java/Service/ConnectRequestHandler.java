package Service;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import protocol.ConnectRequestPacket;
import protocol.ConnectResponsePacket;

public class ConnectRequestHandler extends SimpleChannelInboundHandler<ConnectRequestPacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ConnectRequestPacket connectRequestPacket) throws Exception {
        System.out.println(111);
        if(SequentialGroup.getChannelGroup()==null){
            SequentialGroup.setChannelGroup(new DefaultChannelGroup(channelHandlerContext.executor()));
        }else {
            ChannelGroup group= SequentialGroup.getChannelGroup();
            group.add(channelHandlerContext.channel());
        }
        ConnectResponsePacket connectResponsePacket = new ConnectResponsePacket();
        connectResponsePacket.setKay("123");
        connectResponsePacket.setVal("333");
        connectResponsePacket.setTime(11111);
        SequentialGroup.getChannelGroup().writeAndFlush(connectResponsePacket);
    }
}
