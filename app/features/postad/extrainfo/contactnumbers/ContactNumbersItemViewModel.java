package com.forsale.app.features.postad.extrainfo.contactnumbers;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.z;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.postad.PostAdRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.v;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import wz.h;
import wz.p;
/* compiled from: ContactNumbersItemViewModel.kt */
/* loaded from: classes2.dex */
public final class ContactNumbersItemViewModel extends BaseViewModel {

    /* renamed from: w0  reason: collision with root package name */
    public static final a f35579w0 = new a(null);

    /* renamed from: x0  reason: collision with root package name */
    public static final int f35580x0 = 8;

    /* renamed from: k0  reason: collision with root package name */
    private final PostAdViewModel f35581k0;

    /* renamed from: l0  reason: collision with root package name */
    private final PostAdRepository f35582l0;

    /* renamed from: m0  reason: collision with root package name */
    private final Set<String> f35583m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ObservableField<String> f35584n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ObservableBoolean f35585o0;

    /* renamed from: p0  reason: collision with root package name */
    private final ObservableField<String> f35586p0;

    /* renamed from: q0  reason: collision with root package name */
    private final ObservableBoolean f35587q0;

    /* renamed from: r0  reason: collision with root package name */
    private final MutableSharedFlow<Pair<String, Boolean>> f35588r0;

    /* renamed from: s0  reason: collision with root package name */
    private int f35589s0;

    /* renamed from: t0  reason: collision with root package name */
    private final h f35590t0;

    /* renamed from: u0  reason: collision with root package name */
    private final ObservableField<String> f35591u0;

    /* renamed from: v0  reason: collision with root package name */
    private final z<Boolean> f35592v0;

    /* compiled from: ContactNumbersItemViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v H0() {
        return (v) this.f35590t0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(boolean z11) {
        this.f35587q0.k(z11);
        this.f35592v0.postValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K0(Set<String> set, zz.a<? super p> aVar) {
        Object f11;
        String t02;
        ListingDetailsEntity n22 = this.f35581k0.n2();
        if (n22 != null) {
            PostAdViewModel postAdViewModel = this.f35581k0;
            t02 = CollectionsKt___CollectionsKt.t0(set, ",", null, null, 0, null, null, 62, null);
            n22.setContactNo(t02);
            postAdViewModel.L4(n22);
        }
        Object g11 = this.f35582l0.g(set, aVar);
        f11 = b.f();
        if (g11 == f11) {
            return g11;
        }
        return p.f75480a;
    }

    public final void B0(String number, boolean z11) {
        o.i(number, "number");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ContactNumbersItemViewModel$addNew$1(number, this, z11, null), 3, null);
    }

    public final ObservableField<String> C0() {
        return this.f35591u0;
    }

    public final ObservableBoolean D0() {
        return this.f35587q0;
    }

    public final ObservableField<String> E0() {
        return this.f35584n0;
    }

    public final ObservableBoolean G0() {
        return this.f35585o0;
    }

    public final ObservableField<String> I0() {
        return this.f35586p0;
    }
}
