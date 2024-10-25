package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dc.c;
import g00.l;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$updateFilterRange$2", f = "CategoriesFilterViewModel.kt", l = {FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoriesFilterViewModel$updateFilterRange$2 extends SuspendLambda implements l<a<? super List<? extends c>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29500a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoriesFilterViewModel f29501b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<Integer> f29502c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesFilterViewModel$updateFilterRange$2(CategoriesFilterViewModel categoriesFilterViewModel, List<Integer> list, a<? super CategoriesFilterViewModel$updateFilterRange$2> aVar) {
        super(1, aVar);
        this.f29501b = categoriesFilterViewModel;
        this.f29502c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new CategoriesFilterViewModel$updateFilterRange$2(this.f29501b, this.f29502c, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(a<? super List<? extends c>> aVar) {
        return invoke2((a<? super List<c>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f29500a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            CategoriesFilterViewModel categoriesFilterViewModel = this.f29501b;
            List<Integer> list = this.f29502c;
            this.f29500a = 1;
            obj = categoriesFilterViewModel.c0(list, true, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<c>> aVar) {
        return ((CategoriesFilterViewModel$updateFilterRange$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
