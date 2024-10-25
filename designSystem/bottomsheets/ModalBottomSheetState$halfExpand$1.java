package com.forsale.designSystem.bottomsheets;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheets.kt */
@d(c = "com.forsale.designSystem.bottomsheets.ModalBottomSheetState", f = "BottomSheets.kt", l = {248}, m = "halfExpand$designSystem_forSaleRelease")
/* loaded from: classes3.dex */
public final class ModalBottomSheetState$halfExpand$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40876a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40877b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f40878c;

    /* renamed from: d  reason: collision with root package name */
    int f40879d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$halfExpand$1(ModalBottomSheetState modalBottomSheetState, a<? super ModalBottomSheetState$halfExpand$1> aVar) {
        super(aVar);
        this.f40878c = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40877b = obj;
        this.f40879d |= Integer.MIN_VALUE;
        return this.f40878c.L(this);
    }
}
