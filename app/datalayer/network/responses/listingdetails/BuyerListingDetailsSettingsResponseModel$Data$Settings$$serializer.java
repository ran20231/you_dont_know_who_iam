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
public final class BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer implements GeneratedSerializer<BuyerListingDetailsSettingsResponseModel.Data.Settings> {
    public static final int $stable;
    public static final BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer buyerListingDetailsSettingsResponseModel$Data$Settings$$serializer = new BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer();
        INSTANCE = buyerListingDetailsSettingsResponseModel$Data$Settings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel.Data.Settings", buyerListingDetailsSettingsResponseModel$Data$Settings$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("realty", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BuyerListingDetailsSettingsResponseModel.Data.Settings deserialize(Decoder decoder) {
        BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty realty;
        o.i(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i11 = 1;
        if (beginStructure.decodeSequentially()) {
            realty = (BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty) beginStructure.decodeNullableSerializableElement(descriptor2, 0, BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer.INSTANCE, null);
        } else {
            int i12 = 0;
            realty = null;
            while (i11 != 0) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    i11 = 0;
                } else if (decodeElementIndex != 0) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    realty = (BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty) beginStructure.decodeNullableSerializableElement(descriptor2, 0, BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer.INSTANCE, realty);
                    i12 |= 1;
                }
            }
            i11 = i12;
        }
        beginStructure.endStructure(descriptor2);
        return new BuyerListingDetailsSettingsResponseModel.Data.Settings(i11, realty, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BuyerListingDetailsSettingsResponseModel.Data.Settings value) {
        o.i(encoder, "encoder");
        o.i(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        BuyerListingDetailsSettingsResponseModel.Data.Settings.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
