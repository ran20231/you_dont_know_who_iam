package com.forsale.app.datalayer.network.responses.listingdetails;

import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel;
import com.leanplum.internal.Constants;
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
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
/* loaded from: classes2.dex */
public final class BuyerListingDetailsSettingsResponseModel$$serializer implements GeneratedSerializer<BuyerListingDetailsSettingsResponseModel> {
    public static final int $stable;
    public static final BuyerListingDetailsSettingsResponseModel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BuyerListingDetailsSettingsResponseModel$$serializer buyerListingDetailsSettingsResponseModel$$serializer = new BuyerListingDetailsSettingsResponseModel$$serializer();
        INSTANCE = buyerListingDetailsSettingsResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel", buyerListingDetailsSettingsResponseModel$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("data", true);
        pluginGeneratedSerialDescriptor.addElement(Constants.Params.MESSAGE, true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private BuyerListingDetailsSettingsResponseModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(BuyerListingDetailsSettingsResponseModel$Data$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BuyerListingDetailsSettingsResponseModel deserialize(Decoder decoder) {
        BuyerListingDetailsSettingsResponseModel.Data data;
        String str;
        int i11;
        o.i(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            data = (BuyerListingDetailsSettingsResponseModel.Data) beginStructure.decodeNullableSerializableElement(descriptor2, 0, BuyerListingDetailsSettingsResponseModel$Data$$serializer.INSTANCE, null);
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            data = null;
            String str2 = null;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex == 0) {
                    data = (BuyerListingDetailsSettingsResponseModel.Data) beginStructure.decodeNullableSerializableElement(descriptor2, 0, BuyerListingDetailsSettingsResponseModel$Data$$serializer.INSTANCE, data);
                    i12 |= 1;
                } else if (decodeElementIndex != 1) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    str2 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str2);
                    i12 |= 2;
                }
            }
            str = str2;
            i11 = i12;
        }
        beginStructure.endStructure(descriptor2);
        return new BuyerListingDetailsSettingsResponseModel(i11, data, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BuyerListingDetailsSettingsResponseModel value) {
        o.i(encoder, "encoder");
        o.i(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        BuyerListingDetailsSettingsResponseModel.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
