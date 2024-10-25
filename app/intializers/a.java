package com.forsale.app.intializers;

import android.content.Context;
import ex.b;
import kotlin.jvm.internal.o;
/* compiled from: InitializerEntryPoint.kt */
/* loaded from: classes2.dex */
public interface a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0431a f37573b = C0431a.f37574a;

    /* compiled from: InitializerEntryPoint.kt */
    /* renamed from: com.forsale.app.intializers.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0431a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0431a f37574a = new C0431a();

        private C0431a() {
        }

        public final a a(Context context) {
            o.i(context, "context");
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                return (a) b.a(applicationContext, a.class);
            }
            throw new IllegalStateException();
        }
    }

    void b(MoEngageInitializer moEngageInitializer);

    void g(AdServerInitializer adServerInitializer);

    void h(MobileAdsInitializer mobileAdsInitializer);

    void i(ChatInitializer chatInitializer);

    void l(ProcessObserversInitializer processObserversInitializer);

    void n(TimberInitializer timberInitializer);

    void o(LanguageInitializer languageInitializer);

    void q(AnalyticInitializer analyticInitializer);

    void s(ZendeskSupportInitializer zendeskSupportInitializer);
}
