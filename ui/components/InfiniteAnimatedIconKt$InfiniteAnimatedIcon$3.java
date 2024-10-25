package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.unit.LayoutDirection;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InfiniteAnimatedIcon.kt */
/* loaded from: classes3.dex */
public final class InfiniteAnimatedIconKt$InfiniteAnimatedIcon$3 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42311a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42312b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f42313c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f42314d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ float f42315e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f42316f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ LayoutDirection f42317g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f42318h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f42319i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimatedIconKt$InfiniteAnimatedIcon$3(c cVar, int i11, float f11, float f12, float f13, boolean z11, LayoutDirection layoutDirection, int i12, int i13) {
        super(2);
        this.f42311a = cVar;
        this.f42312b = i11;
        this.f42313c = f11;
        this.f42314d = f12;
        this.f42315e = f13;
        this.f42316f = z11;
        this.f42317g = layoutDirection;
        this.f42318h = i12;
        this.f42319i = i13;
    }

    public final void b(a aVar, int i11) {
        InfiniteAnimatedIconKt.a(this.f42311a, this.f42312b, this.f42313c, this.f42314d, this.f42315e, this.f42316f, this.f42317g, aVar, v0.a(this.f42318h | 1), this.f42319i);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
