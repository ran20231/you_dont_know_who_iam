package com.forsale.designSystem;

import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VendorLabel.kt */
/* loaded from: classes3.dex */
public final class VendorLabelKt$VendorLabel$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f40744a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Painter f40745b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f40746c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f40747d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f40748e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorLabelKt$VendorLabel$1(c cVar, Painter painter, long j11, int i11, int i12) {
        super(2);
        this.f40744a = cVar;
        this.f40745b = painter;
        this.f40746c = j11;
        this.f40747d = i11;
        this.f40748e = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        VendorLabelKt.a(this.f40744a, this.f40745b, this.f40746c, aVar, v0.a(this.f40747d | 1), this.f40748e);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
