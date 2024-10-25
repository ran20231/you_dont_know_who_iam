package com.forsale.designSystem.dividers;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Dividers.kt */
/* loaded from: classes3.dex */
public final class DividersKt$DividerLine$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f41322a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f41323b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f41324c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41325d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41326e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividersKt$DividerLine$1(c cVar, float f11, long j11, int i11, int i12) {
        super(2);
        this.f41322a = cVar;
        this.f41323b = f11;
        this.f41324c = j11;
        this.f41325d = i11;
        this.f41326e = i12;
    }

    public final void b(a aVar, int i11) {
        DividersKt.a(this.f41322a, this.f41323b, this.f41324c, aVar, v0.a(this.f41325d | 1), this.f41326e);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
