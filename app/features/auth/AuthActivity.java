package com.forsale.app.features.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.l;
import androidx.lifecycle.q0;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.x0;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.auth.models.AuthIntention;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import com.forsale.designSystem.theme.ThemeKt;
import g00.p;
import j0.d1;
import j0.s0;
import j0.t0;
import j0.u;
import j0.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import w3.a;
/* compiled from: AuthActivity.kt */
/* loaded from: classes2.dex */
public final class AuthActivity extends g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f22470e = new a(null);

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent c(a aVar, Context context, AuthIntention authIntention, AuthenticationSourcePage authenticationSourcePage, SignInIntention signInIntention, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                signInIntention = SignInIntention.DEFAULT;
            }
            return aVar.b(context, authIntention, authenticationSourcePage, signInIntention);
        }

        public final void a(Context context, AuthIntention intention, AuthenticationSourcePage authenticationSourcePage) {
            o.i(context, "<this>");
            o.i(intention, "intention");
            o.i(authenticationSourcePage, "authenticationSourcePage");
            Intent intent = new Intent(context, AuthActivity.class);
            intent.putExtra("INTENTION", intention);
            intent.putExtra("authenticationSourcePage", authenticationSourcePage);
            context.startActivity(intent);
        }

        public final Intent b(Context context, AuthIntention intention, AuthenticationSourcePage authenticationSourcePage, SignInIntention signInIntention) {
            o.i(context, "<this>");
            o.i(intention, "intention");
            o.i(authenticationSourcePage, "authenticationSourcePage");
            Intent intent = new Intent(context, AuthActivity.class);
            intent.putExtra("INTENTION", intention);
            intent.putExtra("authenticationSourcePage", authenticationSourcePage);
            intent.putExtra("SIGN_IN_INTENTION", signInIntention);
            return intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(androidx.compose.runtime.a aVar, final int i11) {
        w3.a aVar2;
        LayoutDirection layoutDirection;
        androidx.compose.runtime.a h11 = aVar.h(-631584234);
        if ((i11 & 1) == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-631584234, i11, -1, "com.forsale.app.features.auth.AuthActivity.ScreenContent (AuthActivity.kt:38)");
            }
            final Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
            u.d("", new AuthActivity$ScreenContent$1(context, null), h11, 70);
            x0 a11 = LocalViewModelStoreOwner.f12907a.a(h11, LocalViewModelStoreOwner.f12909c);
            if (a11 != null) {
                h11.C(1729797275);
                if (a11 instanceof l) {
                    aVar2 = ((l) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C0905a.f75031b;
                }
                q0 b11 = x3.a.b(AuthViewModel.class, a11, null, null, aVar2, h11, 36936, 0);
                h11.S();
                final AuthViewModel authViewModel = (AuthViewModel) b11;
                s0<LayoutDirection> j11 = CompositionLocalsKt.j();
                if (Languages.Companion.b() == Languages.ARABIC) {
                    layoutDirection = LayoutDirection.Rtl;
                } else {
                    layoutDirection = LayoutDirection.Ltr;
                }
                CompositionLocalKt.a(j11.c(layoutDirection), r0.b.b(h11, 212729558, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.auth.AuthActivity$ScreenContent$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i12) {
                        if ((i12 & 11) == 2 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(212729558, i12, -1, "com.forsale.app.features.auth.AuthActivity.ScreenContent.<anonymous> (AuthActivity.kt:52)");
                        }
                        Context context2 = context;
                        o.g(context2, "null cannot be cast to non-null type com.forsale.app.features.auth.AuthActivity");
                        AuthScaffoldKt.c(authViewModel, (AuthActivity) context2, aVar3, 8);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return wz.p.f75480a;
                    }
                }), h11, t0.f59917d | 0 | 48);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.auth.AuthActivity$ScreenContent$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    AuthActivity.this.m0(aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.auth.g, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.b.b(this, null, r0.b.c(1341979641, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.auth.AuthActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1341979641, i11, -1, "com.forsale.app.features.auth.AuthActivity.onCreate.<anonymous> (AuthActivity.kt:31)");
                }
                final AuthActivity authActivity = AuthActivity.this;
                ThemeKt.a(null, null, r0.b.b(aVar, -143044670, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.auth.AuthActivity$onCreate$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-143044670, i12, -1, "com.forsale.app.features.auth.AuthActivity.onCreate.<anonymous>.<anonymous> (AuthActivity.kt:32)");
                        }
                        AuthActivity.this.m0(aVar2, 0);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }), 1, null);
    }
}
