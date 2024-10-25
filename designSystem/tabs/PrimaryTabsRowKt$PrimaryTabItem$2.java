package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrimaryTabsRow.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabsRowKt$PrimaryTabItem$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ck.a f42092a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f42093b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42094c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryTabsRowKt$PrimaryTabItem$2(ck.a aVar, long j11, int i11) {
        super(2);
        this.f42092a = aVar;
        this.f42093b = j11;
        this.f42094c = i11;
    }

    public final void b(a aVar, int i11) {
        PrimaryTabsRowKt.a(this.f42092a, this.f42093b, aVar, v0.a(this.f42094c | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
