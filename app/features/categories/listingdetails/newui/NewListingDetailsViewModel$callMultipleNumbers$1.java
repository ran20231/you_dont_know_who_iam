package com.forsale.app.features.categories.listingdetails.newui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel", f = "NewListingDetailsViewModel.kt", l = {366, 370}, m = "callMultipleNumbers")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$callMultipleNumbers$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f27226a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f27227b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27228c;

    /* renamed from: d  reason: collision with root package name */
    int f27229d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$callMultipleNumbers$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$callMultipleNumbers$1> aVar) {
        super(aVar);
        this.f27228c = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i12;
        this.f27227b = obj;
        this.f27229d |= Integer.MIN_VALUE;
        i12 = this.f27228c.i1(null, this);
        return i12;
    }
}
