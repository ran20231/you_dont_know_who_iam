package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ProhibitedKeywordEntity.kt */
/* loaded from: classes2.dex */
public final class ProhibitedKeywordEntity {
    public static final String ID = "id";
    public static final String IS_ACTIVE = "is_active";
    public static final String KEYWORD = "keyword";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String PROHIBITED_KEYWORDS = "prohibited_keywords";
    public static final String REGION_ID = "region_id";
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22318id;
    @c("is_active")
    private int isActive;
    @c(KEYWORD)
    private final String keyword;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ProhibitedKeywordEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProhibitedKeywordEntity(int i11, String keyword, int i12) {
        o.i(keyword, "keyword");
        this.f22318id = i11;
        this.keyword = keyword;
        this.isActive = i12;
    }

    public static /* synthetic */ ProhibitedKeywordEntity copy$default(ProhibitedKeywordEntity prohibitedKeywordEntity, int i11, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = prohibitedKeywordEntity.f22318id;
        }
        if ((i13 & 2) != 0) {
            str = prohibitedKeywordEntity.keyword;
        }
        if ((i13 & 4) != 0) {
            i12 = prohibitedKeywordEntity.isActive;
        }
        return prohibitedKeywordEntity.copy(i11, str, i12);
    }

    public final int component1() {
        return this.f22318id;
    }

    public final String component2() {
        return this.keyword;
    }

    public final int component3() {
        return this.isActive;
    }

    public final ProhibitedKeywordEntity copy(int i11, String keyword, int i12) {
        o.i(keyword, "keyword");
        return new ProhibitedKeywordEntity(i11, keyword, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProhibitedKeywordEntity)) {
            return false;
        }
        ProhibitedKeywordEntity prohibitedKeywordEntity = (ProhibitedKeywordEntity) obj;
        if (this.f22318id == prohibitedKeywordEntity.f22318id && o.d(this.keyword, prohibitedKeywordEntity.keyword) && this.isActive == prohibitedKeywordEntity.isActive) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.f22318id;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f22318id) * 31) + this.keyword.hashCode()) * 31) + Integer.hashCode(this.isActive);
    }

    public final int isActive() {
        return this.isActive;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public String toString() {
        int i11 = this.f22318id;
        String str = this.keyword;
        int i12 = this.isActive;
        return "ProhibitedKeywordEntity(id=" + i11 + ", keyword=" + str + ", isActive=" + i12 + ")";
    }

    public /* synthetic */ ProhibitedKeywordEntity(int i11, String str, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, (i13 & 4) != 0 ? 1 : i12);
    }
}
