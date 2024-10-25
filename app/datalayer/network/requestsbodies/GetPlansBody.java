package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
/* compiled from: GetPlansBody.kt */
/* loaded from: classes2.dex */
public final class GetPlansBody {
    public static final int $stable = 0;
    private final String category_id;
    private final String lang;

    public GetPlansBody(String lang, String category_id) {
        o.i(lang, "lang");
        o.i(category_id, "category_id");
        this.lang = lang;
        this.category_id = category_id;
    }

    public static /* synthetic */ GetPlansBody copy$default(GetPlansBody getPlansBody, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getPlansBody.lang;
        }
        if ((i11 & 2) != 0) {
            str2 = getPlansBody.category_id;
        }
        return getPlansBody.copy(str, str2);
    }

    public final String component1() {
        return this.lang;
    }

    public final String component2() {
        return this.category_id;
    }

    public final GetPlansBody copy(String lang, String category_id) {
        o.i(lang, "lang");
        o.i(category_id, "category_id");
        return new GetPlansBody(lang, category_id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPlansBody)) {
            return false;
        }
        GetPlansBody getPlansBody = (GetPlansBody) obj;
        if (o.d(this.lang, getPlansBody.lang) && o.d(this.category_id, getPlansBody.category_id)) {
            return true;
        }
        return false;
    }

    public final String getCategory_id() {
        return this.category_id;
    }

    public final String getLang() {
        return this.lang;
    }

    public int hashCode() {
        return (this.lang.hashCode() * 31) + this.category_id.hashCode();
    }

    public String toString() {
        String str = this.lang;
        String str2 = this.category_id;
        return "GetPlansBody(lang=" + str + ", category_id=" + str2 + ")";
    }
}
