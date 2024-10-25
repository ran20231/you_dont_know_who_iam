package com.forsale.app.ui.customtooltip;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.forsale.app.features.maincontainer.HomeTabs;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import t9.p0;
import t9.q0;
import t9.r0;
import t9.y0;
import th.c;
import th.e;
import uf.b;
import wz.p;
/* compiled from: BottomToolTipMapper.kt */
/* loaded from: classes3.dex */
public final class BottomToolTipMapper {

    /* renamed from: a */
    private final CustomToolTips f39305a;

    /* renamed from: b */
    private final int f39306b;

    /* renamed from: c */
    private final MainContainerActivity f39307c;

    /* renamed from: d */
    private final AggregatedAllAnalyticsLogger f39308d;

    /* compiled from: BottomToolTipMapper.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39309a;

        static {
            int[] iArr = new int[CustomToolTips.values().length];
            try {
                iArr[CustomToolTips.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomToolTips.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomToolTips.OFFERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomToolTips.POST_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CustomToolTips.MESSAGES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CustomToolTips.PROFILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f39309a = iArr;
        }
    }

    public BottomToolTipMapper(CustomToolTips toolTip, int i11, MainContainerActivity context, AggregatedAllAnalyticsLogger analyticsLogger) {
        o.i(toolTip, "toolTip");
        o.i(context, "context");
        o.i(analyticsLogger, "analyticsLogger");
        this.f39305a = toolTip;
        this.f39306b = i11;
        this.f39307c = context;
        this.f39308d = analyticsLogger;
    }

    private final Rect d(CustomToolTips customToolTips) {
        View findViewById;
        Rect rect = new Rect(0, 0, 0, 0);
        switch (a.f39309a[customToolTips.ordinal()]) {
            case 1:
                findViewById = this.f39307c.findViewById(r0.f69875d6);
                break;
            case 2:
            case 5:
                findViewById = this.f39307c.findViewById(r0.f69927h6);
                break;
            case 3:
                findViewById = this.f39307c.findViewById(r0.f69888e6);
                break;
            case 4:
                findViewById = this.f39307c.findViewById(r0.f69914g6);
                break;
            case 6:
                findViewById = this.f39307c.findViewById(r0.f69901f6);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (findViewById != null) {
            findViewById.getHitRect(rect);
        }
        return rect;
    }

    private final th.a e(e eVar, final CustomToolTips customToolTips, final g00.a<p> aVar) {
        MainContainerActivity mainContainerActivity = this.f39307c;
        return new th.a(mainContainerActivity, mainContainerActivity, 80, null, Integer.valueOf(p0.f69702b), eVar, f(), 0, new g00.p<Boolean, Integer, p>() { // from class: com.forsale.app.ui.customtooltip.BottomToolTipMapper$defineBottomTipDialog$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(boolean z11, int i11) {
                aVar.invoke();
                if (z11) {
                    this.o(customToolTips);
                }
                this.j(z11, i11);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(Boolean bool, Integer num) {
                b(bool.booleanValue(), num.intValue());
                return p.f75480a;
            }
        }, 128, null);
    }

    private final List<c> f() {
        List<c> q11;
        q11 = r.q(new c(d(CustomToolTips.HOME), new g00.a<p>() { // from class: com.forsale.app.ui.customtooltip.BottomToolTipMapper$getAllTabsTargetRectList$homeRect$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MainContainerActivity.K1(BottomToolTipMapper.this.h(), HomeTabs.INDEX_HOME, null, 2, null);
            }
        }), new c(d(CustomToolTips.OFFERS), new g00.a<p>() { // from class: com.forsale.app.ui.customtooltip.BottomToolTipMapper$getAllTabsTargetRectList$offersRect$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MainContainerActivity.K1(BottomToolTipMapper.this.h(), HomeTabs.INDEX_OFFERS, null, 2, null);
            }
        }), new c(d(CustomToolTips.POST_AD), new g00.a<p>() { // from class: com.forsale.app.ui.customtooltip.BottomToolTipMapper$getAllTabsTargetRectList$postAdRect$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b.a.a(BottomToolTipMapper.this.h(), null, 1, null);
            }
        }), new c(d(CustomToolTips.SEARCH), new g00.a<p>() { // from class: com.forsale.app.ui.customtooltip.BottomToolTipMapper$getAllTabsTargetRectList$searchRect$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MainContainerActivity.K1(BottomToolTipMapper.this.h(), HomeTabs.INDEX_SEARCH, null, 2, null);
            }
        }), new c(d(CustomToolTips.PROFILE), new g00.a<p>() { // from class: com.forsale.app.ui.customtooltip.BottomToolTipMapper$getAllTabsTargetRectList$profileRect$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MainContainerActivity.K1(BottomToolTipMapper.this.h(), HomeTabs.INDEX_PROFILE, null, 2, null);
            }
        }));
        return q11;
    }

    private final AggregatedAllAnalyticsLogger.BottomToolTipAction g(boolean z11, String str) {
        if (z11) {
            return AggregatedAllAnalyticsLogger.BottomToolTipAction.CLICKED_INSIDE;
        }
        if (!z11) {
            if (str == null) {
                return AggregatedAllAnalyticsLogger.BottomToolTipAction.CLICKED_OUTSIDE;
            }
            return AggregatedAllAnalyticsLogger.BottomToolTipAction.CLICKED_ON_TAB;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void j(boolean z11, int i11) {
        String str;
        CustomToolTips l11 = l(i11);
        if (l11 != null) {
            str = l11.getValue();
        } else {
            str = null;
        }
        String str2 = str;
        AggregatedAllAnalyticsLoggerKt.z(this.f39308d, AggregatedAllAnalyticsLogger.CustomEvents.BOTTOM_TOOLTIP_ACTION, this.f39305a.getValue(), g(z11, str2), str2, false, false, 48, null);
    }

    private final void k() {
        AggregatedAllAnalyticsLoggerKt.B(this.f39308d, AggregatedAllAnalyticsLogger.CustomEvents.BOTTOM_TOOLTIP_VIEWED, this.f39305a.getValue(), false, false, 12, null);
    }

    private final CustomToolTips l(int i11) {
        if (i11 == HomeTabs.INDEX_HOME.getIndex()) {
            return CustomToolTips.HOME;
        }
        if (i11 == HomeTabs.INDEX_OFFERS.getIndex()) {
            return CustomToolTips.OFFERS;
        }
        if (i11 == HomeTabs.INDEX_POST_AD.getIndex()) {
            return CustomToolTips.POST_AD;
        }
        if (i11 == HomeTabs.INDEX_SEARCH.getIndex()) {
            return CustomToolTips.SEARCH;
        }
        if (i11 == HomeTabs.INDEX_PROFILE.getIndex()) {
            return CustomToolTips.PROFILE;
        }
        return null;
    }

    private final e m(CustomToolTips customToolTips) {
        int i11 = a.f39309a[customToolTips.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            return new e(Integer.valueOf(y0.Id), Integer.valueOf(y0.Hd), Integer.valueOf(q0.N1), Integer.valueOf(q0.f69769l), null, 16, null);
        }
        return new e(Integer.valueOf(y0.f70602o5), Integer.valueOf(y0.f70585n5), Integer.valueOf(q0.F0), Integer.valueOf(q0.f69757i), null, 16, null);
    }

    private final e n(CustomToolTips customToolTips) {
        return m(customToolTips);
    }

    public final void o(CustomToolTips customToolTips) {
        switch (a.f39309a[customToolTips.ordinal()]) {
            case 1:
                MainContainerActivity.K1(this.f39307c, HomeTabs.INDEX_HOME, null, 2, null);
                return;
            case 2:
            case 5:
                MainContainerActivity.K1(this.f39307c, HomeTabs.INDEX_SEARCH, null, 2, null);
                return;
            case 3:
                MainContainerActivity.K1(this.f39307c, HomeTabs.INDEX_OFFERS, null, 2, null);
                return;
            case 4:
                b.a.a(this.f39307c, null, 1, null);
                return;
            case 6:
                this.f39307c.findViewById(r0.f69901f6);
                return;
            default:
                return;
        }
    }

    public static final void q(th.a this_apply) {
        o.i(this_apply, "$this_apply");
        if (this_apply.isShowing()) {
            this_apply.dismiss();
        }
    }

    public final MainContainerActivity h() {
        return this.f39307c;
    }

    public final boolean i() {
        if (n(this.f39305a) != null) {
            return true;
        }
        return false;
    }

    public final void p(g00.a<p> onDismissCallBack) {
        o.i(onDismissCallBack, "onDismissCallBack");
        e n11 = n(this.f39305a);
        o.f(n11);
        th.a e11 = e(n11, this.f39305a, onDismissCallBack);
        k();
        e11.show();
        new Handler(Looper.getMainLooper()).postDelayed(new th.b(e11), this.f39306b);
    }
}
