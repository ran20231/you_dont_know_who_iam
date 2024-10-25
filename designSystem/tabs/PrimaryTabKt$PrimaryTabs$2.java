package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.l;
import g00.p;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrimaryTab.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabKt$PrimaryTabs$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42085a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<ck.a> f42086b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42087c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<Integer, wz.p> f42088d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42089e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42090f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PrimaryTabKt$PrimaryTabs$2(c cVar, List<ck.a> list, int i11, l<? super Integer, wz.p> lVar, int i12, int i13) {
        super(2);
        this.f42085a = cVar;
        this.f42086b = list;
        this.f42087c = i11;
        this.f42088d = lVar;
        this.f42089e = i12;
        this.f42090f = i13;
    }

    public final void b(a aVar, int i11) {
        PrimaryTabKt.a(this.f42085a, this.f42086b, this.f42087c, this.f42088d, aVar, v0.a(this.f42089e | 1), this.f42090f);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
