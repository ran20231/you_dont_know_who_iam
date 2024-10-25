package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/* compiled from: OnBoardingViewModel.kt */
/* loaded from: classes2.dex */
public final class OnBoardingViewModel$$serializer implements GeneratedSerializer<OnBoardingViewModel> {
    public static final int $stable;
    public static final OnBoardingViewModel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OnBoardingViewModel$$serializer onBoardingViewModel$$serializer = new OnBoardingViewModel$$serializer();
        INSTANCE = onBoardingViewModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.database.OnBoardingViewModel", onBoardingViewModel$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("advDetailsSwipingEnabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private OnBoardingViewModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public OnBoardingViewModel deserialize(Decoder decoder) {
        int i11;
        o.i(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i12 = 1;
        if (beginStructure.decodeSequentially()) {
            i11 = beginStructure.decodeIntElement(descriptor2, 0);
        } else {
            i11 = 0;
            int i13 = 0;
            while (i12 != 0) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    i12 = 0;
                } else if (decodeElementIndex != 0) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    i11 = beginStructure.decodeIntElement(descriptor2, 0);
                    i13 |= 1;
                }
            }
            i12 = i13;
        }
        beginStructure.endStructure(descriptor2);
        return new OnBoardingViewModel(i12, i11, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, OnBoardingViewModel value) {
        o.i(encoder, "encoder");
        o.i(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        beginStructure.encodeIntElement(descriptor2, 0, value.advDetailsSwipingEnabled);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
