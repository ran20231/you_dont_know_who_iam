package com.forsale.designSystem.tabs;

import g00.a;
import g00.l;
import j0.k0;
import kotlin.jvm.internal.Lambda;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabRow.kt */
/* loaded from: classes3.dex */
public final class TabRowKt$TabRow$1$1$2$1 extends Lambda implements a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f42153a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<Integer, p> f42154b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k0<Integer> f42155c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabRow$1$1$2$1(int i11, l<? super Integer, p> lVar, k0<Integer> k0Var) {
        super(0);
        this.f42153a = i11;
        this.f42154b = lVar;
        this.f42155c = k0Var;
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TabRowKt.d(this.f42155c, this.f42153a);
        this.f42154b.invoke(Integer.valueOf(this.f42153a));
    }
}
