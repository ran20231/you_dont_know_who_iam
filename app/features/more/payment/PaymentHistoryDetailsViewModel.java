package com.forsale.app.features.more.payment;

import androidx.databinding.ObservableField;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.entities.PaymentHistoryEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import t9.y0;
import wz.h;
import wz.p;
import zz.a;
/* compiled from: PaymentHistoryDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class PaymentHistoryDetailsViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final UserProfileInteractor f32740k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ApplicationResourcesRepository f32741l0;

    /* renamed from: m0  reason: collision with root package name */
    private final h f32742m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ObservableField<String> f32743n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ObservableField<String> f32744o0;

    /* renamed from: p0  reason: collision with root package name */
    private final c0<PaymentHistoryEntity.PaymentRecord> f32745p0;

    /* renamed from: q0  reason: collision with root package name */
    private final Flow<UserEntity> f32746q0;

    /* renamed from: r0  reason: collision with root package name */
    private final StateFlow<String> f32747r0;

    /* compiled from: PaymentHistoryDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    static final class a implements c0<PaymentHistoryEntity.PaymentRecord> {
        a() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(PaymentHistoryEntity.PaymentRecord payment) {
            o.i(payment, "payment");
            PaymentHistoryDetailsViewModel paymentHistoryDetailsViewModel = PaymentHistoryDetailsViewModel.this;
            ObservableField<String> y02 = paymentHistoryDetailsViewModel.y0();
            String currency = payment.getCurrency();
            String amount = payment.getAmount();
            y02.k(currency + " " + amount);
            paymentHistoryDetailsViewModel.w0().k(paymentHistoryDetailsViewModel.C0(payment.getAgentName(), payment.getPaymentOptionName()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryDetailsViewModel(UserProfileInteractor userProfileInteractor, ApplicationResourcesRepository resourcesRepository, BaseRepository baseRepository) {
        super(baseRepository);
        h a11;
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(baseRepository, "baseRepository");
        this.f32740k0 = userProfileInteractor;
        this.f32741l0 = resourcesRepository;
        a11 = d.a(new g00.a<b0<PaymentHistoryEntity.PaymentRecord>>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$paymentRecord$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final b0<PaymentHistoryEntity.PaymentRecord> invoke() {
                return new b0<>();
            }
        });
        this.f32742m0 = a11;
        this.f32743n0 = new ObservableField<>("");
        this.f32744o0 = new ObservableField<>("");
        a aVar = new a();
        this.f32745p0 = aVar;
        final Flow<UserEntity> j11 = userProfileInteractor.j();
        this.f32746q0 = j11;
        this.f32747r0 = FlowKt.stateIn(new Flow<String>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f32749a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$special$$inlined$map$1$2", f = "PaymentHistoryDetailsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f32750a;

                    /* renamed from: b  reason: collision with root package name */
                    int f32751b;

                    public AnonymousClass1(a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f32750a = obj;
                        this.f32751b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f32749a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f32751b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32751b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f32750a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f32751b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f32749a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        if (r5 == 0) goto L3f
                        java.lang.String r5 = r5.getPhone()
                        goto L40
                    L3f:
                        r5 = 0
                    L40:
                        r0.f32751b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.payment.PaymentHistoryDetailsViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, a aVar2) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar2);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, r0.a(this), SharingStarted.Companion.getEagerly(), null);
        x0().observeForever(aVar);
    }

    private final void A0() {
        AggregatedAllAnalyticsLoggerKt.x0(r(), AggregatedAllAnalyticsLogger.CustomEvents.PAYMENT_HISTORY_RECEIPT_OPENED, false, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String C0(String str, String str2) {
        boolean z11;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return this.f32741l0.getString(y0.Ya, new Object[0]) + " (" + str + ")";
        }
        return this.f32741l0.getString(y0.Xa, new Object[0]) + " (" + str2 + ")";
    }

    public final void B0() {
        A0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        x0().removeObserver(this.f32745p0);
    }

    public final ObservableField<String> w0() {
        return this.f32744o0;
    }

    public final b0<PaymentHistoryEntity.PaymentRecord> x0() {
        return (b0) this.f32742m0.getValue();
    }

    public final ObservableField<String> y0() {
        return this.f32743n0;
    }

    public final StateFlow<String> z0() {
        return this.f32747r0;
    }
}
