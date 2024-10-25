package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel", f = "SubCategoriesViewModel.kt", l = {118, 121}, m = "generateFilterCapsule")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$generateFilterCapsule$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29589a;

    /* renamed from: b  reason: collision with root package name */
    Object f29590b;

    /* renamed from: c  reason: collision with root package name */
    Object f29591c;

    /* renamed from: d  reason: collision with root package name */
    Object f29592d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f29593e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f29594f;

    /* renamed from: g  reason: collision with root package name */
    int f29595g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$generateFilterCapsule$1(SubCategoriesViewModel subCategoriesViewModel, a<? super SubCategoriesViewModel$generateFilterCapsule$1> aVar) {
        super(aVar);
        this.f29594f = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29593e = obj;
        this.f29595g |= Integer.MIN_VALUE;
        return this.f29594f.j(this);
    }
}
