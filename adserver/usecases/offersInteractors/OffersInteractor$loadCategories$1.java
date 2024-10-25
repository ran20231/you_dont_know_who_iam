package com.forsale.adserver.usecases.offersInteractors;

import com.forsale.adserver.datalayer.offersdata.OffersFactory;
import g00.p;
import g9.e;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadCategories$1", f = "OffersInteractor.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersInteractor$loadCategories$1 extends SuspendLambda implements p<CoroutineScope, a<? super List<? extends e>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20826a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OffersInteractor f20827b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersInteractor$loadCategories$1(OffersInteractor offersInteractor, a<? super OffersInteractor$loadCategories$1> aVar) {
        super(2, aVar);
        this.f20827b = offersInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new OffersInteractor$loadCategories$1(this.f20827b, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, a<? super List<? extends e>> aVar) {
        return invoke2(coroutineScope, (a<? super List<e>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OffersFactory offersFactory;
        f11 = b.f();
        int i11 = this.f20826a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            offersFactory = this.f20827b.f20809b;
            this.f20826a = 1;
            obj = offersFactory.e(this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, a<? super List<e>> aVar) {
        return ((OffersInteractor$loadCategories$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
