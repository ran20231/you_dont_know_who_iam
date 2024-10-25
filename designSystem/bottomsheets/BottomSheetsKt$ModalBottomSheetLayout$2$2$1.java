package com.forsale.designSystem.bottomsheets;

import e2.d;
import e2.n;
import g00.l;
import i00.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
final class BottomSheetsKt$ModalBottomSheetLayout$2$2$1 extends Lambda implements l<d, n> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f40807a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f40808b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetsKt$ModalBottomSheetLayout$2$2$1(ModalBottomSheetState modalBottomSheetState, float f11) {
        super(1);
        this.f40807a = modalBottomSheetState;
        this.f40808b = f11;
    }

    public final long b(d offset) {
        o.i(offset, "$this$offset");
        return e2.o.a(0, this.f40807a.l().isEmpty() ? c.d(this.f40808b) : c.d(this.f40807a.s().getValue().floatValue()));
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ n invoke(d dVar) {
        return n.b(b(dVar));
    }
}
