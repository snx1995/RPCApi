package top.banyaoqiang.RPCApi.common.coder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import top.banyaoqiang.RPCApi.common.serialization.SerializationUtil;

/**
 * Created by 班耀强 on 2018/8/11
 */
public class RPCEncoder extends MessageToByteEncoder {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Object o, ByteBuf byteBuf) throws Exception {
        byte[] bytes = SerializationUtil.serilize(o);
        byteBuf.writeInt(bytes.length);
        byteBuf.writeBytes(bytes);
    }
}
