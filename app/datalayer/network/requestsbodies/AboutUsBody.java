package com.forsale.app.datalayer.network.requestsbodies;

import up.c;
/* compiled from: AboutUsBody.kt */
/* loaded from: classes2.dex */
public final class AboutUsBody {
    public static final int $stable = 0;
    @c("html_render")
    private final int htmlRender;
    @c("region_id")
    private final int regionId;

    public AboutUsBody(int i11, int i12) {
        this.regionId = i11;
        this.htmlRender = i12;
    }

    public static /* synthetic */ AboutUsBody copy$default(AboutUsBody aboutUsBody, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = aboutUsBody.regionId;
        }
        if ((i13 & 2) != 0) {
            i12 = aboutUsBody.htmlRender;
        }
        return aboutUsBody.copy(i11, i12);
    }

    public final int component1() {
        return this.regionId;
    }

    public final int component2() {
        return this.htmlRender;
    }

    public final AboutUsBody copy(int i11, int i12) {
        return new AboutUsBody(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AboutUsBody)) {
            return false;
        }
        AboutUsBody aboutUsBody = (AboutUsBody) obj;
        if (this.regionId == aboutUsBody.regionId && this.htmlRender == aboutUsBody.htmlRender) {
            return true;
        }
        return false;
    }

    public final int getHtmlRender() {
        return this.htmlRender;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.regionId) * 31) + Integer.hashCode(this.htmlRender);
    }

    public String toString() {
        int i11 = this.regionId;
        int i12 = this.htmlRender;
        return "AboutUsBody(regionId=" + i11 + ", htmlRender=" + i12 + ")";
    }
}
