package com.forsale.designSystem.inputs;

import androidx.compose.ui.text.a0;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
public final class InputsKt$Decoration$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f41399a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f41400b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41401c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41402d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41403e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f41404f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$Decoration$1(long j11, a0 a0Var, int i11, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i12, int i13) {
        super(2);
        this.f41399a = j11;
        this.f41400b = a0Var;
        this.f41401c = i11;
        this.f41402d = pVar;
        this.f41403e = i12;
        this.f41404f = i13;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        InputsKt.b(this.f41399a, this.f41400b, this.f41401c, this.f41402d, aVar, v0.a(this.f41403e | 1), this.f41404f);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
