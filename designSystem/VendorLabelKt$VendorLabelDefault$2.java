package com.forsale.designSystem;

import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VendorLabel.kt */
/* loaded from: classes3.dex */
public final class VendorLabelKt$VendorLabelDefault$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f40749a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Painter f40750b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f40751c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f40752d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f40753e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorLabelKt$VendorLabelDefault$2(c cVar, Painter painter, long j11, int i11, int i12) {
        super(2);
        this.f40749a = cVar;
        this.f40750b = painter;
        this.f40751c = j11;
        this.f40752d = i11;
        this.f40753e = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        VendorLabelKt.b(this.f40749a, this.f40750b, this.f40751c, aVar, v0.a(this.f40752d | 1), this.f40753e);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
