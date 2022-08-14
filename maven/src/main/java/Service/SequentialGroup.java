package Service;


import io.netty.channel.group.DefaultChannelGroup;

public class SequentialGroup {

    private static DefaultChannelGroup channelGroup=null;

    public static DefaultChannelGroup getChannelGroup() {
        return channelGroup;
    }

    public static void setChannelGroup(DefaultChannelGroup channelGroup) {
        SequentialGroup.channelGroup = channelGroup;
    }
}
