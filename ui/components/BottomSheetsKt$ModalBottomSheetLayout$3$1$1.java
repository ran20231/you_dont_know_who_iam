package com.forsale.ui.components;

import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import wz.p;
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
final class BottomSheetsKt$ModalBottomSheetLayout$3$1$1 extends Lambda implements a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f42265a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<p> f42266b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f42267c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheets.kt */
    @d(c = "com.forsale.ui.components.BottomSheetsKt$ModalBottomSheetLayout$3$1$1$1", f = "BottomSheets.kt", l = {FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE}, m = "invokeSuspend")
    /* renamed from: com.forsale.ui.components.BottomSheetsKt$ModalBottomSheetLayout$3$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f42269b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ModalBottomSheetState modalBottomSheetState, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f42269b = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f42269b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f42268a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                ModalBottomSheetState modalBottomSheetState = this.f42269b;
                this.f42268a = 1;
                if (modalBottomSheetState.M(this) == f11) {
                    return f11;
                }
            }
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetsKt$ModalBottomSheetLayout$3$1$1(CoroutineScope coroutineScope, a<p> aVar, ModalBottomSheetState modalBottomSheetState) {
        super(0);
        this.f42265a = coroutineScope;
        this.f42266b = aVar;
        this.f42267c = modalBottomSheetState;
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        BuildersKt__Builders_commonKt.launch$default(this.f42265a, null, null, new AnonymousClass1(this.f42267c, null), 3, null);
        a<p> aVar = this.f42266b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
