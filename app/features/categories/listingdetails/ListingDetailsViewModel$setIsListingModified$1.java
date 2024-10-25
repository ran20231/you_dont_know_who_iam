package com.forsale.app.features.categories.listingdetails;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$setIsListingModified$1", f = "ListingDetailsViewModel.kt", l = {361}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$setIsListingModified$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25420a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25421b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f25422c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$setIsListingModified$1(ListingDetailsViewModel listingDetailsViewModel, boolean z11, zz.a<? super ListingDetailsViewModel$setIsListingModified$1> aVar) {
        super(2, aVar);
        this.f25421b = listingDetailsViewModel;
        this.f25422c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$setIsListingModified$1(this.f25421b, this.f25422c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25420a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            ListingDetailsRepository j12 = this.f25421b.j1();
            boolean z11 = this.f25422c;
            this.f25420a = 1;
            if (j12.d0(z11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$setIsListingModified$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
