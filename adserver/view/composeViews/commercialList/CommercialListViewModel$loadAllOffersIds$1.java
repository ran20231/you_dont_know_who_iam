package com.forsale.adserver.view.composeViews.commercialList;

import com.forsale.adserver.usecases.offersInteractors.LoadAllOffersIdsInteractor;
import g00.p;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommercialListViewModel.kt */
@d(c = "com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel$loadAllOffersIds$1", f = "CommercialListViewModel.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CommercialListViewModel$loadAllOffersIds$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21017a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CommercialListViewModel f21018b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<Integer> f21019c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialListViewModel$loadAllOffersIds$1(CommercialListViewModel commercialListViewModel, List<Integer> list, zz.a<? super CommercialListViewModel$loadAllOffersIds$1> aVar) {
        super(2, aVar);
        this.f21018b = commercialListViewModel;
        this.f21019c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CommercialListViewModel$loadAllOffersIds$1(this.f21018b, this.f21019c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        LoadAllOffersIdsInteractor loadAllOffersIdsInteractor;
        List a02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21017a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            loadAllOffersIdsInteractor = this.f21018b.f21000b;
            List<Integer> list = this.f21019c;
            this.f21017a = 1;
            obj = LoadAllOffersIdsInteractor.c(loadAllOffersIdsInteractor, list, false, this, 2, null);
            if (obj == f11) {
                return f11;
            }
        }
        List<List<Integer>> g11 = this.f21018b.g();
        a02 = CollectionsKt___CollectionsKt.a0((List) obj, 5);
        g11.addAll(a02);
        this.f21018b.m();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CommercialListViewModel$loadAllOffersIds$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
