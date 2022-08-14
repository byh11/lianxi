package Sequential;

import client.ClientChannelManger;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import protocol.ConnectRequestPacket;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        TaskThread thread=new TaskThread();
        thread.start();
        NioEventLoopGroup worker=new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(worker)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new SequentialChannelManger())
                .connect("localhost",8000).addListener(new ChannelFutureListener(){
                    @Override
                    public void operationComplete(ChannelFuture channelFuture) throws Exception {
                        channelFuture.channel().writeAndFlush(new ConnectRequestPacket());
                    }
                });
    }


}
