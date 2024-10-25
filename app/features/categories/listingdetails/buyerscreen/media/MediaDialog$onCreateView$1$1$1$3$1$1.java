package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import g00.p;
import j0.n1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaDialog.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$1$1", f = "MediaDialog.kt", l = {128, 129}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MediaDialog$onCreateView$1$1$1$3$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26158a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f26159b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n1<ab.a> f26160c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDialog$onCreateView$1$1$1$3$1$1(ModalBottomSheetState modalBottomSheetState, n1<ab.a> n1Var, zz.a<? super MediaDialog$onCreateView$1$1$1$3$1$1> aVar) {
        super(2, aVar);
        this.f26159b = modalBottomSheetState;
        this.f26160c = n1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MediaDialog$onCreateView$1$1$1$3$1$1(this.f26159b, this.f26160c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ab.a e11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26158a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            e11 = MediaDialog$onCreateView$1$1.AnonymousClass1.e(this.f26160c);
            if (e11.c()) {
                ModalBottomSheetState modalBottomSheetState = this.f26159b;
                this.f26158a = 1;
                if (modalBottomSheetState.Q(this) == f11) {
                    return f11;
                }
            } else {
                ModalBottomSheetState modalBottomSheetState2 = this.f26159b;
                this.f26158a = 2;
                if (modalBottomSheetState2.M(this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MediaDialog$onCreateView$1$1$1$3$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
