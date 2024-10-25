package com.forsale.designSystem.checkboxes;

import androidx.compose.ui.c;
import g00.l;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import v.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Checkboxes.kt */
/* loaded from: classes3.dex */
public final class CheckboxesKt$DefaultCheckbox$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f41219a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f41220b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f41221c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ wj.a f41222d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ float f41223e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k f41224f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l<Boolean, wz.p> f41225g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41226h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f41227i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckboxesKt$DefaultCheckbox$1(c cVar, boolean z11, boolean z12, wj.a aVar, float f11, k kVar, l<? super Boolean, wz.p> lVar, int i11, int i12) {
        super(2);
        this.f41219a = cVar;
        this.f41220b = z11;
        this.f41221c = z12;
        this.f41222d = aVar;
        this.f41223e = f11;
        this.f41224f = kVar;
        this.f41225g = lVar;
        this.f41226h = i11;
        this.f41227i = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        CheckboxesKt.b(this.f41219a, this.f41220b, this.f41221c, this.f41222d, this.f41223e, this.f41224f, this.f41225g, aVar, v0.a(this.f41226h | 1), this.f41227i);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
