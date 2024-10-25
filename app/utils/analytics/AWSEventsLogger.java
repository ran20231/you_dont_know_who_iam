package com.forsale.app.utils.analytics;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobile.client.Callback;
import com.amazonaws.mobile.client.UserStateDetails;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.PinpointManager;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.observers.a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AWSEventsLogger.kt */
/* loaded from: classes3.dex */
public final class AWSEventsLogger implements com.forsale.app.utils.observers.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f39708a;

    /* renamed from: b  reason: collision with root package name */
    private final jj.b f39709b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineScope f39710c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f39711d;

    /* renamed from: e  reason: collision with root package name */
    private final wz.h f39712e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AWSEventsLogger.kt */
    /* loaded from: classes3.dex */
    private static final class CustomAttributeKey {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CustomAttributeKey[] $VALUES;
        private final String value;
        public static final CustomAttributeKey PHONE = new CustomAttributeKey("PHONE", 0, "Phone");
        public static final CustomAttributeKey DEVICE_ID = new CustomAttributeKey("DEVICE_ID", 1, "DeviceID");
        public static final CustomAttributeKey APP_VERSION_NUMBER = new CustomAttributeKey("APP_VERSION_NUMBER", 2, "AppVersion");
        public static final CustomAttributeKey OS = new CustomAttributeKey("OS", 3, "Os");

        private static final /* synthetic */ CustomAttributeKey[] $values() {
            return new CustomAttributeKey[]{PHONE, DEVICE_ID, APP_VERSION_NUMBER, OS};
        }

        static {
            CustomAttributeKey[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CustomAttributeKey(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<CustomAttributeKey> getEntries() {
            return $ENTRIES;
        }

        public static CustomAttributeKey valueOf(String str) {
            return (CustomAttributeKey) Enum.valueOf(CustomAttributeKey.class, str);
        }

        public static CustomAttributeKey[] values() {
            return (CustomAttributeKey[]) $VALUES.clone();
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
    /* compiled from: AWSEventsLogger.kt */
    /* loaded from: classes3.dex */
    private static final class CustomAttributeValue {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CustomAttributeValue[] $VALUES;
        public static final CustomAttributeValue ANDROID = new CustomAttributeValue("ANDROID", 0, "android");
        private final String value;

        private static final /* synthetic */ CustomAttributeValue[] $values() {
            return new CustomAttributeValue[]{ANDROID};
        }

        static {
            CustomAttributeValue[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CustomAttributeValue(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<CustomAttributeValue> getEntries() {
            return $ENTRIES;
        }

        public static CustomAttributeValue valueOf(String str) {
            return (CustomAttributeValue) Enum.valueOf(CustomAttributeValue.class, str);
        }

        public static CustomAttributeValue[] values() {
            return (CustomAttributeValue[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public AWSEventsLogger(Context applicationContext, jj.b pref, CoroutineScope coroutineScope) {
        wz.h a11;
        o.i(applicationContext, "applicationContext");
        o.i(pref, "pref");
        o.i(coroutineScope, "coroutineScope");
        this.f39708a = applicationContext;
        this.f39709b = pref;
        this.f39710c = coroutineScope;
        this.f39711d = h();
        if (applicationContext instanceof Application) {
            a11 = kotlin.d.a(new g00.a<PinpointManager>() { // from class: com.forsale.app.utils.analytics.AWSEventsLogger$pinpointManager$2

                /* compiled from: AWSEventsLogger.kt */
                /* loaded from: classes3.dex */
                public static final class a implements Callback<UserStateDetails> {
                    a() {
                    }

                    @Override // com.amazonaws.mobile.client.Callback
                    /* renamed from: a */
                    public void onResult(UserStateDetails userStateDetails) {
                        o.i(userStateDetails, "userStateDetails");
                    }

                    @Override // com.amazonaws.mobile.client.Callback
                    public void onError(Exception e11) {
                        o.i(e11, "e");
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                /* renamed from: b */
                public final PinpointManager invoke() {
                    Context context;
                    Context context2;
                    Context context3;
                    context = AWSEventsLogger.this.f39708a;
                    AWSConfiguration aWSConfiguration = new AWSConfiguration(context);
                    AWSMobileClient r11 = AWSMobileClient.r();
                    context2 = AWSEventsLogger.this.f39708a;
                    r11.x(context2, aWSConfiguration, new a());
                    context3 = AWSEventsLogger.this.f39708a;
                    return new PinpointManager(new PinpointConfiguration(context3, AWSMobileClient.r(), aWSConfiguration));
                }
            });
            this.f39712e = a11;
            return;
        }
        throw new IllegalArgumentException("You must pass Application context.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PinpointManager g() {
        return (PinpointManager) this.f39712e.getValue();
    }

    private final boolean h() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AWSEventsLogger$isAWSAnalyticsEnabled$1(this, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    public void i(boolean z11) {
        this.f39711d = z11;
    }

    @Override // com.forsale.app.utils.observers.a
    public boolean isEnabled() {
        return this.f39711d;
    }

    @d0(Lifecycle.Event.ON_STOP)
    public final void onMoveToBackground() {
        AnalyticsClient a11;
        SessionClient b11 = g().b();
        if (b11 != null) {
            b11.d();
        }
        if (ContextExtensionsKt.v(this.f39708a) && (a11 = g().a()) != null) {
            a11.j();
        }
    }

    @d0(Lifecycle.Event.ON_START)
    public final void onMoveToForeground() {
        BuildersKt__Builders_commonKt.launch$default(this.f39710c, null, null, new AWSEventsLogger$onMoveToForeground$1(this, null), 3, null);
    }

    @Override // com.forsale.app.utils.observers.a
    public void q() {
        a.C0459a.a(this);
    }

    public final void f() {
    }
}
