package com.forsale.app.features.more.support;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.i;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.TutorialRepository;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.SupportActionType;
import com.forsale.app.utils.facades.ZendeskSupport;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlin.text.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import wz.p;
/* compiled from: SupportViewModel.kt */
/* loaded from: classes2.dex */
public final class SupportViewModel extends BaseViewModel {
    private final SharedFlow<String> A0;
    private final ObservableBoolean B0;
    private final ObservableBoolean C0;
    private final ObservableBoolean D0;
    private i.a E0;

    /* renamed from: k0  reason: collision with root package name */
    private final TutorialRepository f32822k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ZendeskSupport f32823l0;

    /* renamed from: m0  reason: collision with root package name */
    private final UserProfileInteractor f32824m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ObservableField<String> f32825n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ObservableField<String> f32826o0;

    /* renamed from: p0  reason: collision with root package name */
    private final MutableSharedFlow<p> f32827p0;

    /* renamed from: q0  reason: collision with root package name */
    private final SharedFlow<p> f32828q0;

    /* renamed from: r0  reason: collision with root package name */
    private final MutableSharedFlow<p> f32829r0;

    /* renamed from: s0  reason: collision with root package name */
    private final SharedFlow<p> f32830s0;

    /* renamed from: t0  reason: collision with root package name */
    private final MutableSharedFlow<p> f32831t0;

    /* renamed from: u0  reason: collision with root package name */
    private final SharedFlow<p> f32832u0;

    /* renamed from: v0  reason: collision with root package name */
    private final MutableSharedFlow<p> f32833v0;

    /* renamed from: w0  reason: collision with root package name */
    private final SharedFlow<p> f32834w0;

    /* renamed from: x0  reason: collision with root package name */
    private final MutableSharedFlow<p> f32835x0;

    /* renamed from: y0  reason: collision with root package name */
    private final SharedFlow<p> f32836y0;

    /* renamed from: z0  reason: collision with root package name */
    private final MutableSharedFlow<String> f32837z0;

    /* compiled from: SupportViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.support.SupportViewModel$1", f = "SupportViewModel.kt", l = {57, 58, 59, 69}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.support.SupportViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f32838a;

        /* renamed from: b  reason: collision with root package name */
        int f32839b;

        /* compiled from: ObservableExtensions.kt */
        /* renamed from: com.forsale.app.features.more.support.SupportViewModel$1$a */
        /* loaded from: classes2.dex */
        public static final class a extends i.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SupportViewModel f32841a;

            public a(SupportViewModel supportViewModel) {
                this.f32841a = supportViewModel;
            }

