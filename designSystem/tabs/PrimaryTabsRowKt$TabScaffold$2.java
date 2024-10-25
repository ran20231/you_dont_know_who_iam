package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import g00.q;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import w.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrimaryTabsRow.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabsRowKt$TabScaffold$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f42122a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42123b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f42124c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q<e, a, Integer, wz.p> f42125d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42126e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42127f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PrimaryTabsRowKt$TabScaffold$2(boolean z11, g00.a<wz.p> aVar, c cVar, q<? super e, ? super a, ? super Integer, wz.p> qVar, int i11, int i12) {
        super(2);
        this.f42122a = z11;
        this.f42123b = aVar;
        this.f42124c = cVar;
        this.f42125d = qVar;
        this.f42126e = i11;
        this.f42127f = i12;
    }

    public final void b(a aVar, int i11) {
        PrimaryTabsRowKt.c(this.f42122a, this.f42123b, this.f42124c, this.f42125d, aVar, v0.a(this.f42126e | 1), this.f42127f);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
