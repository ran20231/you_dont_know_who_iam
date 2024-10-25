package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import w.e;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrimaryTab.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabKt$PrimaryTabs$1$1$2 extends Lambda implements q<e, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ck.a f42082a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42083b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42084c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryTabKt$PrimaryTabs$1$1$2(ck.a aVar, int i11, int i12) {
        super(3);
        this.f42082a = aVar;
        this.f42083b = i11;
        this.f42084c = i12;
    }

    public final void b(e TabScaffold, a aVar, int i11) {
        long j11;
        o.i(TabScaffold, "$this$TabScaffold");
        if ((i11 & 81) == 16 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1674132903, i11, -1, "com.forsale.designSystem.tabs.PrimaryTabs.<anonymous>.<anonymous>.<anonymous> (PrimaryTab.kt:41)");
        }
        ck.a aVar2 = this.f42082a;
        if (this.f42083b == this.f42084c) {
            aVar.C(-1656562930);
            j11 = dk.a.f54291a.a(aVar, 6).f().i(aVar, 0);
            aVar.S();
        } else {
            aVar.C(-1656562862);
            j11 = dk.a.f54291a.a(aVar, 6).e().j(aVar, 0);
            aVar.S();
        }
        PrimaryTabsRowKt.a(aVar2, j11, aVar, 0);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(e eVar, a aVar, Integer num) {
        b(eVar, aVar, num.intValue());
        return p.f75480a;
    }
}
