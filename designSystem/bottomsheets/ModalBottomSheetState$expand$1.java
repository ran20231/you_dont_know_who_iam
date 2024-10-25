package com.forsale.designSystem.bottomsheets;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheets.kt */
@d(c = "com.forsale.designSystem.bottomsheets.ModalBottomSheetState", f = "BottomSheets.kt", l = {259}, m = "expand$designSystem_forSaleRelease")
/* loaded from: classes3.dex */
public final class ModalBottomSheetState$expand$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40872a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40873b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f40874c;

    /* renamed from: d  reason: collision with root package name */
    int f40875d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$expand$1(ModalBottomSheetState modalBottomSheetState, a<? super ModalBottomSheetState$expand$1> aVar) {
        super(aVar);
        this.f40874c = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40873b = obj;
        this.f40875d |= Integer.MIN_VALUE;
        return this.f40874c.J(this);
    }
}
