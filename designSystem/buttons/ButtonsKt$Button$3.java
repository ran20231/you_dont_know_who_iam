package com.forsale.designSystem.buttons;

import g00.p;
import g00.q;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import s.f;
import v.k;
import w.o;
import w.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
public final class ButtonsKt$Button$3 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41054a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ButtonData f41055b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f41056c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41057d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f41058e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k f41059f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ f f41060g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f41061h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ o f41062i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41063j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ int f41064x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ int f41065y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsKt$Button$3(g00.a<wz.p> aVar, ButtonData buttonData, a aVar2, androidx.compose.ui.c cVar, boolean z11, k kVar, f fVar, boolean z12, o oVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, int i11, int i12) {
        super(2);
        this.f41054a = aVar;
        this.f41055b = buttonData;
        this.f41056c = aVar2;
        this.f41057d = cVar;
        this.f41058e = z11;
        this.f41059f = kVar;
        this.f41060g = fVar;
        this.f41061h = z12;
        this.f41062i = oVar;
        this.f41063j = qVar;
        this.f41064x = i11;
        this.f41065y = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        ButtonsKt.a(this.f41054a, this.f41055b, this.f41056c, this.f41057d, this.f41058e, this.f41059f, this.f41060g, this.f41061h, this.f41062i, this.f41063j, aVar, v0.a(this.f41064x | 1), this.f41065y);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
