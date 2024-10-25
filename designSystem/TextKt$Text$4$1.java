package com.forsale.designSystem;

import androidx.compose.ui.text.w;
import g00.l;
import j0.k0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Text.kt */
/* loaded from: classes3.dex */
public final class TextKt$Text$4$1 extends Lambda implements l<w, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<w, p> f40724a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f40725b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k0<Integer> f40726c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextKt$Text$4$1(l<? super w, p> lVar, int i11, k0<Integer> k0Var) {
        super(1);
        this.f40724a = lVar;
        this.f40725b = i11;
        this.f40726c = k0Var;
    }

    public final void b(w it2) {
        o.i(it2, "it");
        this.f40724a.invoke(it2);
        int n11 = it2.n();
        int i11 = this.f40725b;
        if (n11 < i11) {
            TextKt.d(this.f40726c, i11 - it2.n());
        }
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(w wVar) {
        b(wVar);
        return p.f75480a;
    }
}
