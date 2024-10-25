package com.forsale.app.features.categories.listings.filtration.allFilters;

import com.leanplum.internal.ResourceQualifiers;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllFiltersViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel", f = "AllFiltersViewModel.kt", l = {ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK, 190}, m = "recordResetAllFiltersClicked")
/* loaded from: classes2.dex */
public final class AllFiltersViewModel$recordResetAllFiltersClicked$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29035a;

    /* renamed from: b  reason: collision with root package name */
    int f29036b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29037c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AllFiltersViewModel f29038d;

    /* renamed from: e  reason: collision with root package name */
    int f29039e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllFiltersViewModel$recordResetAllFiltersClicked$1(AllFiltersViewModel allFiltersViewModel, zz.a<? super AllFiltersViewModel$recordResetAllFiltersClicked$1> aVar) {
        super(aVar);
        this.f29038d = allFiltersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object P0;
        this.f29037c = obj;
        this.f29039e |= Integer.MIN_VALUE;
        P0 = this.f29038d.P0(this);
        return P0;
    }
}
