package com.forsale.app.features.postad.plans;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.b0;
import bg.f;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.responses.PlansResponse;
import com.forsale.app.datalayer.network.services.PlansServices;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.postad.PostAdScreens;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: PostAdPlansViewModel.kt */
/* loaded from: classes2.dex */
public final class PostAdPlansViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final PostAdViewModel f36372l0;

    /* renamed from: m0  reason: collision with root package name */
    private final PlansServices f36373m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ObservableField<String> f36374n0;

    /* renamed from: o0  reason: collision with root package name */
    private final b0<String> f36375o0;

    /* renamed from: p0  reason: collision with root package name */
    private final b0<List<PlansResponse.Plan>> f36376p0;

    /* renamed from: q0  reason: collision with root package name */
    private final ObservableBoolean f36377q0;

    /* renamed from: r0  reason: collision with root package name */
    private final MutableStateFlow<String> f36378r0;

    /* renamed from: s0  reason: collision with root package name */
    private final StateFlow<String> f36379s0;

    /* compiled from: PostAdPlansViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        PostAdPlansViewModel a(PostAdViewModel postAdViewModel);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PostAdPlansViewModel f36380a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, PostAdPlansViewModel postAdPlansViewModel) {
            super(key);
            this.f36380a = postAdPlansViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f36380a.v0().postValue(ViewStates.CONNECTION_ERROR);
            } else {
                this.f36380a.v0().postValue(ViewStates.ERROR);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdPlansViewModel(PostAdViewModel postAdViewModel, PlansServices plansServices, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(postAdViewModel, "postAdViewModel");
        o.i(plansServices, "plansServices");
        o.i(baseRepository, "baseRepository");
        this.f36372l0 = postAdViewModel;
        this.f36373m0 = plansServices;
        this.f36374n0 = new ObservableField<>("");
        this.f36375o0 = new b0<>();
        this.f36376p0 = new b0<>();
        this.f36377q0 = new ObservableBoolean(false);
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f36378r0 = MutableStateFlow;
        this.f36379s0 = FlowKt.asStateFlow(MutableStateFlow);
        J0();
        C0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.forsale.app.datalayer.network.responses.PlansResponse.Plan B0(java.lang.Integer r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L76
            r7.intValue()
            androidx.lifecycle.b0<java.util.List<com.forsale.app.datalayer.network.responses.PlansResponse$Plan>> r3 = r6.f36376p0
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L38
            kotlin.jvm.internal.o.f(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.forsale.app.datalayer.network.responses.PlansResponse$Plan r5 = (com.forsale.app.datalayer.network.responses.PlansResponse.Plan) r5
            java.lang.Integer r5 = r5.getId()
            boolean r5 = kotlin.jvm.internal.o.d(r5, r7)
            if (r5 == 0) goto L1b
            goto L34
        L33:
            r4 = r2
        L34:
            com.forsale.app.datalayer.network.responses.PlansResponse$Plan r4 = (com.forsale.app.datalayer.network.responses.PlansResponse.Plan) r4
            if (r4 != 0) goto L71
        L38:
            androidx.lifecycle.b0<java.util.List<com.forsale.app.datalayer.network.responses.PlansResponse$Plan>> r7 = r6.f36376p0
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L70
            kotlin.jvm.internal.o.f(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L4b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r7.next()
            r4 = r3
            com.forsale.app.datalayer.network.responses.PlansResponse$Plan r4 = (com.forsale.app.datalayer.network.responses.PlansResponse.Plan) r4
            java.lang.Integer r4 = r4.isDefault()
            if (r4 != 0) goto L5f
            goto L67
        L5f:
            int r4 = r4.intValue()
            if (r4 != r1) goto L67
            r4 = r1
            goto L68
        L67:
            r4 = r0
        L68:
            if (r4 == 0) goto L4b
            goto L6c
        L6b:
            r3 = r2
        L6c:
            r4 = r3
            com.forsale.app.datalayer.network.responses.PlansResponse$Plan r4 = (com.forsale.app.datalayer.network.responses.PlansResponse.Plan) r4
            goto L71
        L70:
            r4 = r2
        L71:
            if (r4 != 0) goto L74
            goto L76
        L74:
            r2 = r4
            goto La8
        L76:
            androidx.lifecycle.b0<java.util.List<com.forsale.app.datalayer.network.responses.PlansResponse$Plan>> r7 = r6.f36376p0
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto La8
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L86:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La6
            java.lang.Object r3 = r7.next()
            r4 = r3
            com.forsale.app.datalayer.network.responses.PlansResponse$Plan r4 = (com.forsale.app.datalayer.network.responses.PlansResponse.Plan) r4
            java.lang.Integer r4 = r4.isDefault()
            if (r4 != 0) goto L9a
            goto La2
        L9a:
            int r4 = r4.intValue()
            if (r4 != r1) goto La2
            r4 = r1
            goto La3
        La2:
            r4 = r0
        La3:
            if (r4 == 0) goto L86
            r2 = r3
        La6:
            com.forsale.app.datalayer.network.responses.PlansResponse$Plan r2 = (com.forsale.app.datalayer.network.responses.PlansResponse.Plan) r2
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.plans.PostAdPlansViewModel.B0(java.lang.Integer):com.forsale.app.datalayer.network.responses.PlansResponse$Plan");
    }

    private final void J0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdPlansViewModel$initRegionCurrency$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(boolean z11) {
        this.f36377q0.k(z11);
    }

    private final void M0() {
        if (this.f36372l0.q3()) {
            PostAdViewModel.J3(this.f36372l0, CreateEditAdvActionType.EDIT_PLANS_NEXT_CLICKED, null, null, null, null, 30, null);
        } else {
            PostAdViewModel.J3(this.f36372l0, CreateEditAdvActionType.ADD_PLANS_NEXT_CLICKED, null, null, null, null, 30, null);
        }
    }

    private final void N0() {
        if (this.f36372l0.q3()) {
            PostAdViewModel.J3(this.f36372l0, CreateEditAdvActionType.EDIT_LISTING_PLAN_SELECTED, null, null, null, null, 30, null);
        } else {
            PostAdViewModel.J3(this.f36372l0, CreateEditAdvActionType.ADD_LISTING_PLAN_SELECTED, null, null, null, null, 30, null);
        }
    }

    public final ObservableBoolean A0() {
        return this.f36377q0;
    }

    public final void C0() {
        K0(false);
        v0().postValue(ViewStates.LOADING);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdPlansViewModel$getPlans$1(this, null), 3, null);
    }

    public final b0<String> D0() {
        return this.f36375o0;
    }

    public final b0<List<PlansResponse.Plan>> E0() {
        return this.f36376p0;
    }

    public final StateFlow<String> G0() {
        return this.f36379s0;
    }

    public final ObservableField<String> H0() {
        return this.f36374n0;
    }

    public final Integer I0() {
        Integer num;
        ListingDetailsEntity n22 = this.f36372l0.n2();
        if (n22 != null) {
            num = n22.getPlanId();
        } else {
            num = null;
        }
        PlansResponse.Plan B0 = B0(num);
        if (B0 == null) {
            return null;
        }
        return B0.getId();
    }

    public final void L0() {
        Q0(B0(I0()));
        M0();
        this.f36372l0.I4();
        this.f36372l0.N1(PostAdScreens.PLANS_SCREEN);
    }

    public final void O0() {
        if (this.f36372l0.q3()) {
            PostAdViewModel.J3(this.f36372l0, CreateEditAdvActionType.EDIT_PLANS_VISITED, null, null, null, null, 30, null);
        } else {
            PostAdViewModel.J3(this.f36372l0, CreateEditAdvActionType.ADD_PLANS_VISITED, null, null, null, null, 30, null);
        }
    }

    public final void P0(f.b it2) {
        o.i(it2, "it");
        Q0(it2.a());
        N0();
    }

    public final void Q0(PlansResponse.Plan plan) {
        Integer num;
        Float f11;
        Integer num2;
        ListingDetailsEntity n22 = this.f36372l0.n2();
        if (n22 != null) {
            Integer num3 = null;
            if (plan != null) {
                num = plan.getId();
            } else {
                num = null;
            }
            n22.setPlanId(num);
            if (plan != null) {
                f11 = plan.getPrice();
            } else {
                f11 = null;
            }
            n22.setPlanPrice(f11);
            if (plan != null) {
                num2 = plan.isFree();
            } else {
                num2 = null;
            }
            n22.setPlanIsFree(num2);
            if (plan != null) {
                num3 = plan.getExtendPeriod();
            }
            n22.setPlanExtendPeriod(num3);
        }
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getIO().plus(new b(CoroutineExceptionHandler.Key, this));
    }
}
