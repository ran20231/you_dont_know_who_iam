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
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$loadOffersByCategoryId$2", f = "OffersViewModel.kt", l = {264, 264}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersViewModel$loadOffersByCategoryId$2 extends SuspendLambda implements l<a<? super List<? extends g9.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21454a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OffersViewModel f21455b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f21456c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersViewModel$loadOffersByCategoryId$2(OffersViewModel offersViewModel, int i11, a<? super OffersViewModel$loadOffersByCategoryId$2> aVar) {
        super(1, aVar);
        this.f21455b = offersViewModel;
        this.f21456c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new OffersViewModel$loadOffersByCategoryId$2(this.f21455b, this.f21456c, aVar);
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
        int i11 = this.f21454a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            offersInteractor = this.f21455b.f21398c;
            int i12 = this.f21456c;
            this.f21454a = 1;
            obj = offersInteractor.k(i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        this.f21454a = 2;
        obj = ((Deferred) obj).await(this);
        if (obj == f11) {
            return f11;
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<g9.d>> aVar) {
        return ((OffersViewModel$loadOffersByCategoryId$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
