package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

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
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel$updateFilterRange$2", f = "SubCategoriesViewModel.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$updateFilterRange$2 extends SuspendLambda implements l<a<? super List<? extends c>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29631a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f29632b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<Integer> f29633c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$updateFilterRange$2(SubCategoriesViewModel subCategoriesViewModel, List<Integer> list, a<? super SubCategoriesViewModel$updateFilterRange$2> aVar) {
        super(1, aVar);
        this.f29632b = subCategoriesViewModel;
        this.f29633c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new SubCategoriesViewModel$updateFilterRange$2(this.f29632b, this.f29633c, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(a<? super List<? extends c>> aVar) {
        return invoke2((a<? super List<c>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f29631a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SubCategoriesViewModel subCategoriesViewModel = this.f29632b;
            List<Integer> list = this.f29633c;
            this.f29631a = 1;
            obj = subCategoriesViewModel.c0(list, true, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<c>> aVar) {
        return ((SubCategoriesViewModel$updateFilterRange$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
