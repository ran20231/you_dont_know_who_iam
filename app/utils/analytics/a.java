package com.forsale.app.utils.analytics;

import android.content.Context;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import kotlin.jvm.internal.o;
import t9.y0;
/* compiled from: AdjustEventMapper.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f40009a;

    /* compiled from: AdjustEventMapper.kt */
    /* renamed from: com.forsale.app.utils.analytics.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0454a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40010a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f40011b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f40012c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f40013d;

        static {
            int[] iArr = new int[AggregatedAllAnalyticsLogger.CustomEvents.values().length];
            try {
                iArr[AggregatedAllAnalyticsLogger.CustomEvents.LOGIN_CLICKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AggregatedAllAnalyticsLogger.CustomEvents.SEARCH_CLICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AggregatedAllAnalyticsLogger.CustomEvents.CATEGORY_VISITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AggregatedAllAnalyticsLogger.CustomEvents.BUY_MORE_TOKENS_CLICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AggregatedAllAnalyticsLogger.CustomEvents.BUY_PACKAGE_SELECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AggregatedAllAnalyticsLogger.CustomEvents.HOME_SCREEN_VISITED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f40010a = iArr;
            int[] iArr2 = new int[AggregatedAllAnalyticsLogger.ListingsVisitedEvents.values().length];
            try {
                iArr2[AggregatedAllAnalyticsLogger.ListingsVisitedEvents.SEARCH_RESULTS_VISITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            f40011b = iArr2;
            int[] iArr3 = new int[AggregatedAllAnalyticsLogger.AdvActionEvents.values().length];
            try {
                iArr3[AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_VISITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_VOICE_CALL_CLICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_WHATS_APP_CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_CALL_CLICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_CHAT_CLICKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_PHONE_CLICKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            f40012c = iArr3;
            int[] iArr4 = new int[CreateEditAdvActionType.values().length];
            try {
                iArr4[CreateEditAdvActionType.ADD_LISTING_ADDON_SELECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[CreateEditAdvActionType.UPLOAD_NEW_FREE_LISTING_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[CreateEditAdvActionType.UPLOAD_NEW_PAID_LISTING_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[CreateEditAdvActionType.ADD_LISTING_SUCCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            f40013d = iArr4;
        }
    }

    public a(Context applicationContext) {
        o.i(applicationContext, "applicationContext");
        this.f40009a = applicationContext;
    }

    private final String a(int i11) {
        String string = this.f40009a.getString(i11);
        o.h(string, "getString(...)");
        return string;
    }

    public final String b(AggregatedAllAnalyticsLogger.AdvActionEvents event) {
        o.i(event, "event");
        switch (C0454a.f40012c[event.ordinal()]) {
            case 1:
                return a(y0.L8);
            case 2:
                return a(y0.M8);
            case 3:
                return a(y0.R8);
            case 4:
                return a(y0.f70366a6);
            case 5:
                return a(y0.f70417d6);
            case 6:
                return a(y0.K6);
            default:
                return null;
        }
    }

    public final String c(AggregatedAllAnalyticsLogger.CustomEvents event) {
        o.i(event, "event");
        switch (C0454a.f40010a[event.ordinal()]) {
            case 1:
                return a(y0.f70769y9);
            case 2:
                return a(y0.f70757xd);
            case 3:
                return a(y0.E1);
            case 4:
                return a(y0.L0);
            case 5:
                return a(y0.M0);
            case 6:
                return a(y0.f70669s5);
            default:
                return null;
        }
    }

    public final String d(AggregatedAllAnalyticsLogger.ListingsVisitedEvents event) {
        o.i(event, "event");
        if (C0454a.f40011b[event.ordinal()] == 1) {
            return a(y0.Gd);
        }
        return null;
    }

    public final String e(CreateEditAdvActionType event) {
        o.i(event, "event");
        int i11 = C0454a.f40013d[event.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    return a(y0.f70679t);
                }
                return a(y0.Ie);
            }
            return a(y0.He);
        }
        return a(y0.f70663s);
    }
}
