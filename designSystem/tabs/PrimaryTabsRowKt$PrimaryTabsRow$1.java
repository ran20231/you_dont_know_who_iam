package com.forsale.designSystem.tabs;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrimaryTabsRow.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabsRowKt$PrimaryTabsRow$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42095a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42096b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42097c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PrimaryTabsRowKt$PrimaryTabsRow$1(p<? super a, ? super Integer, wz.p> pVar, int i11, int i12) {
        super(2);
        this.f42095a = pVar;
        this.f42096b = i11;
        this.f42097c = i12;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-335114124, i11, -1, "com.forsale.designSystem.tabs.PrimaryTabsRow.<anonymous> (PrimaryTabsRow.kt:65)");
        }
        androidx.compose.ui.c h11 = SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
        p<a, Integer, wz.p> pVar = this.f42095a;
        Integer valueOf = Integer.valueOf(this.f42096b);
        p<a, Integer, wz.p> pVar2 = this.f42095a;
        int i12 = this.f42096b;
        aVar.C(511388516);
        boolean T = aVar.T(pVar) | aVar.T(valueOf);
        Object D = aVar.D();
        if (T || D == a.f7182a.a()) {
            D = new PrimaryTabsRowKt$PrimaryTabsRow$1$1$1(pVar2, i12);
            aVar.u(D);
        }
        aVar.S();
        SubcomposeLayoutKt.a(h11, (p) D, aVar, 6, 0);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
