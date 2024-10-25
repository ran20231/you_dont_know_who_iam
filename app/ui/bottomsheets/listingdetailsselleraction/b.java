package com.forsale.app.ui.bottomsheets.listingdetailsselleraction;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import t9.q0;
import t9.y0;
import wz.p;
/* compiled from: SellerActionResultViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final SellerActionType f38646k0;

    /* renamed from: l0  reason: collision with root package name */
    private final boolean f38647l0;

    /* renamed from: m0  reason: collision with root package name */
    private final boolean f38648m0;

    /* renamed from: n0  reason: collision with root package name */
    private final String f38649n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ApplicationResourcesRepository f38650o0;

    /* renamed from: p0  reason: collision with root package name */
    private final Boolean f38651p0;

    /* renamed from: q0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38652q0;

    /* renamed from: r0  reason: collision with root package name */
    private final b0<String> f38653r0;

    /* renamed from: s0  reason: collision with root package name */
    private final b0<String> f38654s0;

    /* renamed from: t0  reason: collision with root package name */
    private final b0<Drawable> f38655t0;

    /* renamed from: u0  reason: collision with root package name */
    private final LiveData<Drawable> f38656u0;

    /* compiled from: SellerActionResultViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        b a(SellerActionType sellerActionType, boolean z11, boolean z12, String str, Boolean bool);
    }

    /* compiled from: SellerActionResultViewModel.kt */
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0437b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38657a;

        static {
            int[] iArr = new int[SellerActionType.values().length];
            try {
                iArr[SellerActionType.AUTO_RE_POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SellerActionType.HIDE_MY_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SellerActionType.MANUAL_RE_POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SellerActionType.ADD_ADDITIONAL_NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SellerActionType.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SellerActionType.EXPIRE_SOON_DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SellerActionType.EXPIRE_SOON_BOOST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SellerActionType.EXPIRE_SOON_RE_POST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f38657a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SellerActionType sellerActionType, boolean z11, boolean z12, String str, ApplicationResourcesRepository appRepo, Boolean bool, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(sellerActionType, "sellerActionType");
        o.i(appRepo, "appRepo");
        o.i(baseRepository, "baseRepository");
        this.f38646k0 = sellerActionType;
        this.f38647l0 = z11;
        this.f38648m0 = z12;
        this.f38649n0 = str;
        this.f38650o0 = appRepo;
        this.f38651p0 = bool;
        this.f38652q0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38653r0 = new b0<>();
        this.f38654s0 = new b0<>();
        b0<Drawable> b0Var = new b0<>();
        this.f38655t0 = b0Var;
        this.f38656u0 = b0Var;
        T0();
        L0();
    }

    private final String A0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.C7;
        } else if (!z11) {
            i11 = y0.A7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final String B0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.D7;
        } else if (!z11) {
            i11 = y0.B7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final Drawable D0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        if (this.f38648m0) {
            i11 = q0.Y;
        } else {
            i11 = q0.A0;
        }
        return applicationResourcesRepository.getDrawable(i11);
    }

    private final String E0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.G7;
        } else if (!z11) {
            i11 = y0.E7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final String G0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.H7;
        } else if (!z11) {
            i11 = y0.F7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final String H0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            if (o.d(this.f38651p0, Boolean.TRUE)) {
                i11 = y0.K7;
            } else {
                i11 = y0.L7;
            }
        } else if (!z11) {
            i11 = y0.I7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final String I0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.M7;
        } else if (!z11) {
            i11 = y0.J7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final String J0(String str) {
        boolean z11 = this.f38648m0;
        if (z11) {
            boolean z12 = this.f38647l0;
            if (z12) {
                return this.f38650o0.getString(y0.X7, str);
            }
            if (!z12) {
                return this.f38650o0.getString(y0.V7, str);
            }
            throw new NoWhenBranchMatchedException();
        } else if (!z11) {
            boolean z13 = this.f38647l0;
            if (z13) {
                return this.f38650o0.getString(y0.T7, new Object[0]);
            }
            if (!z13) {
                return this.f38650o0.getString(y0.R7, new Object[0]);
            }
            throw new NoWhenBranchMatchedException();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final String K0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            boolean z12 = this.f38647l0;
            if (z12) {
                i11 = y0.Y7;
            } else if (!z12) {
                i11 = y0.W7;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!z11) {
            boolean z13 = this.f38647l0;
            if (z13) {
                i11 = y0.U7;
            } else if (!z13) {
                i11 = y0.S7;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final void L0() {
        int i11 = C0437b.f38657a[this.f38646k0.ordinal()];
        if (i11 != 6) {
            if (i11 != 7) {
                if (i11 != 8) {
                    if (this.f38648m0) {
                        this.f38655t0.postValue(this.f38650o0.getDrawable(q0.f69752g2));
                        return;
                    } else {
                        this.f38655t0.postValue(this.f38650o0.getDrawable(q0.A0));
                        return;
                    }
                }
                this.f38655t0.postValue(P0());
                return;
            }
            this.f38655t0.postValue(z0());
            return;
        }
        this.f38655t0.postValue(D0());
    }

    private final String N0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.f70385b8;
        } else if (!z11) {
            i11 = y0.Z7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final String O0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.f70402c8;
        } else if (!z11) {
            i11 = y0.f70368a8;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final Drawable P0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        if (this.f38648m0) {
            i11 = q0.f69752g2;
        } else {
            i11 = q0.A0;
        }
        return applicationResourcesRepository.getDrawable(i11);
    }

    private final String Q0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.f70453f8;
        } else if (!z11) {
            i11 = y0.f70419d8;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final String R0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.f70470g8;
        } else if (!z11) {
            i11 = y0.f70436e8;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final void T0() {
        switch (C0437b.f38657a[this.f38646k0.ordinal()]) {
            case 1:
                this.f38653r0.postValue(y0());
                this.f38654s0.postValue(x0());
                return;
            case 2:
                this.f38653r0.postValue(K0());
                String str = this.f38649n0;
                if (str != null) {
                    this.f38654s0.postValue(J0(str));
                    return;
                }
                return;
            case 3:
                this.f38653r0.postValue(O0());
                this.f38654s0.postValue(N0());
                return;
            case 4:
                this.f38653r0.postValue(w0());
                this.f38654s0.postValue(v0());
                return;
            case 5:
                this.f38653r0.postValue(I0());
                this.f38654s0.postValue(H0());
                return;
            case 6:
                this.f38653r0.postValue(G0());
                this.f38654s0.postValue(E0());
                return;
            case 7:
                this.f38653r0.postValue(B0());
                this.f38654s0.postValue(A0());
                return;
            case 8:
                this.f38653r0.postValue(R0());
                this.f38654s0.postValue(Q0());
                return;
            default:
                return;
        }
    }

    private final String v0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.f70703u7;
        } else if (!z11) {
            i11 = y0.f70671s7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final String w0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            i11 = y0.f70719v7;
        } else if (!z11) {
            i11 = y0.f70687t7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final String x0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            boolean z12 = this.f38647l0;
            if (z12) {
                i11 = y0.f70767y7;
            } else if (!z12) {
                i11 = y0.f70735w7;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!z11) {
            boolean z13 = this.f38647l0;
            if (z13) {
                i11 = y0.P7;
            } else if (!z13) {
                i11 = y0.N7;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final String y0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        boolean z11 = this.f38648m0;
        if (z11) {
            boolean z12 = this.f38647l0;
            if (z12) {
                i11 = y0.f70783z7;
            } else if (!z12) {
                i11 = y0.f70751x7;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!z11) {
            boolean z13 = this.f38647l0;
            if (z13) {
                i11 = y0.Q7;
            } else if (!z13) {
                i11 = y0.O7;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return applicationResourcesRepository.getString(i11, new Object[0]);
    }

    private final Drawable z0() {
        int i11;
        ApplicationResourcesRepository applicationResourcesRepository = this.f38650o0;
        if (this.f38648m0) {
            i11 = q0.f69738d0;
        } else {
            i11 = q0.A0;
        }
        return applicationResourcesRepository.getDrawable(i11);
    }

    public final OneShotEventHandler<p> C0() {
        return this.f38652q0;
    }

    public final LiveData<Drawable> M0() {
        return this.f38656u0;
    }

    public final b0<String> S0() {
        return this.f38654s0;
    }

    public final b0<String> U0() {
        return this.f38653r0;
    }

    public final void V0() {
        OneShotEventHandler.d(this.f38652q0, null, 1, null);
    }
}
