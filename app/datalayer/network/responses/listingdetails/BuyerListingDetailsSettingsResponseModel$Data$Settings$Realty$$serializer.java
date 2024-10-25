package com.forsale.app.datalayer.network.responses.listingdetails;

import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
/* loaded from: classes2.dex */
public final class BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer implements GeneratedSerializer<BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty> {
    public static final int $stable;
    public static final BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer buyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer = new BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer();
        INSTANCE = buyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty", buyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("contacts", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0])};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        o.i(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty.$childSerializers;
        int i11 = 1;
        if (beginStructure.decodeSequentially()) {
            list = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 0, kSerializerArr[0], null);
        } else {
            int i12 = 0;
            List list2 = null;
            while (i11 != 0) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    i11 = 0;
                } else if (decodeElementIndex != 0) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 0, kSerializerArr[0], list2);
                    i12 |= 1;
                }
            }
            list = list2;
            i11 = i12;
        }
        beginStructure.endStructure(descriptor2);
        return new BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty(i11, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty value) {
        o.i(encoder, "encoder");
        o.i(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        BuyerListingDetailsSettingsResponseModel.Data.Settings.Realty.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
