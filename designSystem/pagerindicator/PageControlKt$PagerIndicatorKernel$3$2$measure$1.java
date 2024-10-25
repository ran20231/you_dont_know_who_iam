package com.forsale.designSystem.pagerindicator;

import a1.f;
import androidx.compose.ui.layout.o0;
import g00.l;
import i00.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: PageControl.kt */
/* loaded from: classes3.dex */
final class PageControlKt$PagerIndicatorKernel$3$2$measure$1 extends Lambda implements l<o0.a, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f42039a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ bk.a f42040b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42041c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageControlKt$PagerIndicatorKernel$3$2$measure$1(o0 o0Var, bk.a aVar, int i11) {
        super(1);
        this.f42039a = o0Var;
        this.f42040b = aVar;
        this.f42041c = i11;
    }

    public final void b(o0.a layout) {
        int d11;
        int d12;
        o.i(layout, "$this$layout");
        o0 o0Var = this.f42039a;
        d11 = c.d(f.o(this.f42040b.f().get(this.f42041c).getValue().x()));
        d12 = c.d(f.p(this.f42040b.f().get(this.f42041c).getValue().x()));
        o0.a.l(layout, o0Var, e2.o.a(d11, d12), 0.0f, 2, null);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(o0.a aVar) {
        b(aVar);
        return p.f75480a;
    }
}
