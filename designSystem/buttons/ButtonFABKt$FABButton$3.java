package com.forsale.designSystem.buttons;

import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import s.n;
import v.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ButtonFAB.kt */
/* loaded from: classes3.dex */
public final class ButtonFABKt$FABButton$3 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41033a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41034b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ButtonFABData f41035c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41036d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f41037e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ float f41038f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ k f41039g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ n f41040h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f41041i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f41042j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonFABKt$FABButton$3(androidx.compose.ui.c cVar, g00.a<wz.p> aVar, ButtonFABData buttonFABData, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, long j11, float f11, k kVar, n nVar, int i11, int i12) {
        super(2);
        this.f41033a = cVar;
        this.f41034b = aVar;
        this.f41035c = buttonFABData;
        this.f41036d = pVar;
        this.f41037e = j11;
        this.f41038f = f11;
        this.f41039g = kVar;
        this.f41040h = nVar;
        this.f41041i = i11;
        this.f41042j = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        ButtonFABKt.a(this.f41033a, this.f41034b, this.f41035c, this.f41036d, this.f41037e, this.f41038f, this.f41039g, this.f41040h, aVar, v0.a(this.f41041i | 1), this.f41042j);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
