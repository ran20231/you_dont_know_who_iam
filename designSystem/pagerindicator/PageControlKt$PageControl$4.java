package com.forsale.designSystem.pagerindicator;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.c;
import g00.l;
import g00.p;
import j0.k0;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PageControl.kt */
/* loaded from: classes3.dex */
public final class PageControlKt$PageControl$4 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42015a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0<Integer> f42016b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42017c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f42018d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f42019e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Orientation f42020f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l<Integer, Integer> f42021g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f42022h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f42023i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f42024j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageControlKt$PageControl$4(c cVar, k0<Integer> k0Var, int i11, b bVar, a aVar, Orientation orientation, l<? super Integer, Integer> lVar, boolean z11, int i12, int i13) {
        super(2);
        this.f42015a = cVar;
        this.f42016b = k0Var;
        this.f42017c = i11;
        this.f42018d = bVar;
        this.f42019e = aVar;
        this.f42020f = orientation;
        this.f42021g = lVar;
        this.f42022h = z11;
        this.f42023i = i12;
        this.f42024j = i13;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        PageControlKt.a(this.f42015a, this.f42016b, this.f42017c, this.f42018d, this.f42019e, this.f42020f, this.f42021g, this.f42022h, aVar, v0.a(this.f42023i | 1), this.f42024j);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
