package com.forsale.app.features.postad.addons.calculatorNew;

import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.entities.AddonsRequested;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.ErrorReason;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import of.d;
import of.f;
import qf.c;
/* compiled from: CalculatorDialogueViewModel.kt */
/* loaded from: classes2.dex */
public final class CalculatorDialogueViewModel extends BaseViewModel {
    private final StateFlow<Boolean> A0;
    private final MutableStateFlow<Integer> B0;
    private final StateFlow<Integer> C0;
    private final MutableStateFlow<Integer> D0;
    private final StateFlow<Integer> E0;
    private final MutableStateFlow<c> F0;
    private final StateFlow<c> G0;

    /* renamed from: k0  reason: collision with root package name */
    private final f f34550k0;

    /* renamed from: l0  reason: collision with root package name */
    private final of.c f34551l0;

    /* renamed from: m0  reason: collision with root package name */
    private final d f34552m0;

    /* renamed from: n0  reason: collision with root package name */
    private final PostAdViewModel f34553n0;

    /* renamed from: o0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f34554o0;

    /* renamed from: p0  reason: collision with root package name */
    private final StateFlow<Boolean> f34555p0;

    /* renamed from: q0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f34556q0;

    /* renamed from: r0  reason: collision with root package name */
    private final MutableStateFlow<qf.a> f34557r0;

    /* renamed from: s0  reason: collision with root package name */
    private final StateFlow<qf.a> f34558s0;

    /* renamed from: t0  reason: collision with root package name */
    private final int f34559t0;

    /* renamed from: u0  reason: collision with root package name */
    private final int f34560u0;

    /* renamed from: v0  reason: collision with root package name */
    private final int f34561v0;

    /* renamed from: w0  reason: collision with root package name */
    private final int f34562w0;

    /* renamed from: x0  reason: collision with root package name */
    private final int f34563x0;

    /* renamed from: y0  reason: collision with root package name */
    private final int f34564y0;

    /* renamed from: z0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f34565z0;

    /* compiled from: CalculatorDialogueViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        CalculatorDialogueViewModel a(PostAdViewModel postAdViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculatorDialogueViewModel(f showAutoRepost, of.c paymentSummary, d pickBestAddonsCombinations, PostAdViewModel postAdViewModel, BaseRepository baseRepository) {
        super(baseRepository);
        boolean z11;
        Integer repostAutoRenew;
        o.i(showAutoRepost, "showAutoRepost");
        o.i(paymentSummary, "paymentSummary");
        o.i(pickBestAddonsCombinations, "pickBestAddonsCombinations");
        o.i(postAdViewModel, "postAdViewModel");
        o.i(baseRepository, "baseRepository");
        this.f34550k0 = showAutoRepost;
        this.f34551l0 = paymentSummary;
        this.f34552m0 = pickBestAddonsCombinations;
        this.f34553n0 = postAdViewModel;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f34554o0 = MutableStateFlow;
        this.f34555p0 = FlowKt.asStateFlow(MutableStateFlow);
        ListingDetailsEntity n22 = postAdViewModel.n2();
        if (n22 != null && (repostAutoRenew = n22.getRepostAutoRenew()) != null) {
            z11 = TypeExtensionsKt.h0(repostAutoRenew.intValue());
        } else {
            z11 = false;
        }
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.valueOf(z11));
        this.f34556q0 = MutableStateFlow2;
        MutableStateFlow<qf.a> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.f34557r0 = MutableStateFlow3;
        this.f34558s0 = FlowKt.asStateFlow(MutableStateFlow3);
        this.f34559t0 = sj.c.f68661x;
        this.f34560u0 = sj.c.J;
        int i11 = sj.c.f68662y;
        this.f34561v0 = i11;
        int i12 = sj.c.I;
        this.f34562w0 = i12;
        this.f34563x0 = i11;
        int i13 = sj.c.F;
        this.f34564y0 = i13;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(MutableStateFlow2.getValue());
        this.f34565z0 = MutableStateFlow4;
        this.A0 = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Integer> MutableStateFlow5 = StateFlowKt.MutableStateFlow(Integer.valueOf(MutableStateFlow2.getValue().booleanValue() ? i13 : i11));
        this.B0 = MutableStateFlow5;
        this.C0 = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Integer> MutableStateFlow6 = StateFlowKt.MutableStateFlow(Integer.valueOf(MutableStateFlow2.getValue().booleanValue() ? i12 : i11));
        this.D0 = MutableStateFlow6;
        this.E0 = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<c> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.F0 = MutableStateFlow7;
        this.G0 = FlowKt.asStateFlow(MutableStateFlow7);
        M0();
    }

    private final void C0(boolean z11) {
        this.f34565z0.setValue(Boolean.valueOf(z11));
    }

    private final List<AddonsRequested> P0(c cVar) {
        return this.f34552m0.e(cVar.a(), cVar.t(), cVar.i());
    }

    private final void R0(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new CalculatorDialogueViewModel$saveAutoRepost$1(this, z11, null), 3, null);
    }

    private final void S0() {
        int i11;
        int i12;
        MutableStateFlow<Integer> mutableStateFlow = this.B0;
        if (this.f34565z0.getValue().booleanValue()) {
            i11 = this.f34564y0;
        } else {
            i11 = this.f34563x0;
        }
        mutableStateFlow.setValue(Integer.valueOf(i11));
        MutableStateFlow<Integer> mutableStateFlow2 = this.D0;
        if (this.f34565z0.getValue().booleanValue()) {
            i12 = this.f34562w0;
        } else {
            i12 = this.f34561v0;
        }
        mutableStateFlow2.setValue(Integer.valueOf(i12));
        R0(this.f34565z0.getValue().booleanValue());
    }

    private final void T0() {
        MutableStateFlow<Boolean> mutableStateFlow = this.f34565z0;
        mutableStateFlow.setValue(Boolean.valueOf(!mutableStateFlow.getValue().booleanValue()));
    }

    public final StateFlow<qf.a> D0() {
        return this.f34558s0;
    }

    public final StateFlow<Integer> E0() {
        return this.C0;
    }

    public final StateFlow<Integer> G0() {
        return this.E0;
    }

    public final int H0() {
        return this.f34560u0;
    }

    public final StateFlow<Boolean> I0() {
        return this.A0;
    }

    public final StateFlow<c> J0() {
        return this.G0;
    }

    public final StateFlow<Boolean> K0() {
        return this.f34555p0;
    }

    public final int L0() {
        return this.f34559t0;
    }

    public final void M0() {
        PostAdViewModel.H3(this.f34553n0, ErrorReason.PAYMENT_CONFIRMATION.getValue(), null, 2, null);
        FlowKt.launchIn(FlowKt.onEach(this.f34553n0.a2(), new CalculatorDialogueViewModel$initialize$1(this, null)), r0.a(this));
    }

    public final void N0() {
        T0();
        S0();
    }

    public final void O0(boolean z11) {
        C0(z11);
        S0();
    }

    public final void Q0() {
        c value = this.F0.getValue();
        if (value != null) {
            PostAdViewModel postAdViewModel = this.f34553n0;
            if (value.s()) {
                PostAdViewModel.G4(postAdViewModel, false, 1, null);
                return;
            }
            ListingDetailsEntity n22 = postAdViewModel.n2();
            if (n22 != null) {
                n22.setLeftOverFlag(TypeExtensionsKt.H0(value.o()));
                n22.setAddonsRequested(P0(value));
            }
            postAdViewModel.I4();
            PostAdViewModel.G4(postAdViewModel, false, 1, null);
        }
    }
}
