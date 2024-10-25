package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: State.kt */
/* loaded from: classes3.dex */
public final class StateKt$GeneralErrorState$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42396a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Integer f42397b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42398c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f42399d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42400e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42401f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f42402g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f42403h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateKt$GeneralErrorState$1(c cVar, Integer num, int i11, int i12, int i13, g00.a<wz.p> aVar, int i14, int i15) {
        super(2);
        this.f42396a = cVar;
        this.f42397b = num;
        this.f42398c = i11;
        this.f42399d = i12;
        this.f42400e = i13;
        this.f42401f = aVar;
        this.f42402g = i14;
        this.f42403h = i15;
    }

    public final void b(a aVar, int i11) {
        StateKt.b(this.f42396a, this.f42397b, this.f42398c, this.f42399d, this.f42400e, this.f42401f, aVar, v0.a(this.f42402g | 1), this.f42403h);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
