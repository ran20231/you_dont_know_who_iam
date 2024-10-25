package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import up.c;
/* compiled from: HomeTooltipSettings.kt */
/* loaded from: classes2.dex */
public final class HomeTooltipSettings {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String HOME_TOOLTIP_DURATION_MILLISECONDS = "duration_milliseconds";
    public static final String HOME_TOOLTIP_MAX_VIEWS_SESSIONS = "max_views_sessions";
    public static final String HOME_TOOLTIP_WAITING_MILLISECONDS = "waiting_milliseconds";
    @c("duration_milliseconds")
    private final int durationMilliseconds;
    @c("max_views_sessions")
    private final int maxViewsSessions;
    @c(HOME_TOOLTIP_WAITING_MILLISECONDS)
    private final int waitingMilliseconds;

    /* compiled from: HomeTooltipSettings.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HomeTooltipSettings(int i11, int i12, int i13) {
        this.maxViewsSessions = i11;
        this.waitingMilliseconds = i12;
        this.durationMilliseconds = i13;
    }

    public final int getDurationMilliseconds() {
        return this.durationMilliseconds;
    }

    public final int getMaxViewsSessions() {
        return this.maxViewsSessions;
    }

    public final int getWaitingMilliseconds() {
        return this.waitingMilliseconds;
    }
}
