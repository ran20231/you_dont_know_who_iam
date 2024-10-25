package com.forsale.designSystem.inputs;

import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
final class InputsKt$EditText$2$1 extends Lambda implements l<z0.l, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Boolean, p> f41409a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$EditText$2$1(l<? super Boolean, p> lVar) {
        super(1);
        this.f41409a = lVar;
    }

    public final void b(z0.l it2) {
        o.i(it2, "it");
        l<Boolean, p> lVar = this.f41409a;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(it2.isFocused()));
        }
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(z0.l lVar) {
        b(lVar);
        return p.f75480a;
    }
}
