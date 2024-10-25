package com.forsale.adserver.usecases.offersInteractors;

import a9.e;
import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import com.forsale.adserver.datalayer.offersdata.OffersFactory;
import com.forsale.adserver.view.models.AdGeneralModel;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadOffersByIdsInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.LoadOffersByIdsInteractor$invoke$2", f = "LoadOffersByIdsInteractor.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadOffersByIdsInteractor$invoke$2 extends SuspendLambda implements l<a<? super List<? extends AdGeneralModel>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20791a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadOffersByIdsInteractor f20792b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<Integer> f20793c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadOffersByIdsInteractor$invoke$2(LoadOffersByIdsInteractor loadOffersByIdsInteractor, List<Integer> list, a<? super LoadOffersByIdsInteractor$invoke$2> aVar) {
        super(1, aVar);
        this.f20792b = loadOffersByIdsInteractor;
        this.f20793c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new LoadOffersByIdsInteractor$invoke$2(this.f20792b, this.f20793c, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(a<? super List<? extends AdGeneralModel>> aVar) {
        return invoke2((a<? super List<AdGeneralModel>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OffersFactory offersFactory;
        REGIONS regions;
        int y11;
        e eVar;
        f11 = b.f();
        int i11 = this.f20791a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            offersFactory = this.f20792b.f20789b;
            List<Integer> list = this.f20793c;
            regions = this.f20792b.f20788a;
            int regionId = regions.getRegionId();
            this.f20791a = 1;
            obj = offersFactory.i(list, regionId, this);
            if (obj == f11) {
                return f11;
            }
        }
        Iterable<g9.d> iterable = (Iterable) obj;
        LoadOffersByIdsInteractor loadOffersByIdsInteractor = this.f20792b;
        y11 = s.y(iterable, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (g9.d dVar : iterable) {
            eVar = loadOffersByIdsInteractor.f20790c;
            arrayList.add(eVar.a(dVar));
        }
        return arrayList;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<AdGeneralModel>> aVar) {
        return ((LoadOffersByIdsInteractor$invoke$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
