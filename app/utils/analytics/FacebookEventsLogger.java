package com.forsale.app.utils.analytics;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.b0;
import com.facebook.appevents.AppEventsLogger;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: FacebookEventsLogger.kt */
/* loaded from: classes3.dex */
public final class FacebookEventsLogger implements CoroutineScope {

    /* renamed from: g  reason: collision with root package name */
    public static final a f39974g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f39975h = 8;

    /* renamed from: a  reason: collision with root package name */
    private final jj.b f39976a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f39977b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<String> f39978c;

    /* renamed from: d  reason: collision with root package name */
    private final b0<String> f39979d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f39980e;

    /* renamed from: f  reason: collision with root package name */
    private final wz.h f39981f;

    /* compiled from: FacebookEventsLogger.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.FacebookEventsLogger$1", f = "FacebookEventsLogger.kt", l = {45, 46}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.utils.analytics.FacebookEventsLogger$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f39982a;

        /* renamed from: b  reason: collision with root package name */
        int f39983b;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.b0] */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.b0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            b0<String> e11;
            b0<String> b0Var;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f39983b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        b0Var = (b0) this.f39982a;
                        kotlin.f.b(obj);
                        b0Var.postValue(obj);
                        return wz.p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e11 = (b0) this.f39982a;
                kotlin.f.b(obj);
            } else {
                kotlin.f.b(obj);
                e11 = FacebookEventsLogger.this.e();
                FacebookEventsLogger facebookEventsLogger = FacebookEventsLogger.this;
                this.f39982a = e11;
                this.f39983b = 1;
                obj = facebookEventsLogger.h(this);
                if (obj == f11) {
                    return f11;
                }
            }
            e11.postValue(obj);
            b0<String> d11 = FacebookEventsLogger.this.d();
            FacebookEventsLogger facebookEventsLogger2 = FacebookEventsLogger.this;
            this.f39982a = d11;
            this.f39983b = 2;
            Object g11 = facebookEventsLogger2.g(this);
            if (g11 == f11) {
                return f11;
            }
            b0Var = d11;
            obj = g11;
            b0Var.postValue(obj);
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FacebookEventsLogger.kt */
    /* loaded from: classes3.dex */
    private static final class CustomEventName {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CustomEventName[] $VALUES;
        private final String value;
        public static final CustomEventName PURCHASED_INCOMPLETE = new CustomEventName("PURCHASED_INCOMPLETE", 0, "Purchased Incomplete");
        public static final CustomEventName PURCHASED_FAILED = new CustomEventName("PURCHASED_FAILED", 1, "Purchased Failed");
        public static final CustomEventName LEAD = new CustomEventName("LEAD", 2, "Lead");

        private static final /* synthetic */ CustomEventName[] $values() {
            return new CustomEventName[]{PURCHASED_INCOMPLETE, PURCHASED_FAILED, LEAD};
        }

        static {
            CustomEventName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CustomEventName(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<CustomEventName> getEntries() {
            return $ENTRIES;
        }

        public static CustomEventName valueOf(String str) {
            return (CustomEventName) Enum.valueOf(CustomEventName.class, str);
        }

        public static CustomEventName[] values() {
            return (CustomEventName[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FacebookEventsLogger.kt */
    /* loaded from: classes3.dex */
    private static final class CustomParameterName {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CustomParameterName[] $VALUES;
        private final String value;
        public static final CustomParameterName COUNTRY = new CustomParameterName("COUNTRY", 0, "Country");
        public static final CustomParameterName CATEGORY_NAME = new CustomParameterName("CATEGORY_NAME", 1, "CategoryName");
        public static final CustomParameterName IS_MOTOR = new CustomParameterName("IS_MOTOR", 2, "IsMotor");
        public static final CustomParameterName HAS_ADDONS = new CustomParameterName("HAS_ADDONS", 3, "HasAddons");
        public static final CustomParameterName IS_ADVANCED = new CustomParameterName("IS_ADVANCED", 4, "IsAdvanced");

        private static final /* synthetic */ CustomParameterName[] $values() {
            return new CustomParameterName[]{COUNTRY, CATEGORY_NAME, IS_MOTOR, HAS_ADDONS, IS_ADVANCED};
        }

        static {
            CustomParameterName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CustomParameterName(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<CustomParameterName> getEntries() {
            return $ENTRIES;
        }

        public static CustomParameterName valueOf(String str) {
            return (CustomParameterName) Enum.valueOf(CustomParameterName.class, str);
        }

        public static CustomParameterName[] values() {
            return (CustomParameterName[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b(th2.getMessage(), new Object[0]);
        }
    }

    public FacebookEventsLogger(final Context applicationContext, jj.b pref) {
        wz.h a11;
        o.i(applicationContext, "applicationContext");
        o.i(pref, "pref");
        this.f39976a = pref;
        this.f39977b = new b(CoroutineExceptionHandler.Key);
        this.f39978c = new b0<>();
        this.f39979d = new b0<>();
        this.f39980e = j();
        if (applicationContext instanceof Application) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
            a11 = kotlin.d.a(new g00.a<AppEventsLogger>() { // from class: com.forsale.app.utils.analytics.FacebookEventsLogger$logger$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                /* renamed from: b */
                public final AppEventsLogger invoke() {
                    return AppEventsLogger.l(applicationContext.getApplicationContext());
                }
            });
            this.f39981f = a11;
            return;
        }
        throw new IllegalArgumentException("You must pass Application context.");
    }

    private final AppEventsLogger f() {
        return (AppEventsLogger) this.f39981f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(zz.a<? super String> aVar) {
        return this.f39976a.i().a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(zz.a<? super String> aVar) {
        return this.f39976a.i().d(aVar);
    }

    private final boolean j() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new FacebookEventsLogger$isFaceBookAnalyticsEnabled$1(this, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    public final b0<String> d() {
        return this.f39979d;
    }

    public final b0<String> e() {
        return this.f39978c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f39977b;
    }

    public final void k(KnetPaymentType paymentType, double d11, boolean z11) {
        o.i(paymentType, "paymentType");
        if (!this.f39980e) {
            return;
        }
        f().i("fb_mobile_add_to_cart", d11, androidx.core.os.f.b(wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39978c.getValue()), wz.i.a("fb_content_type", paymentType.getValue()), wz.i.a("fb_currency", this.f39979d.getValue()), wz.i.a(CustomParameterName.HAS_ADDONS.getValue(), Integer.valueOf(TypeExtensionsKt.H0(z11)))));
    }

    public final void l(String categoryName) {
        o.i(categoryName, "categoryName");
        if (!this.f39980e) {
            return;
        }
        f().j("fb_mobile_add_to_wishlist", androidx.core.os.f.b(wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39978c.getValue()), wz.i.a(CustomParameterName.CATEGORY_NAME.getValue(), categoryName)));
    }

    public final void m(boolean z11, KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        if (!this.f39980e) {
            return;
        }
        f().j(CustomEventName.LEAD.getValue(), androidx.core.os.f.b(wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39978c.getValue()), wz.i.a(CustomParameterName.HAS_ADDONS.getValue(), Integer.valueOf(TypeExtensionsKt.H0(z11))), wz.i.a("fb_content_type", paymentType.getValue())));
    }

    public final void o(double d11, KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        if (!this.f39980e) {
            return;
        }
        f().k(new BigDecimal(String.valueOf(d11)), Currency.getInstance(this.f39979d.getValue()), androidx.core.os.f.b(wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39978c.getValue()), wz.i.a("fb_content_type", paymentType.getValue())));
    }

    public final void p(KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        if (!this.f39980e) {
            return;
        }
        f().j(CustomEventName.PURCHASED_FAILED.getValue(), androidx.core.os.f.b(wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39978c.getValue()), wz.i.a("fb_content_type", paymentType.getValue())));
    }

    public final void q(KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        if (!this.f39980e) {
            return;
        }
        f().j(CustomEventName.PURCHASED_INCOMPLETE.getValue(), androidx.core.os.f.b(wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39978c.getValue()), wz.i.a("fb_content_type", paymentType.getValue())));
    }

    public final void r(double d11, KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        if (!this.f39980e) {
            return;
        }
        f().i("fb_mobile_spent_credits", d11, androidx.core.os.f.b(wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39978c.getValue()), wz.i.a("fb_content_type", paymentType.getValue())));
    }

    public final void s(boolean z11) {
        this.f39980e = z11;
    }

    /* compiled from: FacebookEventsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void c(Application application) {
            AppEventsLogger.a(application);
        }

        public final void b(Application application) {
            o.i(application, "application");
            a();
            c(application);
        }

        private final void a() {
        }
    }
}
