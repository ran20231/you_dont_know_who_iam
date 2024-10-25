package com.forsale.ui.components.flows;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Flow.kt */
/* loaded from: classes3.dex */
public final class FlowKt$Flow$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42683a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LayoutOrientation f42684b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SizeMode f42685c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MainAxisAlignment f42686d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ float f42687e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ FlowCrossAxisAlignment f42688f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ float f42689g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ MainAxisAlignment f42690h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42691i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f42692j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt$Flow$2(c cVar, LayoutOrientation layoutOrientation, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f11, FlowCrossAxisAlignment flowCrossAxisAlignment, float f12, MainAxisAlignment mainAxisAlignment2, p<? super a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f42683a = cVar;
        this.f42684b = layoutOrientation;
        this.f42685c = sizeMode;
        this.f42686d = mainAxisAlignment;
        this.f42687e = f11;
        this.f42688f = flowCrossAxisAlignment;
        this.f42689g = f12;
        this.f42690h = mainAxisAlignment2;
        this.f42691i = pVar;
        this.f42692j = i11;
    }

    public final void b(a aVar, int i11) {
        FlowKt.a(this.f42683a, this.f42684b, this.f42685c, this.f42686d, this.f42687e, this.f42688f, this.f42689g, this.f42690h, this.f42691i, aVar, v0.a(this.f42692j | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
