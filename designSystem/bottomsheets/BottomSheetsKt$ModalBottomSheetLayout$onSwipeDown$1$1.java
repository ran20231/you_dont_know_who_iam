package com.forsale.designSystem.bottomsheets;

import g00.a;
import kotlin.jvm.internal.Lambda;
import wz.p;
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
final class BottomSheetsKt$ModalBottomSheetLayout$onSwipeDown$1$1 extends Lambda implements a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f40844a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<p> f40845b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetsKt$ModalBottomSheetLayout$onSwipeDown$1$1(ModalBottomSheetState modalBottomSheetState, a<p> aVar) {
        super(0);
        this.f40844a = modalBottomSheetState;
        this.f40845b = aVar;
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        a<p> aVar;
        this.f40844a.R();
        if (this.f40844a.o() != ModalBottomSheetValue.Hidden || (aVar = this.f40845b) == null) {
            return;
        }
        aVar.invoke();
    }
}
