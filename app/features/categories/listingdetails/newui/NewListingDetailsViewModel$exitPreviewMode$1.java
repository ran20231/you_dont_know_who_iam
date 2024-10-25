package com.forsale.app.features.categories.listingdetails.newui;

import androidx.lifecycle.b0;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$exitPreviewMode$1", f = "NewListingDetailsViewModel.kt", l = {274, 276}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$exitPreviewMode$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27262a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27263b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$exitPreviewMode$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$exitPreviewMode$1> aVar) {
        super(2, aVar);
        this.f27263b = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$exitPreviewMode$1(this.f27263b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        b0 b0Var;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27262a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    this.f27263b.R1().X1(true);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            mutableSharedFlow = this.f27263b.B1;
            wz.p pVar = wz.p.f75480a;
            this.f27262a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        b0Var = this.f27263b.Y0;
        b0Var.setValue(NewListingDetailsViewModel.UserType.SELLER);
        MutableStateFlow<Boolean> v12 = this.f27263b.R1().v1();
        Boolean a11 = kotlin.coroutines.jvm.internal.a.a(false);
        this.f27262a = 2;
        if (v12.emit(a11, this) == f11) {
            return f11;
        }
        this.f27263b.R1().X1(true);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$exitPreviewMode$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
