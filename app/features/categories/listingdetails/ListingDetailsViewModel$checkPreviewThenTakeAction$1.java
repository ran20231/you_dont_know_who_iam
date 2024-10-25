package com.forsale.app.features.categories.listingdetails;

import com.leanplum.internal.ResourceQualifiers;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$checkPreviewThenTakeAction$1", f = "ListingDetailsViewModel.kt", l = {ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$checkPreviewThenTakeAction$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25374a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25375b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$checkPreviewThenTakeAction$1(ListingDetailsViewModel listingDetailsViewModel, zz.a<? super ListingDetailsViewModel$checkPreviewThenTakeAction$1> aVar) {
        super(2, aVar);
        this.f25375b = listingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$checkPreviewThenTakeAction$1(this.f25375b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25374a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f25375b.f25335a1;
            wz.p pVar = wz.p.f75480a;
            this.f25374a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$checkPreviewThenTakeAction$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
