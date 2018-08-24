package top.banyaoqiang.RPCApi.common.coder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import top.banyaoqiang.RPCApi.common.serialization.SerializationUtil;

import java.util.List;

/**
 * Created by 班耀强 on 2018/8/11
 */
public class RPCDecoder extends ByteToMessageDecoder {
    private Class<?> clazz;

    public RPCDecoder(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (byteBuf.readableBytes() < 4) return;
        byteBuf.markReaderIndex();
        int len = byteBuf.readInt();
        if (byteBuf.readableBytes() < len) {
            byteBuf.resetReaderIndex();
            return;
        }

        byte[] bytes = new byte[len];
        byteBuf.readBytes(bytes);
        Object msg = SerializationUtil.deserialize(bytes, clazz);
        list.add(msg);
    }
}
