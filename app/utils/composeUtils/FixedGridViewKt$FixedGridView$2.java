package com.forsale.app.utils.composeUtils;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import g00.r;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FixedGridView.kt */
/* loaded from: classes3.dex */
public final class FixedGridViewKt$FixedGridView$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<T> f40091a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f40092b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f40093c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f40094d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ float f40095e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r<w.c, T, a, Integer, wz.p> f40096f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f40097g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f40098h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FixedGridViewKt$FixedGridView$2(List<? extends T> list, int i11, c cVar, float f11, float f12, r<? super w.c, ? super T, ? super a, ? super Integer, wz.p> rVar, int i12, int i13) {
        super(2);
        this.f40091a = list;
        this.f40092b = i11;
        this.f40093c = cVar;
        this.f40094d = f11;
        this.f40095e = f12;
        this.f40096f = rVar;
        this.f40097g = i12;
        this.f40098h = i13;
    }

    public final void b(a aVar, int i11) {
        FixedGridViewKt.a(this.f40091a, this.f40092b, this.f40093c, this.f40094d, this.f40095e, this.f40096f, aVar, v0.a(this.f40097g | 1), this.f40098h);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
