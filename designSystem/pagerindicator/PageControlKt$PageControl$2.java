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
public final class PageControlKt$PageControl$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f41997a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0<Integer> f41998b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41999c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f42000d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f42001e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Orientation f42002f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l<Integer, Integer> f42003g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f42004h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f42005i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f42006j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageControlKt$PageControl$2(c cVar, k0<Integer> k0Var, int i11, b bVar, a aVar, Orientation orientation, l<? super Integer, Integer> lVar, boolean z11, int i12, int i13) {
        super(2);
        this.f41997a = cVar;
        this.f41998b = k0Var;
        this.f41999c = i11;
        this.f42000d = bVar;
        this.f42001e = aVar;
        this.f42002f = orientation;
        this.f42003g = lVar;
        this.f42004h = z11;
        this.f42005i = i12;
        this.f42006j = i13;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        PageControlKt.a(this.f41997a, this.f41998b, this.f41999c, this.f42000d, this.f42001e, this.f42002f, this.f42003g, this.f42004h, aVar, v0.a(this.f42005i | 1), this.f42006j);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
