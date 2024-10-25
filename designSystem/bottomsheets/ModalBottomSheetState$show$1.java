package com.forsale.designSystem.bottomsheets;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheets.kt */
@d(c = "com.forsale.designSystem.bottomsheets.ModalBottomSheetState", f = "BottomSheets.kt", l = {234}, m = "show")
/* loaded from: classes3.dex */
public final class ModalBottomSheetState$show$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40884a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40885b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f40886c;

    /* renamed from: d  reason: collision with root package name */
    int f40887d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$show$1(ModalBottomSheetState modalBottomSheetState, a<? super ModalBottomSheetState$show$1> aVar) {
        super(aVar);
        this.f40886c = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40885b = obj;
        this.f40887d |= Integer.MIN_VALUE;
        return this.f40886c.Q(this);
    }
}
