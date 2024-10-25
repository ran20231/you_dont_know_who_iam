package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
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
/* compiled from: DropDownAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$updateFilterRange$2", f = "DropDownAttributeFilterViewModel.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DropDownAttributeFilterViewModel$updateFilterRange$2 extends SuspendLambda implements l<a<? super List<? extends c>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29311a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DropDownAttributeFilterViewModel f29312b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GetListingsBody.FiltrationData.Attribute<List<Integer>> f29313c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownAttributeFilterViewModel$updateFilterRange$2(DropDownAttributeFilterViewModel dropDownAttributeFilterViewModel, GetListingsBody.FiltrationData.Attribute<List<Integer>> attribute, a<? super DropDownAttributeFilterViewModel$updateFilterRange$2> aVar) {
        super(1, aVar);
        this.f29312b = dropDownAttributeFilterViewModel;
        this.f29313c = attribute;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new DropDownAttributeFilterViewModel$updateFilterRange$2(this.f29312b, this.f29313c, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(a<? super List<? extends c>> aVar) {
        return invoke2((a<? super List<c>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f29311a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            DropDownAttributeFilterViewModel dropDownAttributeFilterViewModel = this.f29312b;
            GetListingsBody.FiltrationData.Attribute<List<Integer>> attribute = this.f29313c;
            this.f29311a = 1;
            obj = dropDownAttributeFilterViewModel.c0(attribute, true, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<c>> aVar) {
        return ((DropDownAttributeFilterViewModel$updateFilterRange$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
