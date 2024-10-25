package com.forsale.adserver.view.composeViews.commercialList;

import com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel;
import com.forsale.adserver.view.models.AdGeneralModel;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: CommercialListViewModel.kt */
@d(c = "com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel$loadMoreOffers$1$2$1$1", f = "CommercialListViewModel.kt", l = {64, 65, 69}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommercialListViewModel$loadMoreOffers$1$2$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21023a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CommercialListViewModel f21024b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<AdGeneralModel> f21025c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialListViewModel$loadMoreOffers$1$2$1$1(CommercialListViewModel commercialListViewModel, List<AdGeneralModel> list, zz.a<? super CommercialListViewModel$loadMoreOffers$1$2$1$1> aVar) {
        super(2, aVar);
        this.f21024b = commercialListViewModel;
        this.f21025c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CommercialListViewModel$loadMoreOffers$1$2$1$1(this.f21024b, this.f21025c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21023a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f21024b.k() == 1 && this.f21025c.isEmpty()) {
                MutableSharedFlow<CommercialListViewModel.a> j11 = this.f21024b.j();
                CommercialListViewModel.a.c cVar = CommercialListViewModel.a.c.f21010a;
                this.f21023a = 1;
                if (j11.emit(cVar, this) == f11) {
                    return f11;
                }
            } else if (this.f21024b.k() == this.f21024b.g().size()) {
                MutableSharedFlow<CommercialListViewModel.a> j12 = this.f21024b.j();
                CommercialListViewModel.a.e eVar = CommercialListViewModel.a.e.f21012a;
                this.f21023a = 2;
                if (j12.emit(eVar, this) == f11) {
                    return f11;
                }
            } else {
                CommercialListViewModel commercialListViewModel = this.f21024b;
                commercialListViewModel.o(commercialListViewModel.k() + 1);
                MutableSharedFlow<CommercialListViewModel.a> j13 = this.f21024b.j();
                CommercialListViewModel.a.C0233a c0233a = CommercialListViewModel.a.C0233a.f21008a;
                this.f21023a = 3;
                if (j13.emit(c0233a, this) == f11) {
                    return f11;
                }
            }
        }
        this.f21024b.h().addAll(this.f21025c);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CommercialListViewModel$loadMoreOffers$1$2$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
