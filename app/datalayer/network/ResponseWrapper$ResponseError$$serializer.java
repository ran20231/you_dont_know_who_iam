package com.forsale.app.datalayer.network;

import com.forsale.app.datalayer.network.ResponseWrapper;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: ResponseWrapper.kt */
/* loaded from: classes2.dex */
public final class ResponseWrapper$ResponseError$$serializer implements GeneratedSerializer<ResponseWrapper.ResponseError> {
    public static final int $stable;
    public static final ResponseWrapper$ResponseError$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ResponseWrapper$ResponseError$$serializer responseWrapper$ResponseError$$serializer = new ResponseWrapper$ResponseError$$serializer();
        INSTANCE = responseWrapper$ResponseError$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.network.ResponseWrapper.ResponseError", responseWrapper$ResponseError$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("code", false);
        pluginGeneratedSerialDescriptor.addElement("message_en", false);
        pluginGeneratedSerialDescriptor.addElement("message_ar", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private ResponseWrapper$ResponseError$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ResponseWrapper.ResponseError deserialize(Decoder decoder) {
        int i11;
        int i12;
        String str;
        String str2;
        o.i(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            i11 = decodeIntElement;
            str2 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            i12 = 7;
        } else {
            boolean z11 = true;
            int i13 = 0;
            String str3 = null;
            String str4 = null;
            int i14 = 0;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex == 0) {
                    i13 = beginStructure.decodeIntElement(descriptor2, 0);
                    i14 |= 1;
                } else if (decodeElementIndex == 1) {
                    str3 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str3);
                    i14 |= 2;
                } else if (decodeElementIndex != 2) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str4);
                    i14 |= 4;
                }
            }
            i11 = i13;
            i12 = i14;
            str = str3;
            str2 = str4;
        }
        beginStructure.endStructure(descriptor2);
        return new ResponseWrapper.ResponseError(i12, i11, str, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ResponseWrapper.ResponseError value) {
        o.i(encoder, "encoder");
        o.i(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        ResponseWrapper.ResponseError.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
