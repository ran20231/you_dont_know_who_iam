package com.forsale.designSystem.bottomsheets;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheets.kt */
@d(c = "com.forsale.designSystem.bottomsheets.ModalBottomSheetState", f = "BottomSheets.kt", l = {270}, m = "hide")
/* loaded from: classes3.dex */
public final class ModalBottomSheetState$hide$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40880a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40881b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f40882c;

    /* renamed from: d  reason: collision with root package name */
    int f40883d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$hide$1(ModalBottomSheetState modalBottomSheetState, a<? super ModalBottomSheetState$hide$1> aVar) {
        super(aVar);
        this.f40882c = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40881b = obj;
        this.f40883d |= Integer.MIN_VALUE;
        return this.f40882c.M(this);
    }
}
