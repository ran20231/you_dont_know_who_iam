package com.forsale.adserver.usecases.offersInteractors;

import com.forsale.adserver.datalayer.offersdata.OffersFactory;
import g00.l;
import java.util.List;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadAllOffersIdsInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.LoadAllOffersIdsInteractor$invoke$2", f = "LoadAllOffersIdsInteractor.kt", l = {13}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadAllOffersIdsInteractor$invoke$2 extends SuspendLambda implements l<a<? super List<? extends Integer>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20767a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadAllOffersIdsInteractor f20768b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<Integer> f20769c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f20770d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadAllOffersIdsInteractor$invoke$2(LoadAllOffersIdsInteractor loadAllOffersIdsInteractor, List<Integer> list, boolean z11, a<? super LoadAllOffersIdsInteractor$invoke$2> aVar) {
        super(1, aVar);
        this.f20768b = loadAllOffersIdsInteractor;
        this.f20769c = list;
        this.f20770d = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new LoadAllOffersIdsInteractor$invoke$2(this.f20768b, this.f20769c, this.f20770d, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(a<? super List<? extends Integer>> aVar) {
        return invoke2((a<? super List<Integer>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OffersFactory offersFactory;
        List f12;
        f11 = b.f();
        int i11 = this.f20767a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            offersFactory = this.f20768b.f20766a;
            List<Integer> list = this.f20769c;
            this.f20767a = 1;
            obj = OffersFactory.k(offersFactory, list, null, this, 2, null);
            if (obj == f11) {
                return f11;
            }
        }
        List list2 = (List) obj;
        if (this.f20770d) {
            f12 = q.f(list2);
            return f12;
        }
        return list2;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<Integer>> aVar) {
        return ((LoadAllOffersIdsInteractor$invoke$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
