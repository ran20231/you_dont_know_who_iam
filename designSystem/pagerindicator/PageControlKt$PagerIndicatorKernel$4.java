package com.forsale.designSystem.pagerindicator;

import androidx.compose.foundation.gestures.Orientation;
import g00.l;
import g00.p;
import j0.k0;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PageControl.kt */
/* loaded from: classes3.dex */
public final class PageControlKt$PagerIndicatorKernel$4 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f42042a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0<Integer> f42043b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f42044c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f42045d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f42046e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Orientation f42047f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l<Integer, Integer> f42048g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f42049h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f42050i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f42051j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageControlKt$PagerIndicatorKernel$4(int i11, k0<Integer> k0Var, long j11, b bVar, a aVar, Orientation orientation, l<? super Integer, Integer> lVar, boolean z11, int i12, int i13) {
        super(2);
        this.f42042a = i11;
        this.f42043b = k0Var;
        this.f42044c = j11;
        this.f42045d = bVar;
        this.f42046e = aVar;
        this.f42047f = orientation;
        this.f42048g = lVar;
        this.f42049h = z11;
        this.f42050i = i12;
        this.f42051j = i13;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        PageControlKt.b(this.f42042a, this.f42043b, this.f42044c, this.f42045d, this.f42046e, this.f42047f, this.f42048g, this.f42049h, aVar, v0.a(this.f42050i | 1), this.f42051j);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
