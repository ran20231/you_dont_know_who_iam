package com.forsale.designSystem.bottomsheets;

import androidx.compose.runtime.a;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
public final class BottomSheetsKt$Scrim$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f40848a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f40849b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f40850c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f40851d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetsKt$Scrim$2(long j11, g00.a<wz.p> aVar, boolean z11, int i11) {
        super(2);
        this.f40848a = j11;
        this.f40849b = aVar;
        this.f40850c = z11;
        this.f40851d = i11;
    }

    public final void b(a aVar, int i11) {
        BottomSheetsKt.c(this.f40848a, this.f40849b, this.f40850c, aVar, v0.a(this.f40851d | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
