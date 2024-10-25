package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrimaryTabsRow.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabsRowKt$TabTransition$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f42128a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42129b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42130c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PrimaryTabsRowKt$TabTransition$1(boolean z11, p<? super a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f42128a = z11;
        this.f42129b = pVar;
        this.f42130c = i11;
    }

    public final void b(a aVar, int i11) {
        PrimaryTabsRowKt.d(this.f42128a, this.f42129b, aVar, v0.a(this.f42130c | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
