package com.forsale.designSystem.inputs;

import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
final class InputsKt$CoreTextLayer$2$1$2$1$1 extends Lambda implements l<String, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Integer f41375a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<String, p> f41376b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f41377c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$CoreTextLayer$2$1$2$1$1(Integer num, l<? super String, p> lVar, g00.a<p> aVar) {
        super(1);
        this.f41375a = num;
        this.f41376b = lVar;
        this.f41377c = aVar;
    }

    public final void b(String it2) {
        o.i(it2, "it");
        if (this.f41375a != null) {
            if (it2.length() <= this.f41375a.intValue()) {
                this.f41376b.invoke(it2);
                return;
            } else {
                this.f41377c.invoke();
                return;
            }
        }
        this.f41376b.invoke(it2);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(String str) {
        b(str);
        return p.f75480a;
    }
}
