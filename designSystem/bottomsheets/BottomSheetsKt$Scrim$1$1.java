package com.forsale.designSystem.bottomsheets;

import d1.f;
import g00.l;
import j0.n1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
public final class BottomSheetsKt$Scrim$1$1 extends Lambda implements l<f, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f40846a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n1<Float> f40847b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetsKt$Scrim$1$1(long j11, n1<Float> n1Var) {
        super(1);
        this.f40846a = j11;
        this.f40847b = n1Var;
    }

    public final void b(f Canvas) {
        float d11;
        o.i(Canvas, "$this$Canvas");
        long j11 = this.f40846a;
        d11 = BottomSheetsKt.d(this.f40847b);
        f.c0(Canvas, j11, 0L, 0L, d11, null, null, 0, 118, null);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(f fVar) {
        b(fVar);
        return p.f75480a;
    }
}
