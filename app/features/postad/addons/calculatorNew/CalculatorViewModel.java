package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.models.CalculatorEntity;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.b0;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import t9.y0;
import wz.p;
/* compiled from: CalculatorViewModel.kt */
/* loaded from: classes2.dex */
public final class CalculatorViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final com.forsale.app.features.postad.a f34575a;

    /* renamed from: b  reason: collision with root package name */
    private final PostAdViewModel f34576b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineScope f34577c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableSharedFlow<b0> f34578d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedFlow<b0> f34579e;

    public CalculatorViewModel(com.forsale.app.features.postad.a calculatorInteractors, PostAdViewModel postAdViewModel, CoroutineScope coroutineScope) {
        o.i(calculatorInteractors, "calculatorInteractors");
        o.i(postAdViewModel, "postAdViewModel");
        o.i(coroutineScope, "coroutineScope");
        this.f34575a = calculatorInteractors;
        this.f34576b = postAdViewModel;
        this.f34577c = coroutineScope;
        MutableSharedFlow<b0> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34578d = MutableSharedFlow$default;
        this.f34579e = MutableSharedFlow$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.forsale.app.models.CalculatorEntity r5, com.forsale.app.datalayer.network.entities.PostListingIntention r6, zz.a<? super wz.p> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.postad.addons.calculatorNew.CalculatorViewModel$checkPremiumAndOnlineCreditConsumption$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.postad.addons.calculatorNew.CalculatorViewModel$checkPremiumAndOnlineCreditConsumption$1 r0 = (com.forsale.app.features.postad.addons.calculatorNew.CalculatorViewModel$checkPremiumAndOnlineCreditConsumption$1) r0
            int r1 = r0.f34583d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34583d = r1
            goto L18
        L13:
            com.forsale.app.features.postad.addons.calculatorNew.CalculatorViewModel$checkPremiumAndOnlineCreditConsumption$1 r0 = new com.forsale.app.features.postad.addons.calculatorNew.CalculatorViewModel$checkPremiumAndOnlineCreditConsumption$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f34581b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f34583d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f34580a
            qf.b r5 = (qf.b) r5
            kotlin.f.b(r7)
            goto L53
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r7)
            com.forsale.app.features.postad.a r7 = r4.f34575a
            of.a r7 = r7.a()
            qf.b r5 = r7.b(r5)
            kotlinx.coroutines.flow.MutableSharedFlow<com.forsale.app.utils.b0> r7 = r4.f34578d
            com.forsale.app.utils.b0 r6 = r4.h(r5, r6)
            r0.f34580a = r5
            r0.f34583d = r3
            java.lang.Object r5 = r7.emit(r6, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.calculatorNew.CalculatorViewModel.e(com.forsale.app.models.CalculatorEntity, com.forsale.app.datalayer.network.entities.PostListingIntention, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(CalculatorEntity calculatorEntity, PostListingIntention postListingIntention, zz.a<? super p> aVar) {
        Object f11;
        Object e11 = e(calculatorEntity, postListingIntention, aVar);
        f11 = b.f();
        if (e11 == f11) {
            return e11;
        }
        return p.f75480a;
    }

    private final b0 h(qf.b bVar, PostListingIntention postListingIntention) {
        boolean z11;
        boolean z12;
        int i11;
        if (postListingIntention != PostListingIntention.NEW_LISTING && postListingIntention != PostListingIntention.RE_POST) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (bVar.b() == 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (z11) {
                i11 = y0.T1;
            } else {
                i11 = y0.U1;
            }
        } else {
            i11 = y0.W1;
        }
        return new b0(i11, TypeExtensionsKt.o(bVar.b()), bVar.a());
    }

    public final SharedFlow<b0> f() {
        return this.f34579e;
    }

    public final void i(ListingDetailsEntity listing, PostListingIntention intention, List<Addon> selectedAddons) {
        o.i(listing, "listing");
        o.i(intention, "intention");
        o.i(selectedAddons, "selectedAddons");
        BuildersKt__Builders_commonKt.launch$default(this.f34577c, null, null, new CalculatorViewModel$setupCalculator$1(this, listing, intention, selectedAddons, null), 3, null);
    }

    public final void j(List<Addon> addons, PostListingIntention intention) {
        o.i(addons, "addons");
        o.i(intention, "intention");
        BuildersKt__Builders_commonKt.launch$default(this.f34577c, null, null, new CalculatorViewModel$updateWithSelectedAddons$1(this, addons, intention, null), 3, null);
    }
}
