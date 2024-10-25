package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.text.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpanText.kt */
/* loaded from: classes3.dex */
public final class SpanTextKt$BuildSpanText$5 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c.a f42383a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f42384b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f42385c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f42386d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f42387e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42388f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpanTextKt$BuildSpanText$5(c.a aVar, String str, String str2, long j11, long j12, int i11) {
        super(2);
        this.f42383a = aVar;
        this.f42384b = str;
        this.f42385c = str2;
        this.f42386d = j11;
        this.f42387e = j12;
        this.f42388f = i11;
    }

    public final void b(a aVar, int i11) {
        SpanTextKt.a(this.f42383a, this.f42384b, this.f42385c, this.f42386d, this.f42387e, aVar, v0.a(this.f42388f | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
