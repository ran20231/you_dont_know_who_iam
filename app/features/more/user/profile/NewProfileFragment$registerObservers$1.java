package com.forsale.app.features.more.user.profile;

import android.content.Context;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.auth.models.AuthIntention;
import com.forsale.app.features.more.WebType;
import com.forsale.app.features.more.forsaleweb.ForSaleWebActivity;
import com.forsale.app.features.more.support.SupportActivity;
import com.forsale.app.ui.QRScannerActivity;
import com.forsale.app.utils.FragmentsExtensionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileFragment$registerObservers$1", f = "NewProfileFragment.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileFragment$registerObservers$1 extends SuspendLambda implements g00.l<zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33534a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewProfileFragment f33535b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewProfileFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileFragment$registerObservers$1$1", f = "NewProfileFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.user.profile.NewProfileFragment$registerObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<e0, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33536a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f33537b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NewProfileFragment f33538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewProfileFragment newProfileFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f33538c = newProfileFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(e0 e0Var, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(e0Var, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f33538c, aVar);
            anonymousClass1.f33537b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f33536a == 0) {
                kotlin.f.b(obj);
                e0 e0Var = (e0) this.f33537b;
                if (e0Var instanceof p) {
                    this.f33538c.Y(AuthIntention.SignIn);
                } else if (e0Var instanceof q) {
                    this.f33538c.Y(AuthIntention.SignUp);
                } else if (e0Var instanceof m) {
                    this.f33538c.d0();
                } else if (e0Var instanceof o) {
                    this.f33538c.m0();
                } else if (e0Var instanceof n) {
                    this.f33538c.l0();
                } else if (e0Var instanceof k) {
                    this.f33538c.a0();
                } else if (e0Var instanceof l) {
                    this.f33538c.f0();
                } else if (e0Var instanceof a0) {
                    final NewProfileFragment newProfileFragment = this.f33538c;
                    newProfileFragment.Q(SignInIntention.MY_LISTINGS_FROM_PROFILE, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment.registerObservers.1.1.1
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            NewProfileFragment.this.k0();
                        }
                    });
                } else if (e0Var instanceof x) {
                    this.f33538c.h0(((x) e0Var).a());
                } else if (e0Var instanceof b0) {
                    this.f33538c.o0();
                } else if (e0Var instanceof c0) {
                    this.f33538c.p0();
                } else if (e0Var instanceof y) {
                    this.f33538c.i0();
                } else if (e0Var instanceof z) {
                    this.f33538c.j0();
                } else if (e0Var instanceof d0) {
                    this.f33538c.r0();
                } else if (e0Var instanceof r) {
                    androidx.fragment.app.p activity = this.f33538c.getActivity();
                    if (activity != null) {
                        activity.recreate();
                    }
                } else if (e0Var instanceof s) {
                    QRScannerActivity.f37827g.b(this.f33538c, 1000);
                } else if (e0Var instanceof t) {
                    Context context = this.f33538c.getContext();
                    if (context != null) {
                        ForSaleWebActivity.B.a(context, ((t) e0Var).a());
                    }
                } else if (e0Var instanceof h) {
                    FragmentsExtensionsKt.a(this.f33538c, b.f33670a.a());
                } else if (e0Var instanceof i) {
                    Context context2 = this.f33538c.getContext();
                    if (context2 != null) {
                        SupportActivity.f32788x.a(context2);
                    }
                } else if (e0Var instanceof j) {
                    NewProfileFragment newProfileFragment2 = this.f33538c;
                    WebType webType = WebType.TERMS_CONDITIONS;
                    String string = newProfileFragment2.getString(y0.f70455fa);
                    kotlin.jvm.internal.o.h(string, "getString(...)");
                    NewProfileFragment.c0(newProfileFragment2, webType, string, null, 4, null);
                } else if (e0Var instanceof g) {
                    NewProfileFragment newProfileFragment3 = this.f33538c;
                    WebType webType2 = WebType.ABOUT;
                    String string2 = newProfileFragment3.getString(y0.W9);
                    kotlin.jvm.internal.o.h(string2, "getString(...)");
                    NewProfileFragment.c0(newProfileFragment3, webType2, string2, null, 4, null);
                } else if (e0Var instanceof u) {
                    this.f33538c.e0(((u) e0Var).a());
                } else if (e0Var instanceof w) {
                    this.f33538c.q0(((w) e0Var).a());
                } else if (e0Var instanceof v) {
                    this.f33538c.g0(((v) e0Var).a());
                }
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileFragment$registerObservers$1(NewProfileFragment newProfileFragment, zz.a<? super NewProfileFragment$registerObservers$1> aVar) {
        super(1, aVar);
        this.f33535b = newProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(zz.a<?> aVar) {
        return new NewProfileFragment$registerObservers$1(this.f33535b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33534a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<e0> A = this.f33535b.T().A();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f33535b, null);
            this.f33534a = 1;
            if (FlowKt.collectLatest(A, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super wz.p> aVar) {
        return ((NewProfileFragment$registerObservers$1) create(aVar)).invokeSuspend(wz.p.f75480a);
    }
}
