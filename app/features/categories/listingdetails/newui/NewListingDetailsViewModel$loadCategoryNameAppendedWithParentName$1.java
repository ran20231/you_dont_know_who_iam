package com.forsale.app.features.categories.listingdetails.newui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel", f = "NewListingDetailsViewModel.kt", l = {252, 253}, m = "loadCategoryNameAppendedWithParentName")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$loadCategoryNameAppendedWithParentName$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f27272a;

    /* renamed from: b  reason: collision with root package name */
    Object f27273b;

    /* renamed from: c  reason: collision with root package name */
    Object f27274c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f27275d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27276e;

    /* renamed from: f  reason: collision with root package name */
    int f27277f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$loadCategoryNameAppendedWithParentName$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$loadCategoryNameAppendedWithParentName$1> aVar) {
        super(aVar);
        this.f27276e = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27275d = obj;
        this.f27277f |= Integer.MIN_VALUE;
        return this.f27276e.C2(null, this);
    }
}
