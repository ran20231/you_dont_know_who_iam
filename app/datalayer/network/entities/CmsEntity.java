package com.forsale.app.datalayer.network.entities;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: CmsEntity.kt */
/* loaded from: classes2.dex */
public final class CmsEntity {
    public static final int $stable = 0;
    @c("ar_content")
    private final String contentAr;
    @c("en_content")
    private final String contentEn;

    public CmsEntity(String contentAr, String contentEn) {
        o.i(contentAr, "contentAr");
        o.i(contentEn, "contentEn");
        this.contentAr = contentAr;
        this.contentEn = contentEn;
    }

    public static /* synthetic */ CmsEntity copy$default(CmsEntity cmsEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cmsEntity.contentAr;
        }
        if ((i11 & 2) != 0) {
            str2 = cmsEntity.contentEn;
        }
        return cmsEntity.copy(str, str2);
    }

    public final String component1() {
        return this.contentAr;
    }

    public final String component2() {
        return this.contentEn;
    }

    public final CmsEntity copy(String contentAr, String contentEn) {
        o.i(contentAr, "contentAr");
        o.i(contentEn, "contentEn");
        return new CmsEntity(contentAr, contentEn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CmsEntity)) {
            return false;
        }
        CmsEntity cmsEntity = (CmsEntity) obj;
        if (o.d(this.contentAr, cmsEntity.contentAr) && o.d(this.contentEn, cmsEntity.contentEn)) {
            return true;
        }
        return false;
    }

    public final String getContent() {
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            return this.contentEn;
        }
        return this.contentAr;
    }

    public final String getContentAr() {
        return this.contentAr;
    }

    public final String getContentEn() {
        return this.contentEn;
    }

    public int hashCode() {
        return (this.contentAr.hashCode() * 31) + this.contentEn.hashCode();
    }

    public String toString() {
        String str = this.contentAr;
        String str2 = this.contentEn;
        return "CmsEntity(contentAr=" + str + ", contentEn=" + str2 + ")";
    }
}
