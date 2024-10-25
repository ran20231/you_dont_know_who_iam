package com.forsale.app.datalayer.database;

import com.forsale.app.ui.customtooltip.CustomToolTips;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: MasterDataBottomTooltipSettings.kt */
/* loaded from: classes2.dex */
public final class MasterDataBottomTooltipSettings {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String DURATION_MILLISECONDS = "duration_milliseconds";
    public static final String MAX_VIEWS_SESSIONS = "max_views_sessions";
    public static final String ORDER = "order";
    public static final String RESET_COUNT = "reset_count";
    public static final String TAB_ID = "tab_id";
    @c("duration_milliseconds")
    private final int durationMilliseconds;
    @c("max_views_sessions")
    private final int maxViewsSessions;
    @c(ORDER)
    private final int order;
    @c(RESET_COUNT)
    private final int resetCount;
    @c(TAB_ID)
    private final CustomToolTips tabId;

    /* compiled from: MasterDataBottomTooltipSettings.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MasterDataBottomTooltipSettings(CustomToolTips tabId, int i11, int i12, int i13, int i14) {
        o.i(tabId, "tabId");
        this.tabId = tabId;
        this.resetCount = i11;
        this.order = i12;
        this.maxViewsSessions = i13;
        this.durationMilliseconds = i14;
    }

    public static /* synthetic */ MasterDataBottomTooltipSettings copy$default(MasterDataBottomTooltipSettings masterDataBottomTooltipSettings, CustomToolTips customToolTips, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            customToolTips = masterDataBottomTooltipSettings.tabId;
        }
        if ((i15 & 2) != 0) {
            i11 = masterDataBottomTooltipSettings.resetCount;
        }
        int i16 = i11;
        if ((i15 & 4) != 0) {
            i12 = masterDataBottomTooltipSettings.order;
        }
        int i17 = i12;
        if ((i15 & 8) != 0) {
            i13 = masterDataBottomTooltipSettings.maxViewsSessions;
        }
        int i18 = i13;
        if ((i15 & 16) != 0) {
            i14 = masterDataBottomTooltipSettings.durationMilliseconds;
        }
        return masterDataBottomTooltipSettings.copy(customToolTips, i16, i17, i18, i14);
    }

    public final CustomToolTips component1() {
        return this.tabId;
    }

    public final int component2() {
        return this.resetCount;
    }

    public final int component3() {
        return this.order;
    }

    public final int component4() {
        return this.maxViewsSessions;
    }

    public final int component5() {
        return this.durationMilliseconds;
    }

    public final MasterDataBottomTooltipSettings copy(CustomToolTips tabId, int i11, int i12, int i13, int i14) {
        o.i(tabId, "tabId");
        return new MasterDataBottomTooltipSettings(tabId, i11, i12, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasterDataBottomTooltipSettings)) {
            return false;
        }
        MasterDataBottomTooltipSettings masterDataBottomTooltipSettings = (MasterDataBottomTooltipSettings) obj;
        if (this.tabId == masterDataBottomTooltipSettings.tabId && this.resetCount == masterDataBottomTooltipSettings.resetCount && this.order == masterDataBottomTooltipSettings.order && this.maxViewsSessions == masterDataBottomTooltipSettings.maxViewsSessions && this.durationMilliseconds == masterDataBottomTooltipSettings.durationMilliseconds) {
            return true;
        }
        return false;
    }

    public final int getDurationMilliseconds() {
        return this.durationMilliseconds;
    }

    public final int getMaxViewsSessions() {
        return this.maxViewsSessions;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getResetCount() {
        return this.resetCount;
    }

    public final CustomToolTips getTabId() {
        return this.tabId;
    }

    public int hashCode() {
        return (((((((this.tabId.hashCode() * 31) + Integer.hashCode(this.resetCount)) * 31) + Integer.hashCode(this.order)) * 31) + Integer.hashCode(this.maxViewsSessions)) * 31) + Integer.hashCode(this.durationMilliseconds);
    }

    public String toString() {
        CustomToolTips customToolTips = this.tabId;
        int i11 = this.resetCount;
        int i12 = this.order;
        int i13 = this.maxViewsSessions;
        int i14 = this.durationMilliseconds;
        return "MasterDataBottomTooltipSettings(tabId=" + customToolTips + ", resetCount=" + i11 + ", order=" + i12 + ", maxViewsSessions=" + i13 + ", durationMilliseconds=" + i14 + ")";
    }
}
