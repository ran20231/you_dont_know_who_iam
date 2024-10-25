package com.forsale.designSystem.inputs;

import g00.l;
import j0.k0;
import kotlin.jvm.internal.Lambda;
import wz.p;
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
final class InputsKt$PasswordField$4$1$1 extends Lambda implements g00.a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Boolean, p> f41490a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0<Boolean> f41491b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$PasswordField$4$1$1(l<? super Boolean, p> lVar, k0<Boolean> k0Var) {
        super(0);
        this.f41490a = lVar;
        this.f41491b = k0Var;
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l<Boolean, p> lVar = this.f41490a;
        if (lVar != null) {
            lVar.invoke(this.f41491b.getValue());
        }
        k0<Boolean> k0Var = this.f41491b;
        k0Var.setValue(Boolean.valueOf(!k0Var.getValue().booleanValue()));
    }
}
