package com.forsale.designSystem.bottomsheets;

import e2.r;
import g00.l;
import j0.k0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
final class BottomSheetsKt$ModalBottomSheetLayout$2$3$1 extends Lambda implements l<androidx.compose.ui.layout.l, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0<Float> f40809a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetsKt$ModalBottomSheetLayout$2$3$1(k0<Float> k0Var) {
        super(1);
        this.f40809a = k0Var;
    }

    public final void b(androidx.compose.ui.layout.l it2) {
        o.i(it2, "it");
        this.f40809a.setValue(Float.valueOf(r.f(it2.a())));
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(androidx.compose.ui.layout.l lVar) {
        b(lVar);
        return p.f75480a;
    }
}
