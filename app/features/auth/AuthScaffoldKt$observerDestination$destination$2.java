package com.forsale.app.features.auth;

import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.forsale.app.features.auth.AuthScaffoldKt;
import com.forsale.app.features.auth.models.AuthScreen;
import g00.p;
import g00.q;
import j0.r0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
/* compiled from: AuthScaffold.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.auth.AuthScaffoldKt$observerDestination$destination$2", f = "AuthScaffold.kt", l = {335}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthScaffoldKt$observerDestination$destination$2 extends SuspendLambda implements p<r0<AuthScreen>, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22571a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f22572b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NavController f22573c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthScaffoldKt$observerDestination$destination$2(NavController navController, zz.a<? super AuthScaffoldKt$observerDestination$destination$2> aVar) {
        super(2, aVar);
        this.f22573c = navController;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(r0<AuthScreen> r0Var, zz.a<? super wz.p> aVar) {
        return ((AuthScaffoldKt$observerDestination$destination$2) create(r0Var, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        AuthScaffoldKt$observerDestination$destination$2 authScaffoldKt$observerDestination$destination$2 = new AuthScaffoldKt$observerDestination$destination$2(this.f22573c, aVar);
        authScaffoldKt$observerDestination$destination$2.f22572b = obj;
        return authScaffoldKt$observerDestination$destination$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22571a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            final r0 r0Var = (r0) this.f22572b;
            final q<NavController, NavDestination, Bundle, wz.p> qVar = new q<NavController, NavDestination, Bundle, wz.p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$observerDestination$destination$2$listener$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(NavController navController, NavDestination navDestination, Bundle bundle) {
                    AuthScreen authScreen;
                    String v11;
                    o.i(navController, "<anonymous parameter 0>");
                    r0<AuthScreen> r0Var2 = r0Var;
                    if (navDestination != null && (v11 = navDestination.v()) != null) {
                        authScreen = AuthScreen.b.f22810c.b(v11);
                    } else {
                        authScreen = null;
                    }
                    r0Var2.setValue(authScreen);
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(NavController navController, NavDestination navDestination, Bundle bundle) {
                    b(navController, navDestination, bundle);
                    return wz.p.f75480a;
                }
            };
            this.f22573c.r(new AuthScaffoldKt.a(qVar));
            final NavController navController = this.f22573c;
            g00.a<wz.p> aVar = new g00.a<wz.p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$observerDestination$destination$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    NavController.this.t0(new AuthScaffoldKt.a(qVar));
                }
            };
            this.f22571a = 1;
            if (r0Var.i(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }
}
