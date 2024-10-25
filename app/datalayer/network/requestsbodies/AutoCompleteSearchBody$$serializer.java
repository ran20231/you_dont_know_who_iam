package com.forsale.app.datalayer.network.requestsbodies;

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
/* compiled from: AutoCompleteSearchBody.kt */
/* loaded from: classes2.dex */
public final class AutoCompleteSearchBody$$serializer implements GeneratedSerializer<AutoCompleteSearchBody> {
    public static final int $stable;
    public static final AutoCompleteSearchBody$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AutoCompleteSearchBody$$serializer autoCompleteSearchBody$$serializer = new AutoCompleteSearchBody$$serializer();
        INSTANCE = autoCompleteSearchBody$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.network.requestsbodies.AutoCompleteSearchBody", autoCompleteSearchBody$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("lang", false);
        pluginGeneratedSerialDescriptor.addElement("searchString", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private AutoCompleteSearchBody$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AutoCompleteSearchBody deserialize(Decoder decoder) {
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
        return new AutoCompleteSearchBody(i11, str, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, AutoCompleteSearchBody value) {
        o.i(encoder, "encoder");
        o.i(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        AutoCompleteSearchBody.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
