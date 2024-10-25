package com.forsale.adserver.view.screens.offersScreen;

import com.forsale.adserver.usecases.offersInteractors.OffersInteractor;
import g00.l;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.Deferred;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersViewModel.kt */
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$loadAllFeaturedOffers$2", f = "OffersViewModel.kt", l = {260}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersViewModel$loadAllFeaturedOffers$2 extends SuspendLambda implements l<a<? super List<? extends g9.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21448a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OffersViewModel f21449b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersViewModel$loadAllFeaturedOffers$2(OffersViewModel offersViewModel, a<? super OffersViewModel$loadAllFeaturedOffers$2> aVar) {
        super(1, aVar);
        this.f21449b = offersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new OffersViewModel$loadAllFeaturedOffers$2(this.f21449b, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(a<? super List<? extends g9.d>> aVar) {
        return invoke2((a<? super List<g9.d>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OffersInteractor offersInteractor;
        f11 = b.f();
        int i11 = this.f21448a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            offersInteractor = this.f21449b.f21398c;
            Deferred<List<g9.d>> h11 = offersInteractor.h();
            this.f21448a = 1;
            obj = h11.await(this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<g9.d>> aVar) {
        return ((OffersViewModel$loadAllFeaturedOffers$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
