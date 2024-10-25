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
public final class ButtonsKt$PrimaryButton$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41112a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41113b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ButtonData f41114c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ yj.d f41115d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f41116e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f41117f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ k f41118g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41119h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f41120i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f41121j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsKt$PrimaryButton$2(g00.a<wz.p> aVar, androidx.compose.ui.c cVar, ButtonData buttonData, yj.d dVar, boolean z11, boolean z12, k kVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, int i11, int i12) {
        super(2);
        this.f41112a = aVar;
        this.f41113b = cVar;
        this.f41114c = buttonData;
        this.f41115d = dVar;
        this.f41116e = z11;
        this.f41117f = z12;
        this.f41118g = kVar;
        this.f41119h = qVar;
        this.f41120i = i11;
        this.f41121j = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        ButtonsKt.j(this.f41112a, this.f41113b, this.f41114c, this.f41115d, this.f41116e, this.f41117f, this.f41118g, this.f41119h, aVar, v0.a(this.f41120i | 1), this.f41121j);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
