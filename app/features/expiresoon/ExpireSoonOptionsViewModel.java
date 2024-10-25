package com.forsale.app.features.expiresoon;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.c0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import wz.p;
/* compiled from: ExpireSoonOptionsViewModel.kt */
/* loaded from: classes2.dex */
public final class ExpireSoonOptionsViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final jj.b f31261k0;

    /* renamed from: l0  reason: collision with root package name */
    private final CoroutineExceptionHandler f31262l0;

    /* renamed from: m0  reason: collision with root package name */
    private final b0<Boolean> f31263m0;

    /* renamed from: n0  reason: collision with root package name */
    private final LiveData<Boolean> f31264n0;

    /* renamed from: o0  reason: collision with root package name */
    private final b0<Boolean> f31265o0;

    /* renamed from: p0  reason: collision with root package name */
    private final LiveData<Boolean> f31266p0;

    /* renamed from: q0  reason: collision with root package name */
    private final OneShotEventHandler<ListingDetailsEntity> f31267q0;

    /* renamed from: r0  reason: collision with root package name */
    private final OneShotEventHandler<ListingDetailsEntity> f31268r0;

    /* renamed from: s0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31269s0;

    /* renamed from: t0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31270t0;

    /* renamed from: u0  reason: collision with root package name */
    private final c0 f31271u0;

    /* renamed from: v0  reason: collision with root package name */
    private final LiveData<Boolean> f31272v0;

    /* compiled from: ExpireSoonOptionsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31273a;

        static {
            int[] iArr = new int[ViewStates.values().length];
            try {
                iArr[ViewStates.CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewStates.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewStates.CONNECTION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewStates.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f31273a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExpireSoonOptionsViewModel f31274a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, ExpireSoonOptionsViewModel expireSoonOptionsViewModel) {
            super(key);
            this.f31274a = expireSoonOptionsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String message = th2.getMessage();
            x10.a.b("ExpireSoonOptionsViewModel: Exception " + message, new Object[0]);
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f31274a.S0(ViewStates.CONNECTION_ERROR);
            } else {
                this.f31274a.S0(ViewStates.ERROR);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonOptionsViewModel(jj.b prefs, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(prefs, "prefs");
        o.i(baseRepository, "baseRepository");
        this.f31261k0 = prefs;
        this.f31262l0 = new b(CoroutineExceptionHandler.Key, this);
        Boolean bool = Boolean.FALSE;
        b0<Boolean> b0Var = new b0<>(bool);
        this.f31263m0 = b0Var;
        this.f31264n0 = b0Var;
        b0<Boolean> b0Var2 = new b0<>(bool);
        this.f31265o0 = b0Var2;
        this.f31266p0 = b0Var2;
        this.f31267q0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31268r0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31269s0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31270t0 = new OneShotEventHandler<>(null, 0, 3, null);
        c0 timer = v().getTimer();
        this.f31271u0 = timer;
        Long l11 = (Long) Transformations.a(timer).getValue();
        this.f31272v0 = new b0(Boolean.valueOf(timer.e()));
        N0();
    }

    private final void A0(boolean z11) {
        B0(z11);
        C0(z11);
    }

    private final void B0(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ExpireSoonOptionsViewModel$enableBoost$1(this, z11, null), 3, null);
    }

    private final void C0(boolean z11) {
        this.f31265o0.postValue(Boolean.valueOf(z11));
    }

    private final ListingItemDetails J0() {
        return v().getListingDetails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(zz.a<? super com.forsale.app.datalayer.network.entities.ListingDetailsEntity> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$getListingDetailsEntity$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$getListingDetailsEntity$1 r0 = (com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$getListingDetailsEntity$1) r0
            int r1 = r0.f31282e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31282e = r1
            goto L18
        L13:
            com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$getListingDetailsEntity$1 r0 = new com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$getListingDetailsEntity$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f31280c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f31282e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f31279b
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity$Companion r1 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity.Companion) r1
            java.lang.Object r0 = r0.f31278a
            com.forsale.app.datalayer.network.responses.ListingItemDetails r0 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r0
            kotlin.f.b(r7)
            goto L5b
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.network.responses.ListingItemDetails r7 = r6.J0()
            if (r7 == 0) goto L62
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity$Companion r2 = com.forsale.app.datalayer.network.entities.ListingDetailsEntity.Companion
            jj.b r4 = r6.f31261k0
            kj.b r4 = r4.c()
            r0.f31278a = r7
            r0.f31279b = r2
            r0.f31282e = r3
            java.lang.Object r0 = r4.a(r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r1 = r2
            r5 = r0
            r0 = r7
            r7 = r5
        L5b:
            java.lang.String r7 = (java.lang.String) r7
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r7 = r1.from(r0, r7)
            goto L63
        L62:
            r7 = 0
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel.K0(zz.a):java.lang.Object");
    }

    private final void N0() {
        BuildersKt__Builders_commonKt.launch$default(this, this.f31262l0, null, new ExpireSoonOptionsViewModel$loadListingDetails$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(ViewStates viewStates) {
        int i11 = a.f31273a[viewStates.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3 || i11 == 4) {
                A0(false);
                return;
            }
            return;
        }
        A0(true);
    }

    public final OneShotEventHandler<ListingDetailsEntity> D0() {
        return this.f31267q0;
    }

    public final OneShotEventHandler<p> E0() {
        return this.f31269s0;
    }

    public final OneShotEventHandler<p> G0() {
        return this.f31270t0;
    }

    public final LiveData<Boolean> H0() {
        return this.f31264n0;
    }

    public final LiveData<Boolean> I0() {
        return this.f31266p0;
    }

    public final OneShotEventHandler<ListingDetailsEntity> L0() {
        return this.f31268r0;
    }

    public final LiveData<Boolean> M0() {
        return this.f31272v0;
    }

    public final void O0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ExpireSoonOptionsViewModel$onBoostClick$1(this, null), 3, null);
    }

    public final void P0() {
        OneShotEventHandler.d(this.f31269s0, null, 1, null);
    }

    public final void Q0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ExpireSoonOptionsViewModel$onRepostClick$1(this, null), 3, null);
    }

    public final void R0(boolean z11) {
        B0(!z11);
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getIO().plus(this.f31262l0);
    }

    public final void z0() {
        OneShotEventHandler.d(this.f31270t0, null, 1, null);
    }
}
