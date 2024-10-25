package com.forsale.adserver.view.screens.offersScreen;

import com.forsale.adserver.usecases.offersInteractors.OffersInteractor;
import g00.l;
import g9.e;
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
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$loadCategories$2", f = "OffersViewModel.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersViewModel$loadCategories$2 extends SuspendLambda implements l<a<? super List<? extends e>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21452a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OffersViewModel f21453b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersViewModel$loadCategories$2(OffersViewModel offersViewModel, a<? super OffersViewModel$loadCategories$2> aVar) {
        super(1, aVar);
        this.f21453b = offersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new OffersViewModel$loadCategories$2(this.f21453b, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(a<? super List<? extends e>> aVar) {
        return invoke2((a<? super List<e>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OffersInteractor offersInteractor;
        f11 = b.f();
        int i11 = this.f21452a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            offersInteractor = this.f21453b.f21398c;
            Deferred<List<e>> l11 = offersInteractor.l();
            this.f21452a = 1;
            obj = l11.await(this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<e>> aVar) {
        return ((OffersViewModel$loadCategories$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
