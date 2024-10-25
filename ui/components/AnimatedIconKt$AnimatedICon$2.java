package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedIcon.kt */
/* loaded from: classes3.dex */
public final class AnimatedIconKt$AnimatedICon$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42217a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42218b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f42219c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f42220d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f42221e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42222f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f42223g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f42224h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedIconKt$AnimatedICon$2(c cVar, int i11, float f11, float f12, boolean z11, g00.a<wz.p> aVar, int i12, int i13) {
        super(2);
        this.f42217a = cVar;
        this.f42218b = i11;
        this.f42219c = f11;
        this.f42220d = f12;
        this.f42221e = z11;
        this.f42222f = aVar;
        this.f42223g = i12;
        this.f42224h = i13;
    }

    public final void b(a aVar, int i11) {
        AnimatedIconKt.a(this.f42217a, this.f42218b, this.f42219c, this.f42220d, this.f42221e, this.f42222f, aVar, v0.a(this.f42223g | 1), this.f42224h);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
