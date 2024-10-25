package com.forsale.designSystem.chips;

import g00.a;
import g00.l;
import kotlin.jvm.internal.Lambda;
import wz.p;
/* compiled from: Chips.kt */
/* loaded from: classes3.dex */
final class ChipsKt$Chips$2$1 extends Lambda implements a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Boolean, p> f41256a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f41257b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipsKt$Chips$2$1(l<? super Boolean, p> lVar, boolean z11) {
        super(0);
        this.f41256a = lVar;
        this.f41257b = z11;
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l<Boolean, p> lVar = this.f41256a;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(!this.f41257b));
        }
    }
}
