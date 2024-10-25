package com.forsale.adserver.view.screens.offersScreen;

import com.forsale.adserver.view.screens.offersScreen.OffersViewModel;
import g00.q;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import l8.h;
import rj.a;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersViewModel.kt */
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$offersCategoriesChipsState$1", f = "OffersViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersViewModel$offersCategoriesChipsState$1 extends SuspendLambda implements q<OffersViewModel.a, Boolean, a<? super OffersViewModel.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21457a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f21458b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ boolean f21459c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OffersViewModel$offersCategoriesChipsState$1(a<? super OffersViewModel$offersCategoriesChipsState$1> aVar) {
        super(3, aVar);
    }

    public final Object b(OffersViewModel.a aVar, boolean z11, a<? super OffersViewModel.a> aVar2) {
        OffersViewModel$offersCategoriesChipsState$1 offersViewModel$offersCategoriesChipsState$1 = new OffersViewModel$offersCategoriesChipsState$1(aVar2);
        offersViewModel$offersCategoriesChipsState$1.f21458b = aVar;
        offersViewModel$offersCategoriesChipsState$1.f21459c = z11;
        return offersViewModel$offersCategoriesChipsState$1.invokeSuspend(p.f75480a);
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ Object invoke(OffersViewModel.a aVar, Boolean bool, a<? super OffersViewModel.a> aVar2) {
        return b(aVar, bool.booleanValue(), aVar2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List a12;
        List<n9.a> X0;
        b.f();
        if (this.f21457a == 0) {
            f.b(obj);
            OffersViewModel.a aVar = (OffersViewModel.a) this.f21458b;
            boolean z11 = this.f21459c;
            if (aVar instanceof OffersViewModel.a.c) {
                OffersViewModel.a.c cVar = (OffersViewModel.a.c) aVar;
                a12 = CollectionsKt___CollectionsKt.a1(cVar.b());
                if (z11) {
                    a12.add(1, new n9.a(CategoryTab.FEATURED.getId(), null, new a.b(h.f62342k, new Object[0])));
                }
                X0 = CollectionsKt___CollectionsKt.X0(a12);
                return cVar.a(X0);
            }
            return aVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
