package com.forsale.designSystem.inputs;

import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
public final class InputsKt$VerticalDivider$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f41564a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f41565b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f41566c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f41567d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41568e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f41569f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputsKt$VerticalDivider$1(c cVar, long j11, float f11, float f12, int i11, int i12) {
        super(2);
        this.f41564a = cVar;
        this.f41565b = j11;
        this.f41566c = f11;
        this.f41567d = f12;
        this.f41568e = i11;
        this.f41569f = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        InputsKt.m(this.f41564a, this.f41565b, this.f41566c, this.f41567d, aVar, v0.a(this.f41568e | 1), this.f41569f);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
