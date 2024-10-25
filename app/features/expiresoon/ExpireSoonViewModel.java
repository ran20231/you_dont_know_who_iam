package com.forsale.app.features.expiresoon;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.responses.AboutToExpireListing;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.SessionRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.c0;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import t9.y0;
import wz.p;
/* compiled from: ExpireSoonViewModel.kt */
/* loaded from: classes2.dex */
public final class ExpireSoonViewModel extends BaseViewModel {
    private final LiveData<p> A0;
    private final b0<Boolean> B0;
    private final LiveData<Boolean> C0;
    private final b0<String> D0;
    private final LiveData<String> E0;
    private final b0<Boolean> F0;
    private final LiveData<Boolean> G0;
    private final b0<String> H0;
    private final LiveData<String> I0;
    private final b0<Boolean> J0;
    private final LiveData<Boolean> K0;
    private final b0<String> L0;
    private final LiveData<String> M0;
    private final b0<Boolean> N0;
    private final LiveData<Boolean> O0;
    private final b0<String> P0;
    private final LiveData<String> Q0;
    private final b0<String> R0;
    private final LiveData<String> S0;
    private final b0<String> T0;
    private final LiveData<String> U0;
    private final b0<Boolean> V0;
    private final LiveData<Boolean> W0;
    private final OneShotEventHandler<p> X0;

    /* renamed from: k0  reason: collision with root package name */
    private final AboutToExpireListing f31296k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ApplicationResourcesRepository f31297l0;

    /* renamed from: m0  reason: collision with root package name */
    private final SessionRepository f31298m0;

    /* renamed from: n0  reason: collision with root package name */
    private final UserProfileInteractor f31299n0;

    /* renamed from: o0  reason: collision with root package name */
    private final CoroutineContext f31300o0;

    /* renamed from: p0  reason: collision with root package name */
    private final b0<String> f31301p0;

    /* renamed from: q0  reason: collision with root package name */
    private final LiveData<String> f31302q0;

    /* renamed from: r0  reason: collision with root package name */
    private final b0<String> f31303r0;

    /* renamed from: s0  reason: collision with root package name */
    private final LiveData<String> f31304s0;

    /* renamed from: t0  reason: collision with root package name */
    private final b0<String> f31305t0;

    /* renamed from: u0  reason: collision with root package name */
    private final LiveData<String> f31306u0;

    /* renamed from: v0  reason: collision with root package name */
    private final b0<String> f31307v0;

    /* renamed from: w0  reason: collision with root package name */
    private final LiveData<String> f31308w0;

    /* renamed from: x0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31309x0;

    /* renamed from: y0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31310y0;

    /* renamed from: z0  reason: collision with root package name */
    private final c0 f31311z0;

