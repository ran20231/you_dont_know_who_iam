package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel", f = "SubCategoriesViewModel.kt", l = {158, 159}, m = "createSelectableDataOptions")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$createSelectableDataOptions$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29583a;

    /* renamed from: b  reason: collision with root package name */
    Object f29584b;

    /* renamed from: c  reason: collision with root package name */
    boolean f29585c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f29586d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f29587e;

    /* renamed from: f  reason: collision with root package name */
    int f29588f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$createSelectableDataOptions$1(SubCategoriesViewModel subCategoriesViewModel, a<? super SubCategoriesViewModel$createSelectableDataOptions$1> aVar) {
        super(aVar);
        this.f29587e = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c02;
        this.f29586d = obj;
        this.f29588f |= Integer.MIN_VALUE;
        c02 = this.f29587e.c0(null, false, this);
        return c02;
    }
}
