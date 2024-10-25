package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: SearchPlaceholderKeywordEntity.kt */
/* loaded from: classes2.dex */
public final class SearchPlaceholderKeywordEntity {
    public static final String AR = "ar";
    public static final String EN = "en";
    public static final String ID = "id";
    public static final String SEARCH_PLACEHOLDER_KEYWORD_TABLE = "search_placeholder_keyword_table";
    @c(AR)

    /* renamed from: ar  reason: collision with root package name */
    private String f22322ar;
    @c(EN)

    /* renamed from: en  reason: collision with root package name */
    private String f22323en;

    /* renamed from: id  reason: collision with root package name */
    private transient int f22324id;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SearchPlaceholderKeywordEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SearchPlaceholderKeywordEntity(int i11, String ar2, String en2) {
        o.i(ar2, "ar");
        o.i(en2, "en");
        this.f22324id = i11;
        this.f22322ar = ar2;
        this.f22323en = en2;
    }

    public static /* synthetic */ SearchPlaceholderKeywordEntity copy$default(SearchPlaceholderKeywordEntity searchPlaceholderKeywordEntity, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = searchPlaceholderKeywordEntity.f22324id;
        }
        if ((i12 & 2) != 0) {
            str = searchPlaceholderKeywordEntity.f22322ar;
        }
        if ((i12 & 4) != 0) {
            str2 = searchPlaceholderKeywordEntity.f22323en;
        }
        return searchPlaceholderKeywordEntity.copy(i11, str, str2);
    }

    public final int component1() {
        return this.f22324id;
    }

    public final String component2() {
        return this.f22322ar;
    }

    public final String component3() {
        return this.f22323en;
    }

    public final SearchPlaceholderKeywordEntity copy(int i11, String ar2, String en2) {
        o.i(ar2, "ar");
        o.i(en2, "en");
        return new SearchPlaceholderKeywordEntity(i11, ar2, en2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPlaceholderKeywordEntity)) {
            return false;
        }
        SearchPlaceholderKeywordEntity searchPlaceholderKeywordEntity = (SearchPlaceholderKeywordEntity) obj;
        if (this.f22324id == searchPlaceholderKeywordEntity.f22324id && o.d(this.f22322ar, searchPlaceholderKeywordEntity.f22322ar) && o.d(this.f22323en, searchPlaceholderKeywordEntity.f22323en)) {
            return true;
        }
        return false;
    }

    public final String getAr() {
        return this.f22322ar;
    }

    public final String getEn() {
        return this.f22323en;
    }

    public final int getId() {
        return this.f22324id;
    }

    public final String getKeyword() {
        CharSequence Z0;
        CharSequence Z02;
        CharSequence Z03;
        String k11 = LocaleManager.f39597a.k();
        if (o.d(k11, Languages.ENGLISH.getValue())) {
            Z03 = StringsKt__StringsKt.Z0(this.f22323en);
            return Z03.toString();
        } else if (o.d(k11, Languages.ARABIC.getValue())) {
            Z02 = StringsKt__StringsKt.Z0(this.f22322ar);
            return Z02.toString();
        } else {
            Z0 = StringsKt__StringsKt.Z0(this.f22322ar);
            return Z0.toString();
        }
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f22324id) * 31) + this.f22322ar.hashCode()) * 31) + this.f22323en.hashCode();
    }

    public final void setAr(String str) {
        o.i(str, "<set-?>");
        this.f22322ar = str;
    }

    public final void setEn(String str) {
        o.i(str, "<set-?>");
        this.f22323en = str;
    }

    public final void setId(int i11) {
        this.f22324id = i11;
    }

    public String toString() {
        int i11 = this.f22324id;
        String str = this.f22322ar;
        String str2 = this.f22323en;
        return "SearchPlaceholderKeywordEntity(id=" + i11 + ", ar=" + str + ", en=" + str2 + ")";
    }
}
