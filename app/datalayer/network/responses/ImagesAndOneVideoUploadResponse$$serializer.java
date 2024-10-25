package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.network.responses.ImagesAndOneVideoUploadResponse;
import java.util.List;
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
/* compiled from: ImagesAndOneVideoUploadResponse.kt */
/* loaded from: classes2.dex */
public final class ImagesAndOneVideoUploadResponse$$serializer implements GeneratedSerializer<ImagesAndOneVideoUploadResponse> {
    public static final int $stable;
    public static final ImagesAndOneVideoUploadResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ImagesAndOneVideoUploadResponse$$serializer imagesAndOneVideoUploadResponse$$serializer = new ImagesAndOneVideoUploadResponse$$serializer();
        INSTANCE = imagesAndOneVideoUploadResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.network.responses.ImagesAndOneVideoUploadResponse", imagesAndOneVideoUploadResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("images", false);
        pluginGeneratedSerialDescriptor.addElement("video", false);
        pluginGeneratedSerialDescriptor.addElement("image_success_count", false);
        pluginGeneratedSerialDescriptor.addElement("image_failure_count", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private ImagesAndOneVideoUploadResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = ImagesAndOneVideoUploadResponse.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0]), BuiltinSerializersKt.getNullable(ImagesAndOneVideoUploadResponse$Video$$serializer.INSTANCE), intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ImagesAndOneVideoUploadResponse deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        int i12;
        int i13;
        List list;
        ImagesAndOneVideoUploadResponse.Video video;
        o.i(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = ImagesAndOneVideoUploadResponse.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 2);
            list = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            video = (ImagesAndOneVideoUploadResponse.Video) beginStructure.decodeNullableSerializableElement(descriptor2, 1, ImagesAndOneVideoUploadResponse$Video$$serializer.INSTANCE, null);
            i11 = beginStructure.decodeIntElement(descriptor2, 3);
            i12 = decodeIntElement;
            i13 = 15;
        } else {
            boolean z11 = true;
            int i14 = 0;
            int i15 = 0;
            List list2 = null;
            ImagesAndOneVideoUploadResponse.Video video2 = null;
            int i16 = 0;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex == 0) {
                    list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 0, kSerializerArr[0], list2);
                    i15 |= 1;
                } else if (decodeElementIndex == 1) {
                    video2 = (ImagesAndOneVideoUploadResponse.Video) beginStructure.decodeNullableSerializableElement(descriptor2, 1, ImagesAndOneVideoUploadResponse$Video$$serializer.INSTANCE, video2);
                    i15 |= 2;
                } else if (decodeElementIndex == 2) {
                    i16 = beginStructure.decodeIntElement(descriptor2, 2);
                    i15 |= 4;
                } else if (decodeElementIndex != 3) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    i14 = beginStructure.decodeIntElement(descriptor2, 3);
                    i15 |= 8;
                }
            }
            i11 = i14;
            i12 = i16;
            i13 = i15;
            list = list2;
            video = video2;
        }
        beginStructure.endStructure(descriptor2);
        return new ImagesAndOneVideoUploadResponse(i13, list, video, i12, i11, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ImagesAndOneVideoUploadResponse value) {
        o.i(encoder, "encoder");
        o.i(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        ImagesAndOneVideoUploadResponse.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
