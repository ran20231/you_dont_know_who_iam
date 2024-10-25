package com.forsale.adserver.view.screens.offersScreen;

import com.forsale.adserver.view.screens.offersScreen.OffersViewModel;
import g00.p;
import g9.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import l8.h;
import rj.a;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersViewModel.kt */
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$offersCategoriesState$1", f = "OffersViewModel.kt", l = {85, 85}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersViewModel$offersCategoriesState$1 extends SuspendLambda implements p<FlowCollector<? super OffersViewModel.a>, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21460a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f21461b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ OffersViewModel f21462c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersViewModel$offersCategoriesState$1(OffersViewModel offersViewModel, a<? super OffersViewModel$offersCategoriesState$1> aVar) {
        super(2, aVar);
        this.f21462c = offersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        OffersViewModel$offersCategoriesState$1 offersViewModel$offersCategoriesState$1 = new OffersViewModel$offersCategoriesState$1(this.f21462c, aVar);
        offersViewModel$offersCategoriesState$1.f21461b = obj;
        return offersViewModel$offersCategoriesState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        FlowCollector flowCollector;
        int y11;
        List a12;
        List X0;
        f11 = b.f();
        int i11 = this.f21460a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f21461b;
            f.b(obj);
        } else {
            f.b(obj);
            flowCollector = (FlowCollector) this.f21461b;
            OffersViewModel offersViewModel = this.f21462c;
            this.f21461b = flowCollector;
            this.f21460a = 1;
            obj = offersViewModel.t(this);
            if (obj == f11) {
                return f11;
            }
        }
        Iterable<e> iterable = (Iterable) obj;
        y11 = s.y(iterable, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (e eVar : iterable) {
            arrayList.add(eVar.b());
        }
        a12 = CollectionsKt___CollectionsKt.a1(arrayList);
        a12.add(0, new n9.a(CategoryTab.ALL.getId(), null, new a.b(h.f62337f, new Object[0])));
        X0 = CollectionsKt___CollectionsKt.X0(a12);
        OffersViewModel.a.c cVar = new OffersViewModel.a.c(X0);
        this.f21461b = null;
        this.f21460a = 2;
        if (flowCollector.emit(cVar, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(FlowCollector<? super OffersViewModel.a> flowCollector, zz.a<? super wz.p> aVar) {
        return ((OffersViewModel$offersCategoriesState$1) create(flowCollector, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
