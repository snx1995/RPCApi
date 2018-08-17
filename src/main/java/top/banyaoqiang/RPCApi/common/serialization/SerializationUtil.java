package top.banyaoqiang.RPCApi.common.serialization;


import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

/**
 * Created by 班耀强 on 2018/8/11
 */
public final class SerializationUtil {
    @SuppressWarnings("unchecked")
    public static <T> byte[] serilize(T msg) {
        Class<T> tClass = (Class<T>) msg.getClass();
        Schema<T> schema = RuntimeSchema.getSchema(tClass);

        LinkedBuffer buffer = LinkedBuffer.allocate();
        final byte[] bytes;
        try {
            bytes = ProtostuffIOUtil.toByteArray(msg, schema, buffer);
        } finally {
            buffer.clear();
        }
        return bytes;
    }


    public static <T> T deserialize(byte[] bytes, Class<T> clazz) {
        Schema<T> schema = RuntimeSchema.getSchema(clazz);
        T msg = schema.newMessage();
        ProtostuffIOUtil.mergeFrom(bytes, msg, schema);
        return msg;
    }
}
