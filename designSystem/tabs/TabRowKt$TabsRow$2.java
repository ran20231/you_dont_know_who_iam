package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.l;
import g00.p;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabRow.kt */
/* loaded from: classes3.dex */
public final class TabRowKt$TabsRow$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<String> f42171a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<Integer, wz.p> f42172b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42173c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c f42174d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42175e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42176f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabsRow$2(List<String> list, l<? super Integer, wz.p> lVar, int i11, c cVar, int i12, int i13) {
        super(2);
        this.f42171a = list;
        this.f42172b = lVar;
        this.f42173c = i11;
        this.f42174d = cVar;
        this.f42175e = i12;
        this.f42176f = i13;
    }

    public final void b(a aVar, int i11) {
        TabRowKt.h(this.f42171a, this.f42172b, this.f42173c, this.f42174d, aVar, v0.a(this.f42175e | 1), this.f42176f);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
