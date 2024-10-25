package com.forsale.app.utils.analytics;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.entities.PaymentHistoryEntity;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.logger.AnalyticsParamBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.leanplum.internal.Constants;
import g00.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: FirebaseEventsLogger.kt */
/* loaded from: classes3.dex */
public final class FirebaseEventsLogger implements CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final jj.b f39988a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f39989b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<String> f39990c;

    /* renamed from: d  reason: collision with root package name */
    private final b0<String> f39991d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f39992e;

    /* renamed from: f  reason: collision with root package name */
    private final wz.h f39993f;

    /* compiled from: FirebaseEventsLogger.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.FirebaseEventsLogger$1", f = "FirebaseEventsLogger.kt", l = {41, 42}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.utils.analytics.FirebaseEventsLogger$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f39994a;

        /* renamed from: b  reason: collision with root package name */
        int f39995b;

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
            int i11 = this.f39995b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        b0Var = (b0) this.f39994a;
                        kotlin.f.b(obj);
                        b0Var.postValue(obj);
                        return wz.p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e11 = (b0) this.f39994a;
                kotlin.f.b(obj);
            } else {
                kotlin.f.b(obj);
                e11 = FirebaseEventsLogger.this.e();
                FirebaseEventsLogger firebaseEventsLogger = FirebaseEventsLogger.this;
                this.f39994a = e11;
                this.f39995b = 1;
                obj = firebaseEventsLogger.h(this);
                if (obj == f11) {
                    return f11;
                }
            }
            e11.postValue(obj);
            b0<String> d11 = FirebaseEventsLogger.this.d();
            FirebaseEventsLogger firebaseEventsLogger2 = FirebaseEventsLogger.this;
            this.f39994a = d11;
            this.f39995b = 2;
            Object g11 = firebaseEventsLogger2.g(this);
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
    /* compiled from: FirebaseEventsLogger.kt */
    /* loaded from: classes3.dex */
    private static final class CustomEventName {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CustomEventName[] $VALUES;
        private final String value;
        public static final CustomEventName SIGNUP = new CustomEventName("SIGNUP", 0, "sign_up");
        public static final CustomEventName ADDED_TO_WISHLIST = new CustomEventName("ADDED_TO_WISHLIST", 1, "add_to_wishlist");
        public static final CustomEventName ADD_PAYMENT_INFO = new CustomEventName("ADD_PAYMENT_INFO", 2, "add_payment_info");
        public static final CustomEventName ADD_TO_CART = new CustomEventName("ADD_TO_CART", 3, "add_to_cart");
        public static final CustomEventName BEGIN_CHECKOUT = new CustomEventName("BEGIN_CHECKOUT", 4, "begin_checkout");
        public static final CustomEventName PURCHASE = new CustomEventName("PURCHASE", 5, "ecommerce_purchase");
        public static final CustomEventName PURCHASE_FAIL = new CustomEventName("PURCHASE_FAIL", 6, "ecommerce_purchase_fail");
        public static final CustomEventName PURCHASE_INCOMPLETE = new CustomEventName("PURCHASE_INCOMPLETE", 7, "ecommerce_purchase_incomplete");
        public static final CustomEventName GENERATE_LEAD = new CustomEventName("GENERATE_LEAD", 8, "generate_lead");
        public static final CustomEventName PURCHASE_REFUND = new CustomEventName("PURCHASE_REFUND", 9, "purchase_refund");
        public static final CustomEventName VIEW_ITEM = new CustomEventName("VIEW_ITEM", 10, "view_item");
        public static final CustomEventName VIEW_ITEM_LIST = new CustomEventName("VIEW_ITEM_LIST", 11, "view_item_list");
        public static final CustomEventName VIEW_SEARCH_RESULTS = new CustomEventName("VIEW_SEARCH_RESULTS", 12, "view_search_results");
        public static final CustomEventName SPENT_CREDITS = new CustomEventName("SPENT_CREDITS", 13, "spent_credits");
        public static final CustomEventName TUTORIAL_COMPLETE = new CustomEventName("TUTORIAL_COMPLETE", 14, "tutorial_complete");
        public static final CustomEventName SEARCHED = new CustomEventName("SEARCHED", 15, "search");

        private static final /* synthetic */ CustomEventName[] $values() {
            return new CustomEventName[]{SIGNUP, ADDED_TO_WISHLIST, ADD_PAYMENT_INFO, ADD_TO_CART, BEGIN_CHECKOUT, PURCHASE, PURCHASE_FAIL, PURCHASE_INCOMPLETE, GENERATE_LEAD, PURCHASE_REFUND, VIEW_ITEM, VIEW_ITEM_LIST, VIEW_SEARCH_RESULTS, SPENT_CREDITS, TUTORIAL_COMPLETE, SEARCHED};
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
    /* compiled from: FirebaseEventsLogger.kt */
    /* loaded from: classes3.dex */
    private static final class CustomParameterName {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CustomParameterName[] $VALUES;
        private final String value;
        public static final CustomParameterName CATEGORY_NAME = new CustomParameterName("CATEGORY_NAME", 0, "item_category");
        public static final CustomParameterName COUNTRY = new CustomParameterName("COUNTRY", 1, Constants.Keys.COUNTRY);
        public static final CustomParameterName IS_MOTOR = new CustomParameterName("IS_MOTOR", 2, "is_motor");
        public static final CustomParameterName HAS_ADDONS = new CustomParameterName("HAS_ADDONS", 3, "has_addons");
        public static final CustomParameterName IS_ADVANCED = new CustomParameterName("IS_ADVANCED", 4, "is_advanced");
        public static final CustomParameterName CONTENT_TYPE = new CustomParameterName("CONTENT_TYPE", 5, "content");
        public static final CustomParameterName PRICE = new CustomParameterName("PRICE", 6, "price");
        public static final CustomParameterName VALUE = new CustomParameterName("VALUE", 7, "value");
        public static final CustomParameterName CURRENCY = new CustomParameterName("CURRENCY", 8, PaymentHistoryEntity.PaymentRecord.CURRENCY);
        public static final CustomParameterName REGISTRATION_METHOD = new CustomParameterName("REGISTRATION_METHOD", 9, "sign_up_method");
        public static final CustomParameterName PAYMENT_INFO_AVAILABLE = new CustomParameterName("PAYMENT_INFO_AVAILABLE", 10, "payment_info_available");
        public static final CustomParameterName SUCCESSFUL = new CustomParameterName("SUCCESSFUL", 11, "successful");
        public static final CustomParameterName SEARCHED_STRING = new CustomParameterName("SEARCHED_STRING", 12, "search_term");

        private static final /* synthetic */ CustomParameterName[] $values() {
            return new CustomParameterName[]{CATEGORY_NAME, COUNTRY, IS_MOTOR, HAS_ADDONS, IS_ADVANCED, CONTENT_TYPE, PRICE, VALUE, CURRENCY, REGISTRATION_METHOD, PAYMENT_INFO_AVAILABLE, SUCCESSFUL, SEARCHED_STRING};
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
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b(th2.getMessage(), new Object[0]);
        }
    }

    public FirebaseEventsLogger(final Context applicationContext, jj.b pref) {
        wz.h a11;
        o.i(applicationContext, "applicationContext");
        o.i(pref, "pref");
        this.f39988a = pref;
        this.f39989b = new a(CoroutineExceptionHandler.Key);
        this.f39990c = new b0<>();
        this.f39991d = new b0<>();
        this.f39992e = j();
        if (applicationContext instanceof Application) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
            a11 = kotlin.d.a(new g00.a<FirebaseAnalytics>() { // from class: com.forsale.app.utils.analytics.FirebaseEventsLogger$logger$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                /* renamed from: b */
                public final FirebaseAnalytics invoke() {
                    return FirebaseAnalytics.getInstance(applicationContext.getApplicationContext());
                }
            });
            this.f39993f = a11;
            return;
        }
        throw new IllegalArgumentException("You must pass Application context.");
    }

    private final FirebaseAnalytics f() {
        return (FirebaseAnalytics) this.f39993f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(zz.a<? super String> aVar) {
        return this.f39988a.i().a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(zz.a<? super String> aVar) {
        return this.f39988a.i().d(aVar);
    }

    private final boolean j() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new FirebaseEventsLogger$isGoogleAnalyticsEnabled$1(this, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    public final b0<String> d() {
        return this.f39991d;
    }

    public final b0<String> e() {
        return this.f39990c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f39989b;
    }

    public final void k(String event, Bundle params) {
        o.i(event, "event");
        o.i(params, "params");
        f().a(event, params);
        Map<String, String> b11 = wi.d.b(params);
        x10.a.b("FIREBASE LOGGER " + event + " " + b11, new Object[0]);
    }

    public void l(String event, g00.l<? super AnalyticsParamBuilder, wz.p> params) {
        o.i(event, "event");
        o.i(params, "params");
        AnalyticsParamBuilder analyticsParamBuilder = new AnalyticsParamBuilder();
        params.invoke(analyticsParamBuilder);
        f().a(event, analyticsParamBuilder.a());
        Map<String, String> b11 = wi.d.b(analyticsParamBuilder.a());
        x10.a.b("FIREBASE CUSTOM LOGGER " + event + " " + b11, new Object[0]);
    }

    public final void m(KnetPaymentType paymentType, double d11, boolean z11) {
        o.i(paymentType, "paymentType");
        if (!this.f39992e) {
            return;
        }
        f().a(CustomEventName.ADD_TO_CART.getValue(), androidx.core.os.f.b(wz.i.a(CustomParameterName.CURRENCY.getValue(), this.f39991d.getValue()), wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39990c.getValue()), wz.i.a(CustomParameterName.CONTENT_TYPE.getValue(), paymentType.getValue()), wz.i.a(CustomParameterName.HAS_ADDONS.getValue(), Integer.valueOf(TypeExtensionsKt.H0(z11)))));
    }

    public final void o(String categoryName) {
        o.i(categoryName, "categoryName");
        if (!this.f39992e) {
            return;
        }
        f().a(CustomEventName.ADDED_TO_WISHLIST.getValue(), androidx.core.os.f.b(wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39990c.getValue()), wz.i.a(CustomParameterName.CATEGORY_NAME.getValue(), categoryName)));
    }

    public final void p(boolean z11, KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        if (!this.f39992e) {
            return;
        }
        f().a(CustomEventName.GENERATE_LEAD.getValue(), androidx.core.os.f.b(wz.i.a(CustomParameterName.HAS_ADDONS.getValue(), Integer.valueOf(TypeExtensionsKt.H0(z11))), wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39990c.getValue()), wz.i.a(CustomParameterName.CONTENT_TYPE.getValue(), paymentType.getValue())));
    }

    public final void q(double d11, KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        if (!this.f39992e) {
            return;
        }
        f().a(CustomEventName.PURCHASE.getValue(), androidx.core.os.f.b(wz.i.a(CustomParameterName.VALUE.getValue(), Double.valueOf(d11)), wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39990c.getValue()), wz.i.a(CustomParameterName.CURRENCY.getValue(), this.f39991d.getValue()), wz.i.a(CustomParameterName.CONTENT_TYPE.getValue(), paymentType.getValue())));
    }

    public final void r(KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        if (!this.f39992e) {
            return;
        }
        f().a(CustomEventName.PURCHASE_FAIL.getValue(), androidx.core.os.f.b(wz.i.a(CustomParameterName.CURRENCY.getValue(), this.f39991d.getValue()), wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39990c.getValue()), wz.i.a(CustomParameterName.CONTENT_TYPE.getValue(), paymentType.getValue())));
    }

    public final void s(KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        if (!this.f39992e) {
            return;
        }
        f().a(CustomEventName.PURCHASE_INCOMPLETE.getValue(), androidx.core.os.f.b(wz.i.a(CustomParameterName.CURRENCY.getValue(), this.f39991d.getValue()), wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39990c.getValue()), wz.i.a(CustomParameterName.CONTENT_TYPE.getValue(), paymentType.getValue())));
    }

    public final void t(double d11, KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        if (!this.f39992e) {
            return;
        }
        f().a(CustomEventName.SPENT_CREDITS.getValue(), androidx.core.os.f.b(wz.i.a(CustomParameterName.COUNTRY.getValue(), this.f39990c.getValue()), wz.i.a(CustomParameterName.VALUE.getValue(), this.f39990c.getValue()), wz.i.a(CustomParameterName.CONTENT_TYPE.getValue(), paymentType.getValue())));
    }

    public final void v(boolean z11) {
        this.f39992e = z11;
    }

    public void w(String id2) {
        o.i(id2, "id");
        f().b(id2);
    }

    public final void x(List<Pair<String, String>> properties) {
        o.i(properties, "properties");
        Iterator<T> it2 = properties.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            f().c((String) pair.c(), (String) pair.d());
        }
    }
}
