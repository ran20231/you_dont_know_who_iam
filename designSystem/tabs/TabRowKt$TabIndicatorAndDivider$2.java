package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import ck.b;
import g00.p;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabRow.kt */
/* loaded from: classes3.dex */
public final class TabRowKt$TabIndicatorAndDivider$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<b> f42148a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42149b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f42150c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f42151d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42152e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabIndicatorAndDivider$2(List<b> list, int i11, float f11, int i12, int i13) {
        super(2);
        this.f42148a = list;
        this.f42149b = i11;
        this.f42150c = f11;
        this.f42151d = i12;
        this.f42152e = i13;
    }

    public final void b(a aVar, int i11) {
        TabRowKt.a(this.f42148a, this.f42149b, this.f42150c, aVar, v0.a(this.f42151d | 1), this.f42152e);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
