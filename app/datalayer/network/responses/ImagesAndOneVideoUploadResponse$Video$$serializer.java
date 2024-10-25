package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.network.responses.ImagesAndOneVideoUploadResponse;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: ImagesAndOneVideoUploadResponse.kt */
/* loaded from: classes2.dex */
public final class ImagesAndOneVideoUploadResponse$Video$$serializer implements GeneratedSerializer<ImagesAndOneVideoUploadResponse.Video> {
    public static final int $stable;
    public static final ImagesAndOneVideoUploadResponse$Video$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ImagesAndOneVideoUploadResponse$Video$$serializer imagesAndOneVideoUploadResponse$Video$$serializer = new ImagesAndOneVideoUploadResponse$Video$$serializer();
        INSTANCE = imagesAndOneVideoUploadResponse$Video$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.network.responses.ImagesAndOneVideoUploadResponse.Video", imagesAndOneVideoUploadResponse$Video$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("video", false);
        pluginGeneratedSerialDescriptor.addElement("thumb", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private ImagesAndOneVideoUploadResponse$Video$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ImagesAndOneVideoUploadResponse.Video deserialize(Decoder decoder) {
        String str;
        String str2;
        int i11;
        o.i(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(descriptor2, 0);
            str2 = beginStructure.decodeStringElement(descriptor2, 1);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            str = null;
            String str3 = null;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex == 0) {
                    str = beginStructure.decodeStringElement(descriptor2, 0);
                    i12 |= 1;
                } else if (decodeElementIndex != 1) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    str3 = beginStructure.decodeStringElement(descriptor2, 1);
                    i12 |= 2;
                }
            }
            str2 = str3;
            i11 = i12;
        }
        beginStructure.endStructure(descriptor2);
        return new ImagesAndOneVideoUploadResponse.Video(i11, str, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ImagesAndOneVideoUploadResponse.Video value) {
        o.i(encoder, "encoder");
        o.i(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        ImagesAndOneVideoUploadResponse.Video.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
