package com.forsale.app.features.auth;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.auth.models.AuthIntention;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import kotlin.jvm.internal.o;
import n00.k;
import t9.l0;
import wz.p;
/* compiled from: AuthenticationDelegationImp.kt */
/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.appcompat.app.d f22620a;

    /* renamed from: b  reason: collision with root package name */
    private g00.a<p> f22621b;

    /* renamed from: c  reason: collision with root package name */
    private g00.a<p> f22622c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f22623d;

    /* compiled from: AuthenticationDelegationImp.kt */
    /* loaded from: classes2.dex */
    static final class a implements androidx.activity.result.a<ActivityResult> {
        a() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public final void a(ActivityResult activityResult) {
            g00.a<p> b11;
            g00.a<p> c11;
            if (activityResult.b() == -1 && (c11 = f.this.c()) != null) {
                c11.invoke();
            }
            if (activityResult.b() == 0 && (b11 = f.this.b()) != null) {
                b11.invoke();
            }
        }
    }

    public f(androidx.appcompat.app.d appCompatActivity) {
        o.i(appCompatActivity, "appCompatActivity");
        this.f22620a = appCompatActivity;
        androidx.activity.result.b<Intent> registerForActivityResult = appCompatActivity.registerForActivityResult(new e.d(), new a());
        o.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f22623d = registerForActivityResult;
    }

    @Override // com.forsale.app.features.auth.e
    public void a(AuthenticationSourcePage page, SignInIntention signInIntention, g00.a<p> aVar, g00.a<p> aVar2) {
        o.i(page, "page");
        this.f22621b = aVar2;
        this.f22622c = aVar;
        androidx.core.app.f a11 = androidx.core.app.f.a(this.f22620a.getApplicationContext(), l0.f69320d, l0.f69317a);
        o.h(a11, "makeCustomAnimation(...)");
        this.f22623d.b(AuthActivity.f22470e.b(this.f22620a, AuthIntention.SignIn, page, signInIntention), a11);
    }

    public final g00.a<p> b() {
        return this.f22622c;
    }

    public final g00.a<p> c() {
        return this.f22621b;
    }

    public final e d(Object obj, k<?> property) {
        o.i(property, "property");
        return this;
    }
}
