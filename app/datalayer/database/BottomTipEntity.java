package com.forsale.app.datalayer.database;

import com.forsale.app.features.maincontainer.HomeTabs;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
import x10.a;
/* compiled from: BottomTipEntity.kt */
/* loaded from: classes2.dex */
public final class BottomTipEntity {
    public static final int $stable = 8;
    private transient int countViews;
    @c("duration_milliseconds")
    private final int durationMilliseconds;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22301id;
    private transient boolean isLastShow;
    @c("max_views_sessions")
    private final int maxViewsSessions;
    @c(MasterDataBottomTooltipSettings.RESET_COUNT)
    private final int resetCount;
    @c(MasterDataBottomTooltipSettings.TAB_ID)
    private final String tabId;
    private final transient HomeTabs tabName;
    @c("tab_order")
    private final int tabOrder;

    public BottomTipEntity(int i11, String tabId, int i12, int i13, int i14, int i15, int i16, boolean z11) {
        HomeTabs homeTabs;
        o.i(tabId, "tabId");
        this.f22301id = i11;
        this.tabId = tabId;
        this.resetCount = i12;
        this.tabOrder = i13;
        this.maxViewsSessions = i14;
        this.durationMilliseconds = i15;
        this.countViews = i16;
        this.isLastShow = z11;
        int i17 = 0;
        a.b("tabId: ", new Object[0]);
        HomeTabs[] values = HomeTabs.values();
        int length = values.length;
        while (true) {
            if (i17 >= length) {
                homeTabs = null;
                break;
            }
            homeTabs = values[i17];
            String tabId2 = homeTabs.getTabId();
            String lowerCase = this.tabId.toLowerCase(Locale.ROOT);
            o.h(lowerCase, "toLowerCase(...)");
            if (o.d(tabId2, lowerCase)) {
                break;
            }
            i17++;
        }
        if (homeTabs == null) {
            throw new IllegalStateException("Not supported tab id");
        }
        this.tabName = homeTabs;
    }

    public static /* synthetic */ BottomTipEntity copy$default(BottomTipEntity bottomTipEntity, int i11, String str, int i12, int i13, int i14, int i15, int i16, boolean z11, int i17, Object obj) {
        int i18;
        String str2;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z12;
        if ((i17 & 1) != 0) {
            i18 = bottomTipEntity.f22301id;
        } else {
            i18 = i11;
        }
        if ((i17 & 2) != 0) {
            str2 = bottomTipEntity.tabId;
        } else {
            str2 = str;
        }
        if ((i17 & 4) != 0) {
            i19 = bottomTipEntity.resetCount;
        } else {
            i19 = i12;
        }
        if ((i17 & 8) != 0) {
            i21 = bottomTipEntity.tabOrder;
        } else {
            i21 = i13;
        }
        if ((i17 & 16) != 0) {
            i22 = bottomTipEntity.maxViewsSessions;
        } else {
            i22 = i14;
        }
        if ((i17 & 32) != 0) {
            i23 = bottomTipEntity.durationMilliseconds;
        } else {
            i23 = i15;
        }
        if ((i17 & 64) != 0) {
            i24 = bottomTipEntity.countViews;
        } else {
            i24 = i16;
        }
        if ((i17 & 128) != 0) {
            z12 = bottomTipEntity.isLastShow;
        } else {
            z12 = z11;
        }
        return bottomTipEntity.copy(i18, str2, i19, i21, i22, i23, i24, z12);
    }

    public final int component1() {
        return this.f22301id;
    }

    public final String component2() {
        return this.tabId;
    }

    public final int component3() {
        return this.resetCount;
    }

    public final int component4() {
        return this.tabOrder;
    }

    public final int component5() {
        return this.maxViewsSessions;
    }

    public final int component6() {
        return this.durationMilliseconds;
    }

    public final int component7() {
        return this.countViews;
    }

    public final boolean component8() {
        return this.isLastShow;
    }

    public final BottomTipEntity copy(int i11, String tabId, int i12, int i13, int i14, int i15, int i16, boolean z11) {
        o.i(tabId, "tabId");
        return new BottomTipEntity(i11, tabId, i12, i13, i14, i15, i16, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomTipEntity)) {
            return false;
        }
        BottomTipEntity bottomTipEntity = (BottomTipEntity) obj;
        if (this.f22301id == bottomTipEntity.f22301id && o.d(this.tabId, bottomTipEntity.tabId) && this.resetCount == bottomTipEntity.resetCount && this.tabOrder == bottomTipEntity.tabOrder && this.maxViewsSessions == bottomTipEntity.maxViewsSessions && this.durationMilliseconds == bottomTipEntity.durationMilliseconds && this.countViews == bottomTipEntity.countViews && this.isLastShow == bottomTipEntity.isLastShow) {
            return true;
        }
        return false;
    }

    public final int getCountViews() {
        return this.countViews;
    }

    public final int getDurationMilliseconds() {
        return this.durationMilliseconds;
    }

    public final int getId() {
        return this.f22301id;
    }

    public final int getMaxViewsSessions() {
        return this.maxViewsSessions;
    }

    public final int getResetCount() {
        return this.resetCount;
    }

    public final String getTabId() {
        return this.tabId;
    }

    public final HomeTabs getTabName() {
        return this.tabName;
    }

    public final int getTabOrder() {
        return this.tabOrder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f22301id) * 31) + this.tabId.hashCode()) * 31) + Integer.hashCode(this.resetCount)) * 31) + Integer.hashCode(this.tabOrder)) * 31) + Integer.hashCode(this.maxViewsSessions)) * 31) + Integer.hashCode(this.durationMilliseconds)) * 31) + Integer.hashCode(this.countViews)) * 31;
        boolean z11 = this.isLastShow;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final boolean isLastShow() {
        return this.isLastShow;
    }

    public final void setCountViews(int i11) {
        this.countViews = i11;
    }

    public final void setLastShow(boolean z11) {
        this.isLastShow = z11;
    }

    public String toString() {
        int i11 = this.f22301id;
        String str = this.tabId;
        int i12 = this.resetCount;
        int i13 = this.tabOrder;
        int i14 = this.maxViewsSessions;
        int i15 = this.durationMilliseconds;
        int i16 = this.countViews;
        boolean z11 = this.isLastShow;
        return "BottomTipEntity(id=" + i11 + ", tabId=" + str + ", resetCount=" + i12 + ", tabOrder=" + i13 + ", maxViewsSessions=" + i14 + ", durationMilliseconds=" + i15 + ", countViews=" + i16 + ", isLastShow=" + z11 + ")";
    }

    public /* synthetic */ BottomTipEntity(int i11, String str, int i12, int i13, int i14, int i15, int i16, boolean z11, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i11, str, i12, i13, i14, i15, (i17 & 64) != 0 ? 0 : i16, (i17 & 128) != 0 ? false : z11);
    }
}
