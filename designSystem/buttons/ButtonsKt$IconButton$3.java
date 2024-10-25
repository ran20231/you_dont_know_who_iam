package com.forsale.designSystem.buttons;

import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import v.k;
import w.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
public final class ButtonsKt$IconButton$3 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41090a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41091b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f41092c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ o f41093d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k f41094e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41095f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41096g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41097h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsKt$IconButton$3(g00.a<wz.p> aVar, androidx.compose.ui.c cVar, boolean z11, o oVar, k kVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11, int i12) {
        super(2);
        this.f41090a = aVar;
        this.f41091b = cVar;
        this.f41092c = z11;
        this.f41093d = oVar;
        this.f41094e = kVar;
        this.f41095f = pVar;
        this.f41096g = i11;
        this.f41097h = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        ButtonsKt.g(this.f41090a, this.f41091b, this.f41092c, this.f41093d, this.f41094e, this.f41095f, aVar, v0.a(this.f41096g | 1), this.f41097h);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
