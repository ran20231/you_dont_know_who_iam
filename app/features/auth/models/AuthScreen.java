package com.forsale.app.features.auth.models;

import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.auth.verification.VerificationScreenIntention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.s;
/* compiled from: AuthScreen.kt */
/* loaded from: classes2.dex */
public abstract class AuthScreen {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22808b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f22809a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthScreen.kt */
    /* loaded from: classes2.dex */
    public static final class AuthRoute {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AuthRoute[] $VALUES;
        private final String value;
        public static final AuthRoute SIGN_UP = new AuthRoute("SIGN_UP", 0, "SignUp/{PHONE_PREFIX_ARG}/");
        public static final AuthRoute VERIFY = new AuthRoute("VERIFY", 1, "Verify/{VERIFY_INTENTION}/");
        public static final AuthRoute SIGN_IN = new AuthRoute("SIGN_IN", 2, "SignIn/{SIGN_IN_INTENTION}/{PHONE_PREFIX_ARG}/");
        public static final AuthRoute VERIFY_PHONE_NUMBER = new AuthRoute("VERIFY_PHONE_NUMBER", 3, "VerifyPhoneNumber/{PHONE_PREFIX_ARG}/");
        public static final AuthRoute RESET_PASSWORD = new AuthRoute("RESET_PASSWORD", 4, "RESET_PASSWORD_DESTINATION/{OTP_ARG}");

        private static final /* synthetic */ AuthRoute[] $values() {
            return new AuthRoute[]{SIGN_UP, VERIFY, SIGN_IN, VERIFY_PHONE_NUMBER, RESET_PASSWORD};
        }

        static {
            AuthRoute[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AuthRoute(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<AuthRoute> getEntries() {
            return $ENTRIES;
        }

        public static AuthRoute valueOf(String str) {
            return (AuthRoute) Enum.valueOf(AuthRoute.class, str);
        }

        public static AuthRoute[] values() {
            return (AuthRoute[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: AuthScreen.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String otp) {
            o.i(otp, "otp");
            return "RESET_PASSWORD_DESTINATION/" + otp;
        }

        public final String b(String prefix, SignInIntention intention) {
            String C;
            String C2;
            o.i(prefix, "prefix");
            o.i(intention, "intention");
            C = s.C(c.f22811c.a(), "{SIGN_IN_INTENTION}", intention.getIntention(), false, 4, null);
            C2 = s.C(C, "{PHONE_PREFIX_ARG}", prefix, false, 4, null);
            return C2;
        }

        public final String c(String prefix) {
            String C;
            o.i(prefix, "prefix");
            C = s.C(d.f22812c.a(), "{PHONE_PREFIX_ARG}", prefix, false, 4, null);
            return C;
        }

        public final String d(VerificationScreenIntention intention) {
            String C;
            o.i(intention, "intention");
            C = s.C(e.f22813c.a(), "{VERIFY_INTENTION}", String.valueOf(intention.getValue()), false, 4, null);
            return C;
        }

        public final String e(String prefix) {
            String C;
            o.i(prefix, "prefix");
            C = s.C(f.f22814c.a(), "{PHONE_PREFIX_ARG}", prefix, false, 4, null);
            return C;
        }
    }

    /* compiled from: AuthScreen.kt */
    /* loaded from: classes2.dex */
    public static final class b extends AuthScreen {

        /* renamed from: c  reason: collision with root package name */
        public static final b f22810c = new b();

        private b() {
            super(AuthRoute.RESET_PASSWORD.getValue(), null);
        }
    }

    /* compiled from: AuthScreen.kt */
    /* loaded from: classes2.dex */
    public static final class c extends AuthScreen {

        /* renamed from: c  reason: collision with root package name */
        public static final c f22811c = new c();

        private c() {
            super(AuthRoute.SIGN_IN.getValue(), null);
        }
    }

    /* compiled from: AuthScreen.kt */
    /* loaded from: classes2.dex */
    public static final class d extends AuthScreen {

        /* renamed from: c  reason: collision with root package name */
        public static final d f22812c = new d();

        private d() {
            super(AuthRoute.SIGN_UP.getValue(), null);
        }
    }

    /* compiled from: AuthScreen.kt */
    /* loaded from: classes2.dex */
    public static final class e extends AuthScreen {

        /* renamed from: c  reason: collision with root package name */
        public static final e f22813c = new e();

        private e() {
            super(AuthRoute.VERIFY.getValue(), null);
        }
    }

    /* compiled from: AuthScreen.kt */
    /* loaded from: classes2.dex */
    public static final class f extends AuthScreen {

        /* renamed from: c  reason: collision with root package name */
        public static final f f22814c = new f();

        private f() {
            super(AuthRoute.VERIFY_PHONE_NUMBER.getValue(), null);
        }
    }

    public /* synthetic */ AuthScreen(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f22809a;
    }

    public final AuthScreen b(String str) {
        o.i(str, "<this>");
        if (o.d(str, AuthRoute.SIGN_UP.getValue())) {
            return d.f22812c;
        }
        if (o.d(str, AuthRoute.SIGN_IN.getValue())) {
            return c.f22811c;
        }
        if (o.d(str, AuthRoute.VERIFY.getValue())) {
            return e.f22813c;
        }
        if (o.d(str, AuthRoute.VERIFY_PHONE_NUMBER.getValue())) {
            return f.f22814c;
        }
        if (o.d(str, AuthRoute.RESET_PASSWORD.getValue())) {
            return b.f22810c;
        }
        return c.f22811c;
    }

    private AuthScreen(String str) {
        this.f22809a = str;
    }
}
