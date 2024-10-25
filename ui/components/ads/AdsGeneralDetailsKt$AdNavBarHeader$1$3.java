package com.forsale.ui.components.ads;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import b1.v1;
import com.forsale.designSystem.iconography.IconKt;
import e2.h;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import p1.e;
import sj.d;
import v0.b;
import w.t;
import wz.p;
/* compiled from: AdsGeneralDetails.kt */
/* loaded from: classes3.dex */
final class AdsGeneralDetailsKt$AdNavBarHeader$1$3 extends Lambda implements q<t, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f42428a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42429b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f42430c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsGeneralDetailsKt$AdNavBarHeader$1$3(g00.a<p> aVar, int i11, g00.a<p> aVar2) {
        super(3);
        this.f42428a = aVar;
        this.f42429b = i11;
        this.f42430c = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v2 */
    public final void b(t NavBarInner, a aVar, int i11) {
        int i12;
        int i13;
        o.i(NavBarInner, "$this$NavBarInner");
        if ((i11 & 14) == 0) {
            if (aVar.T(NavBarInner)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 91) == 18 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1620603664, i11, -1, "com.forsale.ui.components.ads.AdNavBarHeader.<anonymous>.<anonymous> (AdsGeneralDetails.kt:163)");
        }
        Painter d11 = e.d(d.f68683t, aVar, 0);
        long d12 = v1.d(4294967295L);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        float f11 = 16;
        androidx.compose.ui.c m11 = PaddingKt.m(aVar2, 0.0f, 0.0f, h.l(f11), 0.0f, 11, null);
        b.a aVar3 = b.f74009a;
        androidx.compose.ui.c c11 = NavBarInner.c(m11, aVar3.i());
        g00.a<p> aVar4 = this.f42428a;
        aVar.C(1157296644);
        boolean T = aVar.T(aVar4);
        Object D = aVar.D();
        if (T || D == a.f7182a.a()) {
            D = new AdsGeneralDetailsKt$AdNavBarHeader$1$3$1$1(aVar4);
            aVar.u(D);
        }
        aVar.S();
        IconKt.b(d11, ClickableKt.e(c11, false, null, null, D, 7, null), null, d12, false, 0.0f, true, aVar, 1575944, 52);
        Painter d13 = e.d(d.I, aVar, 0);
        long d14 = v1.d(4294967295L);
        androidx.compose.ui.c c12 = NavBarInner.c(PaddingKt.m(aVar2, 0.0f, 0.0f, h.l(f11), 0.0f, 11, null), aVar3.i());
        g00.a<p> aVar5 = this.f42430c;
        aVar.C(1157296644);
        boolean T2 = aVar.T(aVar5);
        Object D2 = aVar.D();
        if (T2 || D2 == a.f7182a.a()) {
            D2 = new AdsGeneralDetailsKt$AdNavBarHeader$1$3$2$1(aVar5);
            aVar.u(D2);
        }
        aVar.S();
        IconKt.b(d13, ClickableKt.e(c12, false, null, null, D2, 7, null), null, d14, false, 0.0f, true, aVar, 1575944, 52);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(t tVar, a aVar, Integer num) {
        b(tVar, aVar, num.intValue());
        return p.f75480a;
    }
}
