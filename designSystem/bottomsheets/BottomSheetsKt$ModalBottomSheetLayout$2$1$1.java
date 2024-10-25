package com.forsale.designSystem.bottomsheets;

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
final class BottomSheetsKt$ModalBottomSheetLayout$2$1$1 extends Lambda implements a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f40802a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f40803b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a<p> f40804c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheets.kt */
    @d(c = "com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$1$1$1", f = "BottomSheets.kt", l = {FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS}, m = "invokeSuspend")
    /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40805a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f40806b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ModalBottomSheetState modalBottomSheetState, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f40806b = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f40806b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f40805a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                ModalBottomSheetState modalBottomSheetState = this.f40806b;
                this.f40805a = 1;
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
    public BottomSheetsKt$ModalBottomSheetLayout$2$1$1(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope, a<p> aVar) {
        super(0);
        this.f40802a = modalBottomSheetState;
        this.f40803b = coroutineScope;
        this.f40804c = aVar;
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.f40802a.n().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this.f40803b, null, null, new AnonymousClass1(this.f40802a, null), 3, null);
        }
        a<p> aVar = this.f40804c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
