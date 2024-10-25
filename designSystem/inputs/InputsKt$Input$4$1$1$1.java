package com.forsale.designSystem.inputs;

import g00.l;
import j0.k0;
import kotlin.jvm.internal.Lambda;
import wz.p;
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
final class InputsKt$Input$4$1$1$1 extends Lambda implements l<Boolean, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0<Boolean> f41445a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputsKt$Input$4$1$1$1(k0<Boolean> k0Var) {
        super(1);
        this.f41445a = k0Var;
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return p.f75480a;
    }

    public final void invoke(boolean z11) {
        this.f41445a.setValue(Boolean.valueOf(z11));
    }
}
