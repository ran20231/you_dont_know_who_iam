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
public final class ButtonsKt$TextButton$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41122a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41123b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ButtonData f41124c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f41125d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f41126e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k f41127f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41128g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41129h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f41130i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsKt$TextButton$2(g00.a<wz.p> aVar, androidx.compose.ui.c cVar, ButtonData buttonData, boolean z11, boolean z12, k kVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, int i11, int i12) {
        super(2);
        this.f41122a = aVar;
        this.f41123b = cVar;
        this.f41124c = buttonData;
        this.f41125d = z11;
        this.f41126e = z12;
        this.f41127f = kVar;
        this.f41128g = qVar;
        this.f41129h = i11;
        this.f41130i = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        ButtonsKt.k(this.f41122a, this.f41123b, this.f41124c, this.f41125d, this.f41126e, this.f41127f, this.f41128g, aVar, v0.a(this.f41129h | 1), this.f41130i);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