    /* compiled from: ExpireSoonViewModel.kt */
    @d(c = "com.forsale.app.features.expiresoon.ExpireSoonViewModel$1", f = "ExpireSoonViewModel.kt", l = {92, 98}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.expiresoon.ExpireSoonViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31312a;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            String firstName;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f31312a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        f.b(obj);
                        ExpireSoonViewModel.this.f31307v0.postValue((String) obj);
                        return p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            } else {
                f.b(obj);
                UserProfileInteractor userProfileInteractor = ExpireSoonViewModel.this.f31299n0;
                CoroutineScope a11 = r0.a(ExpireSoonViewModel.this);
                this.f31312a = 1;
                obj = UserProfileInteractor.o(userProfileInteractor, a11, false, this, 2, null);
                if (obj == f11) {
                    return f11;
                }
            }
            UserEntity userEntity = (UserEntity) obj;
            if (userEntity != null && (firstName = userEntity.getFirstName()) != null) {
                ExpireSoonViewModel expireSoonViewModel = ExpireSoonViewModel.this;
                expireSoonViewModel.f31301p0.postValue(expireSoonViewModel.f31297l0.getString(y0.V3, firstName));
            }
            if (ExpireSoonViewModel.this.L0().getPrice() != 0) {
                ExpireSoonViewModel.this.f31305t0.postValue(TypeExtensionsKt.j0(ExpireSoonViewModel.this.L0().getPrice()));
                RegionsRepository I = ExpireSoonViewModel.this.I();
                Integer d11 = kotlin.coroutines.jvm.internal.a.d(ExpireSoonViewModel.this.L0().getRegId());
                this.f31312a = 2;
                obj = I.getRegionCode(d11, this);
                if (obj == f11) {
                    return f11;
                }
                ExpireSoonViewModel.this.f31307v0.postValue((String) obj);
                return p.f75480a;
            }
            String string = ExpireSoonViewModel.this.f31297l0.getString(y0.U8, new Object[0]);
            ExpireSoonViewModel expireSoonViewModel2 = ExpireSoonViewModel.this;
            expireSoonViewModel2.f31305t0.postValue(string);
            expireSoonViewModel2.f31307v0.postValue("");
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: ExpireSoonViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        ExpireSoonViewModel a(AboutToExpireListing aboutToExpireListing);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String message = th2.getMessage();
            x10.a.b("ExpireSoonViewModel:" + message, new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonViewModel(AboutToExpireListing item, ApplicationResourcesRepository resourcesRepository, SessionRepository sessionRepository, UserProfileInteractor userProfileInteractor, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(item, "item");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(sessionRepository, "sessionRepository");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(baseRepository, "baseRepository");
        this.f31296k0 = item;
        this.f31297l0 = resourcesRepository;
        this.f31298m0 = sessionRepository;
        this.f31299n0 = userProfileInteractor;
        CoroutineContext plus = Dispatchers.getIO().plus(new b(CoroutineExceptionHandler.Key));
        this.f31300o0 = plus;
        b0<String> b0Var = new b0<>();
        this.f31301p0 = b0Var;
        this.f31302q0 = b0Var;
        b0<String> b0Var2 = new b0<>();
        this.f31303r0 = b0Var2;
        this.f31304s0 = b0Var2;
        b0<String> b0Var3 = new b0<>();
        this.f31305t0 = b0Var3;
        this.f31306u0 = b0Var3;
        b0<String> b0Var4 = new b0<>();
        this.f31307v0 = b0Var4;
        this.f31308w0 = b0Var4;
        this.f31309x0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31310y0 = new OneShotEventHandler<>(null, 0, 3, null);
        c0 timer = v().getTimer();
        this.f31311z0 = timer;
        Long value = timer.getValue();
        if (value != null) {
            o.f(value);
            com.forsale.app.features.categories.listingdetails.a C0 = TypeExtensionsKt.C0(value.longValue());
            if (C0 != null) {
                X0(C0);
            }
        }
        d1();
        this.A0 = new b0(p.f75480a);
        b0<Boolean> b0Var5 = new b0<>();
        this.B0 = b0Var5;
        this.C0 = b0Var5;
        b0<String> b0Var6 = new b0<>();
        this.D0 = b0Var6;
        this.E0 = b0Var6;
        b0<Boolean> b0Var7 = new b0<>();
        this.F0 = b0Var7;
        this.G0 = b0Var7;
        b0<String> b0Var8 = new b0<>();
        this.H0 = b0Var8;
        this.I0 = b0Var8;
        b0<Boolean> b0Var9 = new b0<>();
        this.J0 = b0Var9;
        this.K0 = b0Var9;
        b0<String> b0Var10 = new b0<>();
        this.L0 = b0Var10;
        this.M0 = b0Var10;
        b0<Boolean> b0Var11 = new b0<>();
        this.N0 = b0Var11;
        this.O0 = b0Var11;
        b0<String> b0Var12 = new b0<>();
        this.P0 = b0Var12;
        this.Q0 = b0Var12;
        b0<String> b0Var13 = new b0<>();
        this.R0 = b0Var13;
        this.S0 = b0Var13;
        b0<String> b0Var14 = new b0<>();
        this.T0 = b0Var14;
        this.U0 = b0Var14;
        b0<Boolean> b0Var15 = new b0<>();
        this.V0 = b0Var15;
        this.W0 = b0Var15;
        this.X0 = new OneShotEventHandler<>(null, 0, 3, null);
        BuildersKt__Builders_commonKt.launch$default(this, plus, null, new AnonymousClass1(null), 2, null);
    }

    private final void W0(boolean z11) {
        v().setActiveItemStatus(z11);
    }

    private final void X0(com.forsale.app.features.categories.listingdetails.a aVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        int a11 = aVar.a();
        b0<Boolean> b0Var = this.B0;
        boolean z14 = true;
        if (b0Var != null) {
            if (a11 > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            b0Var.postValue(Boolean.valueOf(z13));
        }
        b0<String> b0Var2 = this.D0;
        if (b0Var2 != null) {
            b0Var2.postValue(String.valueOf(a11));
        }
        int b11 = aVar.b();
        b0<Boolean> b0Var3 = this.F0;
        if (b0Var3 != null) {
            if (aVar.a() <= 0 && b11 <= 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            b0Var3.postValue(Boolean.valueOf(z12));
        }
        b0<String> b0Var4 = this.H0;
        if (b0Var4 != null) {
            b0Var4.postValue(String.valueOf(b11));
        }
        int c11 = aVar.c();
        b0<Boolean> b0Var5 = this.J0;
        if (b0Var5 != null) {
            if (aVar.a() <= 0 && aVar.b() <= 0 && c11 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            b0Var5.postValue(Boolean.valueOf(z11));
        }
        b0<String> b0Var6 = this.L0;
        if (b0Var6 != null) {
            b0Var6.postValue(String.valueOf(c11));
        }
        int e11 = aVar.e();
        b0<Boolean> b0Var7 = this.N0;
        if (b0Var7 != null) {
            if (aVar.a() <= 0 && aVar.b() <= 0 && aVar.c() <= 0 && e11 <= 0) {
                z14 = false;
            }
            b0Var7.postValue(Boolean.valueOf(z14));
        }
        b0<String> b0Var8 = this.P0;
        if (b0Var8 != null) {
            b0Var8.postValue(String.valueOf(e11));
        }
    }

    private final void d1() {
        if (this.f31311z0.e()) {
            b0<String> b0Var = this.R0;
            if (b0Var != null) {
                b0Var.postValue(this.f31297l0.getString(y0.Y3, new Object[0]));
            }
            b0<String> b0Var2 = this.T0;
            if (b0Var2 != null) {
                b0Var2.postValue(this.f31297l0.getString(y0.X3, new Object[0]));
            }
            b0<Boolean> b0Var3 = this.V0;
            if (b0Var3 != null) {
                b0Var3.postValue(Boolean.TRUE);
                return;
            }
            return;
        }
        b0<String> b0Var4 = this.T0;
        if (b0Var4 != null) {
            b0Var4.postValue(this.f31297l0.getString(y0.W3, new Object[0]));
        }
        b0<Boolean> b0Var5 = this.V0;
        if (b0Var5 != null) {
            b0Var5.postValue(Boolean.FALSE);
        }
    }

    public final void A0() {
        OneShotEventHandler.d(this.X0, null, 1, null);
    }

    public final LiveData<String> B0() {
        return this.E0;
    }

    public final LiveData<String> C0() {
        return this.S0;
    }

    public final LiveData<String> D0() {
        return this.I0;
    }

    public final LiveData<String> E0() {
        return this.U0;
    }

    public final LiveData<String> G0() {
        return this.M0;
    }

    public final LiveData<String> H0() {
        return this.Q0;
    }

    public final LiveData<String> I0() {
        return this.f31308w0;
    }

    public final OneShotEventHandler<p> J0() {
        return this.X0;
    }

    public final LiveData<p> K0() {
        return this.A0;
    }

    public final AboutToExpireListing L0() {
        return this.f31296k0;
    }

    public final OneShotEventHandler<p> M0() {
        return this.f31310y0;
    }

    public final LiveData<String> N0() {
        return this.f31302q0;
    }

    public final LiveData<String> O0() {
        return this.f31306u0;
    }

    public final LiveData<Boolean> P0() {
        return this.C0;
    }

    public final LiveData<Boolean> Q0() {
        return this.G0;
    }

    public final LiveData<Boolean> R0() {
        return this.K0;
    }

    public final LiveData<Boolean> S0() {
        return this.O0;
    }

    public final OneShotEventHandler<p> T0() {
        return this.f31309x0;
    }

    public final LiveData<Boolean> U0() {
        return this.W0;
    }

    public final void V0() {
        this.f31310y0.i(p.f75480a);
    }

    public final void Y0() {
        W0(true);
    }

    public final void Z0() {
        W0(false);
    }

    public final void b1() {
        v().setATEListingViewed(this.f31296k0.getId());
    }

    public final void c1() {
        this.f31309x0.i(p.f75480a);
    }
}
