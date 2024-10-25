package com.forsale.designSystem.buttons;

import g00.p;
import g00.q;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import v.k;
import w.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
public final class ButtonsKt$GhostButton$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41079a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41080b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ButtonData f41081c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f41082d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f41083e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k f41084f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41085g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41086h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f41087i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsKt$GhostButton$2(g00.a<wz.p> aVar, androidx.compose.ui.c cVar, ButtonData buttonData, boolean z11, boolean z12, k kVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, int i11, int i12) {
        super(2);
        this.f41079a = aVar;
        this.f41080b = cVar;
        this.f41081c = buttonData;
        this.f41082d = z11;
        this.f41083e = z12;
        this.f41084f = kVar;
        this.f41085g = qVar;
        this.f41086h = i11;
        this.f41087i = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        ButtonsKt.e(this.f41079a, this.f41080b, this.f41081c, this.f41082d, this.f41083e, this.f41084f, this.f41085g, aVar, v0.a(this.f41086h | 1), this.f41087i);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
