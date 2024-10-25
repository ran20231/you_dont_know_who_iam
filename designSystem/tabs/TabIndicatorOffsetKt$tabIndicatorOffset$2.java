package com.forsale.designSystem.tabs;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import ck.b;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import e2.h;
import g00.q;
import j0.n1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import r.g;
import r.h0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabIndicatorOffset.kt */
/* loaded from: classes3.dex */
public final class TabIndicatorOffsetKt$tabIndicatorOffset$2 extends Lambda implements q<c, a, Integer, c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f42133a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetKt$tabIndicatorOffset$2(b bVar) {
        super(3);
        this.f42133a = bVar;
    }

    private static final float c(n1<h> n1Var) {
        return n1Var.getValue().q();
    }

    private static final float e(n1<h> n1Var) {
        return n1Var.getValue().q();
    }

    public final c b(c composed, a aVar, int i11) {
        o.i(composed, "$this$composed");
        aVar.C(1394174024);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1394174024, i11, -1, "com.forsale.designSystem.tabs.tabIndicatorOffset.<anonymous> (TabIndicatorOffset.kt:33)");
        }
        n1<h> c11 = AnimateAsStateKt.c(this.f42133a.c(), g.k(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, 0, h0.c(), 2, null), "currentTabWidth", null, aVar, 384, 8);
        c u11 = SizeKt.u(OffsetKt.c(SizeKt.y(composed, v0.b.f74009a.d(), false, 2, null), e(AnimateAsStateKt.c(this.f42133a.a(), g.k(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, 0, h0.c(), 2, null), "indicatorOffset", null, aVar, 384, 8)), 0.0f, 2, null), c(c11));
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return u11;
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ c invoke(c cVar, a aVar, Integer num) {
        return b(cVar, aVar, num.intValue());
    }
}
