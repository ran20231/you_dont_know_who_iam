package com.forsale.designSystem.layouts;

import g00.p;
import g00.q;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import w.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListItems.kt */
/* loaded from: classes3.dex */
public final class ListItemsKt$SingleLineListItem$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41776a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41777b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41778c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q<w.c, androidx.compose.runtime.a, Integer, wz.p> f41779d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41780e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f41781f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemsKt$SingleLineListItem$1(androidx.compose.ui.c cVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar2, int i11, int i12) {
        super(2);
        this.f41776a = cVar;
        this.f41777b = pVar;
        this.f41778c = qVar;
        this.f41779d = qVar2;
        this.f41780e = i11;
        this.f41781f = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        ListItemsKt.b(this.f41776a, this.f41777b, this.f41778c, this.f41779d, aVar, v0.a(this.f41780e | 1), this.f41781f);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
