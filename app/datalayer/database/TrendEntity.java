package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: TrendEntity.kt */
/* loaded from: classes2.dex */
public final class TrendEntity {
    public static final int $stable = 0;
    @c(SearchPlaceholderKeywordEntity.AR)

    /* renamed from: ar  reason: collision with root package name */
    private final String f22325ar;
    @c(SearchPlaceholderKeywordEntity.EN)

    /* renamed from: en  reason: collision with root package name */
    private final String f22326en;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final transient int f22327id;
    @c("is_title")
    private final transient boolean isTitle;

    public TrendEntity(int i11, String ar2, String en2, boolean z11) {
        o.i(ar2, "ar");
        o.i(en2, "en");
        this.f22327id = i11;
        this.f22325ar = ar2;
        this.f22326en = en2;
        this.isTitle = z11;
    }

    public static /* synthetic */ TrendEntity copy$default(TrendEntity trendEntity, int i11, String str, String str2, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = trendEntity.f22327id;
        }
        if ((i12 & 2) != 0) {
            str = trendEntity.f22325ar;
        }
        if ((i12 & 4) != 0) {
            str2 = trendEntity.f22326en;
        }
        if ((i12 & 8) != 0) {
            z11 = trendEntity.isTitle;
        }
        return trendEntity.copy(i11, str, str2, z11);
    }

    public final int component1() {
        return this.f22327id;
    }

    public final String component2() {
        return this.f22325ar;
    }

    public final String component3() {
        return this.f22326en;
    }

    public final boolean component4() {
        return this.isTitle;
    }

    public final TrendEntity copy(int i11, String ar2, String en2, boolean z11) {
        o.i(ar2, "ar");
        o.i(en2, "en");
        return new TrendEntity(i11, ar2, en2, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendEntity)) {
            return false;
        }
        TrendEntity trendEntity = (TrendEntity) obj;
        if (this.f22327id == trendEntity.f22327id && o.d(this.f22325ar, trendEntity.f22325ar) && o.d(this.f22326en, trendEntity.f22326en) && this.isTitle == trendEntity.isTitle) {
            return true;
        }
        return false;
    }

    public final String getAr() {
        return this.f22325ar;
    }

    public final String getEn() {
        return this.f22326en;
    }

    public final int getId() {
        return this.f22327id;
    }

    public final String getLocalized() {
        CharSequence Z0;
        CharSequence Z02;
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            Z02 = StringsKt__StringsKt.Z0(this.f22326en);
            return Z02.toString();
        }
        Z0 = StringsKt__StringsKt.Z0(this.f22325ar);
        return Z0.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f22327id) * 31) + this.f22325ar.hashCode()) * 31) + this.f22326en.hashCode()) * 31;
        boolean z11 = this.isTitle;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final boolean isTitle() {
        return this.isTitle;
    }

    public String toString() {
        int i11 = this.f22327id;
        String str = this.f22325ar;
        String str2 = this.f22326en;
        boolean z11 = this.isTitle;
        return "TrendEntity(id=" + i11 + ", ar=" + str + ", en=" + str2 + ", isTitle=" + z11 + ")";
    }

    public /* synthetic */ TrendEntity(int i11, String str, String str2, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, str, str2, (i12 & 8) != 0 ? false : z11);
    }
}
