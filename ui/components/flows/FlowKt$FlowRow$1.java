package com.forsale.ui.components.flows;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Flow.kt */
/* loaded from: classes3.dex */
public final class FlowKt$FlowRow$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42693a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SizeMode f42694b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MainAxisAlignment f42695c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f42696d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ FlowCrossAxisAlignment f42697e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ float f42698f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ MainAxisAlignment f42699g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42700h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f42701i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f42702j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt$FlowRow$1(c cVar, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f11, FlowCrossAxisAlignment flowCrossAxisAlignment, float f12, MainAxisAlignment mainAxisAlignment2, p<? super a, ? super Integer, wz.p> pVar, int i11, int i12) {
        super(2);
        this.f42693a = cVar;
        this.f42694b = sizeMode;
        this.f42695c = mainAxisAlignment;
        this.f42696d = f11;
        this.f42697e = flowCrossAxisAlignment;
        this.f42698f = f12;
        this.f42699g = mainAxisAlignment2;
        this.f42700h = pVar;
        this.f42701i = i11;
        this.f42702j = i12;
    }

    public final void b(a aVar, int i11) {
        FlowKt.b(this.f42693a, this.f42694b, this.f42695c, this.f42696d, this.f42697e, this.f42698f, this.f42699g, this.f42700h, aVar, v0.a(this.f42701i | 1), this.f42702j);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
