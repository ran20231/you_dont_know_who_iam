package com.forsale.app.features.categories.normal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.normal.SubCategoriesViewModel", f = "SubCategoriesViewModel.kt", l = {145}, m = "loadListings")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$loadListings$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f31060a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f31061b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f31062c;

    /* renamed from: d  reason: collision with root package name */
    int f31063d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$loadListings$1(SubCategoriesViewModel subCategoriesViewModel, zz.a<? super SubCategoriesViewModel$loadListings$1> aVar) {
        super(aVar);
        this.f31062c = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f12;
        this.f31061b = obj;
        this.f31063d |= Integer.MIN_VALUE;
        f12 = this.f31062c.f1(null, this);
        return f12;
    }
}
