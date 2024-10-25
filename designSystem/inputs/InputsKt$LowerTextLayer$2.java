package com.forsale.designSystem.inputs;

import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
public final class InputsKt$LowerTextLayer$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41476a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41477b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f41478c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f41479d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41480e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$LowerTextLayer$2(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, long j11, long j12, int i11) {
        super(2);
        this.f41476a = pVar;
        this.f41477b = pVar2;
        this.f41478c = j11;
        this.f41479d = j12;
        this.f41480e = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        InputsKt.g(this.f41476a, this.f41477b, this.f41478c, this.f41479d, aVar, v0.a(this.f41480e | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
