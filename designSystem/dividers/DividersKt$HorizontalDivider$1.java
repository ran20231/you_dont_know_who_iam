package com.forsale.designSystem.dividers;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Dividers.kt */
/* loaded from: classes3.dex */
public final class DividersKt$HorizontalDivider$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f41327a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f41328b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f41329c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f41330d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41331e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f41332f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividersKt$HorizontalDivider$1(c cVar, float f11, float f12, long j11, int i11, int i12) {
        super(2);
        this.f41327a = cVar;
        this.f41328b = f11;
        this.f41329c = f12;
        this.f41330d = j11;
        this.f41331e = i11;
        this.f41332f = i12;
    }

    public final void b(a aVar, int i11) {
        DividersKt.b(this.f41327a, this.f41328b, this.f41329c, this.f41330d, aVar, v0.a(this.f41331e | 1), this.f41332f);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
