package com.forsale.app.datalayer.network.responses.listingdetails;

import com.leanplum.internal.Constants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import up.c;
/* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
@Serializable
/* loaded from: classes2.dex */
public final class BuyerListingDetailsSettingsResponseModel {
    @c("data")
    private final Data data;
    @c(Constants.Params.MESSAGE)
    private final String message;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BuyerListingDetailsSettingsResponseModel> serializer() {
            return BuyerListingDetailsSettingsResponseModel$$serializer.INSTANCE;
        }
    }

    /* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
    @Serializable
    /* loaded from: classes2.dex */
    public static final class Data {
        @c("settings")
        private final Settings settings;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Data> serializer() {
                return BuyerListingDetailsSettingsResponseModel$Data$$serializer.INSTANCE;
            }
        }

        /* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
        @Serializable
        /* loaded from: classes2.dex */
        public static final class Settings {
            @c("realty")
            private final Realty realty;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;

            /* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
            /* loaded from: classes2.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Settings> serializer() {
                    return BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer.INSTANCE;
                }
            }

            /* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
            @Serializable
            /* loaded from: classes2.dex */
            public static final class Realty {
                @c("4sale_realty_contacts_phones")
                private final List<String> contacts;
                public static final Companion Companion = new Companion(null);
                public static final int $stable = 8;
                private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

                /* compiled from: BuyerListingDetailsSettingsResponseModel.kt */
                /* loaded from: classes2.dex */
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Realty> serializer() {
                        return BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer.INSTANCE;
                    }
                }

                public Realty() {
                    this((List) null, 1, (DefaultConstructorMarker) null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Realty copy$default(Realty realty, List list, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        list = realty.contacts;
                    }
                    return realty.copy(list);
                }

                public static final /* synthetic */ void write$Self(Realty realty, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                    KSerializer<Object>[] kSerializerArr = $childSerializers;
                    boolean z11 = true;
                    if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && realty.contacts == null) {
                        z11 = false;
                    }
                    if (z11) {
                        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], realty.contacts);
                    }
                }

                public final List<String> component1() {
                    return this.contacts;
                }

                public final Realty copy(List<String> list) {
                    return new Realty(list);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof Realty) && o.d(this.contacts, ((Realty) obj).contacts)) {
                        return true;
                    }
                    return false;
                }

                public final List<String> getContacts() {
                    return this.contacts;
                }

                public int hashCode() {
                    List<String> list = this.contacts;
                    if (list == null) {
                        return 0;
                    }
                    return list.hashCode();
                }

                public String toString() {
                    List<String> list = this.contacts;
                    return "Realty(contacts=" + list + ")";
                }

                public /* synthetic */ Realty(int i11, List list, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i11 & 0) != 0) {
                        PluginExceptionsKt.throwMissingFieldException(i11, 0, BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer.INSTANCE.getDescriptor());
                    }
                    if ((i11 & 1) == 0) {
                        this.contacts = null;
                    } else {
                        this.contacts = list;
                    }
                }

                public Realty(List<String> list) {
                    this.contacts = list;
                }

                public /* synthetic */ Realty(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : list);
                }
            }

            public Settings() {
                this((Realty) null, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Settings copy$default(Settings settings, Realty realty, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    realty = settings.realty;
                }
                return settings.copy(realty);
            }

            public static final /* synthetic */ void write$Self(Settings settings, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                boolean z11 = true;
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && settings.realty == null) {
                    z11 = false;
                }
                if (z11) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty$$serializer.INSTANCE, settings.realty);
                }
            }

            public final Realty component1() {
                return this.realty;
            }

            public final Settings copy(Realty realty) {
                return new Settings(realty);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof Settings) && o.d(this.realty, ((Settings) obj).realty)) {
                    return true;
                }
                return false;
            }

            public final Realty getRealty() {
                return this.realty;
            }

            public int hashCode() {
                Realty realty = this.realty;
                if (realty == null) {
                    return 0;
                }
                return realty.hashCode();
            }

            public String toString() {
                Realty realty = this.realty;
                return "Settings(realty=" + realty + ")";
            }

            public /* synthetic */ Settings(int i11, Realty realty, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i11 & 0) != 0) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 0, BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer.INSTANCE.getDescriptor());
                }
                if ((i11 & 1) == 0) {
                    this.realty = null;
                } else {
                    this.realty = realty;
                }
            }

            public Settings(Realty realty) {
                this.realty = realty;
            }

            public /* synthetic */ Settings(Realty realty, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : realty);
            }
        }

        public Data() {
            this((Settings) null, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Data copy$default(Data data, Settings settings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                settings = data.settings;
            }
            return data.copy(settings);
        }

        public static final /* synthetic */ void write$Self(Data data, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            boolean z11 = true;
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && data.settings == null) {
                z11 = false;
            }
            if (z11) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BuyerListingDetailsSettingsResponseModel$Data$Settings$$serializer.INSTANCE, data.settings);
            }
        }

        public final Settings component1() {
            return this.settings;
        }

        public final Data copy(Settings settings) {
            return new Data(settings);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Data) && o.d(this.settings, ((Data) obj).settings)) {
                return true;
            }
            return false;
        }

        public final Settings getSettings() {
            return this.settings;
        }

        public int hashCode() {
            Settings settings = this.settings;
            if (settings == null) {
                return 0;
            }
            return settings.hashCode();
        }

        public String toString() {
            Settings settings = this.settings;
            return "Data(settings=" + settings + ")";
        }

        public /* synthetic */ Data(int i11, Settings settings, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i11 & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i11, 0, BuyerListingDetailsSettingsResponseModel$Data$$serializer.INSTANCE.getDescriptor());
            }
            if ((i11 & 1) == 0) {
                this.settings = null;
            } else {
                this.settings = settings;
            }
        }

        public Data(Settings settings) {
            this.settings = settings;
        }

        public /* synthetic */ Data(Settings settings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : settings);
        }
    }

    public BuyerListingDetailsSettingsResponseModel() {
        this((Data) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BuyerListingDetailsSettingsResponseModel copy$default(BuyerListingDetailsSettingsResponseModel buyerListingDetailsSettingsResponseModel, Data data, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            data = buyerListingDetailsSettingsResponseModel.data;
        }
        if ((i11 & 2) != 0) {
            str = buyerListingDetailsSettingsResponseModel.message;
        }
        return buyerListingDetailsSettingsResponseModel.copy(data, str);
    }

    public static final /* synthetic */ void write$Self(BuyerListingDetailsSettingsResponseModel buyerListingDetailsSettingsResponseModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        boolean z11;
        boolean z12 = false;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || buyerListingDetailsSettingsResponseModel.data != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BuyerListingDetailsSettingsResponseModel$Data$$serializer.INSTANCE, buyerListingDetailsSettingsResponseModel.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || buyerListingDetailsSettingsResponseModel.message != null) {
            z12 = true;
        }
        if (z12) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, buyerListingDetailsSettingsResponseModel.message);
        }
    }

    public final Data component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final BuyerListingDetailsSettingsResponseModel copy(Data data, String str) {
        return new BuyerListingDetailsSettingsResponseModel(data, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyerListingDetailsSettingsResponseModel)) {
            return false;
        }
        BuyerListingDetailsSettingsResponseModel buyerListingDetailsSettingsResponseModel = (BuyerListingDetailsSettingsResponseModel) obj;
        if (o.d(this.data, buyerListingDetailsSettingsResponseModel.data) && o.d(this.message, buyerListingDetailsSettingsResponseModel.message)) {
            return true;
        }
        return false;
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode;
        Data data = this.data;
        int i11 = 0;
        if (data == null) {
            hashCode = 0;
        } else {
            hashCode = data.hashCode();
        }
        int i12 = hashCode * 31;
        String str = this.message;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        Data data = this.data;
        String str = this.message;
        return "BuyerListingDetailsSettingsResponseModel(data=" + data + ", message=" + str + ")";
    }

    public /* synthetic */ BuyerListingDetailsSettingsResponseModel(int i11, Data data, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i11 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i11, 0, BuyerListingDetailsSettingsResponseModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.data = null;
        } else {
            this.data = data;
        }
        if ((i11 & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    public BuyerListingDetailsSettingsResponseModel(Data data, String str) {
        this.data = data;
        this.message = str;
    }

    public /* synthetic */ BuyerListingDetailsSettingsResponseModel(Data data, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : data, (i11 & 2) != 0 ? null : str);
    }
}
