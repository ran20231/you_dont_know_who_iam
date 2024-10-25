package com.forsale.ui.components;

import androidx.compose.runtime.a;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: State.kt */
/* loaded from: classes3.dex */
public final class StateKt$ConnectionErrorState$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Integer f42389a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42390b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42391c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f42392d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42393e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42394f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f42395g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateKt$ConnectionErrorState$1(Integer num, int i11, int i12, int i13, g00.a<wz.p> aVar, int i14, int i15) {
        super(2);
        this.f42389a = num;
        this.f42390b = i11;
        this.f42391c = i12;
        this.f42392d = i13;
        this.f42393e = aVar;
        this.f42394f = i14;
        this.f42395g = i15;
    }

    public final void b(a aVar, int i11) {
        StateKt.a(this.f42389a, this.f42390b, this.f42391c, this.f42392d, this.f42393e, aVar, v0.a(this.f42394f | 1), this.f42395g);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
