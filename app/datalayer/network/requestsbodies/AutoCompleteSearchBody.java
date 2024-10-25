package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import up.c;
/* compiled from: AutoCompleteSearchBody.kt */
@Serializable
/* loaded from: classes2.dex */
public final class AutoCompleteSearchBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    @c("lang")
    private final String lang;
    @c("search_string")
    private final String searchString;

    /* compiled from: AutoCompleteSearchBody.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoCompleteSearchBody> serializer() {
            return AutoCompleteSearchBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AutoCompleteSearchBody(int i11, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, AutoCompleteSearchBody$$serializer.INSTANCE.getDescriptor());
        }
        this.lang = str;
        this.searchString = str2;
    }

    public static /* synthetic */ AutoCompleteSearchBody copy$default(AutoCompleteSearchBody autoCompleteSearchBody, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = autoCompleteSearchBody.lang;
        }
        if ((i11 & 2) != 0) {
            str2 = autoCompleteSearchBody.searchString;
        }
        return autoCompleteSearchBody.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self(AutoCompleteSearchBody autoCompleteSearchBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, autoCompleteSearchBody.lang);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, autoCompleteSearchBody.searchString);
    }

    public final String component1() {
        return this.lang;
    }

    public final String component2() {
        return this.searchString;
    }

    public final AutoCompleteSearchBody copy(String lang, String searchString) {
        o.i(lang, "lang");
        o.i(searchString, "searchString");
        return new AutoCompleteSearchBody(lang, searchString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCompleteSearchBody)) {
            return false;
        }
        AutoCompleteSearchBody autoCompleteSearchBody = (AutoCompleteSearchBody) obj;
        if (o.d(this.lang, autoCompleteSearchBody.lang) && o.d(this.searchString, autoCompleteSearchBody.searchString)) {
            return true;
        }
        return false;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getSearchString() {
        return this.searchString;
    }

    public int hashCode() {
        return (this.lang.hashCode() * 31) + this.searchString.hashCode();
    }

    public String toString() {
        String str = this.lang;
        String str2 = this.searchString;
        return "AutoCompleteSearchBody(lang=" + str + ", searchString=" + str2 + ")";
    }

    public AutoCompleteSearchBody(String lang, String searchString) {
        o.i(lang, "lang");
        o.i(searchString, "searchString");
        this.lang = lang;
        this.searchString = searchString;
    }
}
