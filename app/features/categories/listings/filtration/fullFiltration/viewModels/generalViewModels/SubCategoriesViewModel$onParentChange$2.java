package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel$onParentChange$2", f = "SubCategoriesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$onParentChange$2 extends SuspendLambda implements p<List<? extends Integer>, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29609a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29610b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f29611c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$onParentChange$2(SubCategoriesViewModel subCategoriesViewModel, a<? super SubCategoriesViewModel$onParentChange$2> aVar) {
        super(2, aVar);
        this.f29611c = subCategoriesViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(List<Integer> list, a<? super wz.p> aVar) {
        return ((SubCategoriesViewModel$onParentChange$2) create(list, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        SubCategoriesViewModel$onParentChange$2 subCategoriesViewModel$onParentChange$2 = new SubCategoriesViewModel$onParentChange$2(this.f29611c, aVar);
        subCategoriesViewModel$onParentChange$2.f29610b = obj;
        return subCategoriesViewModel$onParentChange$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f29609a == 0) {
            f.b(obj);
            SubCategoriesViewModel.k0(this.f29611c, (List) this.f29610b, null, 2, null);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