            @Override // androidx.databinding.i.a
            public void d(i observable, int i11) {
                o.i(observable, "observable");
                String str = (String) ((ObservableField) observable).j();
                if (str != null) {
                    SupportViewModel supportViewModel = this.f32841a;
                    o.f(str);
                    supportViewModel.H0(str);
                }
            }
        }

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r7.f32839b
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L32
                if (r1 == r6) goto L2e
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r0 = r7.f32838a
                com.forsale.app.features.more.support.SupportViewModel r0 = (com.forsale.app.features.more.support.SupportViewModel) r0
                kotlin.f.b(r8)
                goto Lc5
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L26:
                kotlin.f.b(r8)
                goto L82
            L2a:
                kotlin.f.b(r8)
                goto L66
            L2e:
                kotlin.f.b(r8)
                goto L44
            L32:
                kotlin.f.b(r8)
                com.forsale.app.features.more.support.SupportViewModel r8 = com.forsale.app.features.more.support.SupportViewModel.this
                com.forsale.app.utils.facades.user.UserProfileInteractor r8 = com.forsale.app.features.more.support.SupportViewModel.x0(r8)
                r7.f32839b = r6
                java.lang.Object r8 = r8.i(r7)
                if (r8 != r0) goto L44
                return r0
            L44:
                com.forsale.app.datalayer.database.UserEntity r8 = (com.forsale.app.datalayer.database.UserEntity) r8
                if (r8 == 0) goto L4d
                java.lang.String r8 = r8.getEmail()
                goto L4e
            L4d:
                r8 = r2
            L4e:
                com.forsale.app.features.more.support.SupportViewModel r1 = com.forsale.app.features.more.support.SupportViewModel.this
                androidx.databinding.ObservableField r1 = r1.Q0()
                r1.k(r8)
                com.forsale.app.features.more.support.SupportViewModel r8 = com.forsale.app.features.more.support.SupportViewModel.this
                com.forsale.app.datalayer.repositories.RegionsRepository r8 = r8.I()
                r7.f32839b = r5
                java.lang.Object r8 = r8.getCurrentRegion(r7)
                if (r8 != r0) goto L66
                return r0
            L66:
                com.forsale.app.datalayer.database.RegionEntity r8 = (com.forsale.app.datalayer.database.RegionEntity) r8
                java.lang.String r8 = r8.getSupportMessage()
                if (r8 == 0) goto L77
                com.forsale.app.features.more.support.SupportViewModel r1 = com.forsale.app.features.more.support.SupportViewModel.this
                androidx.databinding.ObservableField r1 = r1.R0()
                r1.k(r8)
            L77:
                com.forsale.app.features.more.support.SupportViewModel r8 = com.forsale.app.features.more.support.SupportViewModel.this
                r7.f32839b = r4
                java.lang.Object r8 = com.forsale.app.features.more.support.SupportViewModel.E0(r8, r7)
                if (r8 != r0) goto L82
                return r0
            L82:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                com.forsale.app.features.more.support.SupportViewModel r1 = com.forsale.app.features.more.support.SupportViewModel.this
                androidx.databinding.ObservableBoolean r1 = r1.T0()
                r4 = r8 ^ 1
                r1.k(r4)
                if (r8 != 0) goto La9
                com.forsale.app.features.more.support.SupportViewModel r8 = com.forsale.app.features.more.support.SupportViewModel.this
                androidx.databinding.ObservableField r0 = r8.Q0()
                com.forsale.app.features.more.support.SupportViewModel r1 = com.forsale.app.features.more.support.SupportViewModel.this
                com.forsale.app.features.more.support.SupportViewModel$1$a r2 = new com.forsale.app.features.more.support.SupportViewModel$1$a
                r2.<init>(r1)
                r0.a(r2)
                com.forsale.app.features.more.support.SupportViewModel.G0(r8, r2)
                goto Ld3
            La9:
                com.forsale.app.features.more.support.SupportViewModel r8 = com.forsale.app.features.more.support.SupportViewModel.this
                androidx.databinding.ObservableBoolean r8 = r8.L0()
                r8.k(r6)
                com.forsale.app.features.more.support.SupportViewModel r8 = com.forsale.app.features.more.support.SupportViewModel.this
                com.forsale.app.utils.facades.user.UserProfileInteractor r1 = com.forsale.app.features.more.support.SupportViewModel.x0(r8)
                r7.f32838a = r8
                r7.f32839b = r3
                java.lang.Object r1 = r1.i(r7)
                if (r1 != r0) goto Lc3
                return r0
            Lc3:
                r0 = r8
                r8 = r1
            Lc5:
                com.forsale.app.datalayer.database.UserEntity r8 = (com.forsale.app.datalayer.database.UserEntity) r8
                if (r8 == 0) goto Lcd
                java.lang.String r2 = r8.getEmail()
            Lcd:
                kotlin.jvm.internal.o.f(r2)
                com.forsale.app.features.more.support.SupportViewModel.v0(r0, r2)
            Ld3:
                wz.p r8 = wz.p.f75480a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.support.SupportViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportViewModel(TutorialRepository tutorialRepository, ZendeskSupport zendeskSupport, UserProfileInteractor userProfileInteractor, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(tutorialRepository, "tutorialRepository");
        o.i(zendeskSupport, "zendeskSupport");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(baseRepository, "baseRepository");
        this.f32822k0 = tutorialRepository;
        this.f32823l0 = zendeskSupport;
        this.f32824m0 = userProfileInteractor;
        this.f32825n0 = new ObservableField<>();
        this.f32826o0 = new ObservableField<>();
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f32827p0 = MutableSharedFlow$default;
        this.f32828q0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f32829r0 = MutableSharedFlow$default2;
        this.f32830s0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<p> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f32831t0 = MutableSharedFlow$default3;
        this.f32832u0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<p> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f32833v0 = MutableSharedFlow$default4;
        this.f32834w0 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<p> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f32835x0 = MutableSharedFlow$default5;
        this.f32836y0 = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        MutableSharedFlow<String> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f32837z0 = MutableSharedFlow$default6;
        this.A0 = FlowKt.asSharedFlow(MutableSharedFlow$default6);
        this.B0 = new ObservableBoolean(false);
        this.C0 = new ObservableBoolean(false);
        this.D0 = new ObservableBoolean(false);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(String str) {
        boolean v11;
        v11 = s.v(str);
        if (!v11) {
            boolean v12 = ViewsExtensionsKt.v(str);
            this.C0.k(!v12);
            this.D0.k(v12);
            if (v12) {
                e1();
                return;
            }
            return;
        }
        this.C0.k(false);
        this.D0.k(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U0(zz.a<? super Boolean> aVar) {
        return this.f32824m0.r(aVar);
    }

    private final void V0(SupportActionType supportActionType, boolean z11, boolean z12) {
        AggregatedAllAnalyticsLoggerKt.J0(r(), supportActionType, null, z11, z12, 2, null);
    }

    private final void d1() {
        this.f32823l0.q(this.f32826o0.j());
    }

    private final void e1() {
        this.f32823l0.r(this.f32826o0.j());
    }

    public final SharedFlow<p> I0() {
        return this.f32836y0;
    }

    public final SharedFlow<p> J0() {
        return this.f32832u0;
    }

    public final ObservableBoolean K0() {
        return this.C0;
    }

    public final ObservableBoolean L0() {
        return this.D0;
    }

    public final SharedFlow<p> M0() {
        return this.f32828q0;
    }

    public final SharedFlow<String> N0() {
        return this.A0;
    }

    public final SharedFlow<p> O0() {
        return this.f32834w0;
    }

    public final SharedFlow<p> P0() {
        return this.f32830s0;
    }

    public final ObservableField<String> Q0() {
        return this.f32826o0;
    }

    public final ObservableField<String> R0() {
        return this.f32825n0;
    }

    public final ZendeskSupport S0() {
        return this.f32823l0;
    }

    public final ObservableBoolean T0() {
        return this.B0;
    }

    public final void W0() {
        V0(SupportActionType.SUPPORT_CALL_US_CLICKED, true, true);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SupportViewModel$onCallUsClick$1(this, null), 3, null);
    }

    public final void X0() {
        V0(SupportActionType.SUPPORT_CREATE_TICKET_CLICKED, true, true);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SupportViewModel$onCreateTicketClick$1(this, null), 3, null);
    }

    public final void Y0() {
        V0(SupportActionType.SUPPORT_FAQ_CLICKED, true, true);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SupportViewModel$onFAQsClick$1(this, null), 3, null);
    }

    public final void Z0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SupportViewModel$onHelpClick$1(this, null), 3, null);
    }

    public final void b1() {
        V0(SupportActionType.SUPPORT_LIVE_CHAT_CLICKED, true, true);
        d1();
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SupportViewModel$onLiveChatClick$1(this, null), 3, null);
    }

    public final void c1() {
        V0(SupportActionType.SUPPORT_MY_TICKETS_CLICKED, true, true);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SupportViewModel$onMyTicketsClick$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        i.a aVar = this.E0;
        if (aVar != null) {
            ObservableField<String> observableField = this.f32826o0;
            o.f(aVar);
            observableField.g(aVar);
        }
    }
}
