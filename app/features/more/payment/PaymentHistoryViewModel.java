package com.forsale.app.features.more.payment;

import androidx.paging.PagedList;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.services.BillingService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import jj.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: PaymentHistoryViewModel.kt */
/* loaded from: classes2.dex */
public final class PaymentHistoryViewModel extends BaseStatefulViewModel {

    /* renamed from: p0  reason: collision with root package name */
    public static final a f32769p0 = new a(null);

    /* renamed from: q0  reason: collision with root package name */
    public static final int f32770q0 = 8;

    /* renamed from: l0  reason: collision with root package name */
    private final ApplicationResourcesRepository f32771l0;

    /* renamed from: m0  reason: collision with root package name */
    private final BaseRepository f32772m0;

    /* renamed from: n0  reason: collision with root package name */
    private final BillingService f32773n0;

    /* renamed from: o0  reason: collision with root package name */
    private final b f32774o0;

    /* compiled from: PaymentHistoryViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryViewModel(ApplicationResourcesRepository resourcesRepository, BaseRepository baseRepository, BillingService billingService, b prefs) {
        super(baseRepository);
        o.i(resourcesRepository, "resourcesRepository");
        o.i(baseRepository, "baseRepository");
        o.i(billingService, "billingService");
        o.i(prefs, "prefs");
        this.f32771l0 = resourcesRepository;
        this.f32772m0 = baseRepository;
        this.f32773n0 = billingService;
        this.f32774o0 = prefs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C0(zz.a<? super com.forsale.app.features.more.payment.PaymentHistoryDataSource> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.more.payment.PaymentHistoryViewModel$paymentHistoryDataSource$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.more.payment.PaymentHistoryViewModel$paymentHistoryDataSource$1 r0 = (com.forsale.app.features.more.payment.PaymentHistoryViewModel$paymentHistoryDataSource$1) r0
            int r1 = r0.f32787f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32787f = r1
            goto L18
        L13:
            com.forsale.app.features.more.payment.PaymentHistoryViewModel$paymentHistoryDataSource$1 r0 = new com.forsale.app.features.more.payment.PaymentHistoryViewModel$paymentHistoryDataSource$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f32785d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f32787f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f32784c
            com.forsale.app.datalayer.network.services.BillingService r1 = (com.forsale.app.datalayer.network.services.BillingService) r1
            java.lang.Object r2 = r0.f32783b
            kotlinx.coroutines.flow.MutableSharedFlow r2 = (kotlinx.coroutines.flow.MutableSharedFlow) r2
            java.lang.Object r0 = r0.f32782a
            androidx.lifecycle.b0 r0 = (androidx.lifecycle.b0) r0
            kotlin.f.b(r8)
            goto L63
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            kotlin.f.b(r8)
            androidx.lifecycle.b0 r8 = r7.v0()
            kotlinx.coroutines.flow.MutableSharedFlow r2 = r7.g0()
            com.forsale.app.datalayer.network.services.BillingService r4 = r7.f32773n0
            jj.b r5 = r7.f32774o0
            kj.b r5 = r5.c()
            r0.f32782a = r8
            r0.f32783b = r2
            r0.f32784c = r4
            r0.f32787f = r3
            java.lang.Object r0 = r5.a(r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r1 = r4
            r6 = r0
            r0 = r8
            r8 = r6
        L63:
            java.lang.String r8 = (java.lang.String) r8
            com.forsale.app.features.more.payment.PaymentHistoryDataSource r3 = new com.forsale.app.features.more.payment.PaymentHistoryDataSource
            r3.<init>(r0, r2, r1, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.payment.PaymentHistoryViewModel.C0(zz.a):java.lang.Object");
    }

    private final PagedList.c D0() {
        return new PagedList.c.a().c(30).d(15).b(false).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(zz.a<? super de.k> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.more.payment.PaymentHistoryViewModel$dataSourceFactory$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.more.payment.PaymentHistoryViewModel$dataSourceFactory$1 r0 = (com.forsale.app.features.more.payment.PaymentHistoryViewModel$dataSourceFactory$1) r0
            int r1 = r0.f32777c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32777c = r1
            goto L18
        L13:
            com.forsale.app.features.more.payment.PaymentHistoryViewModel$dataSourceFactory$1 r0 = new com.forsale.app.features.more.payment.PaymentHistoryViewModel$dataSourceFactory$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f32775a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f32777c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            r0.f32777c = r3
            java.lang.Object r5 = r4.C0(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.forsale.app.features.more.payment.PaymentHistoryDataSource r5 = (com.forsale.app.features.more.payment.PaymentHistoryDataSource) r5
            de.k r0 = new de.k
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.payment.PaymentHistoryViewModel.y0(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0(zz.a<? super androidx.lifecycle.LiveData<androidx.paging.PagedList<com.forsale.app.datalayer.network.entities.PaymentHistoryEntity.PaymentRecord>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.more.payment.PaymentHistoryViewModel$getPaymentHistory$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.more.payment.PaymentHistoryViewModel$getPaymentHistory$1 r0 = (com.forsale.app.features.more.payment.PaymentHistoryViewModel$getPaymentHistory$1) r0
            int r1 = r0.f32781d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32781d = r1
            goto L18
        L13:
            com.forsale.app.features.more.payment.PaymentHistoryViewModel$getPaymentHistory$1 r0 = new com.forsale.app.features.more.payment.PaymentHistoryViewModel$getPaymentHistory$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f32779b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f32781d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f32778a
            com.forsale.app.features.more.payment.PaymentHistoryViewModel r0 = (com.forsale.app.features.more.payment.PaymentHistoryViewModel) r0
            kotlin.f.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            r0.f32778a = r4
            r0.f32781d = r3
            java.lang.Object r5 = r4.y0(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            androidx.paging.DataSource$Factory r5 = (androidx.paging.DataSource.Factory) r5
            androidx.paging.PagedList$c r0 = r0.D0()
            androidx.paging.e r1 = new androidx.paging.e
            r1.<init>(r5, r0)
            androidx.lifecycle.LiveData r5 = r1.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.payment.PaymentHistoryViewModel.A0(zz.a):java.lang.Object");
    }

    public final ApplicationResourcesRepository B0() {
        return this.f32771l0;
    }

    public final BaseRepository z0() {
        return this.f32772m0;
    }
}
