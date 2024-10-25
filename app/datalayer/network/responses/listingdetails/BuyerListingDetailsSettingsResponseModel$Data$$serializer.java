package com.forsale.app.datalayer.network.responses.listingdetails;

import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
/* loaded from: classes2.dex */
public final class BuyerListingDetailsSettingsResponseModel$Data$$serializer implements GeneratedSerializer<BuyerListingDetailsSettingsResponseModel.Data> {
    public static final int $stable;
    public static final BuyerListingDetailsSettingsResponseModel$Data$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BuyerListingDetailsSettingsResponseModel$Data$$serializer buyerListingDetailsSettingsResponseModel$Data$$serializer = new BuyerListingDetailsSettingsResponseModel$Data$$serializer();
        INSTANCE = buyerListingDetailsSettingsResponseModel$Data$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel.Data", buyerListingDetailsSettingsResponseModel$Data$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private BuyerListingDetailsSettingsResponseModel$Data$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BuyerListingDetailsSettingsResponseModel.Data deserialize(Decoder decoder) {
        BuyerListingDetailsSettingsResponseModel.Data.Settings settings;
        o.i(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i11 = 1;
        if (beginStructure.decodeSequentially()) {
            settings = (BuyerListingDetailsSettingsResponseModel.Data.Settings) beginStructure.decodeNullableSerializableElement(descriptor2, 0, BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer.INSTANCE, null);
        } else {
            int i12 = 0;
            settings = null;
            while (i11 != 0) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    i11 = 0;
                } else if (decodeElementIndex != 0) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    settings = (BuyerListingDetailsSettingsResponseModel.Data.Settings) beginStructure.decodeNullableSerializableElement(descriptor2, 0, BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer.INSTANCE, settings);
                    i12 |= 1;
                }
            }
            i11 = i12;
        }
        beginStructure.endStructure(descriptor2);
        return new BuyerListingDetailsSettingsResponseModel.Data(i11, settings, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BuyerListingDetailsSettingsResponseModel.Data value) {
        o.i(encoder, "encoder");
        o.i(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        BuyerListingDetailsSettingsResponseModel.Data.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
