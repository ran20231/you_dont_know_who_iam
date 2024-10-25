package com.forsale.app.datalayer.network;

import com.forsale.app.datalayer.network.ResponseWrapper;
import com.leanplum.internal.Constants;
import falcon.chat.entities.MessageKt;
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
/* compiled from: ResponseWrapperKtor.kt */
/* loaded from: classes2.dex */
public final class ResponseWrapperKtor$$serializer<T> implements GeneratedSerializer<ResponseWrapperKtor<T>> {
    public static final int $stable = 8;
    private final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;
    private final /* synthetic */ KSerializer<?> typeSerial0;

    private ResponseWrapperKtor$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.network.ResponseWrapperKtor", this, 3);
        pluginGeneratedSerialDescriptor.addElement(MessageKt.STATUS, false);
        pluginGeneratedSerialDescriptor.addElement(Constants.Params.RESPONSE, false);
        pluginGeneratedSerialDescriptor.addElement("error", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    private final KSerializer<T> getTypeSerial0() {
        return (KSerializer<T>) this.typeSerial0;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(this.typeSerial0), BuiltinSerializersKt.getNullable(ResponseWrapper$ResponseError$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ResponseWrapperKtor<T> deserialize(Decoder decoder) {
        int i11;
        int i12;
        Object obj;
        ResponseWrapper.ResponseError responseError;
        o.i(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor, 0);
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor, 1, this.typeSerial0, null);
            i11 = decodeIntElement;
            responseError = (ResponseWrapper.ResponseError) beginStructure.decodeNullableSerializableElement(descriptor, 2, ResponseWrapper$ResponseError$$serializer.INSTANCE, null);
            obj = decodeNullableSerializableElement;
            i12 = 7;
        } else {
            boolean z11 = true;
            int i13 = 0;
            Object obj2 = null;
            ResponseWrapper.ResponseError responseError2 = null;
            int i14 = 0;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex == 0) {
                    i13 = beginStructure.decodeIntElement(descriptor, 0);
                    i14 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, this.typeSerial0, obj2);
                    i14 |= 2;
                } else if (decodeElementIndex != 2) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    responseError2 = (ResponseWrapper.ResponseError) beginStructure.decodeNullableSerializableElement(descriptor, 2, ResponseWrapper$ResponseError$$serializer.INSTANCE, responseError2);
                    i14 |= 4;
                }
            }
            i11 = i13;
            i12 = i14;
            obj = obj2;
            responseError = responseError2;
        }
        beginStructure.endStructure(descriptor);
        return new ResponseWrapperKtor<>(i12, i11, obj, responseError, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public void serialize(Encoder encoder, ResponseWrapperKtor<T> value) {
        o.i(encoder, "encoder");
        o.i(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        ResponseWrapperKtor.write$Self(value, beginStructure, descriptor, this.typeSerial0);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResponseWrapperKtor$$serializer(KSerializer typeSerial0) {
        this();
        o.i(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        serialize(encoder, (ResponseWrapperKtor) ((ResponseWrapperKtor) obj));
    }
}
